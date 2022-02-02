package repositories;


import javax.persistence.EntityManager;
import java.io.Serializable;

public class ClientRepository<T, ID extends Serializable>  extends DAO<T, ID> {
  public ClientRepository(EntityManager manager,  Class<T> clazz) {
    super(manager, clazz);
  }
}
