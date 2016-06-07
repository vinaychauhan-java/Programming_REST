package com.vinay.jersey.extractInput;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

// RESTful Web Services (JAX-RS) @PathParam Example
// URL Hit :: http://localhost:8888/Programming_REST/rest/studentInfoPathParamExample/101/Ananya

@Path("/studentInfoPathParamExample")
public class PathParam_ResfulSvc {
	@GET
	@Path("{studRollNo}/{studName}")
	@Produces("text/html")
	public Response getResultByPassingValue(
			@PathParam("studRollNo") String rollNo,
			@PathParam("studName") String name) {

		String output = "Student Roll No. :: " + rollNo + ", Name - " + name;

		return Response.status(200).entity(output).build();

	}

}
