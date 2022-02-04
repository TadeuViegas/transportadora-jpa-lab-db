package repositories;

import entities.City;
import entities.Client;
import jakarta.persistence.EntityManager;

public class CityRepository extends DAO<City, Long>{
  public CityRepository(EntityManager manager) {
    super(manager, City.class);
  }
}
