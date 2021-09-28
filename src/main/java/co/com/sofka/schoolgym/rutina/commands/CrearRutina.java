package co.com.sofka.schoolgym.rutina.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.schoolgym.generic.values.FechaAdquirida;
import co.com.sofka.schoolgym.rutina.values.RutinaId;

public class CrearRutina extends Command {
    private final RutinaId rutinaId;
    private final String objetivo;
    private final FechaAdquirida fechaAdquirida;

    public CrearRutina(RutinaId rutinaId, String objetivo, FechaAdquirida fechaAdquirida) {
        this.rutinaId = rutinaId;
        this.objetivo = objetivo;
        this.fechaAdquirida = fechaAdquirida;
    }

    public RutinaId getRutinaId() {
        return rutinaId;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public FechaAdquirida getFechaAdquirida() {
        return fechaAdquirida;
    }
}
