package co.com.sofka.schoolgym.cliente.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.schoolgym.cliente.Membresia;

public class estadoMembresiaComprobada extends DomainEvent {
    private final Membresia membresia;

    public estadoMembresiaComprobada(Membresia membresia) {
        super("schoolgym.cliente.estadomembresiacomprobada");
        this.membresia = membresia;
    }

    public Membresia getMembresia() {
        return membresia;
    }
}
