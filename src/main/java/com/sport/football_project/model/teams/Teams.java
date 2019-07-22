package com.sport.football_project.model.teams;

import com.sport.football_project.model.common.Competition;
import com.sport.football_project.model.competitions.Season;
import com.sport.football_project.model.football.Filters;
import com.sport.football_project.model.matches.Team;
import lombok.Data;

import java.util.ArrayList;
import java.util.Map;

@Data
public class Teams {

    Long count;
    Filters filters;
    Competition competition;
    Season season;
    ArrayList<Team> teams;

}
