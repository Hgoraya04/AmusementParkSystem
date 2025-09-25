/* This is programming project 1 for COSC 2436 course 
 * By Harpreet Kaur Goraya
 * Professor Javaher
 * 09/30/2024
 */

package project1COSC;

import java.util.Queue;
import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;


public class ticketSystem {
	
	//Stack to store visitors purchasing tickets
	Stack<Visitor> ticketBooth = new Stack<>(); 
	
	//Array to store queues for each ride
	ArrayList<Queue<Visitor>> rideQueues = new ArrayList<>();
	
	//Array rideNames same order as ridePreference
	String[] rideNames = {"Roller Coaster","Ferris Wheel", "Drop Tower", "Water Slide", "Bumper Cars"};
	
	//LinkedList for each ride queue
	public ticketSystem() {
		
		for (int i= 0; i< rideNames.length; i++) {
			rideQueues.add(new LinkedList<>());
		
		}
	}
	
	//Adding visitor to TicketBooth stack
	public void purchaseTicket(Visitor visitor) {
		
		String newLine = System.getProperty("line.separator");
		ticketBooth.push(visitor);
		
		System.out.print(visitor.name + " has purchased 1 " + visitor.ticketType + " ticket for " + visitor.ridePreference);
		System.out.println(" "+ newLine +" "); //confirmational message
	}
	
	//adding visitors to specific ride queues
	void joinRideQueue(Visitor visitor, int ride) {
		for (int i=0; i< rideNames.length; i++) { 
			if(visitor.ridePreference == rideNames[i]) { //ridePreference and rideNames needs to be same; for this to work
				rideQueues.get(i).add(visitor);
				
				
				System.out.println(visitor.name + " has joined the queue for " + rideNames[i] + "."); //confirmation
				
				return;
			}
		}
		
		System.out.println("Ride not found! Try Again."); //if ride is not found, simulation of ride does not execute if there is no such ride
		
	}
	
	//simulation of rides
	public void simulateRides() {
		Random random = new Random();
		
		for (int i = 0; i< rideQueues.size(); i++) {
			Queue<Visitor> queue = rideQueues.get(i);
			
			while (!queue.isEmpty()) { 
				Visitor visitor = queue.poll(); //removing visitors from queue
				System.out.println(visitor.name + " is enjoying the ride.");
				
				try{
					Thread.sleep(random.nextInt(5)*1000); //pause execution for sometime (random) for real time experience
				} catch(InterruptedException e) {
					e.printStackTrace();
				}
				
				System.out.println(visitor.name + " has completed the ride!"); //confirmation of completion
			}
		}
	}
}

