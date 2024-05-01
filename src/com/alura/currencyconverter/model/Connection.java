package com.alura.currencyconverter.model;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Connection {

    String url = "https://v6.exchangerate-api.com/v6/21c4269cdc0ec7988b7ae43c/latest/USD";
    HttpClient client = HttpClient.newHttpClient();
    HttpRequest request = HttpRequest.newBuilder().uri(URI.create(url))
            .build();
    HttpResponse<String> response;


    public ConvertionRates toConnect() {
        try {
            response = client.send(request, HttpResponse.
                    BodyHandlers.ofString());
            System.out.println(response.body());

            Gson gson = new Gson();
            JsonObject outsideJson = gson.fromJson(response.body(), JsonObject.class);

            System.out.println("otsidejson" + outsideJson);

            JsonObject cr = outsideJson.getAsJsonObject("conversion_rates");

            System.out.println("conversion_rates: " + cr);





            return gson.fromJson(cr, ConvertionRates.class);


        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}


