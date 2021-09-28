package co.com.sofka.schoolgym.recepcionista.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.schoolgym.recepcionista.values.Clave;
import co.com.sofka.schoolgym.recepcionista.values.CuentaId;
import co.com.sofka.schoolgym.recepcionista.values.Usuario;

public class CuentaCreada extends DomainEvent {
    private final CuentaId cuentaId;
    private final Usuario usuario;
    private final Clave clave;

    public CuentaCreada(CuentaId cuentaId, Usuario usuario, Clave clave) {
        super("schoolgym.recepcionista.cuentacreada");
        this.cuentaId = cuentaId;
        this.usuario = usuario;
        this.clave = clave;
    }

    public CuentaId getCuentaId() {
        return cuentaId;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public Clave getClave() {
        return clave;
    }
}
