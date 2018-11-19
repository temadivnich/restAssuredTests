package snooker.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

/**
 * Represents a single Match, played between two Players, in one Round, during Event
 *
 * @see Player
 * @see Event
 * <p>
 * "ID": 2240166,
 * "EventID": 397,
 * "Round": 1,
 * "Number": 5,
 * "Player1ID": 1730,
 * "Score1": 1,
 * "Walkover1": false,
 * "Player2ID": 1590,
 * "Score2": 4,
 * "Walkover2": false,
 * "WinnerID": 1590,
 * "Unfinished": false,
 * "OnBreak": false,
 * "WorldSnookerID": 386706,
 * "LiveUrl": "",
 * "DetailsUrl": "",
 * "PointsDropped": false,
 * "ShowCommonNote": false,
 * "Estimated": false,
 * "Type": 1,
 * "TableNo": 0,
 * "VideoURL": "",
 * "InitDate": "2015-07-08T13:36:14Z",
 * "ModDate": "2015-07-29T14:14:35Z",
 * "StartDate": "2015-07-29T14:14:35Z",
 * "EndDate": "2015-07-29T17:25:14Z",
 * "ScheduledDate": "2015-07-29T14:00:00Z",
 * "FrameScores": "",
 * "Sessions": "",
 * "Note": "",
 * "ExtendedNote": ""
 */

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Match {

    private final String ID;
    private final String EventID;
    private final String Round;
    private final String Number;
    private final String Player1ID;
    private final String Score1;
    private final String Player2ID;
    private final String Score2;
    private final String WinnerID;
    private final String Unfinished;
    private final String WorldSnookerID;
    private final String LiveUrl;
    private final String DetailsUrl;
    private final String StartDate;
    private final String EndDate;
    private final String ScheduledDate;
    private final String FrameScores;
}
