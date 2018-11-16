package org.snooker.test;

import io.restassured.response.Response;
import org.junit.jupiter.api.Test;
import org.snooker.api.SnookerApiService;

import java.util.Arrays;

import static io.restassured.RestAssured.get;
import static org.hamcrest.Matchers.equalTo;

public class SnookerApiTest {

    @Test
    public void givenUrl_whenSuccessOnGetsResponseAndJsonHasRequiredKV_thenCorrect() {
        SnookerApiService api = new SnookerApiService();

        Response response = get(api.getEndpoint());
        response.getBody().prettyPrint();
        response.then().statusCode(200).assertThat()
                .body("ID", equalTo(Arrays.asList(2240166)));

    }
}
