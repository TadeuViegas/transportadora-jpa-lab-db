package entities;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.io.Serializable;

@Embeddable
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class ClientCityPK implements Serializable {
    @ManyToOne
    @JoinColumn(name = "codigo_cidade", nullable = false)
    @NotNull
    private City city;

    @ManyToOne
    @JoinColumn(name = "codigo_cliente", nullable = false)
    @NotNull
    private Client client;
}
