package snooker.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

/**
 * Represents the Player
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Player {

    private int ID;
    private String firstName;
    private String middleName;
    private String lastName;
    private String sex;
    private String photo;
    private String firstSeasonAsPro;

//            "ID": 5,
//            "Type": 1,
//            "FirstName": "Ronnie",
//            "MiddleName": "",
//            "LastName": "O'Sullivan",
//            "TeamName": "",
//            "TeamNumber": 0,
//            "TeamSeason": 0,
//            "ShortName": "R O'Sullivan",
//            "Nationality": "England",
//            "Sex": "M",
//            "BioPage": "http:\u002F\u002Fsnooker.org\u002Fplr\u002Fbio\u002Frosullivan.shtml",
//            "Born": "1975-12-05",
//            "Twitter": "ronnieo147",
//            "SurnameFirst": false,
//            "License": "",
//            "Club": "",
//            "URL": "",
//            "Photo": "http:\u002F\u002Fsnooker.org\u002Fimg\u002Fplayers\u002Frosullivan.jpg",
//            "PhotoSource": "",
//            "FirstSeasonAsPro": 1992,
//            "LastSeasonAsPro": 0,
//            "Info": ""
}
