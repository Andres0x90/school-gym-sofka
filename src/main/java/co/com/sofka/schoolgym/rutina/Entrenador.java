package co.com.sofka.schoolgym.rutina;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.schoolgym.generic.values.Direccion;
import co.com.sofka.schoolgym.generic.values.Nombre;
import co.com.sofka.schoolgym.rutina.values.EntrenadorId;

public class Entrenador extends Entity<EntrenadorId> {
    private Nombre nombre;
    private String edad;
    private Direccion direccion;

    public Entrenador(EntrenadorId entrenadorId, Nombre nombre, String edad, Direccion direccion) {
        super(entrenadorId);
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
    }
    public void cambiarDatosPersonales(Nombre nombre, String edad, Direccion direccion)
    {
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
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
}
