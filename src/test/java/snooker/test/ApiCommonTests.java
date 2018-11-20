package snooker.test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import snooker.BaseTest;
import snooker.api.util.FileUtils;

import java.io.File;
import java.io.InputStream;
import java.util.Collections;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static java.util.concurrent.TimeUnit.SECONDS;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.lessThan;
import static org.junit.jupiter.api.Assertions.assertEquals;

@Log4j2
public class ApiCommonTests implements BaseTest {

    private static final String DUMMY_QUERY = "?e=397&r=1&n=5";

    @Test
    public void givenUrl_whenSuccessOnGetsResponseAndJsonHasRequiredKV_thenCorrect() {
        Response response = given().log().all().get(DUMMY_QUERY);
        response.getBody().prettyPrint();
        response.then().statusCode(200).assertThat()
                .body("Number", equalTo(Collections.singletonList(5)));
    }

    @Test
    public void whenRequestGet_thenOK() {
        when().request("GET", DUMMY_QUERY).then().log().headers().log().body().statusCode(200);
    }

    @Test
    void getPicture() throws Exception {
        InputStream inputStream = given()
                .get("img/players/rosullivan.jpg").asInputStream();
        File file = FileUtils.createFile(inputStream, "Ronnie.jpg");
        inputStream.close();
        log.info("File saved to: " + file.getAbsolutePath());

    }

    @Test
    public void whenMeasureResponseTime_thenOK() {
        Response response = RestAssured.get(DUMMY_QUERY);
        long timeInMS = response.time();
        long timeInS = response.timeIn(SECONDS);

        assertEquals(timeInS, timeInMS / 1000);
        log.info(String.format("Total time of the response: %s seconds, or %s millis", timeInS, timeInMS));
    }

    @Test
    public void whenValidateResponseTime_thenSuccess() {
        given().log().all().
                when().get(DUMMY_QUERY).then().time(lessThan(5L), SECONDS);
    }


    @Test
    public void whenLogOnlyIfValidationFailed_thenSuccess() {
        String endpoint = DUMMY_QUERY;
        when().get(endpoint)
                .then().log().ifValidationFails().statusCode(200);

        given().log().ifValidationFails()
                .when().get(endpoint)
                .then().statusCode(200);
    }
}
