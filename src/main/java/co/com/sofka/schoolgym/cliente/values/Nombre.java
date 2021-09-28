package co.com.sofka.schoolgym.cliente.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Nombre implements ValueObject<Nombre.props> {

    private final String nombres;
    private final String apellidos;

    public Nombre(String nombres,String apellidos)
    {
        this.nombres = Objects.requireNonNull(nombres);
        this.apellidos = Objects.requireNonNull(apellidos);
    }

    @Override
    public props value() {
        return new props() {
            @Override
            public String nombres() {
                return nombres;
            }

            @Override
            public String apellidos() {
                return apellidos;
            }
        };
    }

    protected interface props
    {
        String nombres();
        String apellidos();
    }
}
