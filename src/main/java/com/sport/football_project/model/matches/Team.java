package com.sport.football_project.model.matches;

import com.sport.football_project.model.competitions.Area;
import lombok.Data;

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
    String lastUpdated;

}
