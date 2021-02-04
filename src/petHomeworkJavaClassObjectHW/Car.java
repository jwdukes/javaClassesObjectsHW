package petHomeworkJavaClassObjectHW;

public class Car {

	private String make;
	private String model;
	private Integer year;
	private String color;
	
	public Car () {}
	
	public Car (String make, String model, Integer year) {
		this.make = make;
		this.model = model;
		this.year = year;	
	}
	
	public Car (String make, String model, Integer year, String color) {
		this.make = make;
		this.model = model;
		this.year = year;
		this.color = color;
	}
	
	public String getMake() {
		return make;
	}
	
	public void setMake(String make) {
		this.make = make;
	}
	
	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public Integer getYear() {
		return year;
	}
	
	public void setYear(Integer year) {
		this.year = year;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public boolean hasYear() {
		return this.year !=null;
	}
	
	public String description() {
		return "Car is: " + this.year + " " + this.color + " " + this.make + " " + this.model; 
	}
	
	
	
}
