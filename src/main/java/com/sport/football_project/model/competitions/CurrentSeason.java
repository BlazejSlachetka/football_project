package com.sport.football_project.model.competitions;

import lombok.Data;

@Data
public class CurrentSeason {

    Long id;
    String startDate;
    String endDate;
    Integer currentMatchday;
}
