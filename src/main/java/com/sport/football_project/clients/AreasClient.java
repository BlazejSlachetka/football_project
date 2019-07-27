package com.sport.football_project.clients;

import com.sport.football_project.common.Areas;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class AreasClient {

    public Areas getAreasFormFormApi() {
        RestTemplate restTemplate = new RestTemplate();

        ResponseEntity<Areas> exchange = restTemplate.exchange("http://api.football-data.org/v2/areas/",
                HttpMethod.GET,
                HttpEntity.EMPTY,
                Areas.class);
        return exchange.getBody();


    }


}
