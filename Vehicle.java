/*
* Created by: Michael balcerzak
* Created on: 11-Oct-2016
* Created for: ICS4U
* Daily Assignment – Unit#2-06
* This program make a 2 Car for the user
*/ 	

public class Vehicle {
	//this class make the vehicle
	
	public String licensePlateNumber;
	public String colour;
	public int numberOfDoors;
	public double speed;
	public double maximunSpeed;
	public double minimunSpeed;
	
	protected double Accelerate(double speed2){
		// creates the maximun speed
		maximunSpeed = speed2 * 5;
		
		return maximunSpeed;
	}
	
	protected double Brake(double speed2){
		// creates the minimun speed
		minimunSpeed = speed2 / 5;
		
		return minimunSpeed;
	}

	public String getLicensePlateNumber() {
		// get License Plate Number
		return licensePlateNumber;
	}

	public void setLicensePlateNumber(String licensePlateNumber) {
		// set License Plate Number
		this.licensePlateNumber = licensePlateNumber;
	}
		
	public String getColour() {
		// get Colour
		return colour;
	}

	public void setColour(String colour) {
		// set Colour
		this.colour = colour;
	}
	
	public int getNumberOfDoors() {
		// get Number of doors
		return numberOfDoors;
	}

	public void setNumberOfDoors(int numberOfDoors) {
		// set number of doors
		this.numberOfDoors = numberOfDoors;
	}
	
	public double getSpeed() {
		// get speed
		return speed;
	}

	public void setSpeed(int speed) {
		// set speed
		this.speed = speed;
	}
	
	
}
