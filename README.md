# Spring Boot - A personal website
This is the first exploration into Spring Boot (and its surroundings), which took the form of a small personal website. It was inspired by a project of my friend and fellow Kits employee Soroush.

## Agenda
* Create a simple REST API
* Connect with some kind of presentational layer (frontend)
* Setup JPA/database connection

## Progress
* A first, basic REST API is in place.
* Frontend exploration with simple AngularJS, making use of the REST API
* A connection to JPA (PostgreSQL) established and working

## Run
With maven installed, clone the repo and run: 
```mvn spring-boot:run```

This will set up the webpage at the default address of [http://localhost:8080](http://localhost:8080)

## Testing
It is possible to browse and to perform GET operations on the REST API at the simple webpage by running the command above. 
Currently, a REST client like Postman is suited for manual testing of the full REST API.
