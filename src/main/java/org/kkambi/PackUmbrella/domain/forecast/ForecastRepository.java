package org.kkambi.PackUmbrella.domain.forecast;

import org.springframework.data.repository.CrudRepository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

public interface ForecastRepository extends CrudRepository<Forecast, String> {

    @Override
    List<Forecast> findAll();

    Optional<Forecast> findByForecastDateTime(LocalDateTime forecastDateTime);
}
