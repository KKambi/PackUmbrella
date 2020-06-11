package org.kkambi.PackUmbrella.api;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.kkambi.PackUmbrella.config.ForecastYmlRead;
import org.kkambi.PackUmbrella.service.ForecastService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.client.AutoConfigureWebClient;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

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

    @Test
    public void get_request_dateTime_in_api() throws Exception {
        mockMvc.perform(get("/api/v1/forecast"))
                .andExpect(status().isOk())
                .andDo(print());
    }
}