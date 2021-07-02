# Philharmonic-app

Task: create a philharmonic service  for the user to purchase a ticket for an opera session.
The user has the ability to access the available session, buy a ticket, create an order, register, login.

### Person without role can: 
    - register 
    - view all available
    - view all perfomances
    - view all stages

### Admin can: 
    - view a list of all performances
    - find user by email
    - add new performance
    - add new stage
    - add new performance session, delete or update

### User can: 
    - process the order
    - view a history of all the orders
    - add the ticket for movie to the shopping cart
    - view all the tickets in the shopping cart

## Architecture 
    3 Layers:
        - Dao 
        - Service 
        - Controllers 

## Technologies
    - Apache Tomcat - version 9.0.46
    - MySQL - version 8.0.25
    - Spring Core/Web/MVC/Rest
    - Hibernate
    - Json

## Setup
    1) Configure Apache Tomcat
        - Use philharmmonic-app:war exploded
        - Leave Application contex : "/"
    2) Install MySQL and MySQL Workbench
    3) Configure src/main/resources/db.properties 
    4) Start the application
    5) Admin and User will be added to your database when program start. 
        (usernames: admin@domain.com, user@domain.com; password: 12345678) 
    6) Now you can log in with existing users or create new