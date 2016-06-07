package com.vinay.jersey.xmlExample;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

//RESTful Web Services (JAX-RS) XML using JAXB Example
//URL Hit :: http://localhost:8888/Programming_REST/rest/studentXML/1

// Following Web-Service example produces XML response using Jersey.
// Basically JAX-RS supports conversion of java objects into XML with the
// help of JAXB. As Jersey it self contains JAXB libraries we no need to
// worry about JAXB-Jersey integration stuff.

@Path("/studentXML")
public class XML_ResfulSvc {

	@GET
	@Path("/{studRollNo}")
	@Produces(MediaType.APPLICATION_XML)
	public Student produceStudentDetailsInJSON(
			@PathParam("studRollNo") int rollNo) {
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

		SubjectList subjectListObj = new SubjectList(subjectList);

		student.setSubjectList(subjectListObj);

		return student;
	}

}
