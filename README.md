# Spring Boot Demo (Java)

A **simple Spring Boot demo** in Java, ready to run with Docker.

## Getting started

### Requirements

* Docker Compose installed

### Usage

#### 1. Build and run the application

```bash
docker compose --profile default up -d --build
```

The app will be accessible at [http://localhost:8080](http://localhost:8080)

#### 2. Run tests

```bash
docker compose --profile test up -d --build && docker compose logs -f test
```

### 3. Access Swagger UI

Swagger UI allows you to **explore and test the REST API endpoints** directly in your browser.
Once the application is running, open the following URL:

👉 [http://localhost:8080/webjars/swagger-ui/index.html](http://localhost:8080/webjars/swagger-ui/index.html)

## **Authors**

**Names** : SHARIFI Daner, COLSON Arthur and BATISTA Thomas
**Institution** : IMT Atlantique (Nantes)
**Role** : Informatic students
**Program** : FIL
**Contact** : [thomas.batista@imt-atlantique.net](mailto:thomas.batista@imt-atlantique.net)

## **License**

This project is developed as part of our formation.
It is used for educational purposes only and is not intended for commercial use.
