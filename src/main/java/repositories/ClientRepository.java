package repositories;


import jakarta.persistence.EntityManager;

public class ClientRepository<T, ID> extends DAO<T, ID> {
  public ClientRepository(EntityManager manager, Class<T> clazz) {
    super(manager, clazz);
  }
}
