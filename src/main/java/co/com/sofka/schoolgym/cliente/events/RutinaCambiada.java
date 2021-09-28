package co.com.sofka.schoolgym.cliente.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.schoolgym.rutina.values.RutinaId;

public class RutinaCambiada extends DomainEvent {
    private final RutinaId rutinaId;

    public RutinaCambiada(RutinaId rutinaId) {
        super("schoolgym.cliente.rutinacambiada");
        this.rutinaId = rutinaId;
    }

    public RutinaId getRutinaId() {
        return rutinaId;
    }
}
