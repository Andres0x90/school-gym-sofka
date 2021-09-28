package co.com.sofka.schoolgym.generic.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.schoolgym.cliente.values.ClienteId;
import co.com.sofka.schoolgym.generic.values.Nombre;
import co.com.sofka.schoolgym.generic.values.Direccion;

public class ActualizarDatosPersonales extends Command {
    private final ClienteId clienteId;
    private final Nombre nombre;
    private final String edad;
    private final Direccion direccion;

    public ActualizarDatosPersonales(ClienteId clienteId, Nombre nombre, String edad, Direccion direccion) {
        this.clienteId = clienteId;
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
    }

    public ClienteId getClienteId() {
        return clienteId;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public String getEdad() {
        return edad;
    }

    public Direccion getDireccion() {
        return direccion;
    }
}
