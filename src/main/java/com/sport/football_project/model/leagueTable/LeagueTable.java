package com.sport.football_project.model.leagueTable;

import com.sport.football_project.model.competitions.Competition;
import com.sport.football_project.model.matches.Season;
import com.sport.football_project.model.filters.Filters;
import lombok.Data;

import java.util.List;

@Data
public class LeagueTable {

    Filters filters;
    Competition competition;
    Season season;
    List <Standings> standings;


}
