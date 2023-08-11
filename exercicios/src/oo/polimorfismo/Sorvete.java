package oo.polimorfismo;

public class Sorvete {
    private double peso;


    public Sorvete(double peso) {
        this.setPeso(peso);
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if (peso >= 0) {
            this.peso = peso;
        }
    }
}
