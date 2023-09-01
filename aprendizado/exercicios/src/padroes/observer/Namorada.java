package padroes.observer;

public class Namorada implements ChegadaAniversarianteObservador{
    @Override
    public void chegou(EventoChegadaaAniversariante evento) {
        System.out.println("Namorada: Avisar os convidados");
        System.out.println("Namorada: Apagar as luzes");
        System.out.println("Namorada: Esperar um pouco");
        System.out.println("Namorada: Surpresa!!");
    }
}
