package com.sport.football_project.model.matches;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class MatchesTest {
    private ObjectMapper mapper = new ObjectMapper();

    @Test
    public void shouldDeserializeCorrectly() throws IOException {
        //given
        String jsonToDeserialize = getJson();
        //when
        Matches matches = mapper.readValue(jsonToDeserialize, Matches.class);
        //then
        assertEquals(new Integer(1), matches.getCount());
    }

    private String getJson() {
        return "{\n" +
                "    \"count\": 10,\n" +
                "    \"filters\": {\n" +
                "        \"matchday\": \"1\"\n" +
                "    },\n" +
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
                "    \"matches\": [\n" +
                "        {\n" +
                "            \"id\": 233028,\n" +
                "            \"season\": {\n" +
                "                \"id\": 151,\n" +
                "                \"startDate\": \"2018-08-10\",\n" +
                "                \"endDate\": \"2019-05-12\",\n" +
                "                \"currentMatchday\": 3\n" +
                "            },\n" +
                "            \"utcDate\": \"2018-08-10T19:00:00Z\",\n" +
                "            \"status\": \"FINISHED\",\n" +
                "            \"attendance\": 74439,\n" +
                "            \"matchday\": 1,\n" +
                "            \"stage\": \"REGULAR_SEASON\",\n" +
                "            \"group\": \"Regular Season\",\n" +
                "            \"lastUpdated\": \"2018-08-20T22:02:22Z\",\n" +
                "            \"homeTeam\": {\n" +
                "                \"id\": 66,\n" +
                "                \"name\": \"Manchester United FC\",\n" +
                "                \"coach\": {\n" +
                "                    \"id\": 11613,\n" +
                "                    \"name\": \"José Mourinho\",\n" +
                "                    \"countryOfBirth\": \"Portugal\",\n" +
                "                    \"nationality\": \"Portugal\"\n" +
                "                },\n" +
                "                \"captain\": {\n" +
                "                    \"id\": 3366,\n" +
                "                    \"name\": \"Paul Pogba\",\n" +
                "                    \"shirtNumber\": 6\n" +
                "                },\n" +
                "                \"lineup\": [\n" +
                "                    {\n" +
                "                        \"id\": 7909,\n" +
                "                        \"name\": \"Mata\",\n" +
                "                        \"position\": \"Attacker\",\n" +
                "                        \"shirtNumber\": 8\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"id\": 33153,\n" +
                "                        \"name\": \"Andreas Pereira\",\n" +
                "                        \"position\": \"Attacker\",\n" +
                "                        \"shirtNumber\": 15\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"id\": 3188,\n" +
                "                        \"name\": \"David De Gea\",\n" +
                "                        \"position\": \"Goalkeeper\",\n" +
                "                        \"shirtNumber\": 1\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"id\": 3366,\n" +
                "                        \"name\": \"Paul Pogba\",\n" +
                "                        \"position\": \"Midfielder\",\n" +
                "                        \"shirtNumber\": 6\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"id\": 7898,\n" +
                "                        \"name\": \"Luke Shaw\",\n" +
                "                        \"position\": \"Defender\",\n" +
                "                        \"shirtNumber\": 23\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"id\": 7911,\n" +
                "                        \"name\": \"Alexis Sánchez\",\n" +
                "                        \"position\": \"Attacker\",\n" +
                "                        \"shirtNumber\": 7\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"id\": 7900,\n" +
                "                        \"name\": \"Matteo Darmian\",\n" +
                "                        \"position\": \"Defender\",\n" +
                "                        \"shirtNumber\": 36\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"id\": 3232,\n" +
                "                        \"name\": \"Fred\",\n" +
                "                        \"position\": \"Midfielder\",\n" +
                "                        \"shirtNumber\": 17\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"id\": 3492,\n" +
                "                        \"name\": \"Victor Nilsson-Lindelöf\",\n" +
                "                        \"position\": \"Defender\",\n" +
                "                        \"shirtNumber\": 2\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"id\": 7901,\n" +
                "                        \"name\": \"Eric Bailly\",\n" +
                "                        \"position\": \"Defender\",\n" +
                "                        \"shirtNumber\": 3\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"id\": 3331,\n" +
                "                        \"name\": \"Marcus Rashford\",\n" +
                "                        \"position\": \"Attacker\",\n" +
                "                        \"shirtNumber\": 10\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"bench\": [\n" +
                "                    {\n" +
                "                        \"id\": 3317,\n" +
                "                        \"name\": \"Ashley Young\",\n" +
                "                        \"position\": \"Midfielder\",\n" +
                "                        \"shirtNumber\": 18\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"id\": 3652,\n" +
                "                        \"name\": \"Marouane Fellaini\",\n" +
                "                        \"position\": \"Midfielder\",\n" +
                "                        \"shirtNumber\": 27\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"id\": 7896,\n" +
                "                        \"name\": \"Chris Smalling\",\n" +
                "                        \"position\": \"Defender\",\n" +
                "                        \"shirtNumber\": 12\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"id\": 3662,\n" +
                "                        \"name\": \"Romelu Lukaku\",\n" +
                "                        \"position\": \"Attacker\",\n" +
                "                        \"shirtNumber\": 9\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"id\": 3372,\n" +
                "                        \"name\": \"Anthony Martial\",\n" +
                "                        \"position\": \"Attacker\",\n" +
                "                        \"shirtNumber\": 11\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"id\": 7942,\n" +
                "                        \"name\": \"Lee Grant\",\n" +
                "                        \"position\": \"Goalkeeper\",\n" +
                "                        \"shirtNumber\": 13\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"id\": 7905,\n" +
                "                        \"name\": \"Scott McTominay\",\n" +
                "                        \"position\": \"Midfielder\",\n" +
                "                        \"shirtNumber\": 39\n" +
                "                    }\n" +
                "                ]\n" +
                "            },\n" +
                "            \"awayTeam\": {\n" +
                "                \"id\": 338,\n" +
                "                \"name\": \"Leicester City FC\",\n" +
                "                \"coach\": {\n" +
                "                    \"id\": 11625,\n" +
                "                    \"name\": \"Claude Puel\",\n" +
                "                    \"countryOfBirth\": \"France\",\n" +
                "                    \"nationality\": \"France\"\n" +
                "                },\n" +
                "                \"captain\": {\n" +
                "                    \"id\": 8061,\n" +
                "                    \"name\": \"Wes Morgan\",\n" +
                "                    \"shirtNumber\": 5\n" +
                "                },\n" +
                "                \"lineup\": [\n" +
                "                    {\n" +
                "                        \"id\": 3448,\n" +
                "                        \"name\": \"Kasper Schmeichel\",\n" +
                "                        \"position\": \"Goalkeeper\",\n" +
                "                        \"shirtNumber\": 1\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"id\": 8061,\n" +
                "                        \"name\": \"Wes Morgan\",\n" +
                "                        \"position\": \"Defender\",\n" +
                "                        \"shirtNumber\": 5\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"id\": 3326,\n" +
                "                        \"name\": \"Harry Maguire\",\n" +
                "                        \"position\": \"Midfielder\",\n" +
                "                        \"shirtNumber\": 15\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"id\": 8066,\n" +
                "                        \"name\": \"Daniel Amartey\",\n" +
                "                        \"position\": \"Defender\",\n" +
                "                        \"shirtNumber\": 18\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"id\": 8072,\n" +
                "                        \"name\": \"Demarai Gray\",\n" +
                "                        \"position\": \"Midfielder\",\n" +
                "                        \"shirtNumber\": 7\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"id\": 3992,\n" +
                "                        \"name\": \"James Maddison\",\n" +
                "                        \"position\": \"Midfielder\",\n" +
                "                        \"shirtNumber\": 10\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"id\": 3252,\n" +
                "                        \"name\": \"Adrien Silva\",\n" +
                "                        \"position\": \"Midfielder\",\n" +
                "                        \"shirtNumber\": 23\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"id\": 10182,\n" +
                "                        \"name\": \"Ricardo Pereira\",\n" +
                "                        \"position\": \"Defender\",\n" +
                "                        \"shirtNumber\": 14\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"id\": 3383,\n" +
                "                        \"name\": \"Wilfred Ndidi\",\n" +
                "                        \"position\": \"Midfielder\",\n" +
                "                        \"shirtNumber\": 25\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"id\": 3400,\n" +
                "                        \"name\": \"Kelechi Iheanacho\",\n" +
                "                        \"position\": \"Attacker\",\n" +
                "                        \"shirtNumber\": 8\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"id\": 8065,\n" +
                "                        \"name\": \"Ben Chilwell\",\n" +
                "                        \"position\": \"Defender\",\n" +
                "                        \"shirtNumber\": 3\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"bench\": [\n" +
                "                    {\n" +
                "                        \"id\": 8014,\n" +
                "                        \"name\": \"Jonny Evans\",\n" +
                "                        \"position\": \"Defender\",\n" +
                "                        \"shirtNumber\": 6\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"id\": 8071,\n" +
                "                        \"name\": \"Marc Albrighton\",\n" +
                "                        \"position\": \"Midfielder\",\n" +
                "                        \"shirtNumber\": 11\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"id\": 3330,\n" +
                "                        \"name\": \"Jamie Vardy\",\n" +
                "                        \"position\": \"Attacker\",\n" +
                "                        \"shirtNumber\": 9\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"id\": 7857,\n" +
                "                        \"name\": \"Danny Ward\",\n" +
                "                        \"position\": \"Goalkeeper\",\n" +
                "                        \"shirtNumber\": 12\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"id\": 8064,\n" +
                "                        \"name\": \"Christian Fuchs\",\n" +
                "                        \"position\": \"Defender\",\n" +
                "                        \"shirtNumber\": 28\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"id\": 8761,\n" +
                "                        \"name\": \"Rachid Ghezzal\",\n" +
                "                        \"position\": \"Midfielder\",\n" +
                "                        \"shirtNumber\": 31\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"id\": 8073,\n" +
                "                        \"name\": \"Iborra\",\n" +
                "                        \"position\": \"Midfielder\",\n" +
                "                        \"shirtNumber\": 21\n" +
                "                    }\n" +
                "                ]\n" +
                "            },\n" +
                "            \"score\": {\n" +
                "                \"winner\": \"HOME_TEAM\",\n" +
                "                \"duration\": \"REGULAR\",\n" +
                "                \"fullTime\": {\n" +
                "                    \"homeTeam\": 2,\n" +
                "                    \"awayTeam\": 1\n" +
                "                },\n" +
                "                \"halfTime\": {\n" +
                "                    \"homeTeam\": 1,\n" +
                "                    \"awayTeam\": 0\n" +
                "                },\n" +
                "                \"extraTime\": {\n" +
                "                    \"homeTeam\": null,\n" +
                "                    \"awayTeam\": null\n" +
                "                },\n" +
                "                \"penalties\": {\n" +
                "                    \"homeTeam\": null,\n" +
                "                    \"awayTeam\": null\n" +
                "                }\n" +
                "            },\n" +
                "            \"goals\": [\n" +
                "                {\n" +
                "                    \"minute\": 3,\n" +
                "                    \"type\": null,\n" +
                "                    \"team\": {\n" +
                "                        \"id\": 66,\n" +
                "                        \"name\": \"Manchester United FC\"\n" +
                "                    },\n" +
                "                    \"scorer\": {\n" +
                "                        \"id\": 3366,\n" +
                "                        \"name\": \"Paul Pogba\"\n" +
                "                    },\n" +
                "                    \"assist\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"minute\": 83,\n" +
                "                    \"type\": null,\n" +
                "                    \"team\": {\n" +
                "                        \"id\": 66,\n" +
                "                        \"name\": \"Manchester United FC\"\n" +
                "                    },\n" +
                "                    \"scorer\": {\n" +
                "                        \"id\": 7898,\n" +
                "                        \"name\": \"Luke Shaw\"\n" +
                "                    },\n" +
                "                    \"assist\": {\n" +
                "                        \"id\": 7909,\n" +
                "                        \"name\": \"Mata\"\n" +
                "                    }\n" +
                "                },\n" +
                "                {\n" +
                "                    \"minute\": 90,\n" +
                "                    \"type\": null,\n" +
                "                    \"team\": {\n" +
                "                        \"id\": 338,\n" +
                "                        \"name\": \"Leicester City FC\"\n" +
                "                    },\n" +
                "                    \"scorer\": {\n" +
                "                        \"id\": 3330,\n" +
                "                        \"name\": \"Jamie Vardy\"\n" +
                "                    },\n" +
                "                    \"assist\": null\n" +
                "                }\n" +
                "            ],\n" +
                "            \"bookings\": [\n" +
                "                {\n" +
                "                    \"minute\": 51,\n" +
                "                    \"team\": {\n" +
                "                        \"id\": 338,\n" +
                "                        \"name\": \"Leicester City FC\"\n" +
                "                    },\n" +
                "                    \"player\": {\n" +
                "                        \"id\": 8066,\n" +
                "                        \"name\": \"Daniel Amartey\"\n" +
                "                    },\n" +
                "                    \"card\": \"YELLOW_CARD\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"minute\": 54,\n" +
                "                    \"team\": {\n" +
                "                        \"id\": 66,\n" +
                "                        \"name\": \"Manchester United FC\"\n" +
                "                    },\n" +
                "                    \"player\": {\n" +
                "                        \"id\": 3232,\n" +
                "                        \"name\": \"Fred\"\n" +
                "                    },\n" +
                "                    \"card\": \"YELLOW_CARD\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"minute\": 69,\n" +
                "                    \"team\": {\n" +
                "                        \"id\": 66,\n" +
                "                        \"name\": \"Manchester United FC\"\n" +
                "                    },\n" +
                "                    \"player\": {\n" +
                "                        \"id\": 33153,\n" +
                "                        \"name\": \"Andreas Pereira\"\n" +
                "                    },\n" +
                "                    \"card\": \"YELLOW_CARD\"\n" +
                "                }\n" +
                "            ],\n" +
                "            \"substitutions\": [\n" +
                "                {\n" +
                "                    \"minute\": 63,\n" +
                "                    \"team\": {\n" +
                "                        \"id\": 338,\n" +
                "                        \"name\": \"Leicester City FC\"\n" +
                "                    },\n" +
                "                    \"playerOut\": {\n" +
                "                        \"id\": 8066,\n" +
                "                        \"name\": \"Daniel Amartey\"\n" +
                "                    },\n" +
                "                    \"playerIn\": {\n" +
                "                        \"id\": 8761,\n" +
                "                        \"name\": \"Rachid Ghezzal\"\n" +
                "                    }\n" +
                "                },\n" +
                "                {\n" +
                "                    \"minute\": 63,\n" +
                "                    \"team\": {\n" +
                "                        \"id\": 338,\n" +
                "                        \"name\": \"Leicester City FC\"\n" +
                "                    },\n" +
                "                    \"playerOut\": {\n" +
                "                        \"id\": 3992,\n" +
                "                        \"name\": \"James Maddison\"\n" +
                "                    },\n" +
                "                    \"playerIn\": {\n" +
                "                        \"id\": 3330,\n" +
                "                        \"name\": \"Jamie Vardy\"\n" +
                "                    }\n" +
                "                },\n" +
                "                {\n" +
                "                    \"minute\": 67,\n" +
                "                    \"team\": {\n" +
                "                        \"id\": 66,\n" +
                "                        \"name\": \"Manchester United FC\"\n" +
                "                    },\n" +
                "                    \"playerOut\": {\n" +
                "                        \"id\": 3331,\n" +
                "                        \"name\": \"Marcus Rashford\"\n" +
                "                    },\n" +
                "                    \"playerIn\": {\n" +
                "                        \"id\": 3662,\n" +
                "                        \"name\": \"Romelu Lukaku\"\n" +
                "                    }\n" +
                "                },\n" +
                "                {\n" +
                "                    \"minute\": 76,\n" +
                "                    \"team\": {\n" +
                "                        \"id\": 66,\n" +
                "                        \"name\": \"Manchester United FC\"\n" +
                "                    },\n" +
                "                    \"playerOut\": {\n" +
                "                        \"id\": 3232,\n" +
                "                        \"name\": \"Fred\"\n" +
                "                    },\n" +
                "                    \"playerIn\": {\n" +
                "                        \"id\": 7905,\n" +
                "                        \"name\": \"Scott McTominay\"\n" +
                "                    }\n" +
                "                },\n" +
                "                {\n" +
                "                    \"minute\": 80,\n" +
                "                    \"team\": {\n" +
                "                        \"id\": 338,\n" +
                "                        \"name\": \"Leicester City FC\"\n" +
                "                    },\n" +
                "                    \"playerOut\": {\n" +
                "                        \"id\": 3252,\n" +
                "                        \"name\": \"Adrien Silva\"\n" +
                "                    },\n" +
                "                    \"playerIn\": {\n" +
                "                        \"id\": 8073,\n" +
                "                        \"name\": \"Iborra\"\n" +
                "                    }\n" +
                "                },\n" +
                "                {\n" +
                "                    \"minute\": 84,\n" +
                "                    \"team\": {\n" +
                "                        \"id\": 66,\n" +
                "                        \"name\": \"Manchester United FC\"\n" +
                "                    },\n" +
                "                    \"playerOut\": {\n" +
                "                        \"id\": 3366,\n" +
                "                        \"name\": \"Paul Pogba\"\n" +
                "                    },\n" +
                "                    \"playerIn\": {\n" +
                "                        \"id\": 3652,\n" +
                "                        \"name\": \"Marouane Fellaini\"\n" +
                "                    }\n" +
                "                }\n" +
                "            ],\n" +
                "            \"referees\": [\n" +
                "                {\n" +
                "                    \"id\": 11610,\n" +
                "                    \"name\": \"Andre Marriner\",\n" +
                "                    \"nationality\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": 11611,\n" +
                "                    \"name\": \"Scott Ledger\",\n" +
                "                    \"nationality\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": 11504,\n" +
                "                    \"name\": \"Simon Long\",\n" +
                "                    \"nationality\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": 11580,\n" +
                "                    \"name\": \"Anthony Taylor\",\n" +
                "                    \"nationality\": null\n" +
                "                }\n" +
                "            ]\n" +
                "        }\n" +
                "\t\t]\n" +
                "}";

    }
}