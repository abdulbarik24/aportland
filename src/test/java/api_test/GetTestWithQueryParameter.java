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

import java.util.List;

public class GetTestWithQueryParameter {
    private static final Logger LOGGER = LogManager.getLogger(GetTestWithQueryParameter.class);

    @Test
    public void getUsersWithQueryParameter() {
        LOGGER.info("------------API Test: Get All Users with Query Parameter----------------");



        //Specify the base URL or endpoint of the REST API
        RestAssured.baseURI = "https://reqres.in/api/users/";
        LOGGER.info("Base URI get connected");

        //Get the request specification of the request that you want to sent to the server.
        //The server is specified by the BaseUri that we have specified in the above step
        RequestSpecification httpRequest = RestAssured.given();

        //Make a request to the server by specifying the method type and the method URL.
        //This will return response from the server and store the response in a variable.
        Response response = httpRequest.queryParam("page", "2").request(Method.GET);
        LOGGER.debug(response.getBody().asString());

        //Assert that the correct response is returned.
        Assert.assertEquals(response.getStatusCode(), 200);
        LOGGER.debug(response.getBody().asString());

        JsonPath jsonPath = response.jsonPath();
        //Saving above retrieved in the array
        List<String> list = jsonPath.get("data.email");
        System.out.println(list);
        String emailid = "data.email";
        LOGGER.debug(list.contains(emailid));

        //Validate that a specific user email does exist in the response in the body
        String emailId = "michael.lawson@reqres.in";
        boolean emailExist = list.contains(emailId);

        Assert.assertTrue(emailExist, emailId + "does not exist");

        LOGGER.info("------------End Test: Get All Users----------------");

    }
}
