package fundamentos;

public class NotacaoPonto {
  public static void main(String[] args) {
    String s = "Hello World X";

    s = s.toUpperCase();

    System.out.println(s);
    
    s = s.replace("X", "Another World");

    System.out.println(s);

    s = s.concat("!!!");

    System.out.println(s);
  }
}
