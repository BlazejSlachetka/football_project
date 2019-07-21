package com.sport.football_project.model.matches;

import lombok.Data;

@Data
public class Substitutions {

    Long minute;
    Team team;
    PlayerOut playerOut;
    PlayerIn playerIn;
}
