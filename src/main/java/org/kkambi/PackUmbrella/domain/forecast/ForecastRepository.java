package org.kkambi.PackUmbrella.domain.forecast;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ForecastRepository extends CrudRepository<Forecast, String> {

    @Override
    List<Forecast> findAll();
}
