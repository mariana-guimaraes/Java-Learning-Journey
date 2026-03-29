package main.java.entities;

public class ClassLists {

	//attributes
	private String name; //wrapper classes
	private Integer id;
	private Double salary;
	
	//constructors
	public ClassLists(String name, Integer id, Double salary) { //wrapper classes
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	
	//gets e sets
	public String getName() {
		return name;
	}
	public int getId() {
		return id;
	}
	public double getSalary() {
		return salary;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setId(int id) {
		this.id = id;
	}

	//methods
	public void raise(double percentage) {
		salary = salary + (salary* percentage/100);
	}
	
	//toString
	public String toString() {
		return id + ", " + name + ", " + String.format("%.2f", salary);
	}
}
