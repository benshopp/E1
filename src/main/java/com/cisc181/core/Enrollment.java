package com.cisc181.core;

import java.util.UUID;

public class Enrollment extends Section{
	
	public UUID StudentID;

	public UUID getStudentID() {
		return StudentID;
	}

	public void setStudentID(UUID studentID) {
		StudentID = studentID;
	} 
	
	public UUID SectionID;
	
	public UUID getSectionID() {
		return SectionID;
	}

	public void setSectionID(UUID sectionID) {
		SectionID = sectionID;
	}

	public double Grade;

	public double getGrade() {
		return Grade;
	}

	public void setGrade(double grade) {
		Grade = grade;
	}
	
	public UUID EnrollmentID;

	public UUID getEnrollmentID() {
		return EnrollmentID;
	}

	public void setEnrollmentID(UUID enrollmentID) {
		EnrollmentID = enrollmentID;
	}
	
	private Enrollment(){
		
	}
	
	public Enrollment(UUID studentID, UUID sectionID) {
		StudentID = studentID;
		SectionID = sectionID;
		EnrollmentID = UUID.randomUUID();
	}

}
