
public class Vehicle {


	public static String licensePlateNumber;
	public static String colour;
	public static int numberOfDoors;
	public static int speed;
	public static int maximunSpeed;
	public int minimunSpeed;

	//constructor

	public Vehicle (String licensePlateNumber, String colour, int numberOfDoors, int speed , int maxspeed, int minSpeed){

		this.licensePlateNumber = licensePlateNumber;
		this.colour = colour;
		this.numberOfDoors = numberOfDoors;
		this.speed = 0;		
	}
	
	

	protected int Accelerate(int speed){
		maximunSpeed = speed * 5;
		
		return maximunSpeed;
	}
	
	protected int Brake(int speed){
		minimunSpeed = speed / 5;
		
		return minimunSpeed;
	}

	public String getLicensePlateNumber() {
		return licensePlateNumber;
	}

	public void setLicensePlateNumber(String licensePlateNumber) {
		this.licensePlateNumber = licensePlateNumber;
	}
		
	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}
	
	public int getNumberOfDoors() {
		return numberOfDoors;
	}

	public void setNumberOfDoors(int numberOfDoors) {
		this.numberOfDoors = numberOfDoors;
	}
	
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

}
