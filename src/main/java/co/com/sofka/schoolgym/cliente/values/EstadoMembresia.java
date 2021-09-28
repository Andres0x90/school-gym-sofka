package co.com.sofka.schoolgym.cliente.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class EstadoMembresia implements ValueObject<String> {

    private String estado;

    public EstadoMembresia(String estado)
    {
        this.estado = Objects.requireNonNull(estado, "El campo estado no debe estar vacio");
    }

    @Override
    public String value() {
        return estado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EstadoMembresia that = (EstadoMembresia) o;
        return Objects.equals(estado, that.estado);
    }

}
