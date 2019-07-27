package com.sport.football_project.model.matches;

import com.sport.football_project.model.teams.Team;
import lombok.Data;

@Data
public class Substitutions {

    Long minute;
    Team team;
    PlayerOut playerOut;
    PlayerIn playerIn;
}
