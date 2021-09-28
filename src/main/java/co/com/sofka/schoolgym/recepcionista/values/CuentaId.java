package co.com.sofka.schoolgym.recepcionista.values;

import co.com.sofka.domain.generic.Identity;

public class CuentaId extends Identity {
    public CuentaId()
    {

    }
    public CuentaId(String cuentaId)
    {
        super(cuentaId);
    }
    public static CuentaId of(String cuentaId)
    {
        return new CuentaId(cuentaId);
    }
}
