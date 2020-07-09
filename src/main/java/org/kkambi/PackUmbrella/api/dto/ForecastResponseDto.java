package org.kkambi.PackUmbrella.api.dto;


import org.kkambi.PackUmbrella.domain.forecast.Forecast;

import java.time.LocalDateTime;

public class ForecastResponseDto {

    private String id;

    private LocalDateTime forecastDateTime;     //예측일시

    private String POP;     //강수확률

    private String PTY;     //강수형태

    private String T3H;     //3시간 기온

    public ForecastResponseDto(Forecast entity) {
        this.id = entity.getId();
        this.forecastDateTime = entity.getForecastDateTime();
        this.POP = entity.getPOP();
        this.PTY = entity.getPTY();
        this.T3H = entity.getT3H();
    }

    public String getId() {
        return id;
    }

    public LocalDateTime getForecastDateTime() {
        return forecastDateTime;
    }

    public String getPOP() {
        return POP;
    }

    public String getPTY() {
        return PTY;
    }

    public String getT3H() {
        return T3H;
    }
}
