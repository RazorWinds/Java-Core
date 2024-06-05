package com.sparta.lrm.restassuredintro;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.hamcrest.Matcher;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.json.simple.parser.JSONParser;

public class SinglePostcodeTest {

    private static Response response;

    @BeforeAll
    static void beforeAll() {
        response = RestAssured
                .given()
                .baseUri("https://api.postcodes.io")
                .basePath("/postcodes")
                .header("Accept", "text/json")
                .when()
                .get("/EC2y5AS")
                .thenReturn();
    }

    @Test
    @DisplayName("Status code 200 test")
    void testStatusCode200() {
        MatcherAssert.assertThat(response.getStatusCode(), Matchers.is(200));
    }

    @Test
    @DisplayName("Primary Care Trust response returned in the response is \"City and Hackney Teaching\".")
    void testPrimaryCareTrust(){
        MatcherAssert.assertThat(
                response.body().jsonPath().getString("result.primary_care_trust"),
                Matchers.is("City and Hackney Teaching"));
    }

    @Test
    @DisplayName("total number of codes returned is 14.")
    void testCodeAmount(){
        JSONParser parser = new JSONParser();
        JSONObject responseObject = null;
        try {
            responseObject = (JSONObject) parser.parse(response.body().asString());
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

        // Get the "result" object from the first result
        JSONObject resultObject = (JSONObject) responseObject.get("result");

        // Get the "codes" object
        JSONObject codesObject = (JSONObject) resultObject.get("codes");

        // Count the number of fields in the "codes" object
        int totalFields = codesObject.size();

        // Assert that the total number of fields is 14
        MatcherAssert.assertThat(totalFields, Matchers.is(14));

    }
}
