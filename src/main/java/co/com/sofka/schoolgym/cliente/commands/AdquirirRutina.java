package co.com.sofka.schoolgym.cliente.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.schoolgym.cliente.values.ClienteId;
import co.com.sofka.schoolgym.rutina.values.RutinaId;

public class AdquirirRutina extends Command {
    private final ClienteId clienteId;
    private final RutinaId rutinaId;

    public AdquirirRutina(ClienteId clienteId, RutinaId rutinaId) {
        this.clienteId = clienteId;
        this.rutinaId = rutinaId;
    }

    public ClienteId getClienteId() {
        return clienteId;
    }

    public RutinaId getRutinaId() {
        return rutinaId;
    }
}
