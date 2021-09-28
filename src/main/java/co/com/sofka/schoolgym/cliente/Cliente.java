package co.com.sofka.schoolgym.cliente;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.schoolgym.cliente.events.*;
import co.com.sofka.schoolgym.cliente.values.ClienteId;
import co.com.sofka.schoolgym.cliente.values.MembresiaId;
import co.com.sofka.schoolgym.cliente.values.Pago;
import co.com.sofka.schoolgym.generic.values.Direccion;
import co.com.sofka.schoolgym.cliente.values.Nombre;
import co.com.sofka.schoolgym.generic.values.FechaAdquirida;
import co.com.sofka.schoolgym.rutina.values.RutinaId;

import java.util.List;

public class Cliente extends AggregateEvent<ClienteId> {

    protected Nombre nombre;
    protected String edad;
    protected Direccion direccion;
    protected Membresia membresia;
    protected RutinaId rutinaId;

    public Cliente(ClienteId entityId, Nombre nombre, String edad, Direccion direccion,
                   Membresia membresia, RutinaId rutinaId) {
        super(entityId);
        appendChange(new ClienteCreado(entityId, nombre, edad, direccion,
                membresia, rutinaId)).apply();
    }

    private Cliente(ClienteId clienteId)
    {
        super(clienteId);
        subscribe(new ClienteEventChange(this));
    }

    public static Cliente from(ClienteId clienteId, List<DomainEvent> events)
    {
        var cliente = new Cliente(clienteId);
        events.forEach(cliente::applyEvent);
        return cliente;
    }

    public void adquirirMembresia(MembresiaId membresiaId, Pago pago, FechaAdquirida fechaAdquirida)
    {
        appendChange(new MembresiaAdquirida(membresiaId, pago, fechaAdquirida)).apply();
    }

    public void aprobarMembresia()
    {
        appendChange(new MembresiaAprobada(membresia)).apply();

    }
    public void rechazarMembresia()
    {
        appendChange(new MembresiaRechazada(membresia)).apply();

    }
    public void renovarMembresia()
    {
        appendChange(new MembresiaRenovada(membresia)).apply();

    }
    public void vencerMembresia()
    {
        appendChange(new MembresiaVencida(membresia)).apply();

    }
    public void comprobarEstadoMembresia()
    {
        appendChange(new estadoMembresiaComprobada(membresia)).apply();
    }
    public void adquirirRutina(RutinaId rutinaId)
    {
        appendChange(new RutinaAdquirida(rutinaId)).apply();
    }
    public void cambiarRutina(RutinaId rutinaId)
    {
        appendChange(new RutinaCambiada(rutinaId)).apply();
    }
    public void actualizarDatosPersonales(Nombre nombre, String edad, Direccion direccion,
                                          Membresia membresia, RutinaId rutinaId)
    {
        appendChange(new DatosPersonalesActualizados(nombre, edad, direccion))
                .apply();
    }

    public Nombre nombre() {
        return nombre;
    }

    public String edad() {
        return edad;
    }

    public Direccion direccion() {
        return direccion;
    }

    public Membresia membresia() {
        return membresia;
    }

    public RutinaId rutinaId() {
        return rutinaId;
    }
}
