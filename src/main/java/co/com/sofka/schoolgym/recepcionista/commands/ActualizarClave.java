package co.com.sofka.schoolgym.recepcionista.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.schoolgym.recepcionista.Cuenta;
import co.com.sofka.schoolgym.recepcionista.values.Clave;
import co.com.sofka.schoolgym.recepcionista.values.RecepcionistaId;

public class ActualizarClave extends Command {
    private final RecepcionistaId recepcionistaId;
    private final Cuenta cuenta;
    private final Clave nuevaClave;

    public ActualizarClave(RecepcionistaId recepcionistaId,Cuenta cuenta, Clave nuevaClave) {
        this.recepcionistaId = recepcionistaId;
        this.cuenta = cuenta;
        this.nuevaClave = nuevaClave;
    }

    public RecepcionistaId getRecepcionistaId() {
        return recepcionistaId;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    public Clave getNuevaClave() {
        return nuevaClave;
    }
}
