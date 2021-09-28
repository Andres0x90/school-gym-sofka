package co.com.sofka.schoolgym.recepcionista.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class EstadoGimnasio implements ValueObject<String> {
    private final String valor;

    public EstadoGimnasio(String valor) {
        this.valor = Objects.requireNonNull(valor, "El campo estado no debe estar vacio");
    }

    @Override
    public String value() {
        return valor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EstadoGimnasio that = (EstadoGimnasio) o;
        return Objects.equals(valor, that.valor);
    }

}
