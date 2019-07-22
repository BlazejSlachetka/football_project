package com.sport.football_project.model.competitions;

import lombok.Data;

import java.lang.reflect.Array;
import java.util.List;
import java.util.Map;

@Data
public class Season {

    Long id;
    String startDate;
    String endDate;
    Integer currentMatchday;
    String winner;
    List <AvailableStages> availableStages;




}
