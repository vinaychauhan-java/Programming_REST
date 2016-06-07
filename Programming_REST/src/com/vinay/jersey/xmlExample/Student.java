package com.vinay.jersey.xmlExample;

import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "student")
public class Student {
	private int rollNo;
	private String name;
	private String city;

	private SubjectList subjectList;

	@XmlElement
	public SubjectList getSubjectList() {
		return subjectList;
	}

	public void setSubjectList(SubjectList subjectList) {
		this.subjectList = subjectList;
	}

	@XmlAttribute
	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	@XmlElement
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@XmlElement
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}

@XmlRootElement(name = "subjectListType")
class SubjectList {

	protected List<Subject> list;

	public SubjectList() {
	}

	public SubjectList(List<Subject> list) {
		this.list = list;
	}

	@XmlElement(name = "subject")
	public List<Subject> getList() {
		return list;
	}

}