/*
* Created by: Michael balcerzak
* Created on: 11-Oct-2016
* Created for: ICS4U
* Daily Assignment – Unit#2-06
* This program make a 2 Car for the user
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
		
		Vehicle vehicle1 = new Vehicle();
		Vehicle vehicle2 = new Vehicle();

		
		// vehicle1
		System.out.println("put the license plate number");
		vehicle1.licensePlateNumber = br.readLine();
		
		System.out.println("put the colour");
		vehicle1.colour = br.readLine();
		
		System.out.println("put the number of doors");
		vehicle1.numberOfDoors = (int) input.nextDouble();
		
		System.out.println("put the speed");
		vehicle1.speed = input.nextDouble();;
		
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
		vehicle2.speed = input.nextDouble();;
		
		vehicle2.maximunSpeed = vehicle1.Accelerate(vehicle2.speed);
		vehicle2.minimunSpeed = vehicle1.Brake(vehicle2.speed);
		
		//displays the vehicles
		System.out.println(vehicle1.licensePlateNumber + " " + vehicle1.colour + " " + vehicle1.numberOfDoors + " " + vehicle1.speed + " " + vehicle1.maximunSpeed + " " + vehicle1.minimunSpeed);
		System.out.println(vehicle2.licensePlateNumber + vehicle2.colour + " " + vehicle2.numberOfDoors + " " + vehicle2.speed + " " + vehicle2.maximunSpeed + " " + vehicle2.minimunSpeed);
	}

}
