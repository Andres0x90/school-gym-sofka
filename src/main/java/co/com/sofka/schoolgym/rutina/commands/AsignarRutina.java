package co.com.sofka.schoolgym.rutina.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.schoolgym.rutina.values.Agenda;
import co.com.sofka.schoolgym.rutina.values.RutinaId;

public class AsignarRutina extends Command {
    private final RutinaId rutinaId;
    private final Agenda agenda;

    public AsignarRutina(RutinaId rutinaId, Agenda agenda) {
        this.rutinaId = rutinaId;
        this.agenda = agenda;
    }

    public RutinaId getRutinaId() {
        return rutinaId;
    }

    public Agenda getAgenda() {
        return agenda;
    }
}
