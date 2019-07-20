package com.sport.football_project;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class FiltersClient {
    public Filters getFiltersFormApi() {
        RestTemplate restTemplate = new RestTemplate();

        ResponseEntity<Filters> exchange = restTemplate.exchange("http://api.football-data.org/v2/matches ",
                HttpMethod.GET,
                HttpEntity.EMPTY,
                Filters.class);
        return exchange.getBody();


    }
}


