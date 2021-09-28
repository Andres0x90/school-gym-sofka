package co.com.sofka.schoolgym.rutina.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.schoolgym.rutina.Entrenador;
import co.com.sofka.schoolgym.rutina.values.RutinaId;

public class ModificarEntrenador extends Command {
    private final RutinaId rutinaId;
    private final Entrenador entrenador;

    public ModificarEntrenador(RutinaId rutinaId, Entrenador entrenador) {
        this.rutinaId = rutinaId;
        this.entrenador = entrenador;
    }

    public RutinaId getRutinaId() {
        return rutinaId;
    }

    public Entrenador getEntrenador() {
        return entrenador;
    }
}
