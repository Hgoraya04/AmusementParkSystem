# Amusement Park System

A Java-based simulation of an amusement park ticketing and ride queue system.  
This project was developed as part of my Programming coursework at Lone Star College.

---

## Overview
- Processes ticket purchases for visitors (child, adult, senior tickets).  
- Visitors can choose from 5 available rides.  
- Manages ride queues and simulates ride experiences with randomized delays (1–5 seconds).  
- Displays confirmation messages for ticket purchase, ride queue entry, and ride start/end.  

---

## Program Structure
- **Visitor.java**  
  - Handles user input (name, age, ride choice).  
  - Determines ticket type (child, adult, senior) based on age.  
  - Interacts with `ticketSystem` methods to process actions.  

- **ticketSystem.java**  
  - Manages ticket purchases, ride queues, and ride simulation.  
  - Uses a **Stack** for tickets and **ArrayLists** for ride queues.  
  - Contains methods: `purchaseTicket`, `joinRideQueue`, and `simulateRides`.  

---

## Features
- Simulates a real amusement park flow (ticket purchase → queue → ride → completion).  
- Implements **Stacks**, **Queues**, and **ArrayLists**.  
- Applies **Object-Oriented Programming** (multiple classes, methods, interaction).  
- Pauses execution randomly (1–5 seconds) to mimic ride durations.  

---

## How to Run

### Option 1: Using Eclipse
1. Open Eclipse.  
2. Go to **File → New → Java Project** and name it `AmusementParkSystem`.  
3. Copy `Visitor.java` and `ticketSystem.java` into the project’s `src` folder.  
4. Right-click `Visitor.java` → **Run As → Java Application**.  

### Option 2: Using VS Code
1. Install the **Java Extension Pack** in VS Code.  
2. Open the folder containing `Visitor.java` and `ticketSystem.java`.  
3. Click **Run ▶️** at the top-right of `Visitor.java`.  

### Option 3: Using Command Line
1. Make sure you have the Java JDK installed (`java -version` to check).  
2. Save both `Visitor.java` and `ticketSystem.java` in the same folder.  
3. Open terminal/command prompt in that folder.  
4. Compile:  
   ```bash
   javac Visitor.java ticketSystem.java

Run:
java Visitor

**Documentation**
See /docs for detailed notes on:
-> Program design and structure
-> Implementation details
-> Problems faced and solutions
-> References used

**Technologies**
Language: Java
Concepts: Stacks, Queues, ArrayLists, OOP
Tools: Eclipse, VS Code, JDK

Author
_**Harpreet Kaur Goraya**_
