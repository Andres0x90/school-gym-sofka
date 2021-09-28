package co.com.sofka.schoolgym.cliente.values;

import co.com.sofka.domain.generic.ValueObject;

public class EstadoMembresia implements ValueObject<String> {

    private String estado;

    public EstadoMembresia(String estado)
    {
        this.estado = estado;
    }

    @Override
    public String value() {
        return estado;
    }

}
