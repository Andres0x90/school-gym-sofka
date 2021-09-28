package co.com.sofka.schoolgym.cliente.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.schoolgym.cliente.Membresia;
import co.com.sofka.schoolgym.cliente.values.Nombre;
import co.com.sofka.schoolgym.generic.values.Direccion;
import co.com.sofka.schoolgym.rutina.values.RutinaId;

public class datosPersonalesActualizados extends DomainEvent {
    private final Nombre nombre;
    private final String edad;
    private final Direccion direccion;
    private final Membresia membresia;
    private final RutinaId rutinaId;

    public datosPersonalesActualizados(Nombre nombre, String edad, Direccion direccion,
                                       Membresia membresia, RutinaId rutinaId) {
        super("schoolgym.cliente.datospersonalesactualizados");

        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
        this.membresia = membresia;
        this.rutinaId = rutinaId;
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

    public Membresia getMembresia() {
        return membresia;
    }

    public RutinaId getRutinaId() {
        return rutinaId;
    }
}
