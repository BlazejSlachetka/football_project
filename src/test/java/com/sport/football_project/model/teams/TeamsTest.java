package com.sport.football_project.model.teams;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class TeamsTest {
    private ObjectMapper mapper = new ObjectMapper();

    @Test
    public void shouldDeserializeCorrectly() throws IOException {
        //given
        String jsonToDeserialize = getJson();
        //when
        Teams teams = mapper.readValue(jsonToDeserialize, Teams.class);
        //then
        assertEquals(new Long(32), teams.getCount());
    }

    private String getJson() {
        return "{\n" +
                "\t\"count\": 32,\n" +
                "\t\"filters\": {},\n" +
                "\t\"competition\": {\n" +
                "\t\t\"id\": 2000,\n" +
                "\t\t\"area\": {\n" +
                "\t\t\t\"id\": 2267,\n" +
                "\t\t\t\"name\": \"World\"\n" +
                "\t\t},\n" +
                "\t\t\"name\": \"FIFA World Cup\",\n" +
                "\t\t\"code\": \"WC\",\n" +
                "\t\t\"plan\": \"TIER_ONE\",\n" +
                "\t\t\"lastUpdated\": \"2018-06-04T00:02:58Z\"\n" +
                "\t},\n" +
                "\t\"season\": {\n" +
                "\t\t\"id\": 1,\n" +
                "\t\t\"startDate\": \"2018-06-14\",\n" +
                "\t\t\"endDate\": \"2018-07-15\",\n" +
                "\t\t\"currentMatchday\": null,\n" +
                "\t\t\"availableStages\": [\n" +
                "\t\t\t\"GROUP_STAGE\"\n" +
                "\t\t]\n" +
                "\t},\n" +
                "\t\"teams\": [{\n" +
                "\t\t\"id\": 758,\n" +
                "\t\t\"area\": {\n" +
                "\t\t\t\"id\": 2257,\n" +
                "\t\t\t\"name\": \"Uruguay\"\n" +
                "\t\t},\n" +
                "\t\t\"name\": \"Uruguay\",\n" +
                "\t\t\"shortName\": \"Uruguay\",\n" +
                "\t\t\"tla\": \"URY\",\n" +
                "\t\t\"crestUrl\": \"\",\n" +
                "\t\t\"address\": \"Guayaybo 1531 Montevideo 11200\",\n" +
                "\t\t\"phone\": \"+59 (82) 4004814\",\n" +
                "\t\t\"website\": \"http://www.auf.org.uy\",\n" +
                "\t\t\"email\": \"auf@auf.org.uy\",\n" +
                "\t\t\"founded\": 1900,\n" +
                "\t\t\"clubColors\": \"Sky Blue / White / Black\",\n" +
                "\t\t\"venue\": \"Guangxi Sports Centre Stadium\",\n" +
                "\t\t\"lastUpdated\": \"2018-06-07T12:17:29Z\"\n" +
                "\t}]\n" +
                "}";
    }

}