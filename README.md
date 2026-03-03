This project is an event-driven stylist booking system built with Spring Boot and RabbitMQ, demonstrating Enterprise Application Integration (EAI) principles. It utilizes a Booking Service and a Notification Service to decouple processes, ensuring efficient, asynchronous handling of booking events via RabbitMQ exchanges. The system is containerized, allowing for deployment via:
First, build project:
```bash
mvn clean package-DskipTests
```
Then ->
```bash
docker-compose up -d --build
```
to run database and message brokering, and the front-end + backend for a moment need to be deploy manually (deploy will be changed in one single docker-compose later)
