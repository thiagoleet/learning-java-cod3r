package me.thiagoleite.app.financeiro;

import me.thiagoleite.app.calculo.Calculadora;
import me.thiagoleite.app.calculo.interno.OperacoesAritimeticas;

public class Teste {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        System.out.println(calculadora.soma(2, 3, 4));

        // usando exports to
        OperacoesAritimeticas op = new OperacoesAritimeticas();
        System.out.println(op.soma(2,5));
    }
}
