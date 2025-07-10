
# Smart Complaint Management System

## Overview
A Java-based desktop and API system for registering, tracking, and resolving complaints within an organization.

## Modules
1. **complaint-desktop-app**: JavaFX GUI for users to register and view complaint status using JDBC.
2. **complaint-api**: Spring Boot REST API for admin-side complaint resolution and reporting.

## Technologies
- Java, JavaFX, Core Java
- Spring Boot, REST API, JPA
- JDBC
- MySQL
- Maven
- Postman

## How to Run

### Database Setup
1. Create a MySQL database: `smart_complaint_db`
2. Run the provided SQL script to create tables.

### Run Desktop App
- Import `complaint-desktop-app` into your IDE
- Set up DB config in the code
- Run the JavaFX main class

### Run Spring Boot API
- Import `complaint-api` into your IDE
- Set your DB credentials in `application.properties`
- Run the Spring Boot application

### Test API
Use Postman to hit endpoints like:
- `GET /complaints`
- `POST /complaints`
- `PUT /complaints/{id}`

## Author
Viraj Vikas Pandit  
