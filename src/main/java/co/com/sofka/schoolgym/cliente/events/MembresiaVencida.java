package co.com.sofka.schoolgym.cliente.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.schoolgym.cliente.Membresia;

public class MembresiaVencida extends DomainEvent {
    private final Membresia membresia;

    public MembresiaVencida(Membresia membresia) {
        super("schoolgym.cliente.membresiavencida");
        this.membresia = membresia;
    }
    public Membresia getMembresia() {
        return membresia;
    }
}
