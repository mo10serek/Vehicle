
public class Truck extends Vehicle{

	public String colour;
	public int numberOfDoors;
	public int speed;
	public int maximunSpeed;
	
	 public Truck(String licensePlateNumber, String colour, int numberOfDoors, int speed, int maxspeed, int minspeed) {
		 super(licensePlateNumber, colour, numberOfDoors, speed , maxspeed, minspeed);
		 
		 this.colour = colour;
		 this.numberOfDoors = numberOfDoors;
		 this.speed = speed;
		 this.maximunSpeed = maximunSpeed;
		 
	 }   
	 
	 protected int Accelerate(int speed){
			maximunSpeed = speed * 3;
			
			return maximunSpeed;
		}
	 
	 protected int Brake(int speed){
			minimunSpeed = speed / 10;
			
			return minimunSpeed;
		}

	
}
