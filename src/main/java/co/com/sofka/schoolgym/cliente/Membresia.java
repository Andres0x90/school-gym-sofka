package co.com.sofka.schoolgym.cliente;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.schoolgym.cliente.values.EstadoMembresia;
import co.com.sofka.schoolgym.cliente.values.MembresiaId;
import co.com.sofka.schoolgym.cliente.values.Pago;
import co.com.sofka.schoolgym.generic.values.FechaAdquirida;

public class Membresia extends Entity<MembresiaId> {
    private Pago pago;
    private EstadoMembresia estadoMembresia;
    private FechaAdquirida fechaAdquirida;

    public Membresia(MembresiaId membresiaId, Pago pago, FechaAdquirida fechaAdquirida) {
        super(membresiaId);
        this.estadoMembresia = new EstadoMembresia("PENDIENTE");
        this.pago = pago;
        this.fechaAdquirida = fechaAdquirida;
    }

    public void activar()
    {
        this.estadoMembresia = new EstadoMembresia("ACTIVA");
    }
    public void renovar()
    {
        this.estadoMembresia = new EstadoMembresia("ACTIVA");
    }
    public void vencer()
    {
        this.estadoMembresia = new EstadoMembresia("VENCIDA");
    }
    public void rechazar()
    {
        this.estadoMembresia = new EstadoMembresia("RECHAZADA");
    }
    public void cambiarPlanMensual()
    {
        this.estadoMembresia = new EstadoMembresia("MENSUAL");
    }
    public void cambiarPlanQuincenal() {
        this.estadoMembresia = new EstadoMembresia("QUINCENAL");
    }

    public Pago pago() {
        return pago;
    }

    public EstadoMembresia estadoMembresia() {
        return estadoMembresia;
    }

    public FechaAdquirida fechaAdquirida() {
        return fechaAdquirida;
    }
}
