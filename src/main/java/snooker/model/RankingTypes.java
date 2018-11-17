package snooker.model;

/**
 * Represent Ranking Types in Snooker, not all are listed
 */
public enum RankingTypes {

    MoneyRankings(2013),
    MoneySeedings(2013),
    OneYearMoneyRankings(2013),;

    private Integer startYear;

    RankingTypes(Integer startYear) {
        this.startYear = startYear;
    }

    public Integer getStartYear() {
        return startYear;
    }
}
