package co.com.sofka.schoolgym.recepcionista.values;

import co.com.sofka.domain.generic.Identity;
import co.com.sofka.domain.generic.ValueObject;

public class GimnasioId extends Identity {
    public GimnasioId()
    {

    }
    public GimnasioId(String gimnasioId)
    {
        super(gimnasioId);
    }
    public static GimnasioId of(String gimnasioId)
    {
        return new GimnasioId(gimnasioId);
    }
}
