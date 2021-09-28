package co.com.sofka.schoolgym.cliente.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.schoolgym.rutina.values.RutinaId;

public class RutinaAdquirida extends DomainEvent {
    private final RutinaId rutinaId;

    public RutinaAdquirida(RutinaId rutinaId) {
        super("schoolgym.cliente.rutinaadquirida");
        this.rutinaId = rutinaId;
    }

    public RutinaId getRutinaId() {
        return rutinaId;
    }
}
