package co.com.sofka.schoolgym.recepcionista;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.schoolgym.recepcionista.values.Clave;
import co.com.sofka.schoolgym.recepcionista.values.CuentaId;
import co.com.sofka.schoolgym.recepcionista.values.Usuario;

public class Cuenta extends Entity<CuentaId> {
    private Usuario usuario;
    private Clave clave;

    public Cuenta(CuentaId entityId, Usuario usuario, Clave clave) {
        super(entityId);
        this.usuario = usuario;
        this.clave = clave;
    }

   public void cambiarClave(Clave nuevaClave)
   {
       this.clave = nuevaClave;
   }

    public Usuario usuario() {
        return usuario;
    }
}
