package co.com.sofka.schoolgym.recepcionista.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.schoolgym.cliente.values.ClienteId;
import co.com.sofka.schoolgym.recepcionista.values.RecepcionistaId;

public class DenegarAccesoCliente extends Command {

    private final RecepcionistaId recepcionistaId;
    private final ClienteId clienteId;

    public DenegarAccesoCliente(RecepcionistaId recepcionistaId, ClienteId clienteId) {
        this.recepcionistaId = recepcionistaId;
        this.clienteId = clienteId;
    }

    public RecepcionistaId getRecepcionistaId() {
        return recepcionistaId;
    }

    public ClienteId getClienteId() {
        return clienteId;
    }
}
