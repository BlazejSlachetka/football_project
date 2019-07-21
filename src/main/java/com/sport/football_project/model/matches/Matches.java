package com.sport.football_project.model.matches;

import com.sport.football_project.model.competitions.Season;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Data
public class Matches {

    Long id;
    Season season;
    String uctDate;
    String status;
    Long attendance;
    Long matchday;
    String stage;
    String group;
    String lastUpdated;
    HomeTeam homeTeam;
    AwayTeam awayTeam;
    Score score;
    List<Goals> goals;
    List<Bookings>bookings;
    List <Substitutions> substitutions;
    List<Referees>referees;



}
