package co.com.sofka.schoolgym.cliente.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.schoolgym.cliente.Membresia;
import co.com.sofka.schoolgym.cliente.values.ClienteId;

public class RenovarMembresia extends Command {
    private final ClienteId clienteId;
    private  final Membresia membresia;

    public RenovarMembresia(ClienteId clienteId, Membresia membresia) {
        this.clienteId = clienteId;
        this.membresia = membresia;
    }

    public ClienteId getClienteId() {
        return clienteId;
    }

    public Membresia getMembresia() {
        return membresia;
    }
}
