package lambdas;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class OperadorBinario {
    public static void main(String[] args) {
        BinaryOperator<Double> media = (Double n1, Double n2) -> (n1 + n2) / 2;
        Function<Double, String> conceito = m -> m > 7 ? "Aprovado" : "Reprovado";
        BiFunction<Double, Double, String> resultado = (n1, n2) -> {
            double notaFinal = media.apply(n1,n2);
            return conceito.apply(notaFinal);

        };


        System.out.println(media.apply(9.8, 5.7));
        System.out.println(resultado.apply(9.8, 5.7));
        System.out.println(resultado.apply(9.8, 4.1));

        System.out.println(media.andThen(conceito).apply(9.7, 4.1));

    }
}
