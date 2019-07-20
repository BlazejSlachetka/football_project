package com.sport.football_project;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "area",
        "name",
        "code",
        "emblemUrl",
        "plan",
        "currentSeason",
        "numberOfAvailableSeasons",
        "lastUpdated"
})
public class Competition_ {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("area")
    private Area area;
    @JsonProperty("name")
    private String name;
    @JsonProperty("code")
    private Object code;
    @JsonProperty("emblemUrl")
    private Object emblemUrl;
    @JsonProperty("plan")
    private String plan;
    @JsonProperty("currentSeason")
    private CurrentSeason currentSeason;
    @JsonProperty("numberOfAvailableSeasons")
    private Integer numberOfAvailableSeasons;
    @JsonProperty("lastUpdated")
    private String lastUpdated;
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

    @JsonProperty("area")
    public Area getArea() {
        return area;
    }

    @JsonProperty("area")
    public void setArea(Area area) {
        this.area = area;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("code")
    public Object getCode() {
        return code;
    }

    @JsonProperty("code")
    public void setCode(Object code) {
        this.code = code;
    }

    @JsonProperty("emblemUrl")
    public Object getEmblemUrl() {
        return emblemUrl;
    }

    @JsonProperty("emblemUrl")
    public void setEmblemUrl(Object emblemUrl) {
        this.emblemUrl = emblemUrl;
    }

    @JsonProperty("plan")
    public String getPlan() {
        return plan;
    }

    @JsonProperty("plan")
    public void setPlan(String plan) {
        this.plan = plan;
    }

    @JsonProperty("currentSeason")
    public CurrentSeason getCurrentSeason() {
        return currentSeason;
    }

    @JsonProperty("currentSeason")
    public void setCurrentSeason(CurrentSeason currentSeason) {
        this.currentSeason = currentSeason;
    }

    @JsonProperty("numberOfAvailableSeasons")
    public Integer getNumberOfAvailableSeasons() {
        return numberOfAvailableSeasons;
    }

    @JsonProperty("numberOfAvailableSeasons")
    public void setNumberOfAvailableSeasons(Integer numberOfAvailableSeasons) {
        this.numberOfAvailableSeasons = numberOfAvailableSeasons;
    }

    @JsonProperty("lastUpdated")
    public String getLastUpdated() {
        return lastUpdated;
    }

    @JsonProperty("lastUpdated")
    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
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
