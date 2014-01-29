
public class Test {
	public static void main(String[] args) {
		
		Car myCar = new Car.Builder(1250.12)
							.setBrand("Opel")
							.secondHand(true)
							.setColor("Black")
							.setYear(1995)
							.build();
	}

}
