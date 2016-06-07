package com.vinay.jersey.client;

//Have dependencies on following Jars :-
//(1) commons-logging-1.1.1.jar
//(2) httpclient-4.1.1.jar
//(3) httpcore-4.1.jar

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;

public class ApacheHttpClientPost {

	// http://localhost:8080/RESTfulExample/json/product/post
	public static void main(String[] args) {

		try {

			DefaultHttpClient httpClient = new DefaultHttpClient();
			HttpPost postRequest = new HttpPost(
					"http://localhost:8888/Programming_REST/rest/product/post");

			StringEntity input = new StringEntity(
					"{\"quantity\":100,\"name\":\"iPad 4\"}");
			input.setContentType("application/json");
			postRequest.setEntity(input);

			HttpResponse response = httpClient.execute(postRequest);

			if (response.getStatusLine().getStatusCode() != 201) {
				throw new RuntimeException("Failed : HTTP error code : "
						+ response.getStatusLine().getStatusCode());
			}

			BufferedReader br = new BufferedReader(new InputStreamReader(
					(response.getEntity().getContent())));

			String output;
			System.out.println("Output from Server .... \n");
			while ((output = br.readLine()) != null) {

				System.out.println(output);
			}

			httpClient.getConnectionManager().shutdown();

		} catch (MalformedURLException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();

		}

	}

}