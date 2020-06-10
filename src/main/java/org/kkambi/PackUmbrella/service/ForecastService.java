package org.kkambi.PackUmbrella.service;

import org.kkambi.PackUmbrella.domain.forecast.ForecastRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class ForecastService {

    private ForecastRepository forecastRepository;

    public ForecastService(ForecastRepository forecastRepository) {
        this.forecastRepository = forecastRepository;
    }

    //TODO 1. API 요청 시각으로 Redis 캐싱 여부 조회
    boolean isCached(LocalDateTime requestDateTime) {

    }
//
//    //TODO 2. API 요청 시각으로부터 가장 가까운 발표 시각 구하기
//    LocalDateTime getForecastTime(LocalDateTime requestDateTime) {
//
//    }
//
//    //TODO 3. 가장 가까운 발표 시각으로부터 필요한 numOfRows의 값을 구하기
//    int getNumOfRows(LocalDateTime forecastTime) {
//
//    }
//
//    //TODO 4. 가장 가까운 발표 시각으로 요청하고 응답받기 -> 해당 응답값을 Controller에서 response하면 json응답!
//    Forecast requestForecast(LocalDateTime forecastTime) {
//
//    }
}
