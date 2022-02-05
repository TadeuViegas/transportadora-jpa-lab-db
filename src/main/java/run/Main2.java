package run;

import entities.City;
import jakarta.persistence.Persistence;
import repositories.CityRepository;
import services.CityService;

import java.math.BigDecimal;

/**
 *
 * Cadastrar cidades, que representam os lugares abrangidos pela empresa de
 * transportes e contêm o nome da cidade, o estado a que pertence, e o valor
 * para a taxa de entrega;
 */
public class Main2 {
  public static void main(String[] args) {
    var factory = Persistence
        .createEntityManagerFactory ("transportadora_hibernate");
    var manager = factory.createEntityManager ();
    var transaction = manager.getTransaction();

    transaction.begin();

    var city = new City(null, "Nova Iorque", "MA", new BigDecimal(20));

    var cityService = new CityService(new CityRepository(manager));

    cityService.saveCity(city);


    transaction.commit();
  }
}
