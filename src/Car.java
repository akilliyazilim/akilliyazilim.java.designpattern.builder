
public class Car {
	private double price;
	private String color,brand;
	private int year;
	private boolean isSecondHand;
	
	public static class Builder
	{
		private final double price;
		
		private String color,brand;
		private int year;
		private boolean isSecondHand;
		
		public Builder(double price) {
			this.price = price;
		}
		
		public Builder setColor(String color)
		{
			this.color = color;
			return this;
		}
		
		public Builder setBrand(String brand)
		{
			this.brand = brand;
			return this;
		}
		
		public Builder setYear(int year)
		{
			this.year = year;
			return this;
		}
		
		public Builder secondHand(boolean isSecondHand)
		{
			this.isSecondHand = isSecondHand;
			return this;
		}
		
		public Car build()
		{
			return new Car(this);
		}
		
	}
	
	private Car(Builder builder)
	{
		price = builder.price;
		brand = builder.brand;
		color = builder.color;
		isSecondHand = builder.isSecondHand;
		year = builder.year;
	}

}
