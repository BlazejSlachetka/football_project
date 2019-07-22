package com.sport.football_project.model.leagueTable;

import com.sport.football_project.model.matches.Team;
import lombok.Data;

@Data
public class TableStandings {

    Long position;
    Team team;
    Long playedGames;
    Long won;
    Long draw;
    Long lost;
    Long points;
    Long goalsFor;
    Long goalsAgainst;
    Long goalDifference;

}
