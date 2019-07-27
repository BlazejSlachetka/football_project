package com.sport.football_project.common;

import com.sport.football_project.model.competitions.Competition;
import com.sport.football_project.model.filters.Filters;
import com.sport.football_project.model.matches.Match;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class Matches {

    Long count;
    Filters filters;
    Competition competition;
    List<Match> matches;
}
