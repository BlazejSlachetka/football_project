package com.sport.football_project.model.competitions;

import lombok.Data;

@Data
public class Competition {

    Long id;
    Area area;
    String name;
    String code;
    String plan;
    Season currentSeason;
    Long numberOfAvailableSeasons;
    String lastUpdated;
    String emblemUrl;



}
