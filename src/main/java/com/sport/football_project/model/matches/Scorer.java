package com.sport.football_project.model.matches;

import com.sport.football_project.model.players.Player;
import com.sport.football_project.model.teams.Team;
import lombok.Data;

@Data
public class Scorer {

    Long id;
    String name;
    Player player;
    Team team;
    Long numberOfGoals;
}
