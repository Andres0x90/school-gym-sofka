package co.com.sofka.schoolgym.rutina;

import co.com.sofka.domain.generic.EventChange;
import co.com.sofka.schoolgym.generic.events.DatosPersonalesActualizados;
import co.com.sofka.schoolgym.rutina.events.*;

import java.util.Objects;

public class RutinaEventChange extends EventChange {
    public RutinaEventChange(Rutina rutina)
    {
        apply((RutinaCreada event)->
        {
            rutina.objetivo = event.getObjetivo();
            rutina.fechaAdquirida = event.getFechaAdquirida();
        });
        apply((AgendaAsignada event)->
        {
            rutina.agenda = event.getAgenda();
        });
        apply((AgendaModificada event)->
        {
            rutina.agenda = event.getAgenda();
        });
        apply((EntrenadorAsignado event)->
        {
            rutina.entrenador = event.getEntrenador();
        });
        apply((EntrenadorModificado event)->
        {
            rutina.entrenador = event.getEntrenador();
        });
        apply((DatosPersonalesActualizados event)->
        {
            Objects.requireNonNull(rutina.entrenador
                            , "Se necesita primero tener un entrenador asociado")
                    .cambiarDatosPersonales(event.getNombre(), event.getEdad(),
                    event.getDireccion());
        });
    }
}
