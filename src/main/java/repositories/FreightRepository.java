package repositories;

import entities.ClientCityPK;
import entities.Freight;
import jakarta.persistence.EntityManager;

public class FreightRepository extends DAO<Freight, ClientCityPK>{
  public FreightRepository(EntityManager manager) {
    super(manager, Freight.class);
  }
}
