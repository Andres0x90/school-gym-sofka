package co.com.sofka.schoolgym.cliente.values;

import co.com.sofka.domain.generic.Identity;

public class MembresiaId extends Identity {
    public MembresiaId(String membresiaId)
    {
        super(membresiaId);
    }
    public static MembresiaId of(String membresiaId)
    {
        return new MembresiaId(membresiaId);
    }
}
