package co.com.sofka.schoolgym.rutina.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.schoolgym.rutina.Entrenador;

public class EntrenadorModificado extends DomainEvent {
    private final Entrenador entrenador;

    public EntrenadorModificado(Entrenador entrenador) {
        super("schoolgym.recepcionista.entrenadorasignado");
        this.entrenador = entrenador;
    }

    public Entrenador getEntrenador() {
        return entrenador;
    }
}
