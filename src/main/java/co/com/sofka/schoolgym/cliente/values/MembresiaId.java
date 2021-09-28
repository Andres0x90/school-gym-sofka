package co.com.sofka.schoolgym.cliente.values;

import co.com.sofka.domain.generic.Identity;
import co.com.sofka.schoolgym.cliente.Membresia;

public class MembresiaId extends Identity {
    public MembresiaId(){}
    public MembresiaId(String membresiaId)
    {
        super(membresiaId);
    }
    public static MembresiaId of(String membresiaId)
    {
        return new MembresiaId(membresiaId);
    }
}
