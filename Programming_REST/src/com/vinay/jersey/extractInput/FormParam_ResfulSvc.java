package com.vinay.jersey.extractInput;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

// RESTful Web Services (JAX-RS) @FormParam Example
// URL Hit :: http://localhost:8888/Programming_REST/rest/studentInfoFormParamExample

// @FormParam annotation, RESTful web service would accept HTML form
// parameters sent by the client in the POST request and bind them to
// the method variables. Generally @FormParam will come into picture
// when client send the data in POST request, if its the GET request
// @QueryParam would be the best choice.

@Path("/studentInfoFormParamExample")
public class FormParam_ResfulSvc {

	@POST
	@Path("/addStudent")
	@Produces("text/html")
	public Response getResultByPassingValue(
			@FormParam("studRollNo") String rollNo,
			@FormParam("studName") String name) {

		String output = "<b> Student Added </b> >>  Roll No. :: " + rollNo
				+ ", Name - " + name;

		return Response.status(200).entity(output).build();

	}

}
