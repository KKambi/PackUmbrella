package org.kkambi.PackUmbrella.domain.forecast;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

@RedisHash
public class Forecast {

    @Id
    private String id;

    private String POP;     //강수확률

    private String PTY;     //강수형태

    private String T3H;     //3시간 기온

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