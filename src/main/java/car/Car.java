package car;

public class Car {
	
	private String colour;
	private int doors;
	private String carMake;
	
	public Car() {}
	
	public Car(String colour, int doors, String carMake) {
		this.colour = colour;
		this.doors = doors;
		this.carMake = carMake;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public int getDoors() {
		return doors;
	}

	public void setDoors(int doors) {
		this.doors = doors;
	}

	public String getCarMake() {
		return carMake;
	}

	public void setCarMake(String carMake) {
		this.carMake = carMake;
	};
	
	

}
