package com.sport.football_project.model.matches;

import com.sport.football_project.model.common.Competition;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class Matches {

    Long count;
    Map filters;
    Competition competition;
    List<Match> matches;
}
