package co.com.sofka.schoolgym.cliente.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.schoolgym.cliente.Membresia;

public class MembresiaRechazada extends DomainEvent {
    private final Membresia membresia;

    public MembresiaRechazada(Membresia membresia) {
        super("schoolgym.cliente.membresiarechazada");
        this.membresia = membresia;
    }
    public Membresia getMembresia() {
        return membresia;
    }
}
