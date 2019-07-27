package com.sport.football_project.model.teams;

import com.sport.football_project.model.areas.Area;
import com.sport.football_project.model.matches.Squad;
import lombok.Data;

import java.util.List;

@Data
public class Team {

    Long id;
    Area area;
    String name;
    String shortName;
    String tla;
    String crestUrl;
    String address;
    String phone;
    String website;
    String email;
    Long founded;
    String clubColors;
    String venue;
    List<Squad> squad;
    String lastUpdated;

}
