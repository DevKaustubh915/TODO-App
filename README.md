# TODO-App

A simple TODO list web application built with Spring Boot, Spring Data JPA and Thymeleaf. This project demonstrates a basic CRUD flow (create, read, update, delete) with a minimal UI styled using Bootstrap and custom CSS.

The app stores todos with three fields: id, title (unique, required) and completed (boolean). The UI provides an input to add tasks and action links to mark tasks complete or delete them.

## Features

- Add a new todo item
- Mark a todo item as completed
- Delete a todo item
- Simple responsive UI using Thymeleaf + Bootstrap
- Data persistence via Spring Data JPA (configure a database in application properties)

## Tech Stack

- Java (recommended 17+)
- Spring Boot (web, thymeleaf, data-jpa)
- Spring Data JPA
- Thymeleaf templates (src/main/resources/templates/index.html)
- Static assets: CSS in src/main/resources/static/css/style.css
- Maven build

## Project Structure (high level)

- src/main/java/com/example/TODO/App
  - TodoAppApplication.java — Spring Boot main application
  - Controller/TodoController.java — Controller handling the UI routes (/ , /add, /update/{id}, /delete/{id})
  - Entity/TodoEntity.java — JPA entity for todo items
  - Repository/TodoRepository.java — JpaRepository for TodoEntity
- src/main/resources/templates/index.html — Thymeleaf template for the UI
- src/main/resources/static/css/style.css — Application styles

## Endpoints / Usage

- GET / or /home — Show the home page with the list of todos
- POST /add — Add a new todo (form parameter: `title`)
- GET /update/{id} — Mark an existing todo as completed
- GET /delete/{id} — Delete a todo

The default UI form posts to `/add` and the template includes links that call `/update/{id}` and `/delete/{id}` for each todo item.

## Prerequisites

- Java 17 or newer (recommended)
- Maven 3.6+
- A database or use the in-memory H2 for quick testing

## Notes & Observations

- TodoEntity defines:
  - id (Long, generated)
  - title (String, not null, unique)
  - completed (Boolean)
- Title is set as unique in the entity, so duplicate titles will cause persistence errors.
- Controller routes are defined to serve Thymeleaf template `index.html` and handle add/update/delete actions.
- The UI includes Bootstrap and Bootstrap Icons; styles are in `static/css/style
