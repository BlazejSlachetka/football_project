package com.sport.football_project.model.matches;

import lombok.Data;

import java.util.List;

@Data
public class HomeTeam {
    Long id;
    String name;
    Coach coach;
    Captain captain;
    List<Lineup> lineup;
    List<Bench> benches;


}
