package hasArelation;

public class Car {
	
	private String make;
	private String model;
	private Engine engine;
	
	public Car(String make, String model, Engine engine) {
	
		super();
		
		this.make = make;
		this.model = model;
		this.engine = engine;
	}

	@Override
	public String toString() {
		return "Car Make=" + make + "\n Model=" + model + "\n" + engine ;
	}
	
	
	

}
