package me.thiagoleite.app.calculo;

import me.thiagoleite.app.calculo.interno.OperacoesAritimeticas;

public class Calculadora {
    private OperacoesAritimeticas op = new OperacoesAritimeticas();

    public double soma(double... nums) {
        return op.soma(nums);
    }
}
