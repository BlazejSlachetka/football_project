package com.sport.football_project.model.leagueTable;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sport.football_project.model.teams.Teams;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class LeagueTableTest {

    private ObjectMapper mapper = new ObjectMapper();

    @Test
    public void shouldDeserializeCorrectly() throws IOException {
        //given
        String jsonToDeserialize = getJson();
        //when
        LeagueTable leagueTable = mapper.readValue(jsonToDeserialize, LeagueTable.class);
        //then
        assertEquals(new String("TOTAL"), leagueTable.getStandings());
    }

    private String getJson() {
        return "{\n" +
                "    \"filters\": {},\n" +
                "    \"competition\": {\n" +
                "        \"id\": 2021,\n" +
                "        \"area\": {\n" +
                "            \"id\": 2072,\n" +
                "            \"name\": \"England\"\n" +
                "        },\n" +
                "        \"name\": \"Premier League\",\n" +
                "        \"code\": \"PL\",\n" +
                "        \"plan\": \"TIER_ONE\",\n" +
                "        \"lastUpdated\": \"2018-08-23T11:51:26Z\"\n" +
                "    },\n" +
                "    \"season\": {\n" +
                "        \"id\": 151,\n" +
                "        \"startDate\": \"2018-08-10\",\n" +
                "        \"endDate\": \"2019-05-12\",\n" +
                "        \"currentMatchday\": 3,\n" +
                "        \"availableStages\": [\n" +
                "            \"REGULAR_SEASON\"\n" +
                "        ]\n" +
                "    },\n" +
                "    \"standings\": [\n" +
                "        {\n" +
                "            \"stage\": \"REGULAR_SEASON\",\n" +
                "            \"type\": \"TOTAL\",\n" +
                "            \"group\": null,\n" +
                "            \"table\": [\n" +
                "                {\n" +
                "                    \"position\": 1,\n" +
                "                    \"team\": {\n" +
                "                        \"id\": 65,\n" +
                "                        \"name\": \"Manchester City FC\",\n" +
                "                        \"crestUrl\": \"https://upload.wikimedia.org/wikipedia/en/e/eb/Manchester_City_FC_badge.svg\"\n" +
                "                    },\n" +
                "                    \"playedGames\": 2,\n" +
                "                    \"won\": 2,\n" +
                "                    \"draw\": 0,\n" +
                "                    \"lost\": 0,\n" +
                "                    \"points\": 6,\n" +
                "                    \"goalsFor\": 8,\n" +
                "                    \"goalsAgainst\": 1,\n" +
                "                    \"goalDifference\": 7\n" +
                "                },\n" +
                "                {\n" +
                "                    \"position\": 2,\n" +
                "                    \"team\": {\n" +
                "                        \"id\": 64,\n" +
                "                        \"name\": \"Liverpool FC\",\n" +
                "                        \"crestUrl\": \"http://upload.wikimedia.org/wikipedia/de/0/0a/FC_Liverpool.svg\"\n" +
                "                    },\n" +
                "                    \"playedGames\": 2,\n" +
                "                    \"won\": 2,\n" +
                "                    \"draw\": 0,\n" +
                "                    \"lost\": 0,\n" +
                "                    \"points\": 6,\n" +
                "                    \"goalsFor\": 6,\n" +
                "                    \"goalsAgainst\": 0,\n" +
                "                    \"goalDifference\": 6\n" +
                "                },\n" +
                "                {\n" +
                "                    \"position\": 3,\n" +
                "                    \"team\": {\n" +
                "                        \"id\": 61,\n" +
                "                        \"name\": \"Chelsea FC\",\n" +
                "                        \"crestUrl\": \"http://upload.wikimedia.org/wikipedia/de/5/5c/Chelsea_crest.svg\"\n" +
                "                    },\n" +
                "                    \"playedGames\": 2,\n" +
                "                    \"won\": 2,\n" +
                "                    \"draw\": 0,\n" +
                "                    \"lost\": 0,\n" +
                "                    \"points\": 6,\n" +
                "                    \"goalsFor\": 6,\n" +
                "                    \"goalsAgainst\": 2,\n" +
                "                    \"goalDifference\": 4\n" +
                "                },\n" +
                "                {\n" +
                "                    \"position\": 4,\n" +
                "                    \"team\": {\n" +
                "                        \"id\": 346,\n" +
                "                        \"name\": \"Watford FC\",\n" +
                "                        \"crestUrl\": \"https://upload.wikimedia.org/wikipedia/en/e/e2/Watford.svg\"\n" +
                "                    },\n" +
                "                    \"playedGames\": 2,\n" +
                "                    \"won\": 2,\n" +
                "                    \"draw\": 0,\n" +
                "                    \"lost\": 0,\n" +
                "                    \"points\": 6,\n" +
                "                    \"goalsFor\": 5,\n" +
                "                    \"goalsAgainst\": 1,\n" +
                "                    \"goalDifference\": 4\n" +
                "                },\n" +
                "                {\n" +
                "                    \"position\": 5,\n" +
                "                    \"team\": {\n" +
                "                        \"id\": 73,\n" +
                "                        \"name\": \"Tottenham Hotspur FC\",\n" +
                "                        \"crestUrl\": \"http://upload.wikimedia.org/wikipedia/de/b/b4/Tottenham_Hotspur.svg\"\n" +
                "                    },\n" +
                "                    \"playedGames\": 2,\n" +
                "                    \"won\": 2,\n" +
                "                    \"draw\": 0,\n" +
                "                    \"lost\": 0,\n" +
                "                    \"points\": 6,\n" +
                "                    \"goalsFor\": 5,\n" +
                "                    \"goalsAgainst\": 2,\n" +
                "                    \"goalDifference\": 3\n" +
                "                },\n" +
                "                {\n" +
                "                    \"position\": 6,\n" +
                "                    \"team\": {\n" +
                "                        \"id\": 1044,\n" +
                "                        \"name\": \"AFC Bournemouth\",\n" +
                "                        \"crestUrl\": \"https://upload.wikimedia.org/wikipedia/de/4/41/Afc_bournemouth.svg\"\n" +
                "                    },\n" +
                "                    \"playedGames\": 2,\n" +
                "                    \"won\": 2,\n" +
                "                    \"draw\": 0,\n" +
                "                    \"lost\": 0,\n" +
                "                    \"points\": 6,\n" +
                "                    \"goalsFor\": 4,\n" +
                "                    \"goalsAgainst\": 1,\n" +
                "                    \"goalDifference\": 3\n" +
                "                },\n" +
                "                {\n" +
                "                    \"position\": 7,\n" +
                "                    \"team\": {\n" +
                "                        \"id\": 62,\n" +
                "                        \"name\": \"Everton FC\",\n" +
                "                        \"crestUrl\": \"http://upload.wikimedia.org/wikipedia/de/f/f9/Everton_FC.svg\"\n" +
                "                    },\n" +
                "                    \"playedGames\": 2,\n" +
                "                    \"won\": 1,\n" +
                "                    \"draw\": 1,\n" +
                "                    \"lost\": 0,\n" +
                "                    \"points\": 4,\n" +
                "                    \"goalsFor\": 4,\n" +
                "                    \"goalsAgainst\": 3,\n" +
                "                    \"goalDifference\": 1\n" +
                "                },\n" +
                "                {\n" +
                "                    \"position\": 8,\n" +
                "                    \"team\": {\n" +
                "                        \"id\": 338,\n" +
                "                        \"name\": \"Leicester City FC\",\n" +
                "                        \"crestUrl\": \"http://upload.wikimedia.org/wikipedia/en/6/63/Leicester02.png\"\n" +
                "                    },\n" +
                "                    \"playedGames\": 2,\n" +
                "                    \"won\": 1,\n" +
                "                    \"draw\": 0,\n" +
                "                    \"lost\": 1,\n" +
                "                    \"points\": 3,\n" +
                "                    \"goalsFor\": 3,\n" +
                "                    \"goalsAgainst\": 2,\n" +
                "                    \"goalDifference\": 1\n" +
                "                },\n" +
                "                {\n" +
                "                    \"position\": 9,\n" +
                "                    \"team\": {\n" +
                "                        \"id\": 66,\n" +
                "                        \"name\": \"Manchester United FC\",\n" +
                "                        \"crestUrl\": \"http://upload.wikimedia.org/wikipedia/de/d/da/Manchester_United_FC.svg\"\n" +
                "                    },\n" +
                "                    \"playedGames\": 2,\n" +
                "                    \"won\": 1,\n" +
                "                    \"draw\": 0,\n" +
                "                    \"lost\": 1,\n" +
                "                    \"points\": 3,\n" +
                "                    \"goalsFor\": 4,\n" +
                "                    \"goalsAgainst\": 4,\n" +
                "                    \"goalDifference\": 0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"position\": 10,\n" +
                "                    \"team\": {\n" +
                "                        \"id\": 354,\n" +
                "                        \"name\": \"Crystal Palace FC\",\n" +
                "                        \"crestUrl\": \"http://upload.wikimedia.org/wikipedia/de/b/bf/Crystal_Palace_F.C._logo_%282013%29.png\"\n" +
                "                    },\n" +
                "                    \"playedGames\": 2,\n" +
                "                    \"won\": 1,\n" +
                "                    \"draw\": 0,\n" +
                "                    \"lost\": 1,\n" +
                "                    \"points\": 3,\n" +
                "                    \"goalsFor\": 2,\n" +
                "                    \"goalsAgainst\": 2,\n" +
                "                    \"goalDifference\": 0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"position\": 11,\n" +
                "                    \"team\": {\n" +
                "                        \"id\": 397,\n" +
                "                        \"name\": \"Brighton & Hove Albion FC\",\n" +
                "                        \"crestUrl\": \"https://upload.wikimedia.org/wikipedia/en/f/fd/Brighton_%26_Hove_Albion_logo.svg\"\n" +
                "                    },\n" +
                "                    \"playedGames\": 2,\n" +
                "                    \"won\": 1,\n" +
                "                    \"draw\": 0,\n" +
                "                    \"lost\": 1,\n" +
                "                    \"points\": 3,\n" +
                "                    \"goalsFor\": 3,\n" +
                "                    \"goalsAgainst\": 4,\n" +
                "                    \"goalDifference\": -1\n" +
                "                },\n" +
                "                {\n" +
                "                    \"position\": 12,\n" +
                "                    \"team\": {\n" +
                "                        \"id\": 67,\n" +
                "                        \"name\": \"Newcastle United FC\",\n" +
                "                        \"crestUrl\": \"http://upload.wikimedia.org/wikipedia/de/5/56/Newcastle_United_Logo.svg\"\n" +
                "                    },\n" +
                "                    \"playedGames\": 2,\n" +
                "                    \"won\": 0,\n" +
                "                    \"draw\": 1,\n" +
                "                    \"lost\": 1,\n" +
                "                    \"points\": 1,\n" +
                "                    \"goalsFor\": 1,\n" +
                "                    \"goalsAgainst\": 2,\n" +
                "                    \"goalDifference\": -1\n" +
                "                },\n" +
                "                {\n" +
                "                    \"position\": 13,\n" +
                "                    \"team\": {\n" +
                "                        \"id\": 340,\n" +
                "                        \"name\": \"Southampton FC\",\n" +
                "                        \"crestUrl\": \"http://upload.wikimedia.org/wikipedia/de/c/c9/FC_Southampton.svg\"\n" +
                "                    },\n" +
                "                    \"playedGames\": 2,\n" +
                "                    \"won\": 0,\n" +
                "                    \"draw\": 1,\n" +
                "                    \"lost\": 1,\n" +
                "                    \"points\": 1,\n" +
                "                    \"goalsFor\": 1,\n" +
                "                    \"goalsAgainst\": 2,\n" +
                "                    \"goalDifference\": -1\n" +
                "                },\n" +
                "                {\n" +
                "                    \"position\": 14,\n" +
                "                    \"team\": {\n" +
                "                        \"id\": 76,\n" +
                "                        \"name\": \"Wolverhampton Wanderers FC\",\n" +
                "                        \"crestUrl\": \"https://upload.wikimedia.org/wikipedia/en/f/fc/Wolverhampton_Wanderers.svg\"\n" +
                "                    },\n" +
                "                    \"playedGames\": 2,\n" +
                "                    \"won\": 0,\n" +
                "                    \"draw\": 1,\n" +
                "                    \"lost\": 1,\n" +
                "                    \"points\": 1,\n" +
                "                    \"goalsFor\": 2,\n" +
                "                    \"goalsAgainst\": 4,\n" +
                "                    \"goalDifference\": -2\n" +
                "                },\n" +
                "                {\n" +
                "                    \"position\": 15,\n" +
                "                    \"team\": {\n" +
                "                        \"id\": 328,\n" +
                "                        \"name\": \"Burnley FC\",\n" +
                "                        \"crestUrl\": \"https://upload.wikimedia.org/wikipedia/en/0/02/Burnley_FC_badge.png\"\n" +
                "                    },\n" +
                "                    \"playedGames\": 2,\n" +
                "                    \"won\": 0,\n" +
                "                    \"draw\": 1,\n" +
                "                    \"lost\": 1,\n" +
                "                    \"points\": 1,\n" +
                "                    \"goalsFor\": 1,\n" +
                "                    \"goalsAgainst\": 3,\n" +
                "                    \"goalDifference\": -2\n" +
                "                },\n" +
                "                {\n" +
                "                    \"position\": 16,\n" +
                "                    \"team\": {\n" +
                "                        \"id\": 715,\n" +
                "                        \"name\": \"Cardiff City FC\",\n" +
                "                        \"crestUrl\": \"https://upload.wikimedia.org/wikipedia/en/3/3c/Cardiff_City_crest.svg\"\n" +
                "                    },\n" +
                "                    \"playedGames\": 2,\n" +
                "                    \"won\": 0,\n" +
                "                    \"draw\": 1,\n" +
                "                    \"lost\": 1,\n" +
                "                    \"points\": 1,\n" +
                "                    \"goalsFor\": 0,\n" +
                "                    \"goalsAgainst\": 2,\n" +
                "                    \"goalDifference\": -2\n" +
                "                },\n" +
                "                {\n" +
                "                    \"position\": 17,\n" +
                "                    \"team\": {\n" +
                "                        \"id\": 57,\n" +
                "                        \"name\": \"Arsenal FC\",\n" +
                "                        \"crestUrl\": \"http://upload.wikimedia.org/wikipedia/en/5/53/Arsenal_FC.svg\"\n" +
                "                    },\n" +
                "                    \"playedGames\": 2,\n" +
                "                    \"won\": 0,\n" +
                "                    \"draw\": 0,\n" +
                "                    \"lost\": 2,\n" +
                "                    \"points\": 0,\n" +
                "                    \"goalsFor\": 2,\n" +
                "                    \"goalsAgainst\": 5,\n" +
                "                    \"goalDifference\": -3\n" +
                "                },\n" +
                "                {\n" +
                "                    \"position\": 18,\n" +
                "                    \"team\": {\n" +
                "                        \"id\": 63,\n" +
                "                        \"name\": \"Fulham FC\",\n" +
                "                        \"crestUrl\": \"http://upload.wikimedia.org/wikipedia/de/a/a8/Fulham_fc.svg\"\n" +
                "                    },\n" +
                "                    \"playedGames\": 2,\n" +
                "                    \"won\": 0,\n" +
                "                    \"draw\": 0,\n" +
                "                    \"lost\": 2,\n" +
                "                    \"points\": 0,\n" +
                "                    \"goalsFor\": 1,\n" +
                "                    \"goalsAgainst\": 5,\n" +
                "                    \"goalDifference\": -4\n" +
                "                },\n" +
                "                {\n" +
                "                    \"position\": 19,\n" +
                "                    \"team\": {\n" +
                "                        \"id\": 563,\n" +
                "                        \"name\": \"West Ham United FC\",\n" +
                "                        \"crestUrl\": \"http://upload.wikimedia.org/wikipedia/de/e/e0/West_Ham_United_FC.svg\"\n" +
                "                    },\n" +
                "                    \"playedGames\": 2,\n" +
                "                    \"won\": 0,\n" +
                "                    \"draw\": 0,\n" +
                "                    \"lost\": 2,\n" +
                "                    \"points\": 0,\n" +
                "                    \"goalsFor\": 1,\n" +
                "                    \"goalsAgainst\": 6,\n" +
                "                    \"goalDifference\": -5\n" +
                "                },\n" +
                "                {\n" +
                "                    \"position\": 20,\n" +
                "                    \"team\": {\n" +
                "                        \"id\": 394,\n" +
                "                        \"name\": \"Huddersfield Town AFC\",\n" +
                "                        \"crestUrl\": \"https://upload.wikimedia.org/wikipedia/en/5/5a/Huddersfield_Town_A.F.C._logo.svg\"\n" +
                "                    },\n" +
                "                    \"playedGames\": 2,\n" +
                "                    \"won\": 0,\n" +
                "                    \"draw\": 0,\n" +
                "                    \"lost\": 2,\n" +
                "                    \"points\": 0,\n" +
                "                    \"goalsFor\": 1,\n" +
                "                    \"goalsAgainst\": 9,\n" +
                "                    \"goalDifference\": -8\n" +
                "                }\n" +
                "            ]\n" +
                "        },\n";
    }

}