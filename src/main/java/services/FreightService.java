package services;

import entities.Freight;
import repositories.FreightRepository;

import java.util.Optional;

public class FreightService {

  private final FreightRepository<Freight, Long> freightRepository;

  public FreightService(FreightRepository<Freight, Long>  freightRepository) {
    this.freightRepository = freightRepository;
  }

  public Optional<Freight> findFreightById(Long id) {
    return freightRepository.findById(id);
  }

  public Freight saveFreight(Freight freight) {
    return freightRepository.save(freight);
  }
}
