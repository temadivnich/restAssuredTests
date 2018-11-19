package snooker.test;

import io.restassured.response.Response;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.RepeatedTest;
import snooker.model.Event;

import java.util.List;

import static io.restassured.RestAssured.given;
import static java.util.Collections.singletonList;
import static org.hamcrest.Matchers.hasItem;
import static snooker.api.ServiceType.PlayersInEvent;

@Log4j2
public class EventTest {

    @RepeatedTest(value = 1)
//    @ParameterizedTest
//    @MethodSource("eventInfoProvider")
    void whenGetEventInfo_thenOk() {
        int eventId = 712;

        String paramsString = PlayersInEvent.getParamsString().replace("{eventId}", eventId + "");

        Response response = given().baseUri("http://api.snooker.org")
                .log().all()
                .get(paramsString);

        response.then().assertThat().statusCode(200)
                .header("Content-Type", "application/json")
                .body("ID", hasItem(singletonList(1)));

        List<Event> events = response.body().jsonPath().getList(".", Event.class);
        log.info(events);
    }

//    private List<Event> eventInfoProvider() {
//        Map<String, String> paramsMap = PlayersInEvent.getParams();
//        String url = "http://api.snooker.org/?t=5&s=2017";
//        return get(url).jsonPath().getList(".", Event.class);
//    }
}
