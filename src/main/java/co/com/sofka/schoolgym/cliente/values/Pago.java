package co.com.sofka.schoolgym.cliente.values;

import co.com.sofka.domain.generic.ValueObject;

import java.math.BigDecimal;

public class Pago implements ValueObject<Pago.props> {
    protected BigDecimal valor;
    protected String plan;

    public Pago(BigDecimal valor, String plan) {
        this.valor = valor;
        this.plan = plan;
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

    public interface props {
        BigDecimal valor();
        String plan();
    }
}
