package com.sport.football_project.model.leagueTable;

import com.sport.football_project.model.common.Competition;
import com.sport.football_project.model.competitions.Season;
import com.sport.football_project.model.football.Filters;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class LeagueTable {

    Filters filters;
    Competition competition;
    Season season;
    ArrayList <Standings> standings;


}
