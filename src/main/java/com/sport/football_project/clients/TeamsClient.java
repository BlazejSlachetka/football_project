package com.sport.football_project.clients;
import com.sport.football_project.common.Teams;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class TeamsClient {

    public Teams getTeamsFormFormApi() {
        RestTemplate restTemplate = new RestTemplate();

        ResponseEntity<Teams> exchange = restTemplate.exchange("http://api.football-data.org/v2/teams",
                HttpMethod.GET,
                HttpEntity.EMPTY,
                Teams.class);
        return exchange.getBody();


    }


}
