package lambdas.desafio;

import lambdas.Produto;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {
    public static void main(String[] args) {

        /*
        * 1. A partir do produto, calcular o preço real (com desconto)
        * 2. Imposto Municipal: >= 2500 (8,5%) | < 2500 (Isento)
        * 3. Frete: >= 3000 (100) | < 3000 (50)
        * 4. Arredondador: Deixar duas casas decimais
        * 5. Formatar: R$1234,56
         */

        Function<Produto, Double> precoFinal = prod -> prod.preco * (1 - prod.desconto);
        UnaryOperator<Double> impostoMunicipal = valor -> valor >= 2500 ? valor * 1.085 : valor;
        UnaryOperator<Double> frete = preco -> preco >= 3000 ? preco + 100.0 : preco + 50.0;
        UnaryOperator<Double> arredondar = valor -> Double.parseDouble(String.format("%.2f", valor));
        Function<Double, String> formatar = valor -> ("R$" + valor).replace(".", ",");

        Produto p = new Produto("iPad", 3235.89, 0.13);

        String preco = precoFinal
                .andThen(impostoMunicipal)
                .andThen(frete)
                .andThen(arredondar)
                .andThen(formatar)
                .apply(p);

        System.out.println("O preço final é: " + preco);



    }
}
