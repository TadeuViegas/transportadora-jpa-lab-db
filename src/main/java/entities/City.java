package entities;


import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.math.BigDecimal;

@Entity
@Table(name = "cidade")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class City implements BaseEntity<Long> {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "codigo_cidade")
  private Long id;

  @Column(name = "nome", length = 30)
  @Size(max = 30)
  private String name;

  @Column(name = "uf", length = 30)
  @Size(max = 30)
  private String uf;

  @Column(name = "taxa", precision = 4)
  private BigDecimal rate;

}
