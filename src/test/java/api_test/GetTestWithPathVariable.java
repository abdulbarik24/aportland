package api_test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;


public class GetTestWithPathVariable {
    private static final Logger LOGGER = LogManager.getLogger(SimpleGetTest.class);

    @Test
    public void GetTestWithPathVariableId() {
        LOGGER.info("------------API Test: Get Single Users----------------");

        RestAssured.baseURI = "https://reqres.in/api/users";

        RequestSpecification httpRequest = RestAssured.given();

        String id = "2";
        Response response = httpRequest.request(Method.GET, "2");
        LOGGER.debug(response.getBody().asString());

        Assert.assertEquals(response.getStatusCode(), 200);

        JsonPath jsonPath = response.jsonPath();

        String actualEmailId = jsonPath.getString("data.email");
        String expectedEmailId = "janet.weaver@reqres.in";

        Assert.assertEquals(actualEmailId, expectedEmailId);

        LOGGER.info("------------End Test: Get All Users----------------");
    }

    @Test
    public void attemptToGetUserWithInvalidId() {
        LOGGER.info("------------API Test: Get Single Users----------------");

        RestAssured.baseURI = "https://reqres.in/api/users/";

        RequestSpecification httpRequest = RestAssured.given();

        String InvalidId = "23";
        Response response = httpRequest.request(Method.GET, InvalidId);
        LOGGER.debug(response.getBody().asString());

        Assert.assertEquals(response.getStatusCode(), 404);

        LOGGER.info("------------End Test: Get All Users----------------");
    }
}
