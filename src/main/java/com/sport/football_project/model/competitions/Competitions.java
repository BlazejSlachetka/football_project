package com.sport.football_project.model.competitions;

import com.sport.football_project.common.Competition;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class Competitions {

    Integer count;
    Map filters;
    List<Competition> competitions;

}
