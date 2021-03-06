package co.com.sofka.schoolgym.cliente.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.schoolgym.cliente.Membresia;
import co.com.sofka.schoolgym.cliente.values.MembresiaId;
import co.com.sofka.schoolgym.cliente.values.Pago;
import co.com.sofka.schoolgym.generic.values.FechaAdquirida;

public class MembresiaAdquirida extends DomainEvent {
    private final MembresiaId membresiaId;
    private final Pago pago;
    private final FechaAdquirida fechaAdquirida;

    public MembresiaAdquirida(MembresiaId membresiaId, Pago pago, FechaAdquirida fechaAdquirida) {
        super("schoolgym.cliente.membresiaadquirida");
        this.membresiaId = membresiaId;
        this.pago = pago;
        this.fechaAdquirida = fechaAdquirida;
    }

    public MembresiaId getMembresiaId() {
        return membresiaId;
    }

    public Pago getPago() {
        return pago;
    }

    public FechaAdquirida getFechaAdquirida() {
        return fechaAdquirida;
    }
}
