package snooker.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

/**
 * Represent single Round, in scope of Match between two Players
 *
 * @see Match
 * @see Player
 * <p>
 * "Round": 1,
 * "RoundName": "Qual Round 1",
 * "EventID": 398,
 * "MainEvent": 403,
 * "Distance": 5,
 * "NumLeft": 128,
 * "NumMatches": 32,
 * "Note": "",
 * "ValueType": "SM",
 * "Rank": 160,
 * "Money": 0,
 * "SeedGetsHalf": 1,
 * "ActualMoney": 0,
 * "Currency": "GBP",
 * "ConversionRate": 1,
 * "Points": 0,
 * "SeedPoints": 0
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Round {

    private final Integer Round;
    private final String RoundName;
    private final Integer EventID;
    private final Integer MainEvent;
    private final Integer Distance;
    private final Integer NumLeft;
    private final Integer NumMatches;
}
