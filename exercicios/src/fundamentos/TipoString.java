package fundamentos;

public class TipoString {
  public static void main(String[] args) {
    System.out.println("Hello World".charAt(2));

    String s =  "Hello World";
    System.out.println(s.concat("!!!!"));
    System.out.println(s + "!!!");
    System.out.println(s.startsWith("Hello"));
    System.out.println(s.startsWith("hello"));
    System.out.println(s.toLowerCase().startsWith("hello"));
    System.out.println(s.toUpperCase().endsWith("WORLD"));
    System.out.println(s.length());
    System.out.println(s.toLowerCase().equals("hello world"));
    System.out.println(s.equalsIgnoreCase("hello world"));


    var nome = "Thiago";
    var sobrenome = "Leite";
    var idade = 33;
    var salario = 12345.67;

    System.out.println("Nome\n" + nome + "\nSobrenome:\n" + sobrenome + "\nIdade:\n" + idade + "\nSalário:\n" + salario + "\n\n");

    System.out.printf("Nome: %s Sobrenome: %s.\n\nSalário: R$%.2f.\n\n", nome, sobrenome, salario);
    

    String frase = String.format("Nome: %s Sobrenome: %s.\n\nSalário: R$%.2f.\n\n", nome, sobrenome, salario);
    System.out.println(frase);
  }
}
