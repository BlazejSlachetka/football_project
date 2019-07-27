package com.sport.football_project.model.matches;

import com.sport.football_project.model.teams.Team;
import lombok.Data;

@Data
public class Goals {

    Long minute;
    String type;
    Team team;
    Scorer scorer;
    Assist assist;
}
