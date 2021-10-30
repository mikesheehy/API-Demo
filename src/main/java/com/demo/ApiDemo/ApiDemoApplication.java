package com.demo.ApiDemo;

import java.net.URI;
import java.net.http.*;
import java.io.IOException;
import java.net.*;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiDemoApplication {

	public static void main(String[] args) throws IOException, InterruptedException {
		SpringApplication.run(ApiDemoApplication.class, args);
		String firstone = "testing...";
		System.out.println(firstone);
		HttpRequest request = HttpRequest.newBuilder()
		.uri(URI.create("https://skyscanner-skyscanner-flight-search-v1.p.rapidapi.com/apiservices/autosuggest/v1.0/UK/GBP/en-GB/?query=Stockholm"))
		.header("x-rapidapi-host", "skyscanner-skyscanner-flight-search-v1.p.rapidapi.com")
		.header("x-rapidapi-key", "ed452aa554mshd5b1cf45d84d5f6p197527jsn632a1e3a91a1")
		.method("GET", HttpRequest.BodyPublishers.noBody())
		.build();
		HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
		System.out.println(response.body());
		//HttpResponse<String> response = Unirest.get("https://movies-tvshows-data-imdb.p.rapidapi.com/?type=get-movies-by-title&title=matrix")
	//.header("x-rapidapi-host", "movies-tvshows-data-imdb.p.rapidapi.com")
	//.header("x-rapidapi-key", "ed452aa554mshd5b1cf45d84d5f6p197527jsn632a1e3a91a1")
	//.asString();
	}

}
