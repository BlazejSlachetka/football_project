package com.sport.football_project.model.matches;

import lombok.Data;

@Data
public class Score {
    String winner;
    String duration;
    FullTime fullTime;
    HalfTime halfTime;
    ExtraTime extraTime;
    Penalties penalties;
}
