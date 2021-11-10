package car;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class CarTest {
	


	@Test
	public void constructorTest() {
		Car actual = new Car("Blue", 5, "Audi");
		
		assertNotNull(actual.getCarMake());
		assertNotNull(actual.getColour());
		assertNotNull(actual.getDoors());
		
		assertEquals(actual.getCarMake(), "Audi");
		assertEquals(actual.getColour(), "Blue");
		assertEquals(actual.getDoors(), 5);
	}
	
	@Test
	public void setterTest() {
		Car car = new Car();
		
		car.setCarMake("BMW");
		car.setColour("Red");
		car.setDoors(3);
		
		assertNotNull(car.getCarMake());
		assertNotNull(car.getColour());
		assertNotNull(car.getDoors());
		
		assertEquals(car.getCarMake(), "BMW");
		assertEquals(car.getColour(), "Red");
		assertEquals(car.getDoors(), 3);
	}
}
