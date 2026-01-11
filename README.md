# Task 1 – Spring Boot Web Application

A simple Spring Boot web application demonstrating basic MVC patterns and HTTP request handling.

## 📋 Overview

This project fulfills the requirements of Task 1 from the Spring Framework course. It demonstrates fundamental Spring Boot concepts including controllers, request mapping, and view rendering with Thymeleaf.

## 🚀 Features

- **RESTful endpoint** returning plain text
- **MVC view rendering** with HTML and static resources
- **Thymeleaf template engine** integration
- Clean project structure following Spring Boot conventions

## 🛠️ Technologies

- **Java** (latest stable version)
- **Spring Boot** (latest non-SNAPSHOT)
- **Spring Web** - REST API support
- **Thymeleaf** - server-side template engine
- **Lombok** - code simplification
- **Maven** - dependency management

## 📍 Endpoints

### 1. Hello Endpoint
```
GET http://localhost:8080/
```
**Response:** Plain text message
```
Hello Vistula
```

### 2. Greeting Page
```
GET http://localhost:8080/greeting
```
**Response:** HTML view with Vistula logo and greeting message

## 🏃 Running the Application

1. **Clone the repository**
   ```bash
   git clone <your-repository-url>
   cd <project-directory>
   ```

2. **Build the project**
   ```bash
   mvn clean install
   ```

3. **Run the application**
   ```bash
   mvn spring-boot:run
   ```
   
   Or run the main class directly from your IDE.

4. **Access the application**
   - Open browser: `http://localhost:8080/`
   - View greeting: `http://localhost:8080/greeting`

## 📂 Project Structure

```
src/main/java
└── controller
    └── FirstController.java

src/main/resources
├── static
│   └── vistula.png
└── templates
    └── greeting.html
```

## 🧪 Testing

Test the endpoints using:
- **Web Browser** - Simply navigate to the URLs
- **Postman** - Import and test GET requests
- **Swagger UI** - API documentation interface

### Example Browser Test:
1. Start the application
2. Navigate to `http://localhost:8080/`
3. Verify "Hello Vistula" appears
4. Navigate to `http://localhost:8080/greeting`
5. Verify HTML page with logo displays

## 📝 Code Highlights

**Controller with @ResponseBody:**
```java
@GetMapping("/")
@ResponseBody
public String hello() {
    return "Hello Vistula";
}
```

**MVC Pattern with View:**
```java
@GetMapping("/greeting")
public String greeting(Model model) {
    model.addAttribute("name", "Student");
    return "greeting";
}
```

**HTML Template (greeting.html):**
```html
<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
    <meta charset="UTF-8">
    <title>Greeting Page</title>
</head>
<body>
    <h1>Hello, <span th:text="${name}">Guest</span>!</h1>
    <p>Welcome to Spring Boot application</p>
    <p>This is a simple example using Thymeleaf template engine and the MVC design pattern</p>
    
    <img src="/vistula.png" alt="Vistula Logo" width="300"/>
</body>
</html>
```

## ✅ Requirements Met

- ✓ Created from Spring Initializr
- ✓ Uses Spring Web dependency
- ✓ Implements @ResponseBody annotation
- ✓ Returns plain text response
- ✓ Implements MVC pattern with view
- ✓ Includes static resources (image)
- ✓ Fully functional and tested

## 👨‍💻 Author

Created for the Spring Framework course at Akademia Finansów i Biznesu Vistula.

## 📅 Submission

**Deadline:** January 2026  
**Repository:** [GitHub Link]

---

*For questions or issues, please contact: d.bielecki@vistula.edu.pl*
