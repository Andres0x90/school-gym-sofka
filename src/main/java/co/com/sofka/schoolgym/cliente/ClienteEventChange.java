package co.com.sofka.schoolgym.cliente;

import co.com.sofka.domain.generic.EventChange;
import co.com.sofka.schoolgym.cliente.events.*;
import co.com.sofka.schoolgym.generic.events.DatosPersonalesActualizados;

import java.util.Date;
import java.util.Objects;

public class ClienteEventChange extends EventChange {
    public ClienteEventChange(Cliente cliente) {
        apply((ClienteCreado event) ->
        {
            cliente.nombre = event.getNombre();
            cliente.edad = event.getEdad();
            cliente.direccion = event.getDireccion();
            cliente.membresia = event.getMembresia();
            cliente.rutinaId = event.getRutinaId();
        });

        apply((MembresiaAdquirida event) ->
        {
            cliente.membresia = new Membresia(event.getMembresiaId(), event.getPago(),
                    event.getFechaAdquirida());
        });

        apply((MembresiaAprobada event) ->
        {
            Objects.requireNonNull(event.getMembresia(),
                    "Este cliente debe tener asociado una membrecia").activar();
        });
        apply((MembresiaRechazada event) ->
        {
            Objects.requireNonNull(event.getMembresia(),
                    "Este cliente debe tener asociado una membrecia").rechazar();
        });
        apply((MembresiaRenovada event) ->
        {
            Objects.requireNonNull(event.getMembresia(),
                    "Este cliente debe tener asociado una membrecia").renovar();
        });
        apply((MembresiaVencida event) ->
        {
            Objects.requireNonNull(event.getMembresia(),
                    "Este cliente debe tener asociado una membrecia").vencer();
        });
        apply((estadoMembresiaComprobada event) ->
        {
            var membresia = Objects.requireNonNull(event.getMembresia(),
                    "Este cliente debe tener asociado una membrecia");
            Date currentDate = new Date();

            if (currentDate.after(membresia.fechaAdquirida().value().fechaDeRenovacion()))
                cliente.vencerMembresia();

        });
        apply((RutinaAdquirida event) ->
        {
            Objects.requireNonNull(event.getRutinaId(),
                    "Este cliente debete tener asociado una rutina primero");
            cliente.rutinaId = event.getRutinaId();
        });
        apply((RutinaCambiada event) ->
        {
            Objects.requireNonNull(event.getRutinaId(),
                    "Este cliente debete tener asociado una rutina primero");
            cliente.rutinaId = event.getRutinaId();
        });
        apply((DatosPersonalesActualizados event) ->
        {
            cliente.nombre = event.getNombre();
            cliente.edad = event.getEdad();
            cliente.direccion = event.getDireccion();
        });
    }
}
