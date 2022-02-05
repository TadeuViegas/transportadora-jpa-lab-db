package services;

import entities.City;
import repositories.CityRepository;

import java.util.Optional;

public class CityService {
  private final CityRepository cityRepository;

  public CityService(CityRepository cityRepository) {
    this.cityRepository = cityRepository;
  }

  public City saveCity(City city) {
    return cityRepository.save(city);
  }

  public Optional<City> findCityById(Long id) {
    return cityRepository.findById(id);
  }
}
