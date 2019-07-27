package com.sport.football_project.model.scorers;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class ScorersTest {
    private ObjectMapper mapper = new ObjectMapper();

    @Test
    public void shouldDeserializeCorrectly() throws IOException {
        //given
        String jsonToDeserialize = getJson();
        //when
        Scorers scorers = mapper.readValue(jsonToDeserialize, Scorers.class);
        //then
        assertEquals(new Long(10), scorers.getCount());
    }
    private String getJson() {
        return "{\n" +
                "    \"count\": 10,\n" +
                "    \"filters\": {},\n" +
                "    \"competition\": {\n" +
                "        \"id\": 2019,\n" +
                "        \"area\": {\n" +
                "            \"id\": 2114,\n" +
                "            \"name\": \"Italy\"\n" +
                "        },\n" +
                "        \"name\": \"Serie A\",\n" +
                "        \"code\": \"SA\",\n" +
                "        \"plan\": \"TIER_ONE\",\n" +
                "        \"lastUpdated\": \"2018-08-26T22:32:35Z\"\n" +
                "    },\n" +
                "    \"season\": {\n" +
                "        \"id\": 290,\n" +
                "        \"startDate\": \"2018-08-18\",\n" +
                "        \"endDate\": \"2019-05-26\",\n" +
                "        \"currentMatchday\": 2,\n" +
                "        \"availableStages\": [\n" +
                "            \"REGULAR_SEASON\"\n" +
                "        ]\n" +
                "    },\n" +
                "    \"scorers\": [\n" +
                "        {\n" +
                "            \"player\": {\n" +
                "                \"id\": 2045,\n" +
                "                \"name\": \"Mario Mandžukić\",\n" +
                "                \"firstName\": \"Mario\",\n" +
                "                \"lastName\": null,\n" +
                "                \"dateOfBirth\": \"1986-05-21\",\n" +
                "                \"countryOfBirth\": \"Croatia\",\n" +
                "                \"nationality\": \"Croatia\",\n" +
                "                \"position\": \"Attacker\",\n" +
                "                \"lastUpdated\": \"2018-08-09T05:07:10Z\"\n" +
                "            },\n" +
                "            \"team\": {\n" +
                "                \"id\": 109,\n" +
                "                \"name\": \"Juventus FC\"\n" +
                "            },\n" +
                "            \"numberOfGoals\": 2\n" +
                "        }]}}\n";
    }

    }