/*
 * Created by: Michael Balcerzak
 * Created on: 22-Sep-2016
 * Created for: ICS4U
 * Daily Assignment – 1-09
 * This program calculates the class average
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class GetVehicle {

	public static void main(String[] args) throws IOException {
		InputStreamReader r = new InputStreamReader(System.in); 
		BufferedReader br = new BufferedReader(r);
		Scanner input = new Scanner(System.in);
		
		String licensePlateNumber = null;
		String colour = null;
		int numberOfDoors = 0;
		int speed = 0;
		int maximunSpeed = 0 ;
		int minimunSpeed = 0;
				
		Vehicle vehicle1 = new Vehicle(licensePlateNumber, colour, numberOfDoors, speed ,  maximunSpeed, minimunSpeed);
		Vehicle vehicle2 = new Vehicle(licensePlateNumber, colour, numberOfDoors, speed ,  maximunSpeed, minimunSpeed);
		
		// vehicle1
		System.out.println("put the license plate number");
		vehicle1.licensePlateNumber = br.readLine();
		
		System.out.println("put the colour");
		vehicle1.colour = br.readLine();

		System.out.println("put the number of doors");
		vehicle1.numberOfDoors = (int) input.nextDouble();

		System.out.println("put the speed");
		vehicle1.speed = (int) input.nextDouble();
		
		vehicle1.maximunSpeed = vehicle1.Accelerate(vehicle1.speed);
		vehicle1.minimunSpeed = vehicle1.Brake(vehicle1.speed);

		
		
		//vehicle2
		System.out.println("put the license plate number");
		vehicle2.licensePlateNumber = br.readLine();

		System.out.println("put the colour");
		vehicle2.colour = br.readLine();

		System.out.println("put the number of doors");
		vehicle2.numberOfDoors = (int) input.nextDouble();

		System.out.println("put the speed");
		vehicle2.speed = (int) input.nextDouble();;

		vehicle2.maximunSpeed = vehicle1.Accelerate(vehicle2.speed);
		vehicle2.minimunSpeed = vehicle1.Brake(vehicle2.speed);
		
		//displays the vehicles
		System.out.println(vehicle1.licensePlateNumber + " " + vehicle1.colour + " " + vehicle1.numberOfDoors + " " + vehicle1.speed + " " + vehicle1.maximunSpeed + " " + vehicle1.minimunSpeed);
		System.out.println(vehicle2.licensePlateNumber + vehicle2.colour + " " + vehicle2.numberOfDoors + " " + vehicle2.speed + " " + vehicle2.maximunSpeed + " " + vehicle2.minimunSpeed);

		Truck truck1 = new Truck(licensePlateNumber, colour,numberOfDoors,speed, minimunSpeed, minimunSpeed);
		Bike bike1 = new Bike(colour, speed, maximunSpeed, minimunSpeed);

		// truck
		System.out.println("put the colour");
		truck1.colour = br.readLine();

		System.out.println("put the speed");
		truck1.speed = (int) input.nextDouble();
		
		truck1.maximunSpeed = truck1.Accelerate(truck1.speed);
		truck1.minimunSpeed = truck1.Brake(truck1.speed);

		System.out.println( truck1.colour + " " + truck1.speed + " " + truck1.maximunSpeed + " " + truck1.minimunSpeed);
		
		//bike1
		System.out.println("put the license plate number");
		bike1.licensePlateNumber = br.readLine();

		System.out.println("put the colour");
		bike1.colour = br.readLine();

		System.out.println("put the number of doors");
		bike1.numberOfDoors = (int) input.nextDouble();

		System.out.println("put the speed");
		bike1.speed = (int) input.nextDouble();;

		bike1.maximunSpeed = bike1.Accelerate(bike1.speed);
		bike1.minimunSpeed = bike1.Brake(bike1.speed);
		
		System.out.println(bike1.licensePlateNumber + " " + bike1.colour + " " + bike1.numberOfDoors + " " + bike1.speed + " " + bike1.maximunSpeed + " " + bike1.minimunSpeed);
	}

}