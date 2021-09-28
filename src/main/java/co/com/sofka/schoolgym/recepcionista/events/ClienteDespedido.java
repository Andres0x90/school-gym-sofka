package co.com.sofka.schoolgym.recepcionista.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.schoolgym.cliente.values.ClienteId;

public class ClienteDespedido extends DomainEvent {
    private final ClienteId clienteId;

    public ClienteDespedido(ClienteId clienteId) {
        super("schoolgym.recepcionista.clientedespedido");
        this.clienteId = clienteId;
    }

    public ClienteId getClienteId() {
        return clienteId;
    }
}
