import entities.Client;
import jakarta.persistence.Persistence;
import repositories.ClientRepository;
import services.ClientService;

public class Main {
  public static void main(String[] args) {
    var factory = Persistence
        .createEntityManagerFactory ("transportadora_hibernate");
    var manager = factory.createEntityManager ();
    var transaction = manager.getTransaction();
//
    transaction.begin();
//
    var client = new Client(null, null, "", "Rua S", "+55 98 999999999");

    var clientRepository = new ClientRepository(manager);
    var clientService = new ClientService(clientRepository);

    var clientSave = clientService.saveClient(client);

    if(clientSave.isEmpty()) {
      System.err.println("Não pode salvar cliente");
    }

//    client = clientRepository.save(client);

//    var clientSave = clientRepository.findById(client.getId());

    System.err.println(clientRepository.findAll());

    transaction.commit();


//    manager.clear();
//    factory.close();

  }
}
