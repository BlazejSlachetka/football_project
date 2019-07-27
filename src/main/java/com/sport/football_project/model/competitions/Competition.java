package com.sport.football_project.model.competitions;

import com.sport.football_project.model.areas.Area;
import com.sport.football_project.model.matches.Season;
import lombok.Data;

@Data
public class Competition {

    Long id;
    Area area;
    String name;
    String code;
    String plan;
    CurrentSeason currentSeason;
    Long numberOfAvailableSeasons;
    String lastUpdated;
    String emblemUrl;



}
