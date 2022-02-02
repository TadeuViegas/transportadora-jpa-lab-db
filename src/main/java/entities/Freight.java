package entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import java.math.BigDecimal;

@Entity
@Table(name = "frete")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Freight implements BaseEntity<Long> {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @ManyToOne
  @JoinColumn(name = "codigo_cidade", nullable = false)
  private City city;

  @ManyToOne
  @JoinColumn(name = "codigo_cliente", nullable = false)
  private Client client;

  @Column(name = "descricao", length = 30, nullable = false)
  private String description;

  @Column(name = "peso", precision = 4, nullable = false)
  private BigDecimal weight;

  @Column(name = "valor", precision = 4, nullable = false)
  private BigDecimal price;

}
