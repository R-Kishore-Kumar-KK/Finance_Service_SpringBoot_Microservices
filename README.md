Finance Service - Spring Boot Microservices: 
  A Finance Domain Microservices Application built using Spring Boot & Spring Cloud, implementing real-world backend architecture.

Architecture: 
  -Eureka Server → Service Discovery
  -API Gateway → Centralized Routing
  -User Service → User Management
  -Wallet Service → Wallet Operations
  -Transaction Service → Money Transfer

Tech Stack: 
  -Java 17
  -Spring Boot
  -Spring Cloud
  -Eureka Server
  -Spring Cloud Gateway
  -OpenFeign
  -MySQL
  -Maven

Features: 
  -Microservices Architecture
  -API Gateway Routing
  -Service Discovery (Eureka)
  -Inter-service Communication (Feign Client)
  -Wallet Credit/Debit System
  -Transaction Processing
  -Global Exception Handling
  -Standard API Response Structure

How to Run: 
  -Start Eureka Server
  -Start User Service
  -Start Wallet Service
  -Start Transaction Service
  -Start API Gateway

Future Enhancements: 
  -DTO Layer
  -JWT Authentication
  -Circuit Breaker (Resilience4j)
  -Config Server

Demo-Finance-Working-Project
→ Basic working microservices implementation

Finance-Microservice-Standard-API
→ Improved version with:
   - Global Exception Handling
   - Standard API Response
   - Better error handling
   - Clean architecture improvements

API Gateway Base URL: http://localhost:8080

USER SERVICE: 
  POST http://localhost:8080/api/users/register
  GET http://localhost:8080/api/users/{id}

WALLET SERVICE:
  POST http://localhost:8080/api/wallet/create/{userId}
  GET http://localhost:8080/api/wallet/{userId}
  POST http://localhost:8080/api/wallet/credit/{userId}/{amount}
  POST http://localhost:8080/api/wallet/debit/{userId}/{amount}

TRANSACTION SERVICE:
  POST http://localhost:8080/api/transactions/send?senderId={id}&receiverId={id}&amount={amount}
  GET http://localhost:8080/api/transactions/sent/{userId}
  GET http://localhost:8080/api/transactions/received/{userId}

Request & Response:
USER SERVICE:
Request:
{
  "name": "User",
  "email": "user@gmail.com",
  "password": "1234",
  "phone": "9876543210"
}

Response:
{
  "status": "SUCCESS",
  "message": "User registered successfully",
  "data": {
    "userId": 1,
    "name": "Karthik",
    "email": "karthik@gmail.com"
  }
}

Author:
  Kishore Kumar R

