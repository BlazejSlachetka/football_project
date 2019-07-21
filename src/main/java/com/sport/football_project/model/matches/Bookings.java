package com.sport.football_project.model.matches;

import lombok.Data;

@Data
public class Bookings {

    Long minute;
    Team team;
    Player player;
    String card;
}
