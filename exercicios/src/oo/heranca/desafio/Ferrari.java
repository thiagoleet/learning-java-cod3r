package oo.heranca.desafio;

public class Ferrari extends Carro implements Esportivo, Luxo {

    private boolean ligarTurbo = false;
    private boolean ligarAr = false;

    public Ferrari() {
        this(315);
    }

    public Ferrari(int velocidadeMaxima) {
        super(velocidadeMaxima, "Ferrari");
        this.setDelta(15);
    }

    @Override
    public void ligarTurbo() {
        this.ligarTurbo = true;
    }

    @Override
    public void desligarTurbo() {
        this.ligarTurbo = false;
    }

    @Override
    public void ligarAr() {
        this.ligarAr = true;

    }

    @Override
    public void desligarAr() {
        this.ligarAr = false;
    }

//    @Override
//    public void acelerar() {
//        velocidadeAtual += 15;
//    }


    @Override
    public int getDelta() {
        if (ligarTurbo && !ligarAr) {
            return 35;
        } else if (ligarTurbo && ligarAr) {
            return 30;
        } else if (!ligarTurbo && !ligarAr) {
            return 20;
        } else {
            return 15;
        }
    }
}
