package logicalcode;

public class Empolyye {
	String empName;
	int id;
	Double salary;

	
	public Empolyye(String empName, int id, Double salary) {
		this.empName = empName;
		this.id = id;
		this.salary = salary;
	}


	@Override
	public String toString() {
		return "Empolyye [empName=" + empName + ", id=" + id + ", salary=" + salary + "]";
	}



}