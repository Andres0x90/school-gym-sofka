package co.com.sofka.schoolgym.cliente;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.schoolgym.cliente.events.*;
import co.com.sofka.schoolgym.cliente.values.ClienteId;
import co.com.sofka.schoolgym.generic.values.Direccion;
import co.com.sofka.schoolgym.cliente.values.Nombre;
import co.com.sofka.schoolgym.rutina.values.RutinaId;

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

    public void adquirirMembresia()
    {
        appendChange(new MembresiaAdquirida(membresia)).apply();
    }

    public void aprobarMembresia()
    {
        appendChange(new MembresiaAdquirida(membresia)).apply();

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
        appendChange(new datosPersonalesActualizados(nombre, edad, direccion, membresia, rutinaId))
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
