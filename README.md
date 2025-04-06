# 🚀 RiskShield — Automated Risk Monitoring System

Hey there! 👋  
Welcome to **RiskShield** — an automated risk monitoring system I'm building to explore real-world backend architecture, including message queues, databases, and scalable design patterns.

The goal is to simulate how risk systems in fintech or banking environments handle customer data and asynchronous processing, especially for AML/CFT screening.

---

## 🛠️ Tech Stack

- **Java + Spring Boot** — API and core application logic
- **PostgreSQL** — Data persistence
- **RabbitMQ** — Messaging queue for asynchronous processing
- **Maven** — Dependency management
- **Git + GitHub** — Version control with feature branches and pull requests
- _(Planning: AWS, Terraform, Redis, etc.)_

---

## ⚙️ How to Run Locally

Everything you need to set up this project is here in this README.  
No external docs needed!

### 1. Clone the repository

```bash
git clone https://github.com/Nireeksha01/riskshield.git
cd riskshield
```

### 2. Install PostgreSQL

If you don’t have PostgreSQL installed, do this:

```bash
brew install postgresql
brew services start postgresql
```

Check that PostgreSQL is running:

```bash
brew services list
```

Create a Postgres superuser.  
Replace `nireekshahuns` with your Mac username (check with `whoami`):

```bash
createuser -s nireekshahuns
```

Create the project database:

```bash
createdb -U nireekshahuns riskshield
```

Optional: Access the Postgres shell to confirm:

```bash
psql -U nireekshahuns riskshield
```

Inside Postgres shell:

- List all databases:
  ```sql
  \l
  ```
- After running the app, list tables:
  ```sql
  \dt
  ```
- Exit Postgres:
  ```sql
  \q
  ```

---

### 3. Install RabbitMQ

If you don’t have RabbitMQ installed, do this:

```bash
brew install rabbitmq
brew services start rabbitmq
```

Enable the management dashboard:

```bash
rabbitmq-plugins enable rabbitmq_management
```

Access RabbitMQ dashboard:

- URL: [http://localhost:15672](http://localhost:15672)
- Username: `guest`
- Password: `guest`

✅ You'll be able to see your queues and messages live here!

---

### 4. Configure application properties

Make sure your `application.properties` file looks like this:

```properties
# Database config
spring.datasource.url=jdbc:postgresql://localhost:5432/riskshield
spring.datasource.username=nireekshahuns
spring.datasource.password=

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect

# RabbitMQ config
spring.rabbitmq.host=localhost
spring.rabbitmq.port=5672
spring.rabbitmq.username=guest
spring.rabbitmq.password=guest
```

✅ This will connect your Spring Boot app to both Postgres and RabbitMQ.

---

### 5. Run the application

From your project directory, run:

```bash
./mvnw spring-boot:run
```

This will:

- Start your Spring Boot app
- Connect to PostgreSQL
- Connect to RabbitMQ
- Create your API endpoints
- Start your message consumer for RabbitMQ

✅ Watch your terminal for logs!

---

### 6. Test the API and Queue

Using **Postman** (or any HTTP client), send a POST request to:

```
http://localhost:8080/customer
```

With the following request body:

```json
{
  "name": "John Doe"
}
```

Check your terminal.

You should see:

```
Received message from queue: New customer added: John Doe
```

## 🙌 About

I'm Nireeksha — building this project to get hands-on experience with backend systems, message-driven architecture, and cloud infrastructure.



## 🤝 Contributions

This is a personal learning project, but feel free to fork it, explore, and experiment!

---
