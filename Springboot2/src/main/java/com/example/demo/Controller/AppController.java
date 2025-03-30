package com.example.demo.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app")

public class AppController {
	Student Bob = new Student("2020ICT76","Bob",24,"IT",3.2);
	Student Alice = new Student("2020ICT54","Alice",25,"IT",3.4);
	Studnet John = new Student("2020ICT109","John",23,"IT",3.7);
	
	List<Student> students = new ArrayList<Student>();
	

}
