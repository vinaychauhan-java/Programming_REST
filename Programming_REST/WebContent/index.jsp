<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>RESTful Web Services (JAX-RS)</title>
</head>
<body>
	(1) &nbsp; RESTful Web Services (JAX-RS) Hello World Example
	<!-- http://localhost:8888/Programming_REST/rest/greetings -->
	(
	<a href="rest/greetings">Program-1</a>,
	<a href="rest/greetings/evening">Program-2</a>)
	<br>
	<br> (2) &nbsp; RESTful Web Services (JAX-RS) @PathParam Example
	<a href="rest/studentInfoPathParamExample/101/Ananya">(Program-1)</a>
	<br>
	<br> (3) &nbsp; RESTful Web Services (JAX-RS) @QueryParam Example
	<a
		href="rest/studentInfoQueryParamExample?studRollNo=101&studName=Ananya">(Program-1)</a>
	<br>
	<br> (4) &nbsp; RESTful Web Services (JAX-RS) @MatrixParam Example
	<a
		href="rest/studentInfoMatrixParamExample;studRollNo=102;studName=Vipin">(Program-1)</a>
	<br>
	<br> (5) &nbsp; RESTful Web Services (JAX-RS) @FormParam Example
	<a href="formParamClient.jsp">(Program-1)</a>
	<br>
	<br> (6) RESTful Web Services (JAX-RS) JSON Example
	<a href="rest/student/1">(Program-1)</a>
    <br>
	<br> (7) RESTful Web Services (JAX-RS) XML using JAXB Example
	<a href="rest/studentXML/1">(Program-1)</a>
	<br>
	<br> (11) RESTful Web Services (JAX-RS) Upload Example
	<a href="uploadFile.jsp">(Program-1)</a>
	<br>
	<br> (12) RESTful Web Services (JAX-RS) Download Example (
	<a href="rest/downloadFile/asText">Program-1</a>,
	<a href="rest/downloadFile/asImage">Program-2</a>,
	<a href="rest/downloadFile/asPdf">Program-3</a>)
</body>
</html>




<!--
============================ 
Few Notes for Reference :-
============================
Web Services are mainly of 2 types, 
	SOAP [Simple Object Access Protocol]
	and REST [Representational state transfer] based services. 

We have different type of specifications to implement SOAP and REST services.

JAX-RS provides the implementation of RESTful web services, JAX-RS is a
specification for RESTful Web Services with Java and it is given by Sun.

Since it is a specification, other frameworks can be written to implement
these specifications, and that includes Jersey from Oracle, RestEasy from
Jboss, CXF from Apache.

JAX-WS, Apache Axis2 provides the implementation for SOAP

Apache CXF provides implementation for SOAP and RESTful services both.

JAX-RS Annotations
	@Path(Path)
	@GET
	@POST
	@PUT
	@DELETE
	@Produces(MediaType.TEXT_PLAIN [, more-types])
	@Consumes(type[, more-types])
	@PathParam()
	@QueryParam()
	@MatrixParam()
	@FormParam()

@Path() Annotation
Its a Class & Method level of annotation. This will check the path next
to the base URL
Syntax :
Base URL :
http://localhost:(port)/<YourApplicationName>/<UrlPattern In
Web.xml>/<path>
Here <path> is the part of URI, and this will be identified by @path
annotation at class/method level, you will be able to understand in the
next RESTful Hello World example.

@GET
Its a method level of annotation, this annotation indicates that the
following method should respond to the HTTP GET request only, I mean if
we annotate our method with @GET, the execution flow will enter that
following method if we send GET request from the client

@POST
Its a method level of annotation, this annotation indicates that the
following method should respond to the HTTP POST request only.

@PUT
Its a method level of annotation, this annotation indicates that the
following method should respond to the HTTP PUT request only.

@DELETE
Its a method level of annotation, this annotation indicates that the
following method should respond to the HTTP DELETE request only.

@Produces
Its a method or field level annotation, This tells which MIME type is
delivered by the method annotated with @GET. I mean when ever we send a
HTTP GET request to our RESTful service, it will invokes particular
method and produces the output in different formats.
There you can specifies in what are all formats (MIME) your method can
produce the output, by using @produces annotation.
Remember: We will use @Produces annotation for GET requests only.

@Consumes
This is a class and method level annotation, this will define which MIME
type is consumed by the particular method. I mean in which format the
method can accept the input from the client.

 -->