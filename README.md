# Student Management API

  

## Overview

This project is a simple Spring Boot REST API for managing student records. It allows users to retrieve student details, add new students, update information, and delete records.

## Features

✅ Retrieve a list of students

✅ Fetch student details by ID

✅ Add a new student

✅ Update existing student records

✅ Delete a student record

✅ Sort students by GPA

✅ Filter students by age range

## Technologies Used

- Spring Boot (REST API framework)

- Java 17

- Maven (Dependency management)

## Project Structure
````
├── src/main/java/com/example/demo/
│   ├── Controller/AppController.java  # Handles API requests
│   ├── model/Student.java             # Student entity class
│   ├── Application.java               # Main application file
├── src/main/resources/
│   ├── application.properties         # Configuration file
├── README.md                          # Project documentation
````
## Installation

1️⃣ Prerequisites

- Java 17 or later

- Maven

- Spring Boot

2️⃣ Build and Run the Application

- mvn spring-boot:run

- The server will start at http://localhost:8080.

- API Endpoints

- Get all students

- GET /app/students

## Response:

[
  {"regNo": "2020ICT76", "name": "Bob", "age": 24, "course": "IT", "gpa": 3.2},
  {"regNo": "2020ICT54", "name": "Alice", "age": 25, "course": "IT", "gpa": 3.4}
]

- Get a student by ID

- GET /app/student/{id}

### Add a new student

- POST /app/add
- Content-Type: application/json
````
{
  "regNo": "2020ICT90",
  "name": "Emma",
  "age": 22,
  "course": "IT",
  "gpa": 3.8
}

````

### Update a student record

- PUT /app/update/{id}

### Delete a student

- DELETE /app/delete/{id}

## Example Output Screenshots

![output1]()




## License

This project is licensed under the MIT License.
