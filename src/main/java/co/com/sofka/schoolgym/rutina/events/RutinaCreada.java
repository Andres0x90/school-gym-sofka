package co.com.sofka.schoolgym.rutina.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.schoolgym.generic.values.FechaAdquirida;
import co.com.sofka.schoolgym.rutina.values.RutinaId;

public class RutinaCreada extends DomainEvent {
    private final RutinaId rutinaId;
    private final String objetivo;
    private final FechaAdquirida fechaAdquirida;
    public RutinaCreada(RutinaId rutinaId, String objetivo, FechaAdquirida fechaAdquirida) {
        super("schoolgym.rutina.rutinacreada");
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
