package co.com.sofka.schoolgym.recepcionista;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.schoolgym.cliente.values.ClienteId;
import co.com.sofka.schoolgym.generic.values.Direccion;
import co.com.sofka.schoolgym.generic.values.Nombre;
import co.com.sofka.schoolgym.recepcionista.events.*;
import co.com.sofka.schoolgym.recepcionista.values.Clave;
import co.com.sofka.schoolgym.recepcionista.values.CuentaId;
import co.com.sofka.schoolgym.recepcionista.values.RecepcionistaId;
import co.com.sofka.schoolgym.recepcionista.values.Usuario;

import java.util.List;

public class Recepcionista extends AggregateEvent<RecepcionistaId> {
    protected Nombre nombre;
    protected String edad;
    protected Direccion direccion;
    protected Cuenta cuenta;
    protected Gimnasio gimnasio;

    public Recepcionista(RecepcionistaId recepcionistaId, Nombre nombre,String edad,
                         Direccion direccion, Gimnasio gimnasio) {
        super(recepcionistaId);
        appendChange(new RecepcionistaCreado(recepcionistaId, nombre, edad, direccion, gimnasio)).apply();
    }

    private Recepcionista(RecepcionistaId recepcionistaId)
    {
        super(recepcionistaId);
        subscribe(new RecepcionistaEventChange(this));
    }
    public static Recepcionista from(RecepcionistaId recepcionistaId, List<DomainEvent> events)
    {
        var recepcionista = new Recepcionista(recepcionistaId);
        events.forEach(recepcionista::applyEvent);
        return recepcionista;
    }

    public void crearCuenta(CuentaId cuentaId, Usuario usuario, Clave clave)
    {
        appendChange(new CuentaCreada(cuentaId, usuario, clave)).apply();
    }
    public void actualizarClave(Clave nuevaClave)
    {
        appendChange(new ClaveActualizada(nuevaClave)).apply();
    }
    public void permitirAccesoCliente(ClienteId clienteId)
    {
        appendChange(new AccesoClientePermitido(clienteId)).apply();
    }
    public void denegarAccesoCliente(ClienteId clienteId)
    {
        appendChange(new AccesoClienteDenegado(clienteId)).apply();
    }
    public void despedirCliente(ClienteId clienteId)
    {
        appendChange(new ClienteDespedido(clienteId)).apply();
    }
    public void abrirGimnasio()
    {
        appendChange(new GimnasioAbierto(gimnasio)).apply();
    }
    public void cerrarGimnasio()
    {
        appendChange(new GimnasioCerrado(gimnasio)).apply();
    }
}
