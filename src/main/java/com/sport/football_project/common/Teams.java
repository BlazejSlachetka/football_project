package com.sport.football_project.common;

import com.sport.football_project.model.competitions.Competition;
import com.sport.football_project.model.matches.Season;
import com.sport.football_project.model.filters.Filters;
import com.sport.football_project.model.teams.Team;
import lombok.Data;

import java.util.ArrayList;

@Data
public class Teams {

    Long count;
    Filters filters;
    Competition competition;
    Season season;
    ArrayList<Team> teams;

}
