package services;

import entities.Client;
import entities.Freight;
import jakarta.validation.Validation;
import repositories.FreightRepository;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

public class FreightService {

  private final FreightRepository freightRepository;

  public FreightService(FreightRepository freightRepository) {
    this.freightRepository = freightRepository;
  }

  public Optional<Freight> findFreightById(Long id) {
    return freightRepository.findById(id);
  }

  public Optional<Freight> saveFreight(Freight freight) {
    var validator = Validation
        .buildDefaultValidatorFactory()
        .getValidator();

    var constraintViolations = validator.validate(freight);

    if(!constraintViolations.isEmpty()) {
      constraintViolations.forEach(e -> {
        System.err.println(e);
      });

      return Optional.empty();
    }

    return Optional.ofNullable(freightRepository.save(freight));
  }

  public List<Freight> findAllFreightFromUser(Client client) {
    return freightRepository.findAllFreightByUser(client);
  }

  public List<BigDecimal> listFreightMultiplyBy(BigDecimal value) {
    return freightRepository.listFreightMultiplyBy(value);
  }
}
