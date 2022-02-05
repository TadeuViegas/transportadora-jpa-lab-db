package entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import java.math.BigDecimal;

@Entity
@Table(name = "frete")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Freight implements BaseEntity<ClientCityPK> {

  @EmbeddedId
  private ClientCityPK id = new ClientCityPK();

  @Column(name = "descricao", length = 30, nullable = false)
  @NotBlank
  @Size(max = 30)
  private String description;

  @Column(name = "peso", precision = 4, nullable = false)
  @NotNull
  private BigDecimal weight;

  @Column(name = "valor", precision = 4, nullable = false)
  @NotNull
  private BigDecimal price;

}
