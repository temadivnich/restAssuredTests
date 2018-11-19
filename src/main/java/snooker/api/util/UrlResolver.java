package snooker.api.util;

import snooker.api.ServiceType;

import java.util.HashMap;
import java.util.Map;

public class UrlResolver {

    public static String resolve(ServiceType serviceType) {
        Map<String, String> params = new HashMap<>();
        switch (serviceType) {
            case Info:
            case Event:
            case Match:
            case Player:
            case Players:
            case Rankings:
            case EventsInSeason:
            case MatchesOfEvent:
            case OngoingMatches: {
                params.put("t", "7");
            }
            case PlayersInEvent:
            case RoundInfoForEvent:
            case MatchesForPlayerInSeason:
            default:
        }
        return params.toString().replace("{", "").replace("}", "");
    }
}
