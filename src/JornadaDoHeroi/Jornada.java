package JornadaDoHeroi;

import java.util.Scanner;

public class Jornada {

    public static void main(String[] args) {

        int opcao;
        Scanner entrada = new Scanner(System.in);
        Heroi heroi = new Heroi();
        imprimeOpcoes();

        do {

            opcao = entrada.nextInt();

            switch (opcao) {
                case 1:

                    if (heroi.level != 5 || heroi.level != 10) {
                        heroi.uparLevel();
                        System.out.println();
                        System.out.println("PASSOU DE LEVEL!!!");
                        System.out.println("E agora? O que deseja? (1, 2 ou 3?)");
                        System.out.println();
                    }
                    if (heroi.level == 5 || heroi.level == 10) {
                        // EXIGIR ASCENSÃO
                    }

                    break;
                case 2:
                    heroi.ascenderPersonagem();
                    break;
                case 3:
                    heroi.imprimePersonagem();
                    break;
                default:
                    System.out.println("Herói, apenas funcionarão números entre 1 e 3.");
                    break;
            }
        } while (heroi.level < 15);

    }

    private static void imprimeOpcoes() {
        System.out.println("Herói, o que deseja?");
        System.out.println("Pressione 1 para: Upar personagem.");
        System.out.println("Pressione 2 para: Ascender personagem.");
        System.out.println("Pressione 3 para: Checar os atributos atuais.");
        System.out.println();
    }

}

// BUG1: ASCENSÃO - Fazer com que a ascensão seja necessária para conseguir continuar a Jornada do Herói.
