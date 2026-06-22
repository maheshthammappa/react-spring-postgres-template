# React Spring PostgreSQL Template

A reusable full-stack project template using React (Vite), Spring Boot, and PostgreSQL with separate local and production configurations.

## Tech Stack

### Frontend

* React
* Vite
* Axios
* React Router

### Backend

* Spring Boot
* Spring Data JPA
* Maven

### Database

* PostgreSQL

### Deployment

* Frontend: GitHub Pages
* Backend: Render

---

## Features

* Environment-based configuration
* Separate local and production profiles
* GitHub Actions deployment workflow
* Axios API service setup
* PostgreSQL integration
* Production-ready folder structure
* Secure environment variable handling

---

## Project Structure

```text
project/
├── frontend/
│   ├── src/
│   │   ├── components/
│   │   ├── pages/
│   │   ├── services/
│   │   └── hooks/
│   └── .env
│
├── backend/
│   └── src/main/java/
│       └── com/college/
│           ├── controller/
│           ├── service/
│           └── repository/
│
├── .github/workflows/
├── PROJECT_RULES.md
└── README.md
```

---

## Local Development Setup

### Frontend

Create `.env`

```env
VITE_API_URL=http://localhost:8080
```

Run:

```bash
npm install
npm run dev
```

---

### Backend

Create PostgreSQL database:

```sql
CREATE DATABASE projectname;
```

Configure `application-local.properties`

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/projectname
spring.datasource.username=postgres
spring.datasource.password=password
```

Run:

```bash
mvn spring-boot:run
```

---

## Production Setup

### GitHub Secrets

```text
VITE_API_URL
```

Example:

```text
https://your-backend.onrender.com
```

### Render Environment Variables

```text
SPRING_PROFILES_ACTIVE=prod

DB_URL=
DB_USERNAME=
DB_PASSWORD=
```

---

## API Configuration

```javascript
import axios from "axios";

const api = axios.create({
  baseURL: import.meta.env.VITE_API_URL,
});

export default api;
```

---

## Deployment Workflow

### Frontend

```text
GitHub → GitHub Actions → GitHub Pages
```

### Backend

```text
GitHub → Render Auto Deploy
```

---

## Security

Do not commit:

```text
.env
application-local.properties
```

Store secrets only in:

* GitHub Secrets
* Render Environment Variables

---

## License

MIT License
