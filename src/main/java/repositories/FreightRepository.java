package repositories;

import entities.Client;
import entities.Freight;
import jakarta.persistence.EntityManager;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

public class FreightRepository extends DAO<Freight, Long>{
  public FreightRepository(EntityManager manager) {
    super(manager, Freight.class);
  }

  public List<Freight> findAllFreightByUser(Client client) {
    var jpql = " SELECT f FROM Freight f WHERE f.id.client.id = :clientID";
    var  query = manager.createQuery(jpql, Freight.class);
    query.setParameter("clientID", client.getId());

    return query.getResultList();
  }

  public List<BigDecimal> listFreightMultiplyBy(BigDecimal value) {
    return findAll()
        .stream()
        .map(freight -> freight.getWeight().multiply(value).add(freight.getCity().getRate()))
        .collect(Collectors.<BigDecimal>toList());

  }
}
