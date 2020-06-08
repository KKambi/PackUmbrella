package org.kkambi.PackUmbrella.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

@RedisHash
public class Forecast {

    @Id
    private String id;

    private String POP;     //강수확률

    private String PYT;     //강수형태

    private String T3H;     //3시간 기온

    public String getPOP() {
        return POP;
    }

    public void setPOP(String POP) {
        this.POP = POP;
    }

    public String getPYT() {
        return PYT;
    }

    public void setPYT(String PYT) {
        this.PYT = PYT;
    }

    public String getT3H() {
        return T3H;
    }

    public void setT3H(String t3H) {
        T3H = t3H;
    }
}
