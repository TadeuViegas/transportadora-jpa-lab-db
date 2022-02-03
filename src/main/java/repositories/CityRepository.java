package repositories;

import jakarta.persistence.EntityManager;

public class CityRepository <T, ID> extends DAO<T, ID>{
  public CityRepository(EntityManager manager, Class<T> clazz) {
    super(manager, clazz);
  }
}
