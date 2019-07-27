package com.sport.football_project.model.players;

import lombok.Data;

@Data
public class Player {
    Long id;
    String name;
    String firstName;
    Boolean lastName;
    String dateOfBirth;
    String countryOfBirth;
    String nationality;
    String position;
    String lastUpdated;
}
