package co.com.sofka.schoolgym.rutina.values;

import co.com.sofka.domain.generic.Identity;
import co.com.sofka.schoolgym.recepcionista.values.GimnasioId;

public class EntrenadorId extends Identity {
    public EntrenadorId()
    {

    }
    public EntrenadorId(String entrenadorId)
    {
        super(entrenadorId);
    }
    public static EntrenadorId of(String entrenadorId)
    {
        return new EntrenadorId(entrenadorId);
    }
}
