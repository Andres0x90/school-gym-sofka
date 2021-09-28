package co.com.sofka.schoolgym.generic.values;

import co.com.sofka.domain.generic.ValueObject;

public class Direccion implements ValueObject<Direccion.props> {
    final String tipo, calle, numero, barrio;

    public Direccion(String tipo, String calle, String numero, String barrio) {
        this.tipo = tipo;
        this.calle = calle;
        this.numero = numero;
        this.barrio = barrio;
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

    public interface props {
        String tipo();
        String calle();
        String numero();
        String barrio();
    }
}
