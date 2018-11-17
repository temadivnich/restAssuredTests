## snooker.org API
http://api.snooker.org/

It is free for non-commercial use as long as you mention the original source. Please [contact us](mailto:webmaster@snooker.org) if you want to use it commercially.

## Services

1.  Info (this page)
    *   URL format: `api.snooker.org`
    *   Example: `http://api.snooker.org/`
    *   Output: HTML
2.  Event
    *   URL `format: api.snooker.org/?e=[Event ID]`
    *   Example: `http://api.snooker.org/?e=398` (Shanghai Masters Qualifiers 2015)
    *   Output: Event info as JSON (one-dimensional)
3.  Match
    *   URL format: `api.snooker.org/?e=[Event ID]&r=[Round ID]&n=[Match number]`
    *   Example: `http://api.snooker.org/?e=397&r=1&n=5` (Riga Open 2015, qual round 1, Mulholland v Arpat)
    *   Output: Match info as JSON (one-dimensional)
4.  Player
    *   URL format: `api.snooker.org/?p=[Player ID]`
    *   Example: `http://api.snooker.org/?p=1` (Mark J Williams)
    *   Output: Player info as JSON (one-dimensional)
5.  Events in a season
    *   URL format: `api.snooker.org/?t=5&s=[Season]`
    *   Example: `http://api.snooker.org/?t=5&s=2015` (2015/2016)
    *   Output: Event info as JSON (two-dimensional)
    *   Note: All seasons: -1
6.  Matches of an event
    *   URL format: `api.snooker.org/?t=6&e=[Event ID]`
    *   Example: `http://api.snooker.org/?t=6&e=398` (Shanghai Masters qualifiers)
    *   Output: Match info as JSON (two-dimensional)
7.  Ongoing matches (including those between sessions)
    *   URL format: `api.snooker.org/?t=7`
    *   Example: `http://api.snooker.org/?t=7`
    *   Output: Match info as JSON (two-dimensional)
8.  Matches for a player in a season
    *   URL format: `api.snooker.org/?t=8&p=[Player ID]&s=[Season]`
    *   Example: `http://api.snooker.org/?t=8&p=1&s=2015` (Mark J Williams, 2015/2016)
    *   Output: Match info as JSON (two-dimensional)
    *   Note: All seasons: -1
9.  Players in an event
    *   URL format: `api.snooker.org/?t=9&e=[Event ID]`
    *   Example: `http://api.snooker.org/?t=9&e=403` (Shanghai Masters 2015)
    *   Output: Player info as JSON (two-dimensional)
10. Players
    *   URL format: `api.snooker.org/?t=10&st=[p|a]&s=[Season]`
    *   Example: `http://api.snooker.org/?t=10&st=p&s=2015` (Pro players in 2015)
    *   Output: Player info as JSON (two-dimensional)
    *   Note: All seasons: -1
11. Rankings
    *   URL format: `api.snooker.org/?rt=[Ranking type]&s=[Season]`
    *   Example: `http://api.snooker.org/?rt=MoneyRankings&s=2015` (Money rankings, 2015)
    *   Output: Ranking list as JSON (two-dimensional)
    *   Note: [Available ranking types](http://api.snooker.org/help.html#RankingTypes)
12. Round info for an event
    *   URL format: `api.snooker.org/?t=12&e=[Event ID]`
    *   Example: `http://api.snooker.org/?t=12&e=403` (Shanghai Masters 2015)
    *   Output: Round info as JSON (two-dimensional)
