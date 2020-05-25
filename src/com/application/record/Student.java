
package com.application.record;

/**
 * @author vijey
 *
 */
//can implement interfaces
public record Student(int studentId,String name) implements Address {
	
	public String getAddress() {
		return "Chennai,India";
	}
	
	public static void main(String args[]) {
		//records provide constructors without defining
		var student=new Student(101, "vijey");
		System.out.println(student.getClass().isRecord());
		System.out.println(student.getClass().getRecordComponents());
	}
	
	
}

interface Address {
	  String getAddress();
	}
