package oo.heranca;

public class Jogo {
    public static void main(String[] args) {
        var monstro = new Monstro();
        var heroi = new Heroi();

        monstro.x = 10;
        monstro.y = 10;

        heroi.x = 10;
        heroi.y = 11;

        System.out.println("Monstro tem: Vida => " + monstro.vida);
        System.out.println("Herói tem: Vida => " + heroi.vida);

        monstro.atacar(heroi);
        heroi.atacar(monstro);

        monstro.atacar(heroi);
        heroi.atacar(monstro);

        monstro.atacar(heroi);
        heroi.atacar(monstro);

        monstro.andar(Direcao.NORTE);

        monstro.atacar(heroi);
        heroi.atacar(monstro);

        System.out.println("Monstro tem: Vida => " + monstro.vida);
        System.out.println("Herói tem: Vida => " + heroi.vida);

//        monstro.andar(Direcao.NORTE);
//        monstro.andar(Direcao.LESTE);
//        monstro.andar(Direcao.NORTE);
//        monstro.andar(Direcao.LESTE);
//
//        System.out.println(monstro.y);
//        System.out.println(monstro.x);
    }
}
