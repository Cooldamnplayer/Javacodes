package hasArelation;

public class TestCar 
{

	public static void main(String[] args) 
	{

		Engine engine = new Engine("V6 Hybrid");
		
		Car car = new Car("Hyundai", "Camry", engine);

		System.out.println(car);
	}

}