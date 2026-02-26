# Stylist Booking System

This repository contains the project work for the course on **Enterprise Application Integration (EAI)** and related messaging practices. The project implements a booking system using Spring Boot, RabbitMQ, REST APIs, and event-driven architecture.  

---

## Table of Contents

1. [Case Study: Why EAI Matters](#case-study-why-eai-matters)  
2. [Messaging Fundamentals Exploration with AI](#messaging-fundamentals-exploration-with-ai)  
3. [Practice: Message Routing & Transformations](#practice-message-routing--transformations)  
4. [Practice: Event-Driven Messaging with RabbitMQ](#practice-event-driven-messaging-with-rabbitmq)  
5. [Practice: API Orchestration & Service Composition](#practice-api-orchestration--service-composition)  
6. [Capstone / Final Project](#capstone--final-project)  

---

## Case Study: Why EAI Matters

Enterprise Application Integration (EAI) is the process of linking different applications within an organization to simplify and automate business processes.  
Key points:  
- EAI reduces data silos and ensures consistency across systems.  
- Integrates legacy systems with modern applications.  
- Enables real-time communication between services.  
- Supports workflow automation and scalability.  

**Relevance for this project:**  
- My booking system integrates multiple services (booking service, notification service) and uses messaging to coordinate between them.  

---

## Messaging Fundamentals Exploration with AI 

Messaging is the backbone of asynchronous communication in distributed systems.  

**Key concepts:**  
- **Synchronous vs Asynchronous messaging** – async allows decoupling of services.  
- **Message Queue** – a buffer that stores messages until they are processed.  
- **Publish/Subscribe pattern** – one-to-many communication for events.  
- **Message brokers** – software like RabbitMQ, Kafka that handle message delivery.  

**Relevance for this project:**  
- RabbitMQ is used to send booking events and trigger notifications without blocking the main service.  

---

## Practice: Message Routing & Transformations

Message routing determines how messages are directed from producers to consumers.  

**Key points:**  
- **Direct exchange** – route messages to a specific queue based on a key.  
- **Topic exchange** – route messages to multiple queues based on patterns.  
- **Fanout exchange** – broadcast messages to all queues.  
- **Message transformation** – modify message format before delivering it.  

**Relevance for this project:**  
- Booking events are routed to the notification service.  
- Messages are transformed to include formatted text for emails.  

---

## Practice: Event-Driven Messaging with RabbitMQ (10%)

**Deadline:** 08.03.2026  

Event-driven architecture (EDA) allows systems to react to events in real time.  

**Key points:**  
- **Event** – a significant change in state (e.g., booking created).  
- **Publisher** – emits events.  
- **Consumer** – reacts to events.  
- **Loose coupling** – services don’t need direct knowledge of each other.  

**Relevance for this project:**  
- `BookingCreatedEvent` triggers an email notification via RabbitMQ.  
- Email service subscribes to the event queue.  

---

## Capstone

The final project integrates all learned concepts into a single functional system.  

**Project highlights:**  
- **Spring Boot microservices** – booking service, notification service.  
- **RabbitMQ messaging** – asynchronous communication.  
- **REST APIs** – allow interaction with the booking system.  
- **Frontend (Thymeleaf)** – booking form for end users.  
- **Docker** – containerized services for easy deployment.  
- **Email notifications** – confirms bookings to users.  

**Objective:**  
- Demonstrate end-to-end understanding of EAI, messaging, orchestration, and microservices.  

---

**Author:** Oļegs Bērziņš  
**Course:** Enterprise Continuous Application Software Integration 
**Year:** 2026
