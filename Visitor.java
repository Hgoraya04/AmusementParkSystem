/* This is programming project 1 for COSC 2436 course 
 * By Harpreet Kaur Goraya
 * Professor Javaher
 * 09/30/2024
 */

package project1COSC;

import java.util.Scanner; //for getting values from keyboard

public class Visitor { //most of the interaction with user is happening here
	// interaction with user and ticketSystem class

	String name; 
	int age;
	String ticketType;
	String ridePreference;
	
	Visitor(String name, int age, int ride){
		
		this.name = name;
		this.age = age;
		
		if(ride==1) { //Changes ridePreference from integer to string associated with it
			this.ridePreference = "Roller Coaster";
		}
		
		else if(ride==2) {
			this.ridePreference = "Ferris Wheel";
		}
		
		else if(ride==3) {
			this.ridePreference = "Drop Tower";
		}
		
		else if(ride==4) {
			this.ridePreference = "Water Slide";
		}
		
		else if (ride==5){
			this.ridePreference = "Bumper Cars";
		}
		
		//if Ride integer does not exist
		else if (ride>5 || ride<=0) { 
			this.ridePreference = "Ride not in system";
			}
		
		/*Assigning appropriate tickets based on age
		 * Child for age 12 and below
		 * Senior for age 65 and above
		 * Adult for 13-64 age group */
		
		if(age <= 12) {
			this.ticketType = "Child";
		}
		
		else if(age >= 65) {
			this.ticketType = "Senior";
		}
		
		else {
			this.ticketType = "Adult";
		}
		
		
	}
	
	public static void main(String[] args) { //gets input from user
		
		Scanner scanner = new Scanner(System.in); 
		ticketSystem system = new ticketSystem(); //instance of ticketSystem class
		
		System.out.print("Visitor's name: ");
		String name = scanner.nextLine(); //input name of visitor and storing in name variable
		
		System.out.print("Age: ");
		int age = scanner.nextInt(); //input age of visitor, storing in age
		
		String newline = System.getProperty("line.separator");
		
		System.out.println("1. ROLLER COASTER" + newline + "2. FERRIS WHEEL" + newline + "3. DROP TOWER" + newline + "4. WATER SLIDE"
				+ newline + "5. BUMPER CARS" + newline + "Choose a riding preference: ");
		int ride = scanner.nextInt();  //looking for ride preference of visitor, integer is used to make input easier
		
		Visitor visitor =  new Visitor(name, age, ride); //instance of Visitor class
		
		system.purchaseTicket(visitor); // this method push visitors into stack
		
		system.joinRideQueue(visitor, ride); //this method adds visitors to specific ride queues
		
		system.simulateRides(); //This method simulates rides
		
		scanner.close();
				
		}
		
	}
