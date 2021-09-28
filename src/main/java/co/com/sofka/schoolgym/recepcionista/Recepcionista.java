package co.com.sofka.schoolgym.recepcionista;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.schoolgym.recepcionista.values.RecepcionistaId;

public class Recepcionista extends AggregateEvent<RecepcionistaId> {
    public Recepcionista(RecepcionistaId entityId) {
        super(entityId);
    }
}
