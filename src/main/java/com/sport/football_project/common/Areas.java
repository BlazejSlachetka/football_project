package com.sport.football_project.common;

import lombok.Data;

@Data
public class Areas {
    Long id;
    String name;
    String countryCode;
    Integer parentAreaId;
    String parentArea;

}
