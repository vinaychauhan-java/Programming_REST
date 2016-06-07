package com.vinay.jersey.extractInput;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

// RESTful Web Services (JAX-RS) @QueryParam Example
// URL Hit :: http://localhost:8888/Programming_REST/rest/studentInfoQueryParamExample?studRollNo=101&studName=Ananya

// In RESTful web services (JAX-RS) @QueryParam annotation will be used
// to get the query parameters from the URL, But in
// case of @PathParam we will get parameter values directly.
//
// Consider this URL:
// http://localhost:8888/Programming_REST/rest/studentInfoQueryParamExample?studRollNo=101&studName=Ananya
// Here query parameters are studRollNo, studName and their values are
// 101, Ananya respectively

@Path("/studentInfoQueryParamExample")
public class QueryParam_ResfulSvc {
	@GET
	@Produces("text/html")
	public Response getResultByPassingValue(
			@QueryParam("studRollNo") String rollNo,
			@QueryParam("studName") String name) {

		String output = "Student Roll No. :: " + rollNo + ", Name - " + name;

		return Response.status(200).entity(output).build();

	}

}
