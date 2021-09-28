package co.com.sofka.schoolgym.generic.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Date;

public class FechaAdquirida implements ValueObject<FechaAdquirida.props> {

    protected Date fechaObtenido;
    protected Date fechaDeRenovacion;

    public FechaAdquirida(Date fechaObtenido, Date fechaDeRenovacion) {
        this.fechaObtenido = fechaObtenido;
        this.fechaDeRenovacion = fechaDeRenovacion;
    }

    @Override
    public props value() {
        return new props() {
            @Override
            public Date fechaObtenido() {
                return fechaObtenido;
            }

            @Override
            public Date fechaDeRenovacion() {
                return fechaDeRenovacion;
            }
        };
    }

    public interface props {
        Date fechaObtenido();
        Date fechaDeRenovacion();
    }
}
