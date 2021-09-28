package co.com.sofka.schoolgym.cliente.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.schoolgym.cliente.Membresia;

public class MembresiaRenovada extends DomainEvent {
    private final Membresia membresia;

    public MembresiaRenovada(Membresia membresia) {
        super("schoolgym.cliente.membresiarenovada");
        this.membresia = membresia;
    }
    public Membresia getMembresia() {
        return membresia;
    }
}
