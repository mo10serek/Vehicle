
public class Bike extends Vehicle{

	public String colour;
	public int speed;
	
	
	public Bike(String colour, int speed, int maximunSpeed, int minimunSpeed) {
		super(licensePlateNumber, colour, numberOfDoors, speed, maximunSpeed, minimunSpeed);

		this.colour = colour;
		this.speed = speed;
		 
		 
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
