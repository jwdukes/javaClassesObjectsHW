package petHomeworkJavaClassObjectHW;

public class Pet {
	private String name;
	private Integer age;
	private String location;
	private String type;
	
	public Pet(String name, Integer age, String location, String type) {
		this.name = name;
		this.age = age;
		this.location = location;
		this.type = type;
	}

	public Pet(){}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getType() {
		return type;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
	
	
}


	
	










//pet.java Create a Pet Class with the following instance variables: 
//	name (PRIVATE) age (PRIVATE) location (PRIVATE) type (PRIVATE) two constructors 
//	empty all attributes Code to be able to access the following (Get Methods): name
//	age type Code to be able to change (Set Methods): name age location \.java Create
//	a Custom Class (anything you want - car, phone, holiday, etc.). 
//	Requirements: Minimum 3 private instance variables An empty constructor 
//	A constructor that uses only 2 of your 3 variables A constructor that uses all 3
//	of your instance variables Get methods for all 3 of your instance variables 
//	Set methods for all 3 of your instance variables A method that returns a Boolean A 
//	method that returns a String For example, if I created a Santa Custom Class, 
//	my code would look something like the attached Santa.java file. Submit a link to your GitHub repository 