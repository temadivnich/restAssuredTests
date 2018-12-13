package snooker.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.net.URI;
import java.time.LocalDate;
import java.util.Optional;

/**
 * Represent Event, e.g. Northern Ireland Open
 *
 *      <p>
 *      "ID": 712,
 *      "Name": "Northern Ireland Open",
 *      "StartDate": "2018-11-12",
 *      "EndDate": "2018-11-18",
 *      "Sponsor": "BetVictor",
 *      "Season": 2018,
 *      "Type": "Ranking",
 *      "Num": 0,
 *      "Venue": "Waterfront Hall",
 *      "City": "Belfast",
 *      "Country": "Northern Ireland",
 *      "Discipline": "snooker",
 *      "Main": 712,
 *      "Sex": "Both",
 *      "AgeGroup": "O",
 *      "Url": "",
 *      "Related": "Home Nations Series",
 *      "Stage": "F",
 *      "ValueType": "NIO",
 *      "ShortName": "",
 *      "WorldSnookerId": 14037,
 *      "RankingType": "WR",
 *      "EventPredictionID": 2809,
 *      "Team": false,
 *      "Format": 1,
 *      "Twitter": "",
 *      "HashTag": "NorthernIrelandOpen",
 *      "ConversionRate": 1,
 *      "AllRoundsAdded": true,
 *      "PhotoURLs": "",
 *      "NumCompetitors": 128,
 *      "NumUpcoming": 1,
 *      "NumActive": 1,
 *      "NumResults": 125,
 *      "Note": "",
 *      "CommonNote": "<a href=\"http://www.eurosportplayer.com/\">Eurosport</a> ,
 *      <a href=\"http://questtv.co.uk/\">Quest</a> and
 *      <a href=\"http://www.worldsnooker.com/tournaments-broadcasters-2018-19/\">more</a>",
 *      "DefendingChampion": 1,
 *      "PreviousEdition": 628
 */

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Event {

    private final Integer ID;
    private final String Name;
    private final String StartDate;
    private final String EndDate;
    private final String Sponsor;
    private final Integer Season;
    private final String City;
    private final String Country;
    private final Integer WorldSnookerId;
    private final URI PhotoURLs;
    private final Integer NumCompetitors;
    private final Integer NumUpcoming;
    private final Integer NumActive;
    private final Integer NumResults;
    private final String Note;
    private final Integer DefendingChampion;

    public Optional<LocalDate> getStartDate() {
        return parse(StartDate);
    }

    public Optional<LocalDate> getEndDate() {
        return parse(EndDate);
    }

    private Optional<LocalDate> parse(String date) {
        Optional<LocalDate> opt;
        try {
            opt = Optional.of(LocalDate.parse(date));
        } catch (RuntimeException e) {
            return Optional.empty();
        }
        return opt;
    }
}
