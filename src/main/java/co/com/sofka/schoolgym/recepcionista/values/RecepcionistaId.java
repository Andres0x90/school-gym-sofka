package co.com.sofka.schoolgym.recepcionista.values;

import co.com.sofka.domain.generic.Identity;

public class RecepcionistaId extends Identity {
    public RecepcionistaId()
    {

    }
    public RecepcionistaId(String recepcionistaId)
    {
        super(recepcionistaId);
    }
    public static RecepcionistaId of(String recepcionistaId)
    {
        return new RecepcionistaId(recepcionistaId);
    }
}
