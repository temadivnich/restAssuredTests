package snooker.api;

import snooker.api.util.UrlResolver;

public enum ServiceType {

    Info("API page"),
    //    Example: api.snooker.org
    Event,
    //    URL format: api.snooker.org/?e=[Event ID]
//    Example: api.snooker.org/?e=398 (Shanghai Masters Qualifiers 2015)
    Match,
    //    URL format: api.snooker.org/?e=[Event ID]&r=[Round ID]&n=[Match number]
//    Example: api.snooker.org/?e=397&r=1&n=5 (Riga Open 2015, qual round 1, Mulholland v Arpat)
    Player,
    //    URL format: api.snooker.org/?p=[Player ID]
//    Example: api.snooker.org/?p=1 (Mark J Williams)
    EventsInSeason,
    //    URL format: api.snooker.org/?t=5&s=[Season]
//    Example: api.snooker.org/?t=5&s=2015 (2015/2016)
//    Note: All seasons: -1
    MatchesOfEvent,
    //    URL format: api.snooker.org/?t=6&e=[Event ID]
//    Example: api.snooker.org/?t=6&e=398 (Shanghai Masters qualifiers)
    OngoingMatches("including those between sessions"),
    //    URL format: api.snooker.org/?t=7
//    Example: api.snooker.org/?t=7
    MatchesForPlayerInSeason,
    //    URL format: api.snooker.org/?t=8&p=[Player ID]&s=[Season]
//    Example: api.snooker.org/?t=8&p=1&s=2015 (Mark J Williams, 2015/2016)
//    Note: All seasons: -1
    PlayersInEvent,
    //    URL format: api.snooker.org/?t=9&e=[Event ID]
//    Example: api.snooker.org/?t=9&e=403 (Shanghai Masters 2015)
    Players,
    //    URL format: api.snooker.org/?t=10&st=[p|a]&s=[Season]
//    Example: api.snooker.org/?t=10&st=p&s=2015 (Pro players in 2015)
//    Note: All seasons: -1
    Rankings,
    //    URL format: api.snooker.org/?rt=[Ranking type]&s=[Season]
//    Example: api.snooker.org/?rt=MoneyRankings&s=2015 (Money rankings, 2015)
//    Note: Available ranking types
    RoundInfoForEvent,;
//    URL format: api.snooker.org/?t=12&e=[Event ID]
//    Example: api.snooker.org/?t=12&e=403 (Shanghai Masters 2015)

    private final String description;

    ServiceType(String description) {
        this.description = description;
    }

    ServiceType() {
        this.description = "";
    }

    public String getParamsString() throws Exception {
        return UrlResolver.resolve(this);
    }
}
