package dharmemployeedes;

public class Designation {
	private String designation;
	private String name;
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Designation [designation=" + designation + ", name=" + name + "]";
	}
}
