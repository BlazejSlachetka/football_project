package com.sport.football_project;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Season {

    Long id;
    LocalDate startDate;
    LocalDate endDate;
    Integer currentMatchday;




}