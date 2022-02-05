package run;

import entities.Client;
import jakarta.persistence.Persistence;
import repositories.ClientRepository;
import services.ClientService;

/**
 * Cadastrar clientes, contendo os dados: nome, endereço e telefone;
 */
public class Main1 {
  public static void main(String[] args) {
    var factory = Persistence
        .createEntityManagerFactory ("transportadora_hibernate");
    var manager = factory.createEntityManager ();
    var transaction = manager.getTransaction();

    transaction.begin();

    var client = new Client(null, null, "Baianin do Samba", "Rua S", "+55 98 999999999");

    var clientRepository = new ClientRepository(manager);
    var clientService = new ClientService(clientRepository);

    var clientSave = clientService.saveClient(client);

    if(clientSave.isEmpty()) {
      System.err.println("Não pode salvar cliente");
    }

    System.err.println(clientRepository.findAll());

    transaction.commit();

  }
}
