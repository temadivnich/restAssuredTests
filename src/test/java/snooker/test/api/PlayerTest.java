package snooker.test.api;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import snooker.BaseTest;
import snooker.model.Player;

import java.net.URL;
import java.util.Collections;
import java.util.List;

import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

/**
 * 4 Player
 * URL format: api.snooker.org/?p=[Player ID]
 * Example: api.snooker.org/?p=1 (Mark J Williams)
 * Output: Player info as JSON (one-dimensional)
 */
@Log4j2
public class PlayerTest implements BaseTest {

    @ParameterizedTest
    @MethodSource("playerProvider")
    void givenPlayerId_thenCanFindPlayerById(Player player) {
        Integer playerId = player.getID();
        given().queryParam("p", playerId)
                .log().ifValidationFails()
                .get().then().assertThat().statusCode(200)
                .assertThat()
                .body("ID", equalTo(Collections.singletonList(playerId)))
                .body("FirstName", equalTo(player.getFirstName()));

        log.info(player);
    }


    private static List<Player> playerProvider() throws Exception {
//        URI endpoint = new URI("http://api.snooker.org/?p=1");
        URL endpoint = new URL("http://api.snooker.org/?t=10&st=p&s=2015");
        return get(endpoint).body().jsonPath().getList(".", Player.class);
    }
}
