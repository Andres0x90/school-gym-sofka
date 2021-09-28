package co.com.sofka.schoolgym.recepcionista.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.schoolgym.recepcionista.values.Clave;

public class ClaveActualizada extends DomainEvent {
    private final Clave nuevaClave;

    public ClaveActualizada(Clave nuevaClave) {
        super("schoolgym.recepcionista.claveactualizada");
        this.nuevaClave = nuevaClave;
    }

    public Clave getNuevaClave() {
        return nuevaClave;
    }
}
