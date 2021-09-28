package co.com.sofka.schoolgym.recepcionista;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.schoolgym.cliente.values.ClienteId;
import co.com.sofka.schoolgym.recepcionista.values.EstadoGimnasio;
import co.com.sofka.schoolgym.recepcionista.values.GimnasioId;

import java.util.ArrayList;
import java.util.List;

public class Gimnasio extends Entity<GimnasioId> {
    private String nombre;
    private List<ClienteId>clientesIdAdentro;
    private EstadoGimnasio estado;

    public Gimnasio(GimnasioId entityId, String nombre) {
        super(entityId);
        this.nombre = nombre;
        this.clientesIdAdentro = new ArrayList<>();
        cerrar();
    }
    public void abrir()
    {
        this.estado = new EstadoGimnasio("ABIERTO");
    }
    public void cerrar()
    {
        this.estado = new EstadoGimnasio("CERRADO");
    }
    public void ingresarCliente(ClienteId clienteId)
    {
        clientesIdAdentro.add(clienteId);
    }
    public ClienteId rechazarCliente(ClienteId clienteId)
    {
        return clienteId;
    }
    public void sacarCliente(ClienteId clienteId)
    {
        this.clientesIdAdentro = (List<ClienteId>) clientesIdAdentro.stream().filter(
                clienteFilterId-> !clienteFilterId.equals(clienteId))
                .findFirst().orElseThrow(IllegalArgumentException::new);
    }
}
