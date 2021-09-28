package co.com.sofka.schoolgym.cliente.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.schoolgym.cliente.values.ClienteId;
import co.com.sofka.schoolgym.cliente.values.MembresiaId;
import co.com.sofka.schoolgym.cliente.values.Pago;
import co.com.sofka.schoolgym.generic.values.FechaAdquirida;

public class AdquirirMembresia extends Command {
    private final ClienteId clienteId;
    private final MembresiaId membresiaId;
    private final Pago pago;
    private final FechaAdquirida fechaAdquirida;

    public AdquirirMembresia(ClienteId clienteId, MembresiaId membresiaId,
                             Pago pago, FechaAdquirida fechaAdquirida) {
        this.clienteId = clienteId;
        this.membresiaId = membresiaId;
        this.pago = pago;
        this.fechaAdquirida = fechaAdquirida;
    }

    public ClienteId getClienteId() {
        return clienteId;
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
