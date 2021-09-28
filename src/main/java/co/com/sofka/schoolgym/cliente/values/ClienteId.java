package co.com.sofka.schoolgym.cliente.values;

import co.com.sofka.domain.generic.Identity;

public class ClienteId extends Identity {
    private ClienteId(String clienteId) {
        super(clienteId);
    }

    public  ClienteId()
    {

    }

    public static ClienteId of(String clienteId) {
        return new ClienteId(clienteId);
    }
}
