package com.application.workaround;

public class StudentStackTrace {
	
	private int id;
	private String studentName;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentStackTrace student=null;
		String name=student.getStudentName();
		
	}

}
