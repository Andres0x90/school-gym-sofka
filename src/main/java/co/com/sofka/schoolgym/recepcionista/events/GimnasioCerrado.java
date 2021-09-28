package co.com.sofka.schoolgym.recepcionista.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.schoolgym.recepcionista.Gimnasio;

public class GimnasioCerrado extends DomainEvent {
    private final Gimnasio gimnasio;

    public GimnasioCerrado(Gimnasio gimnasio) {
        super("schoolgym.recepcionista.gimnasioabierto");
        this.gimnasio = gimnasio;
    }

    public Gimnasio getGimnasio() {
        return gimnasio;
    }
}
