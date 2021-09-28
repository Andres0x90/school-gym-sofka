package co.com.sofka.schoolgym.recepcionista.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.schoolgym.cliente.values.ClienteId;

public class AccesoClientePermitido extends DomainEvent {
    private final ClienteId clienteId;

    public AccesoClientePermitido(ClienteId clienteId) {
        super("schoolgym.recepcionista.accesoclientepermitido");
        this.clienteId = clienteId;
    }

    public ClienteId getClienteId() {
        return clienteId;
    }
}
