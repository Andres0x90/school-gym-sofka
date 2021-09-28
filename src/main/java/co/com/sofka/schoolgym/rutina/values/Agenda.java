package co.com.sofka.schoolgym.rutina.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.List;
import java.util.Objects;

public class Agenda implements ValueObject<List> {
    private final List<Ejercicio> ejercicios;

    public Agenda(List<Ejercicio> ejercicios) {
        this.ejercicios = ejercicios;
    }

    @Override
    public List value() {
        return ejercicios;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Agenda agenda = (Agenda) o;
        return Objects.equals(ejercicios, agenda.ejercicios);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ejercicios);
    }
}
