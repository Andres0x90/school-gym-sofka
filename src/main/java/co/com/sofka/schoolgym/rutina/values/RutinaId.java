package co.com.sofka.schoolgym.rutina.values;

import co.com.sofka.domain.generic.Identity;

public class RutinaId extends Identity {
    public RutinaId()
    {

    }
    public RutinaId(String rutinaId)
    {
        super(rutinaId);
    }
    public static RutinaId of(String rutinaId)
    {
        return new RutinaId(rutinaId);
    }
}
