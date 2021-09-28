package co.com.sofka.schoolgym.rutina.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.schoolgym.rutina.values.Agenda;

public class AgendaModificada extends DomainEvent {
    private final Agenda agenda;

    public AgendaModificada(Agenda agenda) {
        super("schoolgym.recepcionista.agendamodificada");
        this.agenda = agenda;
    }

    public Agenda getAgenda() {
        return agenda;
    }
}
