package oo.heranca.teste;

import oo.heranca.desafio.Carro;
import oo.heranca.desafio.Civic;
import oo.heranca.desafio.Ferrari;

public class CarroTeste {
    public static void main(String[] args) {
        Carro civic = new Civic();
        Ferrari ferrari = new Ferrari(400);

        civic.acelerar();
        System.out.println(civic);

        civic.acelerar();
        System.out.println(civic);

        civic.acelerar();
        System.out.println(civic);

        ferrari.ligarTurbo();
        ferrari.acelerar();
        ferrari.frear();
        System.out.println(ferrari);

        ferrari.desligarTurbo();
        ferrari.acelerar();
        ferrari.ligarAr();
        ferrari.frear();
        System.out.println(ferrari);

        ferrari.acelerar();
        ferrari.frear();
        ferrari.desligarAr();
        System.out.println(ferrari);
    }
}
