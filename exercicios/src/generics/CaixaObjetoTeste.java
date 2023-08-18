package generics;

public class CaixaObjetoTeste {
    public static void main(String[] args) {
        CaixaObjeto caixaA = new CaixaObjeto();

        caixaA.guardar(2.3); // double -> Double (autobox)
        // Integer coisaA = (Integer) caixaA.abrir(); // Usando cast para recuperar o objeto
        // System.out.println(coisaA); // Vai retornar um exception
        Double coisaA = (Double) caixaA.abrir();
        System.out.println(coisaA); // Vai funcionar, mas é necessário saber o cast correto


        CaixaObjeto caixaB = new CaixaObjeto();
        caixaB.guardar("Olá");
        String coisaB = (String) caixaB.abrir();
        System.out.println(coisaB);

    }
}
