package org.kkambi.PackUmbrella.config;

import org.kkambi.PackUmbrella.factory.YamlPropertySourceFactory;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource(value = "classpath:forecast.yml", factory = YamlPropertySourceFactory.class)
@ConfigurationProperties(prefix = "forecast")
public class ForecastYmlRead {

    private String serviceKey;

    public String getServiceKey() {
        return serviceKey;
    }

    public void setServiceKey(String serviceKey) {
        this.serviceKey = serviceKey;
    }
}
