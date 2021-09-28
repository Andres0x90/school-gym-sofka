package co.com.sofka.schoolgym.recepcionista.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.schoolgym.recepcionista.Gimnasio;
import co.com.sofka.schoolgym.recepcionista.values.RecepcionistaId;

public class CerrarGimnasio extends Command {
    private final RecepcionistaId recepcionistaId;
    private final Gimnasio gimnasio;

    public CerrarGimnasio(RecepcionistaId recepcionistaId, Gimnasio gimnasio) {
        this.recepcionistaId = recepcionistaId;
        this.gimnasio = gimnasio;
    }

    public RecepcionistaId getRecepcionistaId() {
        return recepcionistaId;
    }

    public Gimnasio getGimnasio() {
        return gimnasio;
    }
}
