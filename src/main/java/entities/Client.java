package entities;

import jakarta.persistence.*;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

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

  @OneToMany(mappedBy = "client", cascade = CascadeType.ALL)
  private List<Freight> freight;

  @Column(name = "nome", length = 30)
  @NotBlank
  private String name;

  @Column(name = "endereco", length = 30)
  @NotBlank
  private String address;

  @Column(name = "telefone", length = 30)
  @NotBlank
  private String phoneNumber;

}
