# Java ↔ MySQL JDBC connection

A simple Java application demonstrating JDBC database connectivity with MySQL.

## Project Structure
JDBC-Connectivity/
├─
│ └── JdbcInsert.java
├─
│ └── mysql-connector-j-9.5.0.jar
├── .gitignore
└── README.md


## Prerequisites

- Java JDK 8 or higher
- MySQL Server
- MySQL Connector/J 9.5.0

## Setup Instructions

### 1. Database Setup

Create the database and table:

```sql
CREATE DATABASE demo_jdbc;
USE demo_jdbc;

CREATE TABLE users (
  id INT AUTO_INCREMENT PRIMARY KEY,
  name VARCHAR(100) NOT NULL,
  email VARCHAR(150) NOT NULL UNIQUE,
  created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);
```

## 2. Configuration
```java 
String url = "jdbc:mysql://localhost:3306/demo_jdbc";
String username = "your_mysql_username";
String password = "your_mysql_password";
```

## 3. Running the Application
```bash
javac -cp .;mysql-connector-j-9.5.0.jar JdbcInsert.java
java -cp .;mysql-connector-j-9.5.0.jar JdbcInsert

//NOTE : connector version should be diffrent 
```
**Features**
    Connect to MySQL database using JDBC
    Insert records into users table
    Basic database operations demonstration
    Error handling for database connections

**Dependencies**
    MySQL Connector/J 9.5.0
    MySQL Database Server

**Git Ignore**
The project includes a .gitignore file to exclude:
    MySQL connector directory (mysql-connector-j-9.5.0/)
    IDE files (.idea/)
    Compiled classes (.class files)
    System files

**Troubleshooting**
    ClassNotFoundException: Make sure MySQL connector JAR is in the classpath
    Connection refused: Check if MySQL server is running
    Access denied: Verify database username and password

# License

**MIT License**
```bash
Save this as `README.md` in your project root directory. This provides clear documentation for anyone who wants to understand or run your JDBC connectivity project.
```