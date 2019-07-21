package com.sport.football_project.model.competitions;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Competition {

    Long id;
    Area area;
    String name;
    String code;
    String plan;
    Season currentSeason;
    Long numberOfAvailableSeasons;
    LocalDateTime lastUpdate;


}
