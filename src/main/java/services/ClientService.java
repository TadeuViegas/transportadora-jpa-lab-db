package services;

import entities.Client;
import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;

import jakarta.validation.ValidatorFactory;
import org.hibernate.validator.HibernateValidator;
import repositories.ClientRepository;

import java.util.Optional;
import java.util.Set;


public class ClientService {
  private final ClientRepository clientRepository;

  public ClientService(ClientRepository clientRepository) {
    this.clientRepository = clientRepository;
  }

  public Optional<Client> saveClient(Client client) {

    var validator = Validation
        .buildDefaultValidatorFactory()
        .getValidator();

    var constraintViolations = validator.validate(client);

    if(!constraintViolations.isEmpty()) {
      constraintViolations.forEach(e -> {
        System.err.println(e);
      });

      return Optional.empty();
    }

    return Optional.ofNullable(clientRepository.save(client));
  }

  public Optional<Client> findClientById(Long id) {
    return clientRepository.findById(id);
  }
}
