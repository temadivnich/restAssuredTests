package snooker.test;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import snooker.model.Player;

import java.net.URI;
import java.util.List;

import static io.restassured.RestAssured.get;

/**
 * 4 Player
 * URL format: api.snooker.org/?p=[Player ID]
 * Example: api.snooker.org/?p=1 (Mark J Williams)
 * Output: Player info as JSON (one-dimensional)
 */
public class PlayerEndpointTests {

    @ParameterizedTest
    @MethodSource("playerProvider")
    void givenPlayerId_thenCanFindPlayerById(Player player) {
        System.out.println(player);
    }


    private static List<Player> playerProvider() throws Exception {
//        URI endpoint = new URI("http://api.snooker.org/?p=1");
        URI endpoint = new URI("http://api.snooker.org/?t=10&st=p&s=2015");
        return get(endpoint).body().jsonPath().getList(".", Player.class);
    }
}
