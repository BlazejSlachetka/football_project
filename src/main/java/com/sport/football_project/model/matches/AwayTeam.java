package com.sport.football_project.model.matches;

import lombok.Data;

import java.util.List;

@Data
public class AwayTeam {
    Long id;
    String name;
    Coach coach;
    Captain captain;
    List<Lineup> lineup;
    List<Bench>bench;


}
