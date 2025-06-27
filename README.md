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
- [x] User Profile: view and update profile
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
```

---

## 📌 Interesting Code – `ProfileController`

This controller demonstrates secure access to view and update a user's profile using Spring Security's `Principal`. It ensures that the authenticated user can only access their own data.

```java
@GetMapping
public ProfileDTO getProfile(Principal principal) {
    User user = userRepository.findByUsername(principal.getName()).orElseThrow();
    Profile profile = profileRepository.findByUser(user).orElseThrow();
    return ProfileDTO.fromEntity(profile);
}

@PutMapping
public void updateProfile(@RequestBody @Valid ProfileDTO profileDTO, Principal principal) {
    User user = userRepository.findByUsername(principal.getName()).orElseThrow();
    Profile profile = profileRepository.findByUser(user).orElseThrow();

    profileDTO.updateEntity(profile);
    profileRepository.save(profile);
}
```

### 🔍 Why It’s Interesting:
- Securely retrieves the authenticated user's data using `Principal`.
- Prevents unauthorized access to others' profiles.
- Uses DTO for clean separation between API model and database entity.

---

## Author

Mahmoud Boukhelkhal  
© 2025 – Capstone 3 – Application Development Program
