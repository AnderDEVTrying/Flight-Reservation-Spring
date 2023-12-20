# Flight-Reservation-Spring
# Flight Reservation System

This project is a simple flight reservation system built using Java with Spring Boot.

## Overview

The Flight Reservation System allows users to make reservations for flights. It provides functionalities to create new reservations, retrieve existing reservations, and calculate arrival dates based on the destination.

## Features

- Create new reservations
- Retrieve existing reservations
- Calculate arrival dates based on the destination

## Technologies Used

- Java
- Spring Boot
- H2 Database
- Maven

## Getting Started

To get started with the Flight Reservation System, follow these steps:

1. Clone the repository
2. Open the project in your preferred IDE.
3. Build the project using Maven
4. Run the application

## Usage

Once the application is running, you can use the following endpoints:

- GET `/reservation`: Retrieve all reservations.
- POST `/reservation`: Create a new reservation.

Example request body for creating a reservation:
```json
{
  "first_name": "Anderson",
  "last_name": "Zango",
  "document": "1234567890",
  "destination": "Beira",
  "departureDate": "2023-12-25"
}
