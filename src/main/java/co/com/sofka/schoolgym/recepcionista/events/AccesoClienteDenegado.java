package co.com.sofka.schoolgym.recepcionista.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.schoolgym.cliente.values.ClienteId;

public class AccesoClienteDenegado extends DomainEvent {
    private final ClienteId clienteId;

    public AccesoClienteDenegado(ClienteId clienteId) {
        super("schoolgym.recepcionista.accesoclientedenegado");
        this.clienteId = clienteId;
    }

    public ClienteId getClienteId() {
        return clienteId;
    }
}
