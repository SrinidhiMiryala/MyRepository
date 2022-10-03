package com.ex;

import java.util.Set;


public class Student {
	private int sid;
	private String sname;
	private int marks;
	private String branch;
	
	public Student(int sid, String sname, int marks, String branch) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.marks = marks;
		this.branch = branch;
	}
	/*private Set Course
	
	public Set getCourse() {
		return Course;
	}
	public void setCourse(Set course) {
		Course = course;
	}*/
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	

}
