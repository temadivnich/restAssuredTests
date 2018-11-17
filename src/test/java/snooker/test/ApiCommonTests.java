package snooker.test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import snooker.api.SnookerApiService;
import snooker.api.util.FileUtils;

import java.io.File;
import java.io.InputStream;
import java.util.Collections;

import static io.restassured.RestAssured.*;
import static java.util.concurrent.TimeUnit.SECONDS;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.lessThan;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ApiCommonTests {

    private SnookerApiService api = new SnookerApiService();

    @BeforeAll
    public static void setup() {
        RestAssured.baseURI = "https://api.snooker.org";
        RestAssured.basePath = "/";
        RestAssured.rootPath = "/";
        RestAssured.port = 80;
    }

    @Test
    public void givenUrl_whenSuccessOnGetsResponseAndJsonHasRequiredKV_thenCorrect() {
        Response response = get(api.getEndpoint());
        response.getBody().prettyPrint();
        response.then().statusCode(200).assertThat()
                .body("Number", equalTo(Collections.singletonList(5)));
    }

    @Test
    public void whenRequestGet_thenOK() {
        when().request("GET", api.getEndpoint()).then().log().headers().log().body().statusCode(200);
    }

    @Test
    void getPicture() throws Exception {
        InputStream inputStream = given().baseUri("http://snooker.org/").get("img/players/rosullivan.jpg").asInputStream();
        File file = FileUtils.createFile(inputStream, "Ronnie.jpg");
        inputStream.close();
        System.out.println("File saved to: " + file.getAbsolutePath());

    }

    @Test
    public void whenMeasureResponseTime_thenOK() {
        Response response = RestAssured.get(api.getEndpoint());
        long timeInMS = response.time();
        long timeInS = response.timeIn(SECONDS);

        assertEquals(timeInS, timeInMS / 1000);
        System.out.printf("Total time of the response: %s seconds, or %s millis", timeInS, timeInMS);
    }

    @Test
    public void whenValidateResponseTime_thenSuccess() {
        given().log().all().
                when().get(api.getEndpoint()).then().time(lessThan(5L), SECONDS);
    }


    @Test
    public void whenLogOnlyIfValidationFailed_thenSuccess() {
        String endpoint = api.getEndpoint();
        when().get(endpoint)
                .then().log().ifValidationFails().statusCode(200);

        given().log().ifValidationFails()
                .when().get(endpoint)
                .then().statusCode(200);
    }
}
