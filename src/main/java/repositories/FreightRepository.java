package repositories;

import javax.persistence.EntityManager;

public class FreightRepository <T, ID> extends DAO<T, ID>{
  public FreightRepository(EntityManager manager, Class<T> clazz) {

    super(manager, clazz);
  }
}
