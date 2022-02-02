package repositories;

import javax.persistence.EntityManager;

public class CityRepository <T, ID> extends DAO<T, ID>{
  public CityRepository(EntityManager manager, Class<T> clazz) {
    super(manager, clazz);
  }
}
