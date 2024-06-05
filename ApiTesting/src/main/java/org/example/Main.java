package org.example;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpRequest.BodyPublishers;
import java.net.http.HttpResponse.BodyHandlers;
import java.net.http.HttpResponse;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HttpRequest httpRequest = HttpRequest.newBuilder()
                .uri(URI.create("https://api.postcodes.io/postcodes"))
                .POST(BodyPublishers.ofString( "{\"postcodes\" : [\"OX49 5NU\", \"M32 0JG\", \"NE30 1DP\"]}"))
                .header("Content-Type", "application/json")
                .build();

        HttpResponse<String> httpResponse = null;

        try (HttpClient httpClient = HttpClient.newHttpClient();) {
            httpResponse = httpClient.send(httpRequest, BodyHandlers.ofString());
        } catch (InterruptedException | IOException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(httpResponse.body());
        System.out.println(httpResponse.headers());


        JSONParser parser = new JSONParser();


    }
}