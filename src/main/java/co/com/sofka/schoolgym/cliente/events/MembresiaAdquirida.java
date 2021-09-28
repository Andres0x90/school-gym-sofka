package co.com.sofka.schoolgym.cliente.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.schoolgym.cliente.Membresia;

public class MembresiaAdquirida extends DomainEvent {
    private final Membresia membresia;

    public MembresiaAdquirida(Membresia membresia) {
        super("schoolgym.cliente.membresiaadquirida");
        this.membresia = membresia;
    }
    public Membresia getMembresia() {
        return membresia;
    }
}
