package me.thiagoleite.app.financeiro;


// import me.thiagoleite.app.calculo.CalculadoraImpl;
// import me.thiagoleite.app.calculo.interno.OperacoesAritimeticas;

import me.thiagoleite.app.Calculadora;

import java.util.ServiceLoader;

public class Teste {
    public static void main(String[] args) {
        // CalculadoraImpl calculadora = new CalculadoraImpl();
        Calculadora calculadora = ServiceLoader
                .load(Calculadora.class)
                .findFirst()
                .get();

        System.out.println(calculadora.soma(2, 3, 4));

        // usando exports to
        // OperacoesAritimeticas op = new OperacoesAritimeticas();
        // System.out.println(op.soma(2,5));
    }
}
