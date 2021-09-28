package co.com.sofka.schoolgym.cliente.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.schoolgym.cliente.values.ClienteId;
import co.com.sofka.schoolgym.rutina.values.RutinaId;

public class CambiarRutina extends Command {
    private final ClienteId clienteId;
    private final RutinaId rutinaId;

    public CambiarRutina(ClienteId clienteId, RutinaId rutinaId) {
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
