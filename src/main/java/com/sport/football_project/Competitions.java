package com.sport.football_project;

import lombok.Data;

import java.util.List;

@Data
public class Competitions {

    Integer count;
    String filters;
    List<Competition> competitions;

}
