package co.com.sofka.schoolgym.rutina.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.List;

public class Ejercicio implements ValueObject<Ejercicio.props> {

    private final String accion;
    private final List<String>dias;

    public Ejercicio(String accion, List<String> dias) {
        this.accion = accion;
        this.dias = dias;
    }

    @Override
    public props value() {
        return new props() {
            @Override
            public String accion() {
                return accion;
            }

            @Override
            public List<String> dias() {
                return dias;
            }
        };
    }

    public interface props {
        String accion();
        List<String>dias();
    }
}
