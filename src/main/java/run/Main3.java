package run;

import entities.Freight;
import jakarta.persistence.Persistence;
import repositories.CityRepository;
import repositories.ClientRepository;
import repositories.FreightRepository;
import services.CityService;
import services.ClientService;
import services.FreightService;

import java.math.BigDecimal;

/**
 *
 * Cadastrar fretes, contendo um código, uma descrição, o peso total, um
 * cliente e a cidade de destino, não podendo haver um frete sem os dados
 * citados.
 *
 */
public class Main3 {
  public static void main(String[] args) {
    var factory = Persistence
        .createEntityManagerFactory ("transportadora_hibernate");
    var manager = factory.createEntityManager ();
    var transaction = manager.getTransaction();

    transaction.begin();

    var cityService = new CityService(new CityRepository(manager));
    var clientService = new ClientService(new ClientRepository(manager));
    var freightService = new FreightService(new FreightRepository(manager));

    var client = clientService.findClientById(1L);
    var city = cityService.findCityById(1L);

    if(client.isEmpty() || city.isEmpty()) {
      throw new RuntimeException("Cliente ou cidade inválidos");
    }


    var freight = new Freight(null, city.get(), (client.get()) ,"Descrição do frete via JPA", new BigDecimal(2.5), new BigDecimal(2));

    freightService.saveFreight(freight);

    transaction.commit();

  }
}
