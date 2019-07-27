package com.sport.football_project.clients;

import com.sport.football_project.common.Players;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PlayersClient {

    public Players getPlayersFormFormApi() {
        RestTemplate restTemplate = new RestTemplate();

        ResponseEntity<Players> exchange = restTemplate.exchange("http://api.football-data.org/v2/players",
                HttpMethod.GET,
                HttpEntity.EMPTY,
                Players.class);
        return exchange.getBody();


    }



}
//http://api.football-data.org/v2/players