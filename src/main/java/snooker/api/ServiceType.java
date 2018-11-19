package snooker.api;

import snooker.api.util.UrlResolver;

import java.util.Map;

public enum ServiceType {

    Info("API home page"),
    Event {
        @Override
        protected Map<String, String> getParams() {
            return Map.of("e", "{eventId}");
        }
    },
    Match {
        @Override
        protected Map<String, String> getParams() {
            return Map.of("e", "{eventId}", "r", "{roundId}", "n", "{matchNumber}");
        }
    },
    Player {
        @Override
        protected Map<String, String> getParams() {
            return Map.of("p", "{playerId}");
        }
    },
    EventsInSeason {
        @Override
        protected Map<String, String> getParams() {
            return Map.of("t", "5", "s", "{seasonYear}");
        }
    },
    MatchesOfEvent {
        @Override
        protected Map<String, String> getParams() {
            return Map.of("t", "6", "e", "{eventId}");
        }
    },
    OngoingMatches("including those between sessions") {
        @Override
        protected Map<String, String> getParams() {
            return Map.of("t", "7");
        }
    },
    MatchesForPlayerInSeason {
        @Override
        protected Map<String, String> getParams() {
            return Map.of("t", "8", "p", "{playerId}", "s", "{seasonYear}");
        }
    },
    PlayersInEvent {
        @Override
        protected Map<String, String> getParams() {
            return Map.of("t", "9", "e", "{eventId}");
        }
    },
    Players {
        @Override
        protected Map<String, String> getParams() {
            return Map.of("t", "10", "st", "{playerStatus}", "s", "{seasonYear}");
        }
    },
    Rankings {
        @Override
        protected Map<String, String> getParams() {
            return Map.of("rt", "{rankingType}", "s", "{seasonYear}");
        }
    },
    RoundInfoForEvent {
        @Override
        protected Map<String, String> getParams() {
            return Map.of("t", "12", "e", "{eventId}");
        }
    },
    ;

    private final String description;

    ServiceType(String description) {
        this.description = description;
    }

    ServiceType() {
        this.description = "";
    }

    protected Map<String, String> getParams() {
        return Map.of();
    }

    public String getParamsString() {
        return UrlResolver.toQueryString(getParams());
    }
}
