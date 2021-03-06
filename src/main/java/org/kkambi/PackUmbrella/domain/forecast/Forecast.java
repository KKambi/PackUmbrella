package org.kkambi.PackUmbrella.domain.forecast;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;
import org.springframework.data.redis.core.index.Indexed;

import java.time.LocalDateTime;

@RedisHash
public class Forecast {

    @Id
    private String id;

    @Indexed
    private LocalDateTime forecastDateTime;     //예측일시

    private String POP;     //강수확률

    private String PTY;     //강수형태

    private String T3H;     //3시간 기온

    public static class Builder {
        private LocalDateTime forecastDateTime;     //예측일시

        private String POP;     //강수확률

        private String PTY;     //강수형태

        private String T3H;     //3시간 기온

        public Builder forecastDateTime(LocalDateTime forecastDateTime) {
            this.forecastDateTime = forecastDateTime;
            return this;
        }

        public Builder pop(String pop) {
            this.POP = pop;
            return this;
        }

        public Builder pty(String pty) {
            this.PTY = pty;
            return this;
        }

        public Builder t3h(String t3h) {
            this.T3H = t3h;
            return this;
        }

        public Forecast build() {
            return new Forecast(this);
        }
    }

    private Forecast() {}

    private Forecast(Builder builder) {
        this.forecastDateTime = builder.forecastDateTime;
        this.POP = builder.POP;
        this.PTY = builder.PTY;
        this.T3H = builder.T3H;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDateTime getForecastDateTime() {
        return forecastDateTime;
    }

    public void setForecastDateTime(LocalDateTime forecastDateTime) {
        this.forecastDateTime = forecastDateTime;
    }

    public String getPOP() {
        return POP;
    }

    public void setPOP(String POP) {
        this.POP = POP;
    }

    public String getPTY() {
        return PTY;
    }

    public void setPTY(String PTY) {
        this.PTY = PTY;
    }

    public String getT3H() {
        return T3H;
    }

    public void setT3H(String t3H) {
        T3H = t3H;
    }
}
