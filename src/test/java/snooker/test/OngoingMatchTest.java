package snooker.test;

import org.junit.jupiter.api.RepeatedTest;

import static snooker.api.ServiceType.OngoingMatches;

public class OngoingMatchTest {

    @RepeatedTest(value = 5)
    public void getOngoingMatchInfo() throws Exception {
        OngoingMatches.getParamsString();
    }
}
