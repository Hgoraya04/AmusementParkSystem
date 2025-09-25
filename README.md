# Amusement Park System

A Java-based simulation of an amusement park ticketing and ride queue system.  
This project was developed as part of my Programming coursework at Lone Star College.

## Overview
- Processes ticket purchases for visitors (child, adult, senior tickets).  
- Visitors can select from 5 available rides.  
- Manages ride queues and simulates ride experiences with randomized delays.  
- Confirmation messages are displayed throughout the process (ticket purchase, queue, start/end of ride).  

## Structure
- **Visitor.java** → Handles user input, determines ticket type and ride choice, interacts with ticket system methods.  
- **ticketSystem.java** → Manages ticket purchases, ride queues, and ride simulations.  

## Features
- Uses **Stacks** for ticket purchases and **Queues/ArrayLists** for ride management.  
- Simulates rides with random wait times (1–5 seconds).  
- Implements **Object-Oriented Programming** principles (classes, methods, interaction).  

## How to Run
1. Clone the repository:  
   ```bash
   git clone https://github.com/Hgoraya04/AmusementParkSystem.git
