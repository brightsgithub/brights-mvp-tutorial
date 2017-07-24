package com.examples.bright.tutorial.testutils;

/**
 * This is used to house the json responses, to allow to the app to test against without hitting the
 * server.
 * Created by bright on 23/07/2017.
 */

public interface TestJson {

    /**
     * This is a direct copy and paste of the response from the api of 10 comic records.
     */
    String COMICS_10_RECORDS = "{\n" +
            "  \"code\": 200,\n" +
            "  \"status\": \"Ok\",\n" +
            "  \"copyright\": \"© 2017 MARVEL\",\n" +
            "  \"attributionText\": \"Data provided by Marvel. © 2017 MARVEL\",\n" +
            "  \"attributionHTML\": \"<a href=\\\"http://marvel.com\\\">Data provided by Marvel. © 2017 MARVEL</a>\",\n" +
            "  \"etag\": \"6f4df98a75f9cd3d4c7036903ad50822f5e0c116\",\n" +
            "  \"data\": {\n" +
            "    \"offset\": 0,\n" +
            "    \"limit\": 10,\n" +
            "    \"total\": 40028,\n" +
            "    \"count\": 10,\n" +
            "    \"results\": [\n" +
            "      {\n" +
            "        \"id\": 23889,\n" +
            "        \"digitalId\": 0,\n" +
            "        \"title\": \"Wolverine by Claremont & Miller (Trade Paperback)\",\n" +
            "        \"issueNumber\": 0,\n" +
            "        \"variantDescription\": \"\",\n" +
            "        \"description\": \"The master of mutants joins the master of ninjas in Wolverine's first solo series ' replete with romance, intrigue and mayhem! Our beleaguered berserker's in Japan on a mission of the heart, if he can survive the Hand first! Plus: the introduction of everyone's favorite riotous ronin, Yukio! Collects WOLVERINE #1-4, plus UNCANNY X-MEN #172-173.\\r\\nRated T  '$16.99\\r\\nISBN: 978-0-7851-3724-5\",\n" +
            "        \"modified\": \"2017-03-27T17:00:30-0400\",\n" +
            "        \"isbn\": \"978-0-7851-3724-5\",\n" +
            "        \"upc\": \"5960613724-00111\",\n" +
            "        \"diamondCode\": \"JAN092591\",\n" +
            "        \"ean\": \"9780785 137245 51699\",\n" +
            "        \"issn\": \"\",\n" +
            "        \"format\": \"Trade Paperback\",\n" +
            "        \"pageCount\": 144,\n" +
            "        \"textObjects\": [\n" +
            "          {\n" +
            "            \"type\": \"issue_solicit_text\",\n" +
            "            \"language\": \"en-us\",\n" +
            "            \"text\": \"The master of mutants joins the master of ninjas in Wolverine's first solo series ' replete with romance, intrigue and mayhem! Our beleaguered berserker's in Japan on a mission of the heart, if he can survive the Hand first! Plus: the introduction of everyone's favorite riotous ronin, Yukio! Collects WOLVERINE #1-4, plus UNCANNY X-MEN #172-173.\\r\\nRated T  '$16.99\\r\\nISBN: 978-0-7851-3724-5\"\n" +
            "          }\n" +
            "        ],\n" +
            "        \"resourceURI\": \"http://gateway.marvel.com/v1/public/comics/23889\",\n" +
            "        \"urls\": [\n" +
            "          {\n" +
            "            \"type\": \"detail\",\n" +
            "            \"url\": \"http://marvel.com/comics/collection/23889/wolverine_by_claremont_miller_trade_paperback?utm_campaign=apiRef&utm_source=e5de1b003e4d44302fe74b8d91d4e07b\"\n" +
            "          }\n" +
            "        ],\n" +
            "        \"series\": {\n" +
            "          \"resourceURI\": \"http://gateway.marvel.com/v1/public/series/7056\",\n" +
            "          \"name\": \"Wolverine by Claremont & Miller (2009 - Present)\"\n" +
            "        },\n" +
            "        \"variants\": [],\n" +
            "        \"collections\": [],\n" +
            "        \"collectedIssues\": [\n" +
            "          {\n" +
            "            \"resourceURI\": \"http://gateway.marvel.com/v1/public/comics/13714\",\n" +
            "            \"name\": \"Uncanny X-Men (1963) #173\"\n" +
            "          },\n" +
            "          {\n" +
            "            \"resourceURI\": \"http://gateway.marvel.com/v1/public/comics/13713\",\n" +
            "            \"name\": \"Uncanny X-Men (1963) #172\"\n" +
            "          },\n" +
            "          {\n" +
            "            \"resourceURI\": \"http://gateway.marvel.com/v1/public/comics/12171\",\n" +
            "            \"name\": \"Wolverine (1982) #4\"\n" +
            "          },\n" +
            "          {\n" +
            "            \"resourceURI\": \"http://gateway.marvel.com/v1/public/comics/12170\",\n" +
            "            \"name\": \"Wolverine (1982) #3\"\n" +
            "          },\n" +
            "          {\n" +
            "            \"resourceURI\": \"http://gateway.marvel.com/v1/public/comics/12169\",\n" +
            "            \"name\": \"Wolverine (1982) #2\"\n" +
            "          },\n" +
            "          {\n" +
            "            \"resourceURI\": \"http://gateway.marvel.com/v1/public/comics/12168\",\n" +
            "            \"name\": \"Wolverine (1982) #1\"\n" +
            "          }\n" +
            "        ],\n" +
            "        \"dates\": [\n" +
            "          {\n" +
            "            \"type\": \"onsaleDate\",\n" +
            "            \"date\": \"2029-12-31T00:00:00-0500\"\n" +
            "          },\n" +
            "          {\n" +
            "            \"type\": \"focDate\",\n" +
            "            \"date\": \"2009-02-05T00:00:00-0500\"\n" +
            "          }\n" +
            "        ],\n" +
            "        \"prices\": [\n" +
            "          {\n" +
            "            \"type\": \"printPrice\",\n" +
            "            \"price\": 16.99\n" +
            "          }\n" +
            "        ],\n" +
            "        \"thumbnail\": {\n" +
            "          \"path\": \"http://i.annihil.us/u/prod/marvel/i/mg/6/50/58d97d2b532a0\",\n" +
            "          \"extension\": \"jpg\"\n" +
            "        },\n" +
            "        \"images\": [\n" +
            "          {\n" +
            "            \"path\": \"http://i.annihil.us/u/prod/marvel/i/mg/6/50/58d97d2b532a0\",\n" +
            "            \"extension\": \"jpg\"\n" +
            "          },\n" +
            "          {\n" +
            "            \"path\": \"http://i.annihil.us/u/prod/marvel/i/mg/c/90/58545fd0f3fbb\",\n" +
            "            \"extension\": \"jpg\"\n" +
            "          },\n" +
            "          {\n" +
            "            \"path\": \"http://i.annihil.us/u/prod/marvel/i/mg/c/70/4c363ba9d76ea\",\n" +
            "            \"extension\": \"jpg\"\n" +
            "          }\n" +
            "        ],\n" +
            "        \"creators\": {\n" +
            "          \"available\": 10,\n" +
            "          \"collectionURI\": \"http://gateway.marvel.com/v1/public/comics/23889/creators\",\n" +
            "          \"items\": [\n" +
            "            {\n" +
            "              \"resourceURI\": \"http://gateway.marvel.com/v1/public/creators/44\",\n" +
            "              \"name\": \"Chris Claremont\",\n" +
            "              \"role\": \"writer\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"resourceURI\": \"http://gateway.marvel.com/v1/public/creators/6049\",\n" +
            "              \"name\": \"Danny Fingeroth\",\n" +
            "              \"role\": \"editor\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"resourceURI\": \"http://gateway.marvel.com/v1/public/creators/2406\",\n" +
            "              \"name\": \"Louise Jones\",\n" +
            "              \"role\": \"editor\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"resourceURI\": \"http://gateway.marvel.com/v1/public/creators/17\",\n" +
            "              \"name\": \"Frank Miller\",\n" +
            "              \"role\": \"penciller\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"resourceURI\": \"http://gateway.marvel.com/v1/public/creators/939\",\n" +
            "              \"name\": \"Joe Rubinstein\",\n" +
            "              \"role\": \"penciller\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"resourceURI\": \"http://gateway.marvel.com/v1/public/creators/431\",\n" +
            "              \"name\": \"Paul Smith\",\n" +
            "              \"role\": \"penciller\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"resourceURI\": \"http://gateway.marvel.com/v1/public/creators/1872\",\n" +
            "              \"name\": \"Glynis Oliver\",\n" +
            "              \"role\": \"colorist\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"resourceURI\": \"http://gateway.marvel.com/v1/public/creators/2459\",\n" +
            "              \"name\": \"Lynn Varley\",\n" +
            "              \"role\": \"colorist\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"resourceURI\": \"http://gateway.marvel.com/v1/public/creators/791\",\n" +
            "              \"name\": \"Tom Orzechowski\",\n" +
            "              \"role\": \"letterer\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"resourceURI\": \"http://gateway.marvel.com/v1/public/creators/2030\",\n" +
            "              \"name\": \"Bob Wiacek\",\n" +
            "              \"role\": \"inker\"\n" +
            "            }\n" +
            "          ],\n" +
            "          \"returned\": 10\n" +
            "        },\n" +
            "        \"characters\": {\n" +
            "          \"available\": 15,\n" +
            "          \"collectionURI\": \"http://gateway.marvel.com/v1/public/comics/23889/characters\",\n" +
            "          \"items\": [\n" +
            "            {\n" +
            "              \"resourceURI\": \"http://gateway.marvel.com/v1/public/characters/1009243\",\n" +
            "              \"name\": \"Colossus\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"resourceURI\": \"http://gateway.marvel.com/v1/public/characters/1009247\",\n" +
            "              \"name\": \"Corsair\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"resourceURI\": \"http://gateway.marvel.com/v1/public/characters/1009257\",\n" +
            "              \"name\": \"Cyclops\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"resourceURI\": \"http://gateway.marvel.com/v1/public/characters/1009337\",\n" +
            "              \"name\": \"Havok\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"resourceURI\": \"http://gateway.marvel.com/v1/public/characters/1009368\",\n" +
            "              \"name\": \"Iron Man\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"resourceURI\": \"http://gateway.marvel.com/v1/public/characters/1009402\",\n" +
            "              \"name\": \"Lilandra\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"resourceURI\": \"http://gateway.marvel.com/v1/public/characters/1009405\",\n" +
            "              \"name\": \"Lockheed\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"resourceURI\": \"http://gateway.marvel.com/v1/public/characters/1009434\",\n" +
            "              \"name\": \"Mastermind\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"resourceURI\": \"http://gateway.marvel.com/v1/public/characters/1009472\",\n" +
            "              \"name\": \"Nightcrawler\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"resourceURI\": \"http://gateway.marvel.com/v1/public/characters/1009499\",\n" +
            "              \"name\": \"Polaris\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"resourceURI\": \"http://gateway.marvel.com/v1/public/characters/1009546\",\n" +
            "              \"name\": \"Rogue\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"resourceURI\": \"http://gateway.marvel.com/v1/public/characters/1009629\",\n" +
            "              \"name\": \"Storm\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"resourceURI\": \"http://gateway.marvel.com/v1/public/characters/1009696\",\n" +
            "              \"name\": \"Viper\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"resourceURI\": \"http://gateway.marvel.com/v1/public/characters/1009718\",\n" +
            "              \"name\": \"Wolverine\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"resourceURI\": \"http://gateway.marvel.com/v1/public/characters/1009726\",\n" +
            "              \"name\": \"X-Men\"\n" +
            "            }\n" +
            "          ],\n" +
            "          \"returned\": 15\n" +
            "        },\n" +
            "        \"stories\": {\n" +
            "          \"available\": 8,\n" +
            "          \"collectionURI\": \"http://gateway.marvel.com/v1/public/comics/23889/stories\",\n" +
            "          \"items\": [\n" +
            "            {\n" +
            "              \"resourceURI\": \"http://gateway.marvel.com/v1/public/stories/21089\",\n" +
            "              \"name\": \"I'm Wolverine.\",\n" +
            "              \"type\": \"interiorStory\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"resourceURI\": \"http://gateway.marvel.com/v1/public/stories/21091\",\n" +
            "              \"name\": \"Debts and Obligations\",\n" +
            "              \"type\": \"interiorStory\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"resourceURI\": \"http://gateway.marvel.com/v1/public/stories/21093\",\n" +
            "              \"name\": \"Loss\",\n" +
            "              \"type\": \"interiorStory\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"resourceURI\": \"http://gateway.marvel.com/v1/public/stories/21095\",\n" +
            "              \"name\": \"Honor\",\n" +
            "              \"type\": \"interiorStory\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"resourceURI\": \"http://gateway.marvel.com/v1/public/stories/27854\",\n" +
            "              \"name\": \"Scarlet In Glory\",\n" +
            "              \"type\": \"interiorStory\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"resourceURI\": \"http://gateway.marvel.com/v1/public/stories/27855\",\n" +
            "              \"name\": \"Cover #27855\",\n" +
            "              \"type\": \"cover\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"resourceURI\": \"http://gateway.marvel.com/v1/public/stories/27856\",\n" +
            "              \"name\": \"To Have and Have Not\",\n" +
            "              \"type\": \"interiorStory\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"resourceURI\": \"http://gateway.marvel.com/v1/public/stories/53006\",\n" +
            "              \"name\": \"Wolverine 1-4, Uncanny X-Men 172, 173\",\n" +
            "              \"type\": \"interiorStory\"\n" +
            "            }\n" +
            "          ],\n" +
            "          \"returned\": 8\n" +
            "        },\n" +
            "        \"events\": {\n" +
            "          \"available\": 0,\n" +
            "          \"collectionURI\": \"http://gateway.marvel.com/v1/public/comics/23889/events\",\n" +
            "          \"items\": [],\n" +
            "          \"returned\": 0\n" +
            "        }\n" +
            "      },\n" +
            "      {\n" +
            "        \"id\": 37497,\n" +
            "        \"digitalId\": 0,\n" +
            "        \"title\": \"Marvels Vol. 1 (1994) #1\",\n" +
            "        \"issueNumber\": 1,\n" +
            "        \"variantDescription\": \"\",\n" +
            "        \"description\": null,\n" +
            "        \"modified\": \"2014-05-08T12:18:41-0400\",\n" +
            "        \"isbn\": \"\",\n" +
            "        \"upc\": \"\",\n" +
            "        \"diamondCode\": \"\",\n" +
            "        \"ean\": \"\",\n" +
            "        \"issn\": \"\",\n" +
            "        \"format\": \"Digital Comic\",\n" +
            "        \"pageCount\": 0,\n" +
            "        \"textObjects\": [],\n" +
            "        \"resourceURI\": \"http://gateway.marvel.com/v1/public/comics/37497\",\n" +
            "        \"urls\": [\n" +
            "          {\n" +
            "            \"type\": \"detail\",\n" +
            "            \"url\": \"http://marvel.com/comics/issue/37497/marvels_vol_1_1994_1?utm_campaign=apiRef&utm_source=e5de1b003e4d44302fe74b8d91d4e07b\"\n" +
            "          }\n" +
            "        ],\n" +
            "        \"series\": {\n" +
            "          \"resourceURI\": \"http://gateway.marvel.com/v1/public/series/13495\",\n" +
            "          \"name\": \"Marvels Vol. 1 (1994)\"\n" +
            "        },\n" +
            "        \"variants\": [],\n" +
            "        \"collections\": [],\n" +
            "        \"collectedIssues\": [],\n" +
            "        \"dates\": [\n" +
            "          {\n" +
            "            \"type\": \"onsaleDate\",\n" +
            "            \"date\": \"2029-12-31T00:00:00-0500\"\n" +
            "          },\n" +
            "          {\n" +
            "            \"type\": \"focDate\",\n" +
            "            \"date\": \"-0001-11-30T00:00:00-0500\"\n" +
            "          }\n" +
            "        ],\n" +
            "        \"prices\": [\n" +
            "          {\n" +
            "            \"type\": \"printPrice\",\n" +
            "            \"price\": 0\n" +
            "          }\n" +
            "        ],\n" +
            "        \"thumbnail\": {\n" +
            "          \"path\": \"http://i.annihil.us/u/prod/marvel/i/mg/b/40/image_not_available\",\n" +
            "          \"extension\": \"jpg\"\n" +
            "        },\n" +
            "        \"images\": [],\n" +
            "        \"creators\": {\n" +
            "          \"available\": 0,\n" +
            "          \"collectionURI\": \"http://gateway.marvel.com/v1/public/comics/37497/creators\",\n" +
            "          \"items\": [],\n" +
            "          \"returned\": 0\n" +
            "        },\n" +
            "        \"characters\": {\n" +
            "          \"available\": 0,\n" +
            "          \"collectionURI\": \"http://gateway.marvel.com/v1/public/comics/37497/characters\",\n" +
            "          \"items\": [],\n" +
            "          \"returned\": 0\n" +
            "        },\n" +
            "        \"stories\": {\n" +
            "          \"available\": 0,\n" +
            "          \"collectionURI\": \"http://gateway.marvel.com/v1/public/comics/37497/stories\",\n" +
            "          \"items\": [],\n" +
            "          \"returned\": 0\n" +
            "        },\n" +
            "        \"events\": {\n" +
            "          \"available\": 0,\n" +
            "          \"collectionURI\": \"http://gateway.marvel.com/v1/public/comics/37497/events\",\n" +
            "          \"items\": [],\n" +
            "          \"returned\": 0\n" +
            "        }\n" +
            "      },\n" +
            "      {\n" +
            "        \"id\": 3627,\n" +
            "        \"digitalId\": 0,\n" +
            "        \"title\": \"Storm (2006)\",\n" +
            "        \"issueNumber\": 0,\n" +
            "        \"variantDescription\": \"\",\n" +
            "        \"description\": \"The epic, untold love story between Marvel's two pre-eminent Black super heroes -- Storm and the Black Panther -- is finally told, as only New York Times best-selling author Eric Jerome Dickey can do it!  An orphaned street urchin, living by her wits on the unforgiving plains of Africa as she struggles to harness her slowly-developing mutant powers...A warrior Prince, embarking on his rite of passage as he ponders the great responsibility in his future...And a crew of ruthless mercenaries who'll stop at nothing to capture an elusive creature of legend -- the fabled wind-rider.  What sparks occur when their paths intersect?  Don't miss out on this story, True Believer, as it builds to a July Event that will shake the entire Marvel Universe.\\r<br>\\r<br>32 PGS./T+ SUGGESTED FOR TEENS AND UP ...$2.99\\r<br>\",\n" +
            "        \"modified\": \"2015-01-29T20:04:55-0500\",\n" +
            "        \"isbn\": \"\",\n" +
            "        \"upc\": \"\",\n" +
            "        \"diamondCode\": \"\",\n" +
            "        \"ean\": \"\",\n" +
            "        \"issn\": \"\",\n" +
            "        \"format\": \"Comic\",\n" +
            "        \"pageCount\": 0,\n" +
            "        \"textObjects\": [\n" +
            "          {\n" +
            "            \"type\": \"issue_solicit_text\",\n" +
            "            \"language\": \"en-us\",\n" +
            "            \"text\": \"The epic, untold love story between Marvel's two pre-eminent Black super heroes -- Storm and the Black Panther -- is finally told, as only New York Times best-selling author Eric Jerome Dickey can do it!  An orphaned street urchin, living by her wits on the unforgiving plains of Africa as she struggles to harness her slowly-developing mutant powers...A warrior Prince, embarking on his rite of passage as he ponders the great responsibility in his future...And a crew of ruthless mercenaries who'll stop at nothing to capture an elusive creature of legend -- the fabled wind-rider.  What sparks occur when their paths intersect?  Don't miss out on this story, True Believer, as it builds to a July Event that will shake the entire Marvel Universe.\\r<br>\\r<br>32 PGS./T+ SUGGESTED FOR TEENS AND UP ...$2.99\\r<br>\"\n" +
            "          }\n" +
            "        ],\n" +
            "        \"resourceURI\": \"http://gateway.marvel.com/v1/public/comics/3627\",\n" +
            "        \"urls\": [\n" +
            "          {\n" +
            "            \"type\": \"detail\",\n" +
            "            \"url\": \"http://marvel.com/comics/issue/3627/storm_2006?utm_campaign=apiRef&utm_source=e5de1b003e4d44302fe74b8d91d4e07b\"\n" +
            "          }\n" +
            "        ],\n" +
            "        \"series\": {\n" +
            "          \"resourceURI\": \"http://gateway.marvel.com/v1/public/series/357\",\n" +
            "          \"name\": \"Storm (2006)\"\n" +
            "        },\n" +
            "        \"variants\": [],\n" +
            "        \"collections\": [],\n" +
            "        \"collectedIssues\": [],\n" +
            "        \"dates\": [\n" +
            "          {\n" +
            "            \"type\": \"onsaleDate\",\n" +
            "            \"date\": \"2029-12-31T00:00:00-0500\"\n" +
            "          },\n" +
            "          {\n" +
            "            \"type\": \"focDate\",\n" +
            "            \"date\": \"-0001-11-30T00:00:00-0500\"\n" +
            "          }\n" +
            "        ],\n" +
            "        \"prices\": [\n" +
            "          {\n" +
            "            \"type\": \"printPrice\",\n" +
            "            \"price\": 0\n" +
            "          }\n" +
            "        ],\n" +
            "        \"thumbnail\": {\n" +
            "          \"path\": \"http://i.annihil.us/u/prod/marvel/i/mg/c/80/4bc5fe7a308d7\",\n" +
            "          \"extension\": \"jpg\"\n" +
            "        },\n" +
            "        \"images\": [\n" +
            "          {\n" +
            "            \"path\": \"http://i.annihil.us/u/prod/marvel/i/mg/c/80/4bc5fe7a308d7\",\n" +
            "            \"extension\": \"jpg\"\n" +
            "          }\n" +
            "        ],\n" +
            "        \"creators\": {\n" +
            "          \"available\": 3,\n" +
            "          \"collectionURI\": \"http://gateway.marvel.com/v1/public/comics/3627/creators\",\n" +
            "          \"items\": [\n" +
            "            {\n" +
            "              \"resourceURI\": \"http://gateway.marvel.com/v1/public/creators/370\",\n" +
            "              \"name\": \"Eric Jerome Dickey\",\n" +
            "              \"role\": \"writer\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"resourceURI\": \"http://gateway.marvel.com/v1/public/creators/371\",\n" +
            "              \"name\": \"David Hine\",\n" +
            "              \"role\": \"penciller\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"resourceURI\": \"http://gateway.marvel.com/v1/public/creators/243\",\n" +
            "              \"name\": \"Mike Mayhew\",\n" +
            "              \"role\": \"penciller (cover)\"\n" +
            "            }\n" +
            "          ],\n" +
            "          \"returned\": 3\n" +
            "        },\n" +
            "        \"characters\": {\n" +
            "          \"available\": 1,\n" +
            "          \"collectionURI\": \"http://gateway.marvel.com/v1/public/comics/3627/characters\",\n" +
            "          \"items\": [\n" +
            "            {\n" +
            "              \"resourceURI\": \"http://gateway.marvel.com/v1/public/characters/1009629\",\n" +
            "              \"name\": \"Storm\"\n" +
            "            }\n" +
            "          ],\n" +
            "          \"returned\": 1\n" +
            "        },\n" +
            "        \"stories\": {\n" +
            "          \"available\": 2,\n" +
            "          \"collectionURI\": \"http://gateway.marvel.com/v1/public/comics/3627/stories\",\n" +
            "          \"items\": [\n" +
            "            {\n" +
            "              \"resourceURI\": \"http://gateway.marvel.com/v1/public/stories/496\",\n" +
            "              \"name\": \"Cover #496\",\n" +
            "              \"type\": \"cover\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"resourceURI\": \"http://gateway.marvel.com/v1/public/stories/497\",\n" +
            "              \"name\": \"Interior #497\",\n" +
            "              \"type\": \"interiorStory\"\n" +
            "            }\n" +
            "          ],\n" +
            "          \"returned\": 2\n" +
            "        },\n" +
            "        \"events\": {\n" +
            "          \"available\": 0,\n" +
            "          \"collectionURI\": \"http://gateway.marvel.com/v1/public/comics/3627/events\",\n" +
            "          \"items\": [],\n" +
            "          \"returned\": 0\n" +
            "        }\n" +
            "      },\n" +
            "      {\n" +
            "        \"id\": 16230,\n" +
            "        \"digitalId\": 0,\n" +
            "        \"title\": \"Cap Transport (2005) #10\",\n" +
            "        \"issueNumber\": 10,\n" +
            "        \"variantDescription\": \"\",\n" +
            "        \"description\": null,\n" +
            "        \"modified\": \"-0001-11-30T00:00:00-0500\",\n" +
            "        \"isbn\": \"\",\n" +
            "        \"upc\": \"\",\n" +
            "        \"diamondCode\": \"\",\n" +
            "        \"ean\": \"\",\n" +
            "        \"issn\": \"\",\n" +
            "        \"format\": \"Comic\",\n" +
            "        \"pageCount\": 0,\n" +
            "        \"textObjects\": [],\n" +
            "        \"resourceURI\": \"http://gateway.marvel.com/v1/public/comics/16230\",\n" +
            "        \"urls\": [\n" +
            "          {\n" +
            "            \"type\": \"detail\",\n" +
            "            \"url\": \"http://marvel.com/comics/issue/16230/cap_transport_2005_10?utm_campaign=apiRef&utm_source=e5de1b003e4d44302fe74b8d91d4e07b\"\n" +
            "          }\n" +
            "        ],\n" +
            "        \"series\": {\n" +
            "          \"resourceURI\": \"http://gateway.marvel.com/v1/public/series/2722\",\n" +
            "          \"name\": \"Cap Transport (2005 - 2006)\"\n" +
            "        },\n" +
            "        \"variants\": [],\n" +
            "        \"collections\": [],\n" +
            "        \"collectedIssues\": [],\n" +
            "        \"dates\": [\n" +
            "          {\n" +
            "            \"type\": \"onsaleDate\",\n" +
            "            \"date\": \"2029-12-31T00:00:00-0500\"\n" +
            "          },\n" +
            "          {\n" +
            "            \"type\": \"focDate\",\n" +
            "            \"date\": \"-0001-11-30T00:00:00-0500\"\n" +
            "          }\n" +
            "        ],\n" +
            "        \"prices\": [\n" +
            "          {\n" +
            "            \"type\": \"printPrice\",\n" +
            "            \"price\": 0\n" +
            "          }\n" +
            "        ],\n" +
            "        \"thumbnail\": {\n" +
            "          \"path\": \"http://i.annihil.us/u/prod/marvel/i/mg/b/40/image_not_available\",\n" +
            "          \"extension\": \"jpg\"\n" +
            "        },\n" +
            "        \"images\": [],\n" +
            "        \"creators\": {\n" +
            "          \"available\": 14,\n" +
            "          \"collectionURI\": \"http://gateway.marvel.com/v1/public/comics/16230/creators\",\n" +
            "          \"items\": [\n" +
            "            {\n" +
            "              \"resourceURI\": \"http://gateway.marvel.com/v1/public/creators/2133\",\n" +
            "              \"name\": \"Tom Brevoort\",\n" +
            "              \"role\": \"editor\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"resourceURI\": \"http://gateway.marvel.com/v1/public/creators/5245\",\n" +
            "              \"name\": \"Nathan Cosby\",\n" +
            "              \"role\": \"editor\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"resourceURI\": \"http://gateway.marvel.com/v1/public/creators/5248\",\n" +
            "              \"name\": \"Molly Lazer\",\n" +
            "              \"role\": \"editor\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"resourceURI\": \"http://gateway.marvel.com/v1/public/creators/4600\",\n" +
            "              \"name\": \"Mark Paniccia\",\n" +
            "              \"role\": \"editor\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"resourceURI\": \"http://gateway.marvel.com/v1/public/creators/4371\",\n" +
            "              \"name\": \"Andy Schmidt\",\n" +
            "              \"role\": \"editor\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"resourceURI\": \"http://gateway.marvel.com/v1/public/creators/367\",\n" +
            "              \"name\": \"Ed Brubaker\",\n" +
            "              \"role\": \"writer\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"resourceURI\": \"http://gateway.marvel.com/v1/public/creators/400\",\n" +
            "              \"name\": \"Keith Giffen\",\n" +
            "              \"role\": \"writer\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"resourceURI\": \"http://gateway.marvel.com/v1/public/creators/8504\",\n" +
            "              \"name\": \"Frank D'Armata\",\n" +
            "              \"role\": \"colorist\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"resourceURI\": \"http://gateway.marvel.com/v1/public/creators/5247\",\n" +
            "              \"name\": \"J. Tai of Sotocolor\",\n" +
            "              \"role\": \"colorist\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"resourceURI\": \"http://gateway.marvel.com/v1/public/creators/1016\",\n" +
            "              \"name\": \"Eduardo Francisco\",\n" +
            "              \"role\": \"penciler\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"resourceURI\": \"http://gateway.marvel.com/v1/public/creators/8991\",\n" +
            "              \"name\": \"Lee Weeks\",\n" +
            "              \"role\": \"penciler\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"resourceURI\": \"http://gateway.marvel.com/v1/public/creators/647\",\n" +
            "              \"name\": \"Kris Justice\",\n" +
            "              \"role\": \"inker\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"resourceURI\": \"http://gateway.marvel.com/v1/public/creators/878\",\n" +
            "              \"name\": \"Dave Lanphear\",\n" +
            "              \"role\": \"letterer\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"resourceURI\": \"http://gateway.marvel.com/v1/public/creators/1405\",\n" +
            "              \"name\": \"Matt Milla\",\n" +
            "              \"role\": \"letterer\"\n" +
            "            }\n" +
            "          ],\n" +
            "          \"returned\": 14\n" +
            "        },\n" +
            "        \"characters\": {\n" +
            "          \"available\": 3,\n" +
            "          \"collectionURI\": \"http://gateway.marvel.com/v1/public/comics/16230/characters\",\n" +
            "          \"items\": [\n" +
            "            {\n" +
            "              \"resourceURI\": \"http://gateway.marvel.com/v1/public/characters/1009220\",\n" +
            "              \"name\": \"Captain America\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"resourceURI\": \"http://gateway.marvel.com/v1/public/characters/1009284\",\n" +
            "              \"name\": \"Dum Dum Dugan\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"resourceURI\": \"http://gateway.marvel.com/v1/public/characters/1009356\",\n" +
            "              \"name\": \"Human Torch\"\n" +
            "            }\n" +
            "          ],\n" +
            "          \"returned\": 3\n" +
            "        },\n" +
            "        \"stories\": {\n" +
            "          \"available\": 4,\n" +
            "          \"collectionURI\": \"http://gateway.marvel.com/v1/public/comics/16230/stories\",\n" +
            "          \"items\": [\n" +
            "            {\n" +
            "              \"resourceURI\": \"http://gateway.marvel.com/v1/public/stories/33979\",\n" +
            "              \"name\": \"Cover #33979\",\n" +
            "              \"type\": \"cover\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"resourceURI\": \"http://gateway.marvel.com/v1/public/stories/33980\",\n" +
            "              \"name\": \"The House of M\",\n" +
            "              \"type\": \"interiorStory\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"resourceURI\": \"http://gateway.marvel.com/v1/public/stories/33981\",\n" +
            "              \"name\": \"Freedom of Speech\",\n" +
            "              \"type\": \"letters\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"resourceURI\": \"http://gateway.marvel.com/v1/public/stories/33982\",\n" +
            "              \"name\": \"Creatures on the Loose!\",\n" +
            "              \"type\": \"promo\"\n" +
            "            }\n" +
            "          ],\n" +
            "          \"returned\": 4\n" +
            "        },\n" +
            "        \"events\": {\n" +
            "          \"available\": 0,\n" +
            "          \"collectionURI\": \"http://gateway.marvel.com/v1/public/comics/16230/events\",\n" +
            "          \"items\": [],\n" +
            "          \"returned\": 0\n" +
            "        }\n" +
            "      },\n" +
            "      {\n" +
            "        \"id\": 16246,\n" +
            "        \"digitalId\": 0,\n" +
            "        \"title\": \"Cap Transport (2005) #7\",\n" +
            "        \"issueNumber\": 7,\n" +
            "        \"variantDescription\": \"\",\n" +
            "        \"description\": null,\n" +
            "        \"modified\": \"-0001-11-30T00:00:00-0500\",\n" +
            "        \"isbn\": \"\",\n" +
            "        \"upc\": \"\",\n" +
            "        \"diamondCode\": \"\",\n" +
            "        \"ean\": \"\",\n" +
            "        \"issn\": \"\",\n" +
            "        \"format\": \"Comic\",\n" +
            "        \"pageCount\": 0,\n" +
            "        \"textObjects\": [],\n" +
            "        \"resourceURI\": \"http://gateway.marvel.com/v1/public/comics/16246\",\n" +
            "        \"urls\": [\n" +
            "          {\n" +
            "            \"type\": \"detail\",\n" +
            "            \"url\": \"http://marvel.com/comics/issue/16246/cap_transport_2005_7?utm_campaign=apiRef&utm_source=e5de1b003e4d44302fe74b8d91d4e07b\"\n" +
            "          }\n" +
            "        ],\n" +
            "        \"series\": {\n" +
            "          \"resourceURI\": \"http://gateway.marvel.com/v1/public/series/2722\",\n" +
            "          \"name\": \"Cap Transport (2005 - 2006)\"\n" +
            "        },\n" +
            "        \"variants\": [],\n" +
            "        \"collections\": [],\n" +
            "        \"collectedIssues\": [],\n" +
            "        \"dates\": [\n" +
            "          {\n" +
            "            \"type\": \"onsaleDate\",\n" +
            "            \"date\": \"2029-12-31T00:00:00-0500\"\n" +
            "          },\n" +
            "          {\n" +
            "            \"type\": \"focDate\",\n" +
            "            \"date\": \"-0001-11-30T00:00:00-0500\"\n" +
            "          }\n" +
            "        ],\n" +
            "        \"prices\": [\n" +
            "          {\n" +
            "            \"type\": \"printPrice\",\n" +
            "            \"price\": 0\n" +
            "          }\n" +
            "        ],\n" +
            "        \"thumbnail\": {\n" +
            "          \"path\": \"http://i.annihil.us/u/prod/marvel/i/mg/b/40/image_not_available\",\n" +
            "          \"extension\": \"jpg\"\n" +
            "        },\n" +
            "        \"images\": [],\n" +
            "        \"creators\": {\n" +
            "          \"available\": 9,\n" +
            "          \"collectionURI\": \"http://gateway.marvel.com/v1/public/comics/16246/creators\",\n" +
            "          \"items\": [\n" +
            "            {\n" +
            "              \"resourceURI\": \"http://gateway.marvel.com/v1/public/creators/2133\",\n" +
            "              \"name\": \"Tom Brevoort\",\n" +
            "              \"role\": \"editor\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"resourceURI\": \"http://gateway.marvel.com/v1/public/creators/5248\",\n" +
            "              \"name\": \"Molly Lazer\",\n" +
            "              \"role\": \"editor\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"resourceURI\": \"http://gateway.marvel.com/v1/public/creators/4371\",\n" +
            "              \"name\": \"Andy Schmidt\",\n" +
            "              \"role\": \"editor\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"resourceURI\": \"http://gateway.marvel.com/v1/public/creators/367\",\n" +
            "              \"name\": \"Ed Brubaker\",\n" +
            "              \"role\": \"writer\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"resourceURI\": \"http://gateway.marvel.com/v1/public/creators/7129\",\n" +
            "              \"name\": \"Virtual Calligraphy\",\n" +
            "              \"role\": \"letterer\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"resourceURI\": \"http://gateway.marvel.com/v1/public/creators/8635\",\n" +
            "              \"name\": \"Randy Gentile\",\n" +
            "              \"role\": \"letterer\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"resourceURI\": \"http://gateway.marvel.com/v1/public/creators/8504\",\n" +
            "              \"name\": \"Frank D'Armata\",\n" +
            "              \"role\": \"colorist\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"resourceURI\": \"http://gateway.marvel.com/v1/public/creators/374\",\n" +
            "              \"name\": \"Steve Epting\",\n" +
            "              \"role\": \"penciler\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"resourceURI\": \"http://gateway.marvel.com/v1/public/creators/127\",\n" +
            "              \"name\": \"John Paul Leon\",\n" +
            "              \"role\": \"penciler\"\n" +
            "            }\n" +
            "          ],\n" +
            "          \"returned\": 9\n" +
            "        },\n" +
            "        \"characters\": {\n" +
            "          \"available\": 4,\n" +
            "          \"collectionURI\": \"http://gateway.marvel.com/v1/public/comics/16246/characters\",\n" +
            "          \"items\": [\n" +
            "            {\n" +
            "              \"resourceURI\": \"http://gateway.marvel.com/v1/public/characters/1009220\",\n" +
            "              \"name\": \"Captain America\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"resourceURI\": \"http://gateway.marvel.com/v1/public/characters/1009475\",\n" +
            "              \"name\": \"Nomad\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"resourceURI\": \"http://gateway.marvel.com/v1/public/characters/1009565\",\n" +
            "              \"name\": \"Scourge\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"resourceURI\": \"http://gateway.marvel.com/v1/public/characters/1010791\",\n" +
            "              \"name\": \"Sub-Mariner\"\n" +
            "            }\n" +
            "          ],\n" +
            "          \"returned\": 4\n" +
            "        },\n" +
            "        \"stories\": {\n" +
            "          \"available\": 3,\n" +
            "          \"collectionURI\": \"http://gateway.marvel.com/v1/public/comics/16246/stories\",\n" +
            "          \"items\": [\n" +
            "            {\n" +
            "              \"resourceURI\": \"http://gateway.marvel.com/v1/public/stories/34018\",\n" +
            "              \"name\": \"Cover #34018\",\n" +
            "              \"type\": \"cover\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"resourceURI\": \"http://gateway.marvel.com/v1/public/stories/34019\",\n" +
            "              \"name\": \"The Lonesome Death of Jack Monroe\",\n" +
            "              \"type\": \"interiorStory\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"resourceURI\": \"http://gateway.marvel.com/v1/public/stories/34020\",\n" +
            "              \"name\": \"Freedom of Speech\",\n" +
            "              \"type\": \"letters\"\n" +
            "            }\n" +
            "          ],\n" +
            "          \"returned\": 3\n" +
            "        },\n" +
            "        \"events\": {\n" +
            "          \"available\": 0,\n" +
            "          \"collectionURI\": \"http://gateway.marvel.com/v1/public/comics/16246/events\",\n" +
            "          \"items\": [],\n" +
            "          \"returned\": 0\n" +
            "        }\n" +
            "      },\n" +
            "      {\n" +
            "        \"id\": 56802,\n" +
            "        \"digitalId\": 0,\n" +
            "        \"title\": \"Captain Britain: Legacy of A Legend (Trade Paperback)\",\n" +
            "        \"issueNumber\": 0,\n" +
            "        \"variantDescription\": \"\",\n" +
            "        \"description\": \"Honor four decades of myth and majesty with the United Kingdom’s greatest hero! Follow Brian Braddock — handpicked for greatness by the sorcerer Merlyn — from the fateful decision that imbues him with the might of right on the path to glory that will make him protector of the Omniverse! Along the way, he’ll make a splash stateside in a team-up with Spider-Man and fight alongside the Black Knight in the name of King Arthur! Things go from fantasy to far-out as Brian goes Multiversal — facing Slaymaster, the Crazy Gang, Mad Jim Jaspers and the Fury! He’s Britain’s champion — now and forever! Collecting CAPTAIN BRITAIN (1976) #1-2; MARVEL TEAM-UP (1972) #65-66; and material from HULK COMIC #1 and #3-5, INCREDIBLE HULK WEEKLY #57-59, MARVEL SUPER-HEROES (UK) #377-384 and #386, DAREDEVILS #3-4, MIGHTY WORLD OF MARVEL (1983) #8-12 and CAPTAIN BRITAIN (1985) #14.\",\n" +
            "        \"modified\": \"2016-11-18T18:45:57-0500\",\n" +
            "        \"isbn\": \"978-1-302-90654-2\",\n" +
            "        \"upc\": \"\",\n" +
            "        \"diamondCode\": \"\",\n" +
            "        \"ean\": \"9781302 900458 51799\",\n" +
            "        \"issn\": \"\",\n" +
            "        \"format\": \"Trade Paperback\",\n" +
            "        \"pageCount\": 208,\n" +
            "        \"textObjects\": [\n" +
            "          {\n" +
            "            \"type\": \"issue_solicit_text\",\n" +
            "            \"language\": \"en-us\",\n" +
            "            \"text\": \"Honor four decades of myth and majesty with the United Kingdom’s greatest hero! Follow Brian Braddock — handpicked for greatness by the sorcerer Merlyn — from the fateful decision that imbues him with the might of right on the path to glory that will make him protector of the Omniverse! Along the way, he’ll make a splash stateside in a team-up with Spider-Man and fight alongside the Black Knight in the name of King Arthur! Things go from fantasy to far-out as Brian goes Multiversal — facing Slaymaster, the Crazy Gang, Mad Jim Jaspers and the Fury! He’s Britain’s champion — now and forever! Collecting CAPTAIN BRITAIN (1976) #1-2; MARVEL TEAM-UP (1972) #65-66; and material from HULK COMIC #1 and #3-5, INCREDIBLE HULK WEEKLY #57-59, MARVEL SUPER-HEROES (UK) #377-384 and #386, DAREDEVILS #3-4, MIGHTY WORLD OF MARVEL (1983) #8-12 and CAPTAIN BRITAIN (1985) #14.\"\n" +
            "          }\n" +
            "        ],\n" +
            "        \"resourceURI\": \"http://gateway.marvel.com/v1/public/comics/56802\",\n" +
            "        \"urls\": [\n" +
            "          {\n" +
            "            \"type\": \"detail\",\n" +
            "            \"url\": \"http://marvel.com/comics/collection/56802/captain_britain_legacy_of_a_legend_trade_paperback?utm_campaign=apiRef&utm_source=e5de1b003e4d44302fe74b8d91d4e07b\"\n" +
            "          }\n" +
            "        ],\n" +
            "        \"series\": {\n" +
            "          \"resourceURI\": \"http://gateway.marvel.com/v1/public/series/20794\",\n" +
            "          \"name\": \"Captain Britain: Legacy of A Legend (2016)\"\n" +
            "        },\n" +
            "        \"variants\": [],\n" +
            "        \"collections\": [],\n" +
            "        \"collectedIssues\": [],\n" +
            "        \"dates\": [\n" +
            "          {\n" +
            "            \"type\": \"onsaleDate\",\n" +
            "            \"date\": \"2029-12-31T00:00:00-0500\"\n" +
            "          },\n" +
            "          {\n" +
            "            \"type\": \"focDate\",\n" +
            "            \"date\": \"2016-11-02T00:00:00-0400\"\n" +
            "          }\n" +
            "        ],\n" +
            "        \"prices\": [\n" +
            "          {\n" +
            "            \"type\": \"printPrice\",\n" +
            "            \"price\": 24.99\n" +
            "          }\n" +
            "        ],\n" +
            "        \"thumbnail\": {\n" +
            "          \"path\": \"http://i.annihil.us/u/prod/marvel/i/mg/1/70/582f91995c049\",\n" +
            "          \"extension\": \"jpg\"\n" +
            "        },\n" +
            "        \"images\": [\n" +
            "          {\n" +
            "            \"path\": \"http://i.annihil.us/u/prod/marvel/i/mg/1/70/582f91995c049\",\n" +
            "            \"extension\": \"jpg\"\n" +
            "          }\n" +
            "        ],\n" +
            "        \"creators\": {\n" +
            "          \"available\": 10,\n" +
            "          \"collectionURI\": \"http://gateway.marvel.com/v1/public/comics/56802/creators\",\n" +
            "          \"items\": [\n" +
            "            {\n" +
            "              \"resourceURI\": \"http://gateway.marvel.com/v1/public/creators/1827\",\n" +
            "              \"name\": \"John Byrne\",\n" +
            "              \"role\": \"penciller\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"resourceURI\": \"http://gateway.marvel.com/v1/public/creators/3798\",\n" +
            "              \"name\": \"John Stokes\",\n" +
            "              \"role\": \"penciller\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"resourceURI\": \"http://gateway.marvel.com/v1/public/creators/199\",\n" +
            "              \"name\": \"Herb Trimpe\",\n" +
            "              \"role\": \"penciller\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"resourceURI\": \"http://gateway.marvel.com/v1/public/creators/44\",\n" +
            "              \"name\": \"Chris Claremont\",\n" +
            "              \"role\": \"writer\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"resourceURI\": \"http://gateway.marvel.com/v1/public/creators/8669\",\n" +
            "              \"name\": \"Jamie Delano\",\n" +
            "              \"role\": \"writer\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"resourceURI\": \"http://gateway.marvel.com/v1/public/creators/15\",\n" +
            "              \"name\": \"Alan Moore\",\n" +
            "              \"role\": \"writer\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"resourceURI\": \"http://gateway.marvel.com/v1/public/creators/4844\",\n" +
            "              \"name\": \"Steve Parkhouse\",\n" +
            "              \"role\": \"writer\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"resourceURI\": \"http://gateway.marvel.com/v1/public/creators/8363\",\n" +
            "              \"name\": \"David Thorpe\",\n" +
            "              \"role\": \"writer\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"resourceURI\": \"http://gateway.marvel.com/v1/public/creators/16\",\n" +
            "              \"name\": \"Alan Davis\",\n" +
            "              \"role\": \"penciller (cover)\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"resourceURI\": \"http://gateway.marvel.com/v1/public/creators/4430\",\n" +
            "              \"name\": \"Jeff Youngquist\",\n" +
            "              \"role\": \"editor\"\n" +
            "            }\n" +
            "          ],\n" +
            "          \"returned\": 10\n" +
            "        },\n" +
            "        \"characters\": {\n" +
            "          \"available\": 0,\n" +
            "          \"collectionURI\": \"http://gateway.marvel.com/v1/public/comics/56802/characters\",\n" +
            "          \"items\": [],\n" +
            "          \"returned\": 0\n" +
            "        },\n" +
            "        \"stories\": {\n" +
            "          \"available\": 2,\n" +
            "          \"collectionURI\": \"http://gateway.marvel.com/v1/public/comics/56802/stories\",\n" +
            "          \"items\": [\n" +
            "            {\n" +
            "              \"resourceURI\": \"http://gateway.marvel.com/v1/public/stories/124421\",\n" +
            "              \"name\": \"cover from Captain Britain (2016)\",\n" +
            "              \"type\": \"cover\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"resourceURI\": \"http://gateway.marvel.com/v1/public/stories/124422\",\n" +
            "              \"name\": \"story from Captain Britain (2016)\",\n" +
            "              \"type\": \"interiorStory\"\n" +
            "            }\n" +
            "          ],\n" +
            "          \"returned\": 2\n" +
            "        },\n" +
            "        \"events\": {\n" +
            "          \"available\": 0,\n" +
            "          \"collectionURI\": \"http://gateway.marvel.com/v1/public/comics/56802/events\",\n" +
            "          \"items\": [],\n" +
            "          \"returned\": 0\n" +
            "        }\n" +
            "      },\n" +
            "      {\n" +
            "        \"id\": 21474,\n" +
            "        \"digitalId\": 0,\n" +
            "        \"title\": \"Ultimate X-Men (Spanish Language Edition) (2000)\",\n" +
            "        \"issueNumber\": 0,\n" +
            "        \"variantDescription\": \"\",\n" +
            "        \"description\": null,\n" +
            "        \"modified\": \"-0001-11-30T00:00:00-0500\",\n" +
            "        \"isbn\": \"\",\n" +
            "        \"upc\": \"\",\n" +
            "        \"diamondCode\": \"\",\n" +
            "        \"ean\": \"\",\n" +
            "        \"issn\": \"\",\n" +
            "        \"format\": \"Comic\",\n" +
            "        \"pageCount\": 0,\n" +
            "        \"textObjects\": [],\n" +
            "        \"resourceURI\": \"http://gateway.marvel.com/v1/public/comics/21474\",\n" +
            "        \"urls\": [\n" +
            "          {\n" +
            "            \"type\": \"detail\",\n" +
            "            \"url\": \"http://marvel.com/comics/issue/21474/ultimate_x-men_spanish_language_edition_2000?utm_campaign=apiRef&utm_source=e5de1b003e4d44302fe74b8d91d4e07b\"\n" +
            "          }\n" +
            "        ],\n" +
            "        \"series\": {\n" +
            "          \"resourceURI\": \"http://gateway.marvel.com/v1/public/series/5106\",\n" +
            "          \"name\": \"Ultimate X-Men (Spanish Language Edition) (2000 - 2009)\"\n" +
            "        },\n" +
            "        \"variants\": [],\n" +
            "        \"collections\": [],\n" +
            "        \"collectedIssues\": [],\n" +
            "        \"dates\": [\n" +
            "          {\n" +
            "            \"type\": \"onsaleDate\",\n" +
            "            \"date\": \"2029-12-31T00:00:00-0500\"\n" +
            "          },\n" +
            "          {\n" +
            "            \"type\": \"focDate\",\n" +
            "            \"date\": \"-0001-11-30T00:00:00-0500\"\n" +
            "          }\n" +
            "        ],\n" +
            "        \"prices\": [\n" +
            "          {\n" +
            "            \"type\": \"printPrice\",\n" +
            "            \"price\": 0\n" +
            "          }\n" +
            "        ],\n" +
            "        \"thumbnail\": {\n" +
            "          \"path\": \"http://i.annihil.us/u/prod/marvel/i/mg/b/40/image_not_available\",\n" +
            "          \"extension\": \"jpg\"\n" +
            "        },\n" +
            "        \"images\": [],\n" +
            "        \"creators\": {\n" +
            "          \"available\": 0,\n" +
            "          \"collectionURI\": \"http://gateway.marvel.com/v1/public/comics/21474/creators\",\n" +
            "          \"items\": [],\n" +
            "          \"returned\": 0\n" +
            "        },\n" +
            "        \"characters\": {\n" +
            "          \"available\": 1,\n" +
            "          \"collectionURI\": \"http://gateway.marvel.com/v1/public/comics/21474/characters\",\n" +
            "          \"items\": [\n" +
            "            {\n" +
            "              \"resourceURI\": \"http://gateway.marvel.com/v1/public/characters/1011109\",\n" +
            "              \"name\": \"X-Men (Ultimate)\"\n" +
            "            }\n" +
            "          ],\n" +
            "          \"returned\": 1\n" +
            "        },\n" +
            "        \"stories\": {\n" +
            "          \"available\": 2,\n" +
            "          \"collectionURI\": \"http://gateway.marvel.com/v1/public/comics/21474/stories\",\n" +
            "          \"items\": [\n" +
            "            {\n" +
            "              \"resourceURI\": \"http://gateway.marvel.com/v1/public/stories/48982\",\n" +
            "              \"name\": \"Cover #48982\",\n" +
            "              \"type\": \"cover\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"resourceURI\": \"http://gateway.marvel.com/v1/public/stories/48983\",\n" +
            "              \"name\": \"Interior #48983\",\n" +
            "              \"type\": \"interiorStory\"\n" +
            "            }\n" +
            "          ],\n" +
            "          \"returned\": 2\n" +
            "        },\n" +
            "        \"events\": {\n" +
            "          \"available\": 0,\n" +
            "          \"collectionURI\": \"http://gateway.marvel.com/v1/public/comics/21474/events\",\n" +
            "          \"items\": [],\n" +
            "          \"returned\": 0\n" +
            "        }\n" +
            "      },\n" +
            "      {\n" +
            "        \"id\": 21462,\n" +
            "        \"digitalId\": 0,\n" +
            "        \"title\": \"Ultimate Spider-Man (Spanish Language Edition) (2000)\",\n" +
            "        \"issueNumber\": 0,\n" +
            "        \"variantDescription\": \"\",\n" +
            "        \"description\": null,\n" +
            "        \"modified\": \"-0001-11-30T00:00:00-0500\",\n" +
            "        \"isbn\": \"\",\n" +
            "        \"upc\": \"\",\n" +
            "        \"diamondCode\": \"\",\n" +
            "        \"ean\": \"\",\n" +
            "        \"issn\": \"\",\n" +
            "        \"format\": \"Comic\",\n" +
            "        \"pageCount\": 0,\n" +
            "        \"textObjects\": [],\n" +
            "        \"resourceURI\": \"http://gateway.marvel.com/v1/public/comics/21462\",\n" +
            "        \"urls\": [\n" +
            "          {\n" +
            "            \"type\": \"detail\",\n" +
            "            \"url\": \"http://marvel.com/comics/issue/21462/ultimate_spider-man_spanish_language_edition_2000?utm_campaign=apiRef&utm_source=e5de1b003e4d44302fe74b8d91d4e07b\"\n" +
            "          }\n" +
            "        ],\n" +
            "        \"series\": {\n" +
            "          \"resourceURI\": \"http://gateway.marvel.com/v1/public/series/5105\",\n" +
            "          \"name\": \"Ultimate Spider-Man (Spanish Language Edition) (2000 - 2001)\"\n" +
            "        },\n" +
            "        \"variants\": [],\n" +
            "        \"collections\": [],\n" +
            "        \"collectedIssues\": [],\n" +
            "        \"dates\": [\n" +
            "          {\n" +
            "            \"type\": \"onsaleDate\",\n" +
            "            \"date\": \"2029-12-31T00:00:00-0500\"\n" +
            "          },\n" +
            "          {\n" +
            "            \"type\": \"focDate\",\n" +
            "            \"date\": \"-0001-11-30T00:00:00-0500\"\n" +
            "          }\n" +
            "        ],\n" +
            "        \"prices\": [\n" +
            "          {\n" +
            "            \"type\": \"printPrice\",\n" +
            "            \"price\": 0\n" +
            "          }\n" +
            "        ],\n" +
            "        \"thumbnail\": {\n" +
            "          \"path\": \"http://i.annihil.us/u/prod/marvel/i/mg/b/40/image_not_available\",\n" +
            "          \"extension\": \"jpg\"\n" +
            "        },\n" +
            "        \"images\": [],\n" +
            "        \"creators\": {\n" +
            "          \"available\": 0,\n" +
            "          \"collectionURI\": \"http://gateway.marvel.com/v1/public/comics/21462/creators\",\n" +
            "          \"items\": [],\n" +
            "          \"returned\": 0\n" +
            "        },\n" +
            "        \"characters\": {\n" +
            "          \"available\": 1,\n" +
            "          \"collectionURI\": \"http://gateway.marvel.com/v1/public/comics/21462/characters\",\n" +
            "          \"items\": [\n" +
            "            {\n" +
            "              \"resourceURI\": \"http://gateway.marvel.com/v1/public/characters/1011010\",\n" +
            "              \"name\": \"Spider-Man (Ultimate)\"\n" +
            "            }\n" +
            "          ],\n" +
            "          \"returned\": 1\n" +
            "        },\n" +
            "        \"stories\": {\n" +
            "          \"available\": 2,\n" +
            "          \"collectionURI\": \"http://gateway.marvel.com/v1/public/comics/21462/stories\",\n" +
            "          \"items\": [\n" +
            "            {\n" +
            "              \"resourceURI\": \"http://gateway.marvel.com/v1/public/stories/48956\",\n" +
            "              \"name\": \"Cover #48956\",\n" +
            "              \"type\": \"cover\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"resourceURI\": \"http://gateway.marvel.com/v1/public/stories/48957\",\n" +
            "              \"name\": \"Interior #48957\",\n" +
            "              \"type\": \"interiorStory\"\n" +
            "            }\n" +
            "          ],\n" +
            "          \"returned\": 2\n" +
            "        },\n" +
            "        \"events\": {\n" +
            "          \"available\": 0,\n" +
            "          \"collectionURI\": \"http://gateway.marvel.com/v1/public/comics/21462/events\",\n" +
            "          \"items\": [],\n" +
            "          \"returned\": 0\n" +
            "        }\n" +
            "      },\n" +
            "      {\n" +
            "        \"id\": 59181,\n" +
            "        \"digitalId\": 0,\n" +
            "        \"title\": \"Civil War II (2016) #6 (Gi Connecting Variant H)\",\n" +
            "        \"issueNumber\": 6,\n" +
            "        \"variantDescription\": \"Gi Connecting Variant H\",\n" +
            "        \"description\": null,\n" +
            "        \"modified\": \"2016-08-30T11:04:03-0400\",\n" +
            "        \"isbn\": \"\",\n" +
            "        \"upc\": \"75960608471500641\",\n" +
            "        \"diamondCode\": \"\",\n" +
            "        \"ean\": \"\",\n" +
            "        \"issn\": \"\",\n" +
            "        \"format\": \"Comic\",\n" +
            "        \"pageCount\": 40,\n" +
            "        \"textObjects\": [],\n" +
            "        \"resourceURI\": \"http://gateway.marvel.com/v1/public/comics/59181\",\n" +
            "        \"urls\": [\n" +
            "          {\n" +
            "            \"type\": \"detail\",\n" +
            "            \"url\": \"http://marvel.com/comics/issue/59181/civil_war_ii_2016_6_gi_connecting_variant_h/gi_connecting_variant_h?utm_campaign=apiRef&utm_source=e5de1b003e4d44302fe74b8d91d4e07b\"\n" +
            "          }\n" +
            "        ],\n" +
            "        \"series\": {\n" +
            "          \"resourceURI\": \"http://gateway.marvel.com/v1/public/series/21417\",\n" +
            "          \"name\": \"Civil War II (2016 - Present)\"\n" +
            "        },\n" +
            "        \"variants\": [\n" +
            "          {\n" +
            "            \"resourceURI\": \"http://gateway.marvel.com/v1/public/comics/59754\",\n" +
            "            \"name\": \"Civil War II (2016) #6 (Sprouse Battle Variant)\"\n" +
            "          },\n" +
            "          {\n" +
            "            \"resourceURI\": \"http://gateway.marvel.com/v1/public/comics/58683\",\n" +
            "            \"name\": \"Civil War II (2016) #6\"\n" +
            "          },\n" +
            "          {\n" +
            "            \"resourceURI\": \"http://gateway.marvel.com/v1/public/comics/58879\",\n" +
            "            \"name\": \"Civil War II (2016) #6 (Michael Cho Variant)\"\n" +
            "          },\n" +
            "          {\n" +
            "            \"resourceURI\": \"http://gateway.marvel.com/v1/public/comics/59180\",\n" +
            "            \"name\": \"Civil War II (2016) #6 (Gi B&W Virgin Connecting Variant G)\"\n" +
            "          },\n" +
            "          {\n" +
            "            \"resourceURI\": \"http://gateway.marvel.com/v1/public/comics/59454\",\n" +
            "            \"name\": \"Civil War II (2016) #6 (Noto Black Panther Variant)\"\n" +
            "          }\n" +
            "        ],\n" +
            "        \"collections\": [],\n" +
            "        \"collectedIssues\": [],\n" +
            "        \"dates\": [\n" +
            "          {\n" +
            "            \"type\": \"onsaleDate\",\n" +
            "            \"date\": \"2029-12-31T00:00:00-0500\"\n" +
            "          },\n" +
            "          {\n" +
            "            \"type\": \"focDate\",\n" +
            "            \"date\": \"2016-08-24T00:00:00-0400\"\n" +
            "          }\n" +
            "        ],\n" +
            "        \"prices\": [\n" +
            "          {\n" +
            "            \"type\": \"printPrice\",\n" +
            "            \"price\": 4.99\n" +
            "          }\n" +
            "        ],\n" +
            "        \"thumbnail\": {\n" +
            "          \"path\": \"http://i.annihil.us/u/prod/marvel/i/mg/b/40/image_not_available\",\n" +
            "          \"extension\": \"jpg\"\n" +
            "        },\n" +
            "        \"images\": [],\n" +
            "        \"creators\": {\n" +
            "          \"available\": 2,\n" +
            "          \"collectionURI\": \"http://gateway.marvel.com/v1/public/comics/59181/creators\",\n" +
            "          \"items\": [\n" +
            "            {\n" +
            "              \"resourceURI\": \"http://gateway.marvel.com/v1/public/creators/2133\",\n" +
            "              \"name\": \"Tom Brevoort\",\n" +
            "              \"role\": \"editor\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"resourceURI\": \"http://gateway.marvel.com/v1/public/creators/12853\",\n" +
            "              \"name\": \"Jung Gi Kim\",\n" +
            "              \"role\": \"penciller (cover)\"\n" +
            "            }\n" +
            "          ],\n" +
            "          \"returned\": 2\n" +
            "        },\n" +
            "        \"characters\": {\n" +
            "          \"available\": 0,\n" +
            "          \"collectionURI\": \"http://gateway.marvel.com/v1/public/comics/59181/characters\",\n" +
            "          \"items\": [],\n" +
            "          \"returned\": 0\n" +
            "        },\n" +
            "        \"stories\": {\n" +
            "          \"available\": 2,\n" +
            "          \"collectionURI\": \"http://gateway.marvel.com/v1/public/comics/59181/stories\",\n" +
            "          \"items\": [\n" +
            "            {\n" +
            "              \"resourceURI\": \"http://gateway.marvel.com/v1/public/stories/128895\",\n" +
            "              \"name\": \"cover from Cw2 (2016) #6 (GI CONNECTING VARIANT H)\",\n" +
            "              \"type\": \"cover\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"resourceURI\": \"http://gateway.marvel.com/v1/public/stories/128896\",\n" +
            "              \"name\": \"story from Cw2 (2016) #6 (GI CONNECTING VARIANT H)\",\n" +
            "              \"type\": \"interiorStory\"\n" +
            "            }\n" +
            "          ],\n" +
            "          \"returned\": 2\n" +
            "        },\n" +
            "        \"events\": {\n" +
            "          \"available\": 0,\n" +
            "          \"collectionURI\": \"http://gateway.marvel.com/v1/public/comics/59181/events\",\n" +
            "          \"items\": [],\n" +
            "          \"returned\": 0\n" +
            "        }\n" +
            "      },\n" +
            "      {\n" +
            "        \"id\": 1590,\n" +
            "        \"digitalId\": 0,\n" +
            "        \"title\": \"Official Handbook of the Marvel Universe (2004) #9 (THE WOMEN OF MARVEL)\",\n" +
            "        \"issueNumber\": 9,\n" +
            "        \"variantDescription\": \"THE WOMEN OF MARVEL\",\n" +
            "        \"description\": \"Marvel's leading ladies take center stage! This Official Handbook includes in-depth bios on more than 40 of the House's most powerful women warriors - from Araña to Vindicator! Plus: an all-new cover by superstar artist Greg Land!\",\n" +
            "        \"modified\": \"-0001-11-30T00:00:00-0500\",\n" +
            "        \"isbn\": \"\",\n" +
            "        \"upc\": \"5960605678-00111\",\n" +
            "        \"diamondCode\": \"\",\n" +
            "        \"ean\": \"\",\n" +
            "        \"issn\": \"\",\n" +
            "        \"format\": \"Comic\",\n" +
            "        \"pageCount\": 0,\n" +
            "        \"textObjects\": [\n" +
            "          {\n" +
            "            \"type\": \"issue_solicit_text\",\n" +
            "            \"language\": \"en-us\",\n" +
            "            \"text\": \"Marvel's leading ladies take center stage! This Official Handbook includes in-depth bios on more than 40 of the House's most powerful women warriors - from Araña to Vindicator! Plus: an all-new cover by superstar artist Greg Land!\"\n" +
            "          }\n" +
            "        ],\n" +
            "        \"resourceURI\": \"http://gateway.marvel.com/v1/public/comics/1590\",\n" +
            "        \"urls\": [\n" +
            "          {\n" +
            "            \"type\": \"detail\",\n" +
            "            \"url\": \"http://marvel.com/comics/issue/1590/official_handbook_of_the_marvel_universe_2004_9_the_women_of_marvel/the_women_of_marvel?utm_campaign=apiRef&utm_source=e5de1b003e4d44302fe74b8d91d4e07b\"\n" +
            "          }\n" +
            "        ],\n" +
            "        \"series\": {\n" +
            "          \"resourceURI\": \"http://gateway.marvel.com/v1/public/series/787\",\n" +
            "          \"name\": \"Official Handbook of the Marvel Universe (2004)\"\n" +
            "        },\n" +
            "        \"variants\": [],\n" +
            "        \"collections\": [],\n" +
            "        \"collectedIssues\": [],\n" +
            "        \"dates\": [\n" +
            "          {\n" +
            "            \"type\": \"onsaleDate\",\n" +
            "            \"date\": \"2029-12-31T00:00:00-0500\"\n" +
            "          },\n" +
            "          {\n" +
            "            \"type\": \"focDate\",\n" +
            "            \"date\": \"-0001-11-30T00:00:00-0500\"\n" +
            "          }\n" +
            "        ],\n" +
            "        \"prices\": [\n" +
            "          {\n" +
            "            \"type\": \"printPrice\",\n" +
            "            \"price\": 3.99\n" +
            "          }\n" +
            "        ],\n" +
            "        \"thumbnail\": {\n" +
            "          \"path\": \"http://i.annihil.us/u/prod/marvel/i/mg/9/b0/4c7d666c0e58a\",\n" +
            "          \"extension\": \"jpg\"\n" +
            "        },\n" +
            "        \"images\": [\n" +
            "          {\n" +
            "            \"path\": \"http://i.annihil.us/u/prod/marvel/i/mg/9/b0/4c7d666c0e58a\",\n" +
            "            \"extension\": \"jpg\"\n" +
            "          }\n" +
            "        ],\n" +
            "        \"creators\": {\n" +
            "          \"available\": 12,\n" +
            "          \"collectionURI\": \"http://gateway.marvel.com/v1/public/comics/1590/creators\",\n" +
            "          \"items\": [\n" +
            "            {\n" +
            "              \"resourceURI\": \"http://gateway.marvel.com/v1/public/creators/887\",\n" +
            "              \"name\": \"Ronald Byrd\",\n" +
            "              \"role\": \"writer\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"resourceURI\": \"http://gateway.marvel.com/v1/public/creators/902\",\n" +
            "              \"name\": \"Jeff Christiansen\",\n" +
            "              \"role\": \"writer\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"resourceURI\": \"http://gateway.marvel.com/v1/public/creators/919\",\n" +
            "              \"name\": \"Jonathan Coupersmartt\",\n" +
            "              \"role\": \"writer\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"resourceURI\": \"http://gateway.marvel.com/v1/public/creators/903\",\n" +
            "              \"name\": \"Anthony Flamini\",\n" +
            "              \"role\": \"writer\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"resourceURI\": \"http://gateway.marvel.com/v1/public/creators/888\",\n" +
            "              \"name\": \"Michael Hoskin\",\n" +
            "              \"role\": \"writer\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"resourceURI\": \"http://gateway.marvel.com/v1/public/creators/898\",\n" +
            "              \"name\": \"Bill Lentz\",\n" +
            "              \"role\": \"writer\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"resourceURI\": \"http://gateway.marvel.com/v1/public/creators/897\",\n" +
            "              \"name\": \"Sean McQuaid\",\n" +
            "              \"role\": \"writer\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"resourceURI\": \"http://gateway.marvel.com/v1/public/creators/394\",\n" +
            "              \"name\": \"Eric J. Moreels\",\n" +
            "              \"role\": \"writer\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"resourceURI\": \"http://gateway.marvel.com/v1/public/creators/899\",\n" +
            "              \"name\": \"Mark OEnglish\",\n" +
            "              \"role\": \"writer\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"resourceURI\": \"http://gateway.marvel.com/v1/public/creators/896\",\n" +
            "              \"name\": \"Stuart Vandal\",\n" +
            "              \"role\": \"writer\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"resourceURI\": \"http://gateway.marvel.com/v1/public/creators/425\",\n" +
            "              \"name\": \"Greg Land\",\n" +
            "              \"role\": \"penciller (cover)\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"resourceURI\": \"http://gateway.marvel.com/v1/public/creators/500\",\n" +
            "              \"name\": \"Chris Sotomayor\",\n" +
            "              \"role\": \"colorist\"\n" +
            "            }\n" +
            "          ],\n" +
            "          \"returned\": 12\n" +
            "        },\n" +
            "        \"characters\": {\n" +
            "          \"available\": 14,\n" +
            "          \"collectionURI\": \"http://gateway.marvel.com/v1/public/comics/1590/characters\",\n" +
            "          \"items\": [\n" +
            "            {\n" +
            "              \"resourceURI\": \"http://gateway.marvel.com/v1/public/characters/1009156\",\n" +
            "              \"name\": \"Apocalypse\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"resourceURI\": \"http://gateway.marvel.com/v1/public/characters/1009197\",\n" +
            "              \"name\": \"Blink\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"resourceURI\": \"http://gateway.marvel.com/v1/public/characters/1009243\",\n" +
            "              \"name\": \"Colossus\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"resourceURI\": \"http://gateway.marvel.com/v1/public/characters/1009313\",\n" +
            "              \"name\": \"Gambit\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"resourceURI\": \"http://gateway.marvel.com/v1/public/characters/1009349\",\n" +
            "              \"name\": \"Holocaust (Age of Apocalypse)\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"resourceURI\": \"http://gateway.marvel.com/v1/public/characters/1009417\",\n" +
            "              \"name\": \"Magneto\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"resourceURI\": \"http://gateway.marvel.com/v1/public/characters/1009447\",\n" +
            "              \"name\": \"Mister Sinister\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"resourceURI\": \"http://gateway.marvel.com/v1/public/characters/1009546\",\n" +
            "              \"name\": \"Rogue\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"resourceURI\": \"http://gateway.marvel.com/v1/public/characters/1010969\",\n" +
            "              \"name\": \"Sabretooth (Age of Apocalypse)\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"resourceURI\": \"http://gateway.marvel.com/v1/public/characters/1010975\",\n" +
            "              \"name\": \"Shadowcat (Age of Apocalypse)\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"resourceURI\": \"http://gateway.marvel.com/v1/public/characters/1010976\",\n" +
            "              \"name\": \"Silver Samurai (Age of Apocalypse)\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"resourceURI\": \"http://gateway.marvel.com/v1/public/characters/1010979\",\n" +
            "              \"name\": \"Storm (Age of Apocalypse)\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"resourceURI\": \"http://gateway.marvel.com/v1/public/characters/1009636\",\n" +
            "              \"name\": \"Sunfire\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"resourceURI\": \"http://gateway.marvel.com/v1/public/characters/1009718\",\n" +
            "              \"name\": \"Wolverine\"\n" +
            "            }\n" +
            "          ],\n" +
            "          \"returned\": 14\n" +
            "        },\n" +
            "        \"stories\": {\n" +
            "          \"available\": 2,\n" +
            "          \"collectionURI\": \"http://gateway.marvel.com/v1/public/comics/1590/stories\",\n" +
            "          \"items\": [\n" +
            "            {\n" +
            "              \"resourceURI\": \"http://gateway.marvel.com/v1/public/stories/4513\",\n" +
            "              \"name\": \"Cover #4513\",\n" +
            "              \"type\": \"cover\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"resourceURI\": \"http://gateway.marvel.com/v1/public/stories/4514\",\n" +
            "              \"name\": \"Interior #4514\",\n" +
            "              \"type\": \"interiorStory\"\n" +
            "            }\n" +
            "          ],\n" +
            "          \"returned\": 2\n" +
            "        },\n" +
            "        \"events\": {\n" +
            "          \"available\": 0,\n" +
            "          \"collectionURI\": \"http://gateway.marvel.com/v1/public/comics/1590/events\",\n" +
            "          \"items\": [],\n" +
            "          \"returned\": 0\n" +
            "        }\n" +
            "      }\n" +
            "    ]\n" +
            "  }\n" +
            "}";

}
