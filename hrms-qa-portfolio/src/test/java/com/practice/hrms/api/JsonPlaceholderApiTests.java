package com.practice.hrms.api;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;
public class JsonPlaceholderApiTests {
    private static final String BASE = System.getProperty("api.base.url", "https://jsonplaceholder.typicode.com");
    @Test public void getExistingPostReturnsExpectedFields() {
        given().baseUri(BASE).when().get("/posts/1").then().statusCode(200)
            .body("id", equalTo(1)).body("userId", equalTo(1)).body("title", not(emptyString()));
    }
    @Test public void getMissingPostReturnsNotFound() {
        given().baseUri(BASE).when().get("/posts/999999").then().statusCode(404);
    }
    @Test public void createPostReturnsCreatedPayload() {
        given().baseUri(BASE).contentType("application/json")
            .body("{\"title\":\"QA practice\",\"body\":\"REST Assured sample\",\"userId\":1}")
            .when().post("/posts").then().statusCode(201)
            .body("title", equalTo("QA practice")).body("userId", equalTo(1)).body("id", notNullValue());
    }
}
