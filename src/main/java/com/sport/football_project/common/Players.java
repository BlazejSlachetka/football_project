package com.sport.football_project.common;



import com.sport.football_project.model.filters.Filters;
import com.sport.football_project.model.matches.Match;
import com.sport.football_project.model.players.Player;
import lombok.Data;

import java.util.List;

@Data
public class Players {
    Long count;
    Filters filters;
    Player player;
    List<Match> matches;

}
