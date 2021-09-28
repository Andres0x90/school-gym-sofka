package co.com.sofka.schoolgym.rutina.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.schoolgym.rutina.values.Agenda;

public class AgendaAsignada extends DomainEvent {
    private final Agenda agenda;

    public AgendaAsignada(Agenda agenda) {
        super("schoolgym.recepcionista.agendaasignada");
        this.agenda = agenda;
    }

    public Agenda getAgenda() {
        return agenda;
    }
}
