package com.sport.football_project.clients;

import com.sport.football_project.common.Competitions;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CompetitionsClient {
    public Competitions getCompetitionsFormFormApi() {
        RestTemplate restTemplate = new RestTemplate();

        ResponseEntity<Competitions> exchange = restTemplate.exchange("http://api.football-data.org/v2/competitions",
                HttpMethod.GET,
                HttpEntity.EMPTY,
                Competitions.class);
        return exchange.getBody();


    }
}
