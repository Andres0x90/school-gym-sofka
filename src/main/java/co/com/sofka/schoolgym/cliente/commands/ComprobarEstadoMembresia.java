package co.com.sofka.schoolgym.cliente.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.schoolgym.cliente.Membresia;
import co.com.sofka.schoolgym.cliente.values.ClienteId;

public class ComprobarEstadoMembresia extends Command {
    private final ClienteId clienteId;
    private final Membresia membresia;

    public ComprobarEstadoMembresia(ClienteId clienteId, Membresia membresia) {
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
