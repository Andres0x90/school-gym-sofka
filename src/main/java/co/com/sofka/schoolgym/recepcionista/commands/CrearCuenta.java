package co.com.sofka.schoolgym.recepcionista.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.schoolgym.recepcionista.values.Clave;
import co.com.sofka.schoolgym.recepcionista.values.CuentaId;
import co.com.sofka.schoolgym.recepcionista.values.Usuario;

public class CrearCuenta extends Command {
    private final CuentaId cuentaId;
    private final Usuario usuario;
    private final Clave clave;

    public CrearCuenta(CuentaId cuentaId, Usuario usuario, Clave clave) {
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
