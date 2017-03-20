package com.cisc181.core;

import java.util.UUID;

import com.cisc181.eNums.eMajor;

public class Course extends Section{
	
	
	public UUID getCourseID() {
		return CourseID;
	}
	public void setCourseID(UUID courseId) {
		CourseID = courseId;
	}
	public String getCourseName() {
		return CourseName;
	}
	public void setCourseName(String courseName) {
		CourseName = courseName;
	}
	public int getGradePoints() {
		return GradePoints;
	}
	public void setGradePoints(int scorePoints) {
		GradePoints = scorePoints;
	}
	public eMajor getMajor(){
		return Major;
	}
	public void setMajor(eMajor major){
		Major = major;
	}
	public UUID CourseID;
	public String CourseName;
	public int GradePoints;
	public eMajor Major;
	
}
