package co.com.sofka.schoolgym.recepcionista.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Usuario implements ValueObject<String> {

    private final String valor;

    public Usuario(String valor)
    {
        this.valor = Objects.requireNonNull(valor, "El campo usuario no debe estar vacio");
    }

    @Override
    public String value() {
        return valor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario1 = (Usuario) o;
        return Objects.equals(valor, usuario1.valor);
    }

}
