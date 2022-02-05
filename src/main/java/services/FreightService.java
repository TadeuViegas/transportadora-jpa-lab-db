package services;

import entities.ClientCityPK;
import entities.Freight;
import repositories.FreightRepository;

import java.util.Optional;

public class FreightService {

  private final FreightRepository freightRepository;

  public FreightService(FreightRepository freightRepository) {
    this.freightRepository = freightRepository;
  }

  public Optional<Freight> findFreightById(ClientCityPK id) {
    return freightRepository.findById(id);
  }

  public Freight saveFreight(Freight freight) {
    return freightRepository.save(freight);
  }
}
