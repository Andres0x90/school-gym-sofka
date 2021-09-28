package co.com.sofka.schoolgym.cliente.values;

import co.com.sofka.domain.generic.ValueObject;

import java.math.BigDecimal;
import java.util.Objects;

public class Pago implements ValueObject<Pago.props> {
    protected BigDecimal valor;
    protected String plan;

    public Pago(BigDecimal valor, String plan) {
        this.valor = Objects.requireNonNull(valor, "El campo valor no debe estar vacio");
        this.plan = Objects.requireNonNull(plan, "El campo plan no debe estar vacio");
    }

    @Override
    public props value() {
        return new props() {
            @Override
            public BigDecimal valor() {
                return valor;
            }

            @Override
            public String plan() {
                return plan;
            }
        };
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pago pago = (Pago) o;
        return Objects.equals(valor, pago.valor) && Objects.equals(plan, pago.plan);
    }


    public interface props {
        BigDecimal valor();
        String plan();
    }
}
