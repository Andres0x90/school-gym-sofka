package co.com.sofka.schoolgym.recepcionista.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.schoolgym.generic.values.Direccion;
import co.com.sofka.schoolgym.generic.values.Nombre;
import co.com.sofka.schoolgym.recepcionista.Gimnasio;
import co.com.sofka.schoolgym.recepcionista.values.RecepcionistaId;

public class CrearRecepcionista extends Command {
    private final RecepcionistaId recepcionistaId;
    private final Nombre nombre;
    private final String edad;
    private final Direccion direccion;
    private final Gimnasio gimnasio;

    public CrearRecepcionista(RecepcionistaId recepcionistaId, Nombre nombre, String edad,
                              Direccion direccion, Gimnasio gimnasio) {
        this.recepcionistaId = recepcionistaId;
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
        this.gimnasio = gimnasio;
    }

    public RecepcionistaId getRecepcionistaId() {
        return recepcionistaId;
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

    public Gimnasio getGimnasio() {
        return gimnasio;
    }
}
