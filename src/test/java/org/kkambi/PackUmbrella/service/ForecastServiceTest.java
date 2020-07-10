package org.kkambi.PackUmbrella.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDateTime;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ForecastServiceTest {

    @Autowired
    private ForecastService forecastService;

    @Test
    public void test_getMainDateTime() {
        //given
        LocalDateTime currDateTime = LocalDateTime.of(2020, 7, 10, 13, 42, 23);

        //when
        LocalDateTime mainDateTime = forecastService.getMainDateTime(currDateTime);

        //then
        assertThat(mainDateTime.getHour()).isEqualTo(18);
    }

    @Test
    public void test_getForecastDateTime() {
        //given
        LocalDateTime currDateTime = LocalDateTime.of(2020, 7, 31, 23, 42, 23);

        //when
        LocalDateTime mainDateTime = forecastService.getMainDateTime(currDateTime);
        LocalDateTime forecastDateTime = forecastService.getForecastDateTime(currDateTime, mainDateTime);

        //then
        assertThat(mainDateTime.getDayOfMonth()).isEqualTo(1);
        assertThat(mainDateTime.getHour()).isEqualTo(6);
        assertThat(forecastDateTime.getHour()).isEqualTo(23);
    }
}