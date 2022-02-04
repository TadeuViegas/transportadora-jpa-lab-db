package repositories;

import entities.Freight;
import jakarta.persistence.EntityManager;

public class FreightRepository extends DAO<Freight, Long>{
  public FreightRepository(EntityManager manager) {
    super(manager, Freight.class);
  }
}
