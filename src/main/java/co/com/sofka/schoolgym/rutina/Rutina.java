package co.com.sofka.schoolgym.rutina;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.schoolgym.generic.events.DatosPersonalesActualizados;
import co.com.sofka.schoolgym.generic.values.Direccion;
import co.com.sofka.schoolgym.generic.values.FechaAdquirida;
import co.com.sofka.schoolgym.generic.values.Nombre;
import co.com.sofka.schoolgym.rutina.events.*;
import co.com.sofka.schoolgym.rutina.values.Agenda;
import co.com.sofka.schoolgym.rutina.values.RutinaId;

import java.util.List;

public class Rutina extends AggregateEvent<RutinaId> {
    protected String objetivo;
    protected Agenda agenda;
    protected FechaAdquirida fechaAdquirida;
    protected Entrenador entrenador;

    public Rutina(RutinaId rutinaId, String objetivo, FechaAdquirida fechaAdquirida) {
        super(rutinaId);
        appendChange(new RutinaCreada(rutinaId, objetivo,
                fechaAdquirida)).apply();
    }
    private Rutina(RutinaId rutinaId)
    {
        super(rutinaId);
        subscribe(new RutinaEventChange(this));
    }
    public static Rutina from(RutinaId rutinaId, List<DomainEvent>events)
    {
        var rutina = new Rutina(rutinaId);
        events.forEach(rutina::applyEvent);
        return rutina;
    }
    public void asignarAgenda(Agenda agenda)
    {
        appendChange(new AgendaAsignada(agenda)).apply();
    }
    public void modificarAgenda(Agenda agenda)
    {
        appendChange(new AgendaModificada(agenda)).apply();
    }
    public void asignarEntrenador(Entrenador entrenador)
    {
        appendChange(new EntrenadorAsignado(entrenador)).apply();
    }
    public void cambiarEntrenador(Entrenador entrenador)
    {
        appendChange(new EntrenadorModificado(entrenador)).apply();
    }
    public void actualizarDatosPersonalesEntrenador(Nombre nombre, String edad, Direccion direccion)
    {
        appendChange(new DatosPersonalesActualizados(nombre, edad, direccion)).apply();
    }
}
