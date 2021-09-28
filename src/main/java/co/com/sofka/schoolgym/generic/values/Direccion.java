package co.com.sofka.schoolgym.generic.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Direccion implements ValueObject<Direccion.props> {
    final String tipo, calle, numero, barrio;

    public Direccion(String tipo, String calle, String numero, String barrio) {
        this.tipo = Objects.requireNonNull(tipo, "El campo tipo no debe estar vacio");
        this.calle = Objects.requireNonNull(calle, "El campo calle no debe estar vacio");
        this.numero = Objects.requireNonNull(numero, "El campo numero no debe estar vacio");
        this.barrio = Objects.requireNonNull(barrio, "El campo barrio no debe estar vacio");
    }

    @Override
    public props value() {
        return new props() {
            @Override
            public String tipo() {
                return tipo;
            }

            @Override
            public String calle() {
                return calle;
            }

            @Override
            public String numero() {
                return numero;
            }

            @Override
            public String barrio() {
                return barrio;
            }
        };
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Direccion direccion = (Direccion) o;
        return Objects.equals(tipo, direccion.tipo) && Objects.equals(calle, direccion.calle) && Objects.equals(numero, direccion.numero) && Objects.equals(barrio, direccion.barrio);
    }

    public interface props {
        String tipo();
        String calle();
        String numero();
        String barrio();
    }
}
