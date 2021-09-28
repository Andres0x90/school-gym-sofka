package co.com.sofka.schoolgym.cliente.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Nombre implements ValueObject<Nombre.props> {

    private final String nombres;
    private final String apellidos;

    public Nombre(String nombres,String apellidos)
    {
        this.nombres = Objects.requireNonNull(nombres, "El campo nombre no debe estar vacio");
        this.apellidos = Objects.requireNonNull(apellidos, "El campo apellido no debe estar vacio");
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Nombre nombre = (Nombre) o;
        return nombres.equals(nombre.nombres) && apellidos.equals(nombre.apellidos);
    }


    protected interface props
    {
        String nombres();
        String apellidos();
    }
}
