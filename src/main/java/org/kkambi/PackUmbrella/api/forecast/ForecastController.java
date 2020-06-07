package org.kkambi.PackUmbrella.api.forecast;

import org.kkambi.PackUmbrella.config.ForecastYmlRead;
import org.kkambi.PackUmbrella.service.ForecastServiceImpl;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.DefaultUriBuilderFactory;
import org.springframework.web.util.UriBuilder;

@RestController
@RequestMapping("/api/v1")
public class ForecastController {

    private final ForecastYmlRead forecastYmlRead;

    private final RestTemplateBuilder restTemplateBuilder;

    private final ForecastServiceImpl forecastService;

    public ForecastController(RestTemplateBuilder restTemplateBuilder, ForecastServiceImpl forecastService, ForecastYmlRead forecastYmlRead){
        this.restTemplateBuilder = restTemplateBuilder;
        this.forecastService = forecastService;
        this.forecastYmlRead = forecastYmlRead;
    }

    @GetMapping("/forecast")
    public String getForecast() {
        RestTemplate restTemplate = new RestTemplateBuilder().build();

        String callUri = "http://apis.data.go.kr";

        DefaultUriBuilderFactory uriBuilderFactory = new DefaultUriBuilderFactory(callUri);
        uriBuilderFactory.setEncodingMode(DefaultUriBuilderFactory.EncodingMode.NONE);

        UriBuilder uriBuilder = uriBuilderFactory.builder();
        uriBuilder
                .path("/1360000/VilageFcstInfoService/getVilageFcst")
                .queryParam("ServiceKey", forecastYmlRead.getServiceKey())
                .queryParam("pageNo", "1")
                .queryParam("numOfRows", "10")
                .queryParam("dataType", "JSON")
                .queryParam("base_date", "20200526")
                .queryParam("base_time", "1400")
                .queryParam("nx", "1")
                .queryParam("ny", "1");

        ResponseEntity responseEntity = restTemplate.exchange(uriBuilder.build(), HttpMethod.GET, null, String.class);
        String response = (String) responseEntity.getBody();
        System.out.println(response);
        return response;
    }
}
