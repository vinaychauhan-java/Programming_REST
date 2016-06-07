package com.vinay.jersey.jsonExample;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

// RESTful Web Services (JAX-RS) JSON Example
// URL Hit :: http://localhost:8888/Programming_REST/rest/student/1

// URL Used in Advanced REST Client (Chrome Extension) http://localhost:8888/Programming_REST/rest/student/1
//		(1) Method : Get
//		(2) End-point : http://localhost:8888
//		(3) Resource : /Programming_REST/rest/student
//		(4) Parameters : /1

// Tip : add ‘jersey-json.jar‘ to your classpath which includes all Jackson
// and other JSON supporting libraries

@Path("/student")
public class JSON_ResfulSvc {

	@GET
	@Path("/{studRollNo}")
	@Produces(MediaType.APPLICATION_JSON)
	public Student produceStudentDetailsInJSON(
			@PathParam("studRollNo") int rollNo) {
		/*
		 * We are passing studRollNo as an input parameter and business
		 * computation could be performed on that. Once it is done object is
		 * returned in the JSON Format :-)
		 */
		Student student = new Student();
		student.setRollNo(rollNo);
		student.setName("Ananya Chauhan");
		student.setCity("Chandigarh");

		List<Subject> subjectList = new ArrayList<Subject>();

		Subject sub1 = new Subject();
		sub1.setName("English");
		sub1.setMarks(98);
		subjectList.add(sub1);

		Subject sub2 = new Subject();
		sub2.setName("Hindi");
		sub2.setMarks(98);
		subjectList.add(sub2);

		student.setSubject(subjectList);

		return student;
	}
}
