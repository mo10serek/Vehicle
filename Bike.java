
public class Bike extends Vehicle{

	public Bike(String licensePlateNumber, String colour, int numberOfDoors, int speed, int maximunSpeed, int minimunSpeed) {
		 super(licensePlateNumber, colour, numberOfDoors, speed, maximunSpeed);
	 }   
	
	protected int Accelerate(int speed){
		maximunSpeed = speed * 20;
		
		return maximunSpeed;
	}
	
	
	protected int Brake(int speed){
		minimunSpeed = speed / 2;
		
		return minimunSpeed;
	}

}
