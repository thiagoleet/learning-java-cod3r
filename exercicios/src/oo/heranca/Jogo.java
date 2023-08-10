package oo.heranca;

public class Jogo {
    public static void main(String[] args) {
        var j1 = new Monstro();
        var j2 = new Heroi();

        j1.x = 10;
        j1.y = 10;

        j2.x = 10;
        j2.y = 11;

        System.out.println(j1.vida);
        System.out.println(j2.vida);

        j1.atacar(j2);
        j2.atacar(j1);

        System.out.println(j1.vida);
        System.out.println(j2.vida);

//        j1.andar(Direcao.NORTE);
//        j1.andar(Direcao.LESTE);
//        j1.andar(Direcao.NORTE);
//        j1.andar(Direcao.LESTE);
//
//        System.out.println(j1.y);
//        System.out.println(j1.x);
    }
}
