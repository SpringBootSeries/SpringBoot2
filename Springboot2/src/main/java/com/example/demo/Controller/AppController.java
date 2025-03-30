package com.example.demo.Controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Comparator;

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
	
	@GetMapping("age-range")
	public List<Student> getStudentByAgeRange(){
		return students.stream().filter(s -> s.getAge() >= 20 && s.getAge()<=23).collect(Collectors.toList());
    }
	
	@GetMapping("/sorted-by-gpa")
    public List<Student> getSortedByGpa() {
        return students.stream()
                .sorted(Comparator.comparingDouble(Student::getGpa).reversed())
                .collect(Collectors.toList());
    }

	@GetMapping
    public List<Student> getAllStudents() {
        return students;
    }

    
    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable("id") String regNo) {
        return students.stream()
                .filter(s -> s.getRegNo().equals(regNo))
                .findFirst()
                .orElse(null);
    }

   
    @PostMapping
    public String addStudent(@RequestBody Student student) {
        students.add(student);
        return "Student added successfully!";
    }
    @PutMapping("/{id}")
    public String updateStudent(@PathVariable("id") String regNo, @RequestBody Student updatedStudent) {
        for (Student student : students) {
            if (student.getRegNo().equals(regNo)) {
                student.setName(updatedStudent.getName());
                student.setAge(updatedStudent.getAge());
                student.setGpa(updatedStudent.getGpa());
                return "Student updated successfully!";
            }
        }
        return "Student not found!";
    }

    @DeleteMapping("/delete/{id}")
    public String deleteStudent(@PathVariable("id") String regNo) {
        return students.removeIf(student -> student.getRegNo().equals(regNo)) 
                ? "Student deleted successfully!"
                : "Student not found!";
    }}
	
	
	
	
	
	
	


