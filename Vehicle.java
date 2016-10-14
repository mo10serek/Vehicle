
public class Vehicle {
	
	public static enum Colour {
		red("red"),
		blue("blue"),
		green("green"),
		black("black"),
		white("white"),
		orange("orange"),
		yellow("yellow");
		
		private final String colour;
		
		Colour(String colour){
			this.colour = colour;
		}
		
		public String setColour(){
			return this.colour;
		}
	}
	
	public String licensePlateNumber;
	public String colour;
	public int numberOfDoors;
	public int speed;
	public int maximunSpeed;
	public int minimunSpeed;

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

	public Vehicle(/*String licensePlateNumber, String colour, int numberOfDoors, int speed, int maximunSpeed*/)
	{
		
	}

}
