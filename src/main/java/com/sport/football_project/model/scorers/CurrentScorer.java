package com.sport.football_project.model.scorers;

import com.sport.football_project.model.players.Player;
import com.sport.football_project.model.teams.Team;
import lombok.Data;

@Data
public class CurrentScorer {

    Player player;
    Team team;
    Long numberOfGoals;


}


