# 📚 Valmiki Library Management System

A complete backend system built using **Spring Boot** and **MySQL** to manage library operations such as:

- Book Inventory
- Member Management
- Loan & Returns
- Fines Calculation
- Book Reservations
- Renewal Logic
- Business Rules for Membership Tiers

🔧 Tech Stack: Java, Spring Boot, Spring Data JPA, MySQL  
📦 Package Base: `valmiki`  
🗃️ Database: `java123`

---

## 🗂️ Project Structure

```
valmiki-library/
├── backend/
│   ├── src/main/java/valmiki/
│   │   ├── controller/     # REST API Controllers
│   │   ├── service/        # Business Logic Layer
│   │   ├── repository/     # JPA Interfaces
│   │   ├── model/          # Entity Classes
│   │   ├── dto/            # Request/Response DTOs
│   │   └── exception/      # Custom Exceptions
│   ├── resources/
│   │   └── application.properties
├── pom.xml
└── README.md
```

---

## 🚀 How to Run the Backend

### ⚙️ Prerequisites

- Java 17+
- Maven
- MySQL installed and running
- MySQL DB: `java123`

### 🧪 MySQL Setup

Login to MySQL and create the database:

```sql
CREATE DATABASE java123;
```

### 🔧 Configure `application.properties`

Update your username/password in:
```
src/main/resources/application.properties
```

### ▶️ Run the Application

From terminal or IDE:

```bash
mvn spring-boot:run
```

The application will be available at:  
📍 `http://localhost:8080`

---

## 📘 API Documentation

After starting the server, visit:  
👉 `http://localhost:8080/swagger-ui/`  
This includes all endpoints for:

- Book Management
- Member Management
- Loans & Returns
- Fines
- Reservations

---

## 🧪 Sample Endpoints

### Add a New Book

```http
POST /api/books
Content-Type: application/json

{
  "isbn": "9780321356680",
  "title": "Effective Java",
  "author": "James Goshling",
  "category": "Programming",
  "copiesAvailable": 5
}
```

### Register a Member

```http
POST /api/members
Content-Type: application/json

{
  "name": "Valmiki yogesh",
  "age": 21,
  "membershipType": "STANDARD",
  "email": "valmikiyogesh01@gmail.com"
}

```

---

## 🔧 To-Do / Enhancements

- ✅ Complete book & member CRUD
- 🔄 Add advanced filtering & search
- 📧 Integrate email service for reservations
- 🏅 Add badge system for reading milestones
