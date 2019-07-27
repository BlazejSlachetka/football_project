package com.sport.football_project.common;
import com.sport.football_project.model.competitions.Competition;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class Competitions {

    Integer count;
    Map filters;
    List<Competition> competitions;

}
