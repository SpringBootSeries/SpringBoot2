package com.example.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import java.util.List;
import java.util.ArrayList;

@RestController
@RequestMapping("/app")

public class AppController {
	Student Bob = new Student("2020ICT76","Bob",24,"IT",3.2);
	Student Alice = new Student("2020ICT54","Alice",25,"IT",3.4);
	Student John = new Student("2020ICT109","John",23,"IT",3.7);
	
	List<Student> students = new ArrayList<Student>();
	
	@GetMapping("/age/{ag}")
	public String MyAge(@PathVariable("ag") int age) {
		return "My age is  " +age;
	}
	
	@GetMapping("/student")
	public Student getStudent() {
		return Bob;
		
	}
	
	@GetMapping("/students")
	public  List<Student> getStudents() {
		return students;
		
	}
	
	@GetMapping("/student/{id}")
	public Student getStudent(@PathVariable("id") String regno) {
		for (Student student : students) {
			if(student.getRegNo().equals(regno)) {
				return student;
			}
		}
		return null;
	}
	
	
	
	
	
	
	
	

}
