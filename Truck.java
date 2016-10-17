
public class Truck extends Vehicle{

	 public Truck() {
		 super(licensePlateNumber, colour, numberOfDoors, speed, maximunSpeed);
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
