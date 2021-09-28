package co.com.sofka.schoolgym.cliente.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.schoolgym.cliente.Membresia;

public class MembresiaAprobada extends DomainEvent {
    private  final Membresia membresia;
    public MembresiaAprobada(Membresia membresia) {
        super("schoolgym.cliente.membresiaaprobada");
        this.membresia = membresia;
    }

    public Membresia getMembresia() {
        return membresia;
    }
}
