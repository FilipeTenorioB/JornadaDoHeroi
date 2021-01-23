package JornadaDoHeroi;

public class Heroi {

    int level = 1;
    int HP = 100;
    int ATK = 100;
    int DEF = 100;
    int taxaCritica = 10;

    public void uparLevel() {

        if (this.level == 4 || this.level == 9) {
            System.out.println();
            System.out.println("ATENÇÃO: será necessário ascender antes de continuar sua progressão.");
        }
        if (this.level == 14) {
            System.out.println();
            System.out.println("VOCÊ ATINGIU O LEVEL MÁXIMO!!!");
        }

        this.level = this.level + 1;
        this.HP = this.HP + 20;
        this.ATK = this.ATK + 30;
        this.DEF = this.DEF + 15;

        imprimePersonagem();

    }

    public void ascenderPersonagem() {

        if (this.level == 5) {

            this.HP += 200;
            this.ATK += 300;
            this.taxaCritica += 10;
            imprimePersonagem();
            System.out.println();
            System.out.println("PARABÉNS! Você ascendeu! Seus novos status são incríveis.");
            System.out.println("E agora? O que deseja fazer?");
            System.out.println();

        }
        if (this.level == 10) {

            this.HP += 300;
            this.ATK += 400;
            this.taxaCritica += 20;
            imprimePersonagem();
            System.out.println();
            System.out.println("PARABÉNS! Você ascendeu! Seus novos atributos são incríveis.");
            System.out.println("E agora? O que deseja fazer?");
            System.out.println();

        } else if (this.level > 0 && this.level < 5) {

            erroAscenderPersonagem();

        } else if (this.level > 5 && this.level < 10) {

            erroAscenderPersonagem();

        } else if (this.level > 10 && this.level < 15) {

            erroAscenderPersonagem();

        }
    }

    public void imprimePersonagem() {
        System.out.println("");
        System.out.println("Level atual: " + this.level);
        System.out.println("HP: " + this.HP);
        System.out.println("ATK: " + this.ATK);
        System.out.println("DEF: " + this.DEF);
        System.out.println("Taxa Crítica: " + this.taxaCritica);

    }

    public void erroAscenderPersonagem() {
        System.out.println();
        System.out.println("A ascensão apenas será possível no level 5 ou 10.");
        System.out.println("O que deseja fazer?");
        System.out.println();
    }
    
    public void erroUparPersonagem() {

        System.out.println();
        System.out.println("Não foi possível upar.");
        System.out.println("Será necessário ascender antes de continuar.");
        System.out.println();
        
    }

}
