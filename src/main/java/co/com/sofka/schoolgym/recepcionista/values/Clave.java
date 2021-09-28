package co.com.sofka.schoolgym.recepcionista.values;

import co.com.sofka.domain.generic.ValueObject;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.Objects;

public class Clave implements ValueObject<Clave.props> {
    private final String valor;
    private  final PasswordEncoder passwordEncoder;

    public Clave(String valor) {
        this.valor = valor;
        this.passwordEncoder = new BCryptPasswordEncoder();
    }

    @Override
    public props value() {
        return new props() {
            @Override
            public String valor() {
                return valor;
            }

            @Override
            public PasswordEncoder passwordEncoder() {
                return passwordEncoder;
            }
        };
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Clave clave = (Clave) o;
        return Objects.equals(valor, clave.valor) && Objects.equals(passwordEncoder, clave.passwordEncoder);
    }

    @Override
    public int hashCode() {
        return Objects.hash(valor, passwordEncoder);
    }

    public interface props {
        String valor();
        PasswordEncoder passwordEncoder();
    }
}
