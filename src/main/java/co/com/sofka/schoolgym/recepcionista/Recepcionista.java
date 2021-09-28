package co.com.sofka.schoolgym.recepcionista;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.schoolgym.generic.values.Direccion;
import co.com.sofka.schoolgym.generic.values.Nombre;
import co.com.sofka.schoolgym.recepcionista.values.RecepcionistaId;

public class Recepcionista extends AggregateEvent<RecepcionistaId> {
    protected Nombre nombre;
    protected String edad;
    protected Direccion direccion;
    protected Cuenta cuenta;
    protected Gimnasio gimnasio;

    public Recepcionista(RecepcionistaId entityId) {
        super(entityId);
    }
}
