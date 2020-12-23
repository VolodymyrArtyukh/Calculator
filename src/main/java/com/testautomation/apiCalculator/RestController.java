package com.testautomation.apiCalculator;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;
import static org.apache.http.HttpStatus.SC_OK;

public class RestController {

    private static final String URL = "https://api.mathjs.org/v4/";

    public static Response get(double number1, double number2, String operation) {
        Response response = given()
                .contentType(ContentType.JSON)
                .log().all()
                .param("expr", number1 + operation + number2)
                .get(URL);

        response.then().statusCode(SC_OK);
        return response;
    }
}
