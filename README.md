# EasyShop E-Commerce API (Capstone 3)

## Overview

This project is a full-featured **Spring Boot** API backend for an e-commerce platform called **EasyShop**. It represents **Version 2** of the API and extends the existing functionality by fixing bugs, implementing category management, adding shopping cart operations, and optionally enabling user profiles and checkout features.

The project uses **MySQL** for data storage and **JWT authentication** for secure access control. It is designed to integrate with a front-end web application and is tested using **Postman**.

---

## Features

### ✅ Version 1 (Existing API)
- User registration & login with JWT tokens
- Product display and filtering by category
- Basic search functionality

### 🔧 Version 2 (Your Tasks)
- [x] Fix bugs in product search and update logic
- [x] Implement full CRUD for product categories (admin only)
- [x] Implement full CRUD for products (admin only)
- [x] Secure endpoints using roles (USER, ADMIN)
- [x] Add unit tests for bug fixes

### ⭐ Optional Features
- [x] Shopping Cart (persistent, per user)
- [x] PUT endpoint to update cart item quantity
- [ ] User Profile: view and update profile
- [ ] Checkout: convert cart to order and clear cart

---

## Technologies Used

- Java 17
- Spring Boot
- Spring Security
- MySQL
- JDBC / JPA (as needed)
- Postman (for API testing)
- GitHub Projects (for task planning)

---

## Setup Instructions

### 🛠 Prerequisites
- MySQL Workbench
- Java 17+
- Maven
- IntelliJ or any IDE

### 🧪 Database Setup
1. Open and execute the script `create_database.sql` in MySQL Workbench.
2. Default users:
    - `admin` / `password`
    - `user` / `password`

### 🚀 Run the Application
```bash
mvn spring-boot:run
