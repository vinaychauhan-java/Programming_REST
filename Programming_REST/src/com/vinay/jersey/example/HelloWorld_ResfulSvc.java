package com.vinay.jersey.example;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/greetings")
public class HelloWorld_ResfulSvc {

	// URL Hit : http://localhost:8888/Programming_REST/rest/greetings
	@GET
	@Produces("text/html")
	public Response getMorningMessage() {
		String output = "Hello, Very <B>Good Morning</B> to You :-)";
		return Response.status(200).entity(output).build();
	}

	// URL Hit : http://localhost:8888/Programming_REST/rest/greetings/evening
	@GET
	@Path("/evening")
	@Produces("text/html")
	public Response getEveningMessage() {
		String output = "Hello, Very Good Evening to You :-)";
		return Response.status(200).entity(output).build();
	}
}
