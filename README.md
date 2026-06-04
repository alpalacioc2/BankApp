# React Frontend Integration Branch

## Overview

This branch introduces the initial React frontend setup for the BankApp project. The frontend is being developed using React and Vite to create a modern user interface that will eventually integrate with the existing Spring Boot REST API backend.

The purpose of this branch is to establish the frontend development environment, project structure, and initial API communication setup before merging into a future full-stack integration branch.

---

## Technologies Used

### Frontend

* React
* Vite
* Axios
* JavaScript
* CSS

### Backend Integration Target

* Spring Boot REST API
* Spring Data JPA
* Hibernate
* MySQL

---

## Current Features

* React frontend environment configured using Vite
* Project structure organized for scalable frontend development
* Axios configured for backend API communication
* Initial API integration with customer endpoints
* Development server configured with hot reload support
* Basic frontend verification and rendering completed

---

## Project Structure

```text
react-frontend-bankapp/
├── public/
├── src/
│   ├── api/
│   │   └── customerApi.js
│   ├── assets/
│   ├── components/
│   ├── pages/
│   ├── App.jsx
│   ├── App.css
│   ├── index.css
│   └── main.jsx
├── package.json
├── vite.config.js
└── README.md
```

---

## API Integration

The frontend is configured to communicate with the Spring Boot backend running on:

```text
http://localhost:8080
```

Current endpoint integration:

```text
GET /api/customers
POST /api/customers
```

Axios is used to manage HTTP requests between the React frontend and Spring Boot backend.

---

## Running the Frontend

### Install Dependencies

```bash
npm install
```

### Start Development Server

```bash
npm run dev
```

Frontend runs on:

```text
http://localhost:5173
```

---

## Development Goals

Upcoming goals for future integration:

* Customer dashboard UI
* Account management pages
* Transaction display components
* Authentication and login flow
* Full CRUD operations
* Improved frontend styling and responsiveness
* Complete React + Spring Boot full-stack integration

---

## Notes

This branch focuses only on frontend setup and early backend communication. Full-stack integration and advanced UI development will continue in future branches.
