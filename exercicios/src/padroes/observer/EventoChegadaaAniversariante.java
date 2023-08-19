package padroes.observer;

import java.util.Date;

public class EventoChegadaaAniversariante {
    private final Date momento;

    public EventoChegadaaAniversariante(Date momento) {
        this.momento = momento;
    }

    public Date getMomento() {
        return momento;
    }
}
