package repositories;


import entities.Client;
import jakarta.persistence.EntityManager;

public class ClientRepository extends DAO<Client, Long> {
  public ClientRepository(EntityManager manager) {
    super(manager, Client.class);
  }
}
