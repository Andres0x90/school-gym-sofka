package co.com.sofka.schoolgym.generic.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.schoolgym.generic.values.Nombre;
import co.com.sofka.schoolgym.generic.values.Direccion;

public class DatosPersonalesActualizados extends DomainEvent {
    private final Nombre nombre;
    private final String edad;
    private final Direccion direccion;

    public DatosPersonalesActualizados(Nombre nombre, String edad, Direccion direccion) {
        super("schoolgym.generic.datospersonalesactualizados");

        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
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
