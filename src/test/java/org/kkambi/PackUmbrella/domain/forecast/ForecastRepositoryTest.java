package org.kkambi.PackUmbrella.domain.forecast;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


@RunWith(SpringRunner.class)
@SpringBootTest
public class ForecastRepositoryTest {

    @Autowired
    private ForecastRepository forecastRepository;

    @Test
    public void save_forecast_in_redis() {
        //given
        String POP = "20";
        String PTY = "10";
        String T3H = "27";

        forecastRepository.save(new Forecast.Builder()
                            .pop(POP)
                            .pty(PTY)
                            .t3h(T3H)
                            .build());

        //when
        List<Forecast> forecasts = forecastRepository.findAll();

        //then
        Forecast forecast = forecasts.get(0);
        assertThat(forecast.getPOP()).isEqualTo(POP);
        assertThat(forecast.getPTY()).isEqualTo(PTY);
        assertThat(forecast.getT3H()).isEqualTo(T3H);
    }
}