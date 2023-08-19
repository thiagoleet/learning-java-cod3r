package padroes.observer;

public class AniversarioSurpresa {

    public static void main(String[] args) {
        Namorada namorada = new Namorada();
        Porteiro porteiro = new Porteiro();

        // usando um objeto observador
        porteiro.registrarObservador(namorada);

        // Usando uma lambda
        porteiro.registrarObservador(e -> {
            System.out.println("λ: Surpresa via lambda");
            System.out.println("λ: Evento ocorreu em " + e.getMomento());
        });

        porteiro.monitorar();
    }

}
