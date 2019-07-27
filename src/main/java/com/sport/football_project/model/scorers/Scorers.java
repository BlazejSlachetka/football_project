package com.sport.football_project.model.scorers;

import com.sport.football_project.model.competitions.Competition;
import com.sport.football_project.model.matches.Season;
import com.sport.football_project.model.filters.Filters;
import lombok.Data;

import java.util.ArrayList;


@Data
public class Scorers {

    Long count;
    Filters filters;
    Competition competition;
    Season season;
    ArrayList<CurrentScorer> scorers;


}
