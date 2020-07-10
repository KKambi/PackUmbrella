package org.kkambi.PackUmbrella.api;

import org.junit.runner.RunWith;
import org.kkambi.PackUmbrella.config.ForecastYmlRead;
import org.kkambi.PackUmbrella.service.ForecastService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.client.AutoConfigureWebClient;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@WebMvcTest(ForecastController.class)
@AutoConfigureWebClient
public class ForecastControllerTest {

    @Autowired
    MockMvc mockMvc;

    @MockBean
    ForecastService forecastService;

    @MockBean
    ForecastYmlRead forecastYmlRead;
}