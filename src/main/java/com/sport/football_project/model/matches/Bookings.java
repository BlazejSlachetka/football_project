package com.sport.football_project.model.matches;

import com.sport.football_project.model.players.Player;
import com.sport.football_project.model.teams.Team;
import lombok.Data;

@Data
public class Bookings {

    Long minute;
    Team team;
    Player player;
    String card;
}
