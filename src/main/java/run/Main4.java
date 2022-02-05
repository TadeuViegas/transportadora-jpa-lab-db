package run;

import jakarta.persistence.Persistence;
import repositories.CityRepository;
import repositories.FreightRepository;
import services.FreightService;

import java.math.BigDecimal;

/**
 *
 * Recuperar o valor do frete, que deve ser calculado através do peso
 * multiplicado por um valor fixo (por exemplo R$ 10,00), acrescido da taxa de
 * entrega associada a cada cidade de destino.
 */

public class Main4 {
  public static void main(String[] args) {
    var factory = Persistence
        .createEntityManagerFactory ("transportadora_hibernate");
    var manager = factory.createEntityManager ();
    var transaction = manager.getTransaction();

    var freightService = new FreightService(new FreightRepository(manager));

    transaction.begin();
    freightService
        .listFreightMultiplyBy(new BigDecimal(12))
        .forEach(System.out::println);

    transaction.commit();
  }
}
