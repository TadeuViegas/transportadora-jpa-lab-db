package run;

import jakarta.persistence.Persistence;
import repositories.ClientRepository;
import repositories.FreightRepository;
import services.ClientService;
import services.FreightService;

/**
 * Recuperar uma lista com todos os fretes de um determinado cliente
 */
public class Main5 {
  public static void main(String[] args) {
    var factory = Persistence
        .createEntityManagerFactory ("transportadora_hibernate");
    var manager = factory.createEntityManager ();
    var transaction = manager.getTransaction();

    transaction.begin();
    var freightService = new FreightService(new FreightRepository(manager));
    var clientService = new ClientService(new ClientRepository(manager));
    var client = clientService.findClientById(2L);

    if(client.isEmpty()) {
      throw new RuntimeException("Cliente não existe");
    }

    freightService
        .findAllFreightFromUser(client.get())
        .forEach(System.out::println);

    transaction.commit();
  }
}
