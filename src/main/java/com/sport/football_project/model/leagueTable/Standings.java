package com.sport.football_project.model.leagueTable;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Standings {

    String stage;
    String type;
    String group;
    List<TableStandings>table;


}
