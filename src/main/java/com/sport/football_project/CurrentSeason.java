package com.sport.football_project;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "startDate",
        "endDate",
        "currentMatchday",
        "winner"
})
public class CurrentSeason {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("startDate")
    private String startDate;
    @JsonProperty("endDate")
    private String endDate;
    @JsonProperty("currentMatchday")
    private Object currentMatchday;
    @JsonProperty("winner")
    private Object winner;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("startDate")
    public String getStartDate() {
        return startDate;
    }

    @JsonProperty("startDate")
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    @JsonProperty("endDate")
    public String getEndDate() {
        return endDate;
    }

    @JsonProperty("endDate")
    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    @JsonProperty("currentMatchday")
    public Object getCurrentMatchday() {
        return currentMatchday;
    }

    @JsonProperty("currentMatchday")
    public void setCurrentMatchday(Object currentMatchday) {
        this.currentMatchday = currentMatchday;
    }

    @JsonProperty("winner")
    public Object getWinner() {
        return winner;
    }

    @JsonProperty("winner")
    public void setWinner(Object winner) {
        this.winner = winner;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
