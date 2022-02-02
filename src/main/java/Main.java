import entities.Client;
import repositories.ClientRepository;

import javax.persistence.Persistence;

public class Main {
  public static void main(String[] args) {
    var factory = Persistence.createEntityManagerFactory ("transportadora");
    var manager = factory.createEntityManager ();
    var transaction = manager.getTransaction();

    transaction.begin();

    var client = new Client(null, null, "Daniel Rocha", "Rua S", "+55 98 999999999");

    var clientRepository = new ClientRepository<Client, Long>(manager, Client.class);

    clientRepository.save(client);

    var clientSave = clientRepository.findById(client.getId());

    System.err.println(clientRepository.findAll());

    transaction.commit();

//    MainWindow.run(manager);

//    manager.clear();
//    factory.close();

  }
}
