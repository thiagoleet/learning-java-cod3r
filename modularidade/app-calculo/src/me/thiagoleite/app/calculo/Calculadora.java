package me.thiagoleite.app.calculo;

import me.thiagoleite.app.calculo.interno.OperacoesAritimeticas;
import me.thiagoleite.app.loggin.Logger;

public class Calculadora {
    private OperacoesAritimeticas op = new OperacoesAritimeticas();

    public double soma(double... nums) {
        Logger.info("Somando...");
        return op.soma(nums);
    }

    public Class<Logger> getLoggerClass() {
        return Logger.class;
    }
}
