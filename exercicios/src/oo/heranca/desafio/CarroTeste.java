package oo.heranca.desafio;

public class CarroTeste {
    public static void main(String[] args) {
        Carro civic = new Civic();
        Carro ferrari = new Ferrari();

        civic.acelerar();
        System.out.println(civic);

        civic.acelerar();
        System.out.println(civic);

        civic.acelerar();
        System.out.println(civic);

        ferrari.acelerar();
        ferrari.frear();
        System.out.println(ferrari);

        ferrari.acelerar();
        ferrari.frear();
        System.out.println(ferrari);

        ferrari.acelerar();
        ferrari.frear();
        System.out.println(ferrari);
    }
}
