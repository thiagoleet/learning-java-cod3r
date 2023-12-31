package oo.polimorfismo;

public class Pessoa {
    private double peso;


    public Pessoa(double peso) {
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

//    public void comer(Arroz arroz) {
//        this.peso += arroz.getPeso();
//    }
//
//    public void comer(Feijao feijao) {
//        this.peso += feijao.getPeso();
//    }
//
//    public void comer(Sorvete sorvete) {
//        this.peso += sorvete.getPeso();
//    }

    public void comer(Comida comida) {
        this.peso += comida.getPeso();
    }

    @Override
    public String toString() {
        return "Meu peso é " + this.getPeso();
    }
}
