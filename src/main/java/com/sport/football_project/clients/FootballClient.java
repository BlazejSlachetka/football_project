package com.sport.football_project.clients;

import com.sport.football_project.model.football.Football;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class FootballClient {

    public Football getFootballFormApi() {
        RestTemplate restTemplate = new RestTemplate();

        ResponseEntity<Football> exchange = restTemplate.exchange("http://api.football-data.org/v2/matches ",
                HttpMethod.GET,
                HttpEntity.EMPTY,
                Football.class);
        return exchange.getBody();


    }
}

