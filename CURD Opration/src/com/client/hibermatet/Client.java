package com.client.hibermatet;

import com.entities.hibermatet.Student;
import com.service.hibermatet.StudentService;
import com.service.hibermatet.StudentServiceImpl;

public class Client {
	public static void main(String[] args) 
	{
		
		// CRUD operation calling activity
		Student student = new Student();
		
		StudentService service = new StudentServiceImpl();
		
////		 Create Operation
		
//		student.setStudentid(3);
//		student.setName("Rani");
//		service.addStudent(student);
//		
		
	// Retrieve Operation
		service.findStudentById(2);
		System.out.println("ID is: "+student.getStudentid());
		System.out.println("Name is: "+student.getName());	
		
//		
////	Update Operation
//		student  =service.findStudentById(2);
//		student.setName("Avantika ");
//		service.updateStudent(student);
//		
		
//		service.findStudentById(1);
//		System.out.println("ID is: "+student.getStudentid())	;
//		System.out.println("Name is: "+student.getName());
////		
		
//		// Delete Operation
//		student=service.findStudentById(3);
//		service.removeStudent(student);
//		System.out.println("Row removed");
//		
		
	}
}
