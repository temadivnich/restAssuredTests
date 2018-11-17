package snooker.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.net.URI;
import java.time.LocalDate;

/**
 * Represents the Player. e.g.
 *
 *    "ID": 5,
 *    "Type": 1,
 *    "FirstName": "Ronnie",
 *    "MiddleName": "",
 *    "LastName": "O'Sullivan",
 *    "TeamName": "",
 *    "TeamNumber": 0,
 *    "TeamSeason": 0,
 *    "ShortName": "R O'Sullivan",
 *    "Nationality": "England",
 *    "Sex": "M",
 *    "BioPage": "http:\u002F\u002Fsnooker.org\u002Fplr\u002Fbio\u002Frosullivan.shtml",
 *    "Born": "1975-12-05",
 *    "Twitter": "ronnieo147",
 *    "SurnameFirst": false,
 *    "License": "",
 *    "Club": "",
 *    "URL": "",
 *    "Photo": "http:\u002F\u002Fsnooker.org\u002Fimg\u002Fplayers\u002Frosullivan.jpg",
 *    "PhotoSource": "",
 *    "FirstSeasonAsPro": 1992,
 *    "LastSeasonAsPro": 0,
 *    "Info": ""
 */

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Player {

    private final Integer ID;
    private final String FirstName;
    private final String MiddleName;
    private final String LastName;
    private final String Nationality;
    private final String Sex;
    private final URI BioPage;
    private final String Born;
    private final URI URL;
    private final URI Photo;
    private final String FirstSeasonAsPro;

    public LocalDate getBorn() {
        return LocalDate.parse(Born);
    }
}
