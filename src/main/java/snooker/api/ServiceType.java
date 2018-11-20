package snooker.api;

import snooker.api.util.UrlResolver;

import java.util.HashMap;
import java.util.Map;

public enum ServiceType {
    Info(new HashMap<>()),

    Event(new HashMap<String, String>() {{
        put("e", "{eventId}");
    }}),

    Match(new HashMap<String, String>() {{
        put("e", "{eventId}");
        put("r", "{roundId}");
        put("n", "{matchNumber}");
    }}),

    Player(new HashMap<String, String>() {{
        put("p", "{playerId}");
    }}),

    EventsInSeason(new HashMap<String, String>() {{
        put("t", "5");
        put("s", "{seasonYear}");
    }}),

    MatchesOfEvent(new HashMap<String, String>() {{
        put("t", "6");
        put("e", "{eventId}");
    }}),

    OngoingMatches(new HashMap<String, String>() {{
        put("t", "7");
    }}),

    MatchesForPlayerInSeason(new HashMap<String, String>() {{
        put("t", "8");
        put("p", "{playerId}");
        put("s", "{seasonYear}");
    }}),

    PlayersInEvent(new HashMap<String, String>() {{
        put("t", "9");
        put("e", "{eventId}");
    }}),

    Players(new HashMap<String, String>() {{
        put("t", "10");
        put("st", "{playerStatus}");
        put("s", "{seasonYear}");
    }}),

    Rankings(new HashMap<String, String>() {{
        put("rt", "{rankingType}");
        put("s", "{seasonYear}");
    }}),

    RoundInfoForEvent(new HashMap<String, String>() {{
        put("t", "12");
        put("e", "{eventId}");
    }}),
    ;

    ServiceType(Map<String, String> params) {
        this.params = params;
    }

    private Map<String, String> params;

    public String getParamsString() {
        return UrlResolver.toQueryString(params);
    }
}
