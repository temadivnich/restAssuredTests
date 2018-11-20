package snooker.test;

import io.restassured.response.Response;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import snooker.model.Event;
import snooker.model.Player;

import java.util.List;

import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.given;
import static snooker.api.ServiceType.PlayersInEvent;

@Log4j2
public class EventTest {

    //    @RepeatedTest(value = 1)
    @ParameterizedTest
    @MethodSource("eventInfoProvider")
    void whenGetEventInfo_thenOk(Event event) {
        String paramsString = PlayersInEvent.getParamsString().replace("{eventId}", event.getID() + "");

        Response response = given().baseUri("http://api.snooker.org")
                .log().ifValidationFails()
                .get(paramsString);

        response.then().assertThat().statusCode(200)
                .header("Content-Type", "application/json");
//                .body(".", Matchers.hasItem(1));

        List<Player> players = response.body().jsonPath().getList(".", Player.class);
        log.info(players.size() + "\t players participated in event: " + event.getName());
    }

    private static List<Event> eventInfoProvider() {
        String url = "http://api.snooker.org/?t=5&s=2017"; // events in a season 2017
        return get(url).body().jsonPath().getList(".", Event.class);
    }
}
