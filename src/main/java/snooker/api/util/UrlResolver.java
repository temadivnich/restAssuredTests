package snooker.api.util;

import java.util.Map;

import static java.util.stream.Collectors.joining;

public class UrlResolver {

    public static String toQueryString(Map<String, String> params) {
        return params.entrySet().stream().map(Map.Entry::toString).collect(joining("&", "?", ""));
    }

    /*public static Map<String, String> resolve(ServiceType serviceType) {
        Map<String, String> params = new HashMap<>();
        switch (serviceType) {
            case Info:
                break;
            case Event:
                params.put("e", "{eventId}");
                break;
            case Match:  // URL format: api.snooker.org/?e=[Event ID]&r=[Round ID]&n=[Match number]
                params.put("e", "{eventId}");
                params.put("r", "{roundId}");
                params.put("n", "{matchNumber}");
                break;
            case Player:   //URL format: api.snooker.org/?p=[Player ID]
                params.put("p", "{playerId}");
                break;
            case EventsInSeason:  //URL format: api.snooker.org/?t=5&s=[Season]
                params.put("t", "5");
                params.put("s", "{seasonYear}");
                break;
            case MatchesOfEvent: //URL format: api.snooker.org/?t=6&e=[Event ID]
                params.put("t", "6");
                params.put("e", "{eventId}");
                break;
            case OngoingMatches:  //api.snooker.org/?t=7
                params.put("t", "7");
                break;
            case MatchesForPlayerInSeason:  //URL format: api.snooker.org/?t=8&p=[Player ID]&s=[Season]
                params.put("t", "8");
                params.put("p", "{playerId}");
                params.put("s", "{seasonYear}");
                break;
            case PlayersInEvent:  //URL format: api.snooker.org/?t=9&e=[Event ID]
                params.put("t", "9");
                params.put("e", "{eventId}");
                break;
            case Players:   //URL format: api.snooker.org/?t=10&st=[p|a]&s=[Season]
                params.put("t", "10");
                params.put("st", "{playerStatus}");
                params.put("s", "{seasonYear}");
                break;
            case Rankings: //URL format: api.snooker.org/?rt=[Ranking type]&s=[Season]
                params.put("rt", "{rankingType}");
                params.put("s", "{seasonYear}");
                break;
            case RoundInfoForEvent:  //URL format: api.snooker.org/?t=12&e=[Event ID]
                params.put("t", "12");
                params.put("e", "{eventId}");
                break;
            default:
                throw new RuntimeException("No such service: " + serviceType);
        }
        return params;
    }
*/
}
