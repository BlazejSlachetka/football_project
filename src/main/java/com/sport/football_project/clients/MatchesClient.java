package com.sport.football_project.clients;

import com.sport.football_project.common.Matches;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class MatchesClient {

    public Matches getMatchesFormFormApi() {
        RestTemplate restTemplate = new RestTemplate();

        ResponseEntity<Matches> exchange = restTemplate.exchange("http://api.football-data.org/v2/matches",
                HttpMethod.GET,
                HttpEntity.EMPTY,
                Matches.class);
        return exchange.getBody();

    }

}

