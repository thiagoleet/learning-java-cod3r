package oo.heranca.desafio;

public class Carro {
    final String name;
    int velocidadeAtual;
    public final int VELOCIDADE_MAXIMA;

    public int getDelta() {
        return delta;
    }

    public void setDelta(int delta) {
        this.delta = delta;
    }

    private int delta = 5;

    protected Carro(int velocidadeMaxima, String name) {

        this.VELOCIDADE_MAXIMA = velocidadeMaxima;
        this.name = name;
    }

    public void acelerar() {

        if (velocidadeAtual + getDelta() > VELOCIDADE_MAXIMA) {
            velocidadeAtual = VELOCIDADE_MAXIMA;
        } else {
            velocidadeAtual += getDelta();
        }

    }

    public void frear() {
        if (velocidadeAtual >= 5) {
            velocidadeAtual -= 5;
        } else {
            velocidadeAtual = 0;
        }
    }


    public String toString() {
        return "(" + this.name + ") " + "Velocidade atual: " + velocidadeAtual + "km/h";
    }
}
