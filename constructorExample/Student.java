package constructorExample;

public class Student {
	String name;
	
	public Student() {
		this.name="Dharm Patel";
	}
	public Student(String name) {
	super();
	this.name = name;
}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + "]";
	}	
}
