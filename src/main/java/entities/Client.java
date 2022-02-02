package entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "cliente")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Client implements BaseEntity<Long> {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "codigo_cliente")
  private Long id;

  @OneToMany(mappedBy = "client")
  private List<Freight> freight;

  @Column(name = "nome", length = 30)
  private String name;

  @Column(name = "endereco", length = 30)
  private String address;

  @Column(name = "telefone", length = 30)
  private String phoneNumber;

}
