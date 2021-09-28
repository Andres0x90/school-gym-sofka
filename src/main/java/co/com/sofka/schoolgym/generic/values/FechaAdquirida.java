package co.com.sofka.schoolgym.generic.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Date;
import java.util.Objects;

public class FechaAdquirida implements ValueObject<FechaAdquirida.props> {

    protected Date fechaObtenido;
    protected Date fechaDeRenovacion;

    public FechaAdquirida(Date fechaObtenido, Date fechaDeRenovacion) {
        this.fechaObtenido = Objects.requireNonNull(fechaObtenido,
                "El campo fecha de obtencion no debe estar vacio");
        this.fechaDeRenovacion = Objects.requireNonNull(fechaDeRenovacion,
                "El campo fecha de renovacion no debe estar vacio");
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FechaAdquirida that = (FechaAdquirida) o;
        return Objects.equals(fechaObtenido, that.fechaObtenido) && Objects.equals(fechaDeRenovacion, that.fechaDeRenovacion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fechaObtenido, fechaDeRenovacion);
    }

    public interface props {
        Date fechaObtenido();
        Date fechaDeRenovacion();
    }
}
