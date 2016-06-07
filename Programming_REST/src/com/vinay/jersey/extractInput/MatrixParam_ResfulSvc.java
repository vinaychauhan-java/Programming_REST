package com.vinay.jersey.extractInput;

import javax.ws.rs.GET;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

// RESTful Web Services (JAX-RS) @MatrixParam Example
// URL Hit :: http://localhost:8888/Programming_REST/rest/studentInfoMatrixParamExample;studRollNo=101;studName=Ananya

// Consider this URL
// http://localhost:8888/Programming_REST/rest/studentInfoMatrixParamExample;studRollNo=101;studName=Ananya
// If you observe the URL, i am passing 2 parameters studRollNo=101 &
// studName=Ananya. One parameter is separated from another with a
// semicolon, similarly you can pass any number of parameters. These
// type of parameters are called as Matrix Parameters. 

@Path("/studentInfoMatrixParamExample")
public class MatrixParam_ResfulSvc {

	@GET
	@Produces("text/html")
	public Response getResultByPassingValue(
			@MatrixParam("studRollNo") String rollNo,
			@MatrixParam("studName") String name) {

		String output = "Student Roll No. :: " + rollNo + ", Name - " + name;

		return Response.status(200).entity(output).build();
	}

}
