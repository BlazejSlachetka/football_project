package com.sport.football_project.clients;

import com.sport.football_project.common.Teams;
import com.sport.football_project.model.teams.Team;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;

@Service
public class TeamsClient {

    public ArrayList<Team> getTeamsFormFormApi() {
        RestTemplate restTemplate = new RestTemplate();

        ResponseEntity<Teams> exchangeTeam;

        while (true) {
            exchangeTeam
                    = restTemplate.exchange("http://api.football-data.org/v2/teams",
                    HttpMethod.GET,
                    HttpEntity.EMPTY,
                    Teams.class);
            if
            (exchangeTeam.getBody().getTeams().toString().startsWith("")) {
                return exchangeTeam.getBody().getTeams();
            } else {
                return null;
            }
        }

    }

    //ResponseEntity<CatGif> exchangeGif;
    //        while (true) {
    //            exchangeGif =
    //                    restTemplate.exchange("https://aws.random.cat/meow",
    //                            HttpMethod.GET,
    //                            HttpEntity.EMPTY,
    //                            CatGif.class);
    //            if (exchangeGif.getBody().getFile().endsWith("gif")) {
    //                return exchangeGif.getBody().getFile();
    //
    //            }
    //        }
    //    }


}
