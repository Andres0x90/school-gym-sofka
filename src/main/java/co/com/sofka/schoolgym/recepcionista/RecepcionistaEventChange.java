package co.com.sofka.schoolgym.recepcionista;

import co.com.sofka.domain.generic.EventChange;
import co.com.sofka.schoolgym.recepcionista.events.*;

import java.util.Objects;

public class RecepcionistaEventChange extends EventChange {
    public RecepcionistaEventChange(Recepcionista recepcionista)
    {
        apply((RecepcionistaCreado event) ->
        {
            recepcionista.nombre = event.getNombre();
            recepcionista.edad = event.getEdad();
            recepcionista.direccion = event.getDireccion();
            recepcionista.gimnasio = event.getGimnasio();
        });
        apply((CuentaCreada event)->
        {
            recepcionista.cuenta = new Cuenta(event.getCuentaId(), event.getUsuario(),
                    event.getClave());
        });
        apply((ClaveActualizada event)->
        {
            Objects.requireNonNull(recepcionista.cuenta,
                    "Es necesario que tenga una cuenta asociada primero")
                    .cambiarClave(event.getNuevaClave());
        });
        apply((AccesoClientePermitido event)->
        {
            Objects.requireNonNull(recepcionista.gimnasio
                    , "Es necesario que tenga asociado un gimnasio")
                    .ingresarCliente(event.getClienteId());
        });
        apply((AccesoClienteDenegado event)->
        {
            Objects.requireNonNull(recepcionista.gimnasio
                            , "Es necesario que tenga asociado un gimnasio")
                    .rechazarCliente(event.getClienteId());
        });

        apply((ClienteDespedido event)->
        {
            Objects.requireNonNull(recepcionista.gimnasio
                            , "Es necesario que tenga asociado un gimnasio")
                    .sacarCliente(event.getClienteId());
        });
        apply((GimnasioAbierto event)->
        {
            Objects.requireNonNull(recepcionista.gimnasio
                            , "Es necesario que tenga asociado un gimnasio")
                    .abrir();
        });
        apply((GimnasioCerrado event)->
        {
            Objects.requireNonNull(recepcionista.gimnasio
                            , "Es necesario que tenga asociado un gimnasio")
                    .cerrar();
        });
    }
}
