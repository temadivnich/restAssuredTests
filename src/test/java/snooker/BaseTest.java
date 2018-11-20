package snooker;

import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public interface BaseTest {

    @BeforeAll
    default void init() {
        RestAssured.baseURI = "http://api.snooker.org";
        RestAssured.basePath = "/";
        RestAssured.rootPath = "/";
//        RestAssured.config;
//        RestAssured.authentication;
//        RestAssured.requestSpecification;
//        RestAssured.responseSpecification;
//        RestAssured.responseSpecification;
    }
}
