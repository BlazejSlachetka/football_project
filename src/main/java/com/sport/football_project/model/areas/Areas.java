package com.sport.football_project.model.areas;

import lombok.Data;

@Data
public class Areas {
    Long id;
    String name;
    String countryCode;
    Integer parentAreaId;
    String parentArea;

}
