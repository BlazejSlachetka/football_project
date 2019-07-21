package com.sport.football_project;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sport.football_project.model.competitions.Competitions;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class FootballProjectApplicationTests {
   private ObjectMapper mapper = new ObjectMapper();
    @Test
    public void shouldDeserializeCorrectly() throws IOException {
        //given
        String jsonToDeserialize = getJson();
        //when
        Competitions competitions = mapper.readValue(jsonToDeserialize, Competitions.class);
        //then
        assertEquals( new Integer(2), competitions.getCount());
    }

    private String getJson() {
        return "{\n" +
                "    \"count\": 2,\n" +
                "    \"filters\": {},\n" +
                "    \"competitions\": [\n" +
                "        {\n" +
                "            \"id\": 2006,\n" +
                "            \"area\": {\n" +
                "                \"id\": 2001,\n" +
                "                \"name\": \"Africa\"\n" +
                "            },\n" +
                "            \"name\": \"WC Qualification\",\n" +
                "            \"code\": null,\n" +
                "            \"emblemUrl\": null,\n" +
                "            \"plan\": \"TIER_FOUR\",\n" +
                "            \"currentSeason\": {\n" +
                "                \"id\": 7,\n" +
                "                \"startDate\": \"2015-10-07\",\n" +
                "                \"endDate\": \"2017-11-14\",\n" +
                "                \"currentMatchday\": 6,\n" +
                "                \"winner\": null\n" +
                "            },\n" +
                "            \"numberOfAvailableSeasons\": 1,\n" +
                "            \"lastUpdated\": \"2018-06-04T23:54:04Z\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 2025,\n" +
                "            \"area\": {\n" +
                "                \"id\": 2011,\n" +
                "                \"name\": \"Argentina\"\n" +
                "            },\n" +
                "            \"name\": \"Supercopa Argentina\",\n" +
                "            \"code\": null,\n" +
                "            \"emblemUrl\": null,\n" +
                "            \"plan\": \"TIER_FOUR\",\n" +
                "            \"currentSeason\": {\n" +
                "                \"id\": 430,\n" +
                "                \"startDate\": \"2019-04-04\",\n" +
                "                \"endDate\": \"2019-04-04\",\n" +
                "                \"currentMatchday\": null,\n" +
                "                \"winner\": null\n" +
                "            },\n" +
                "            \"numberOfAvailableSeasons\": 2,\n" +
                "            \"lastUpdated\": \"2019-05-03T05:08:18Z\"\n" +
                "        }\n" +
                "\t\t]}";
    }


}
