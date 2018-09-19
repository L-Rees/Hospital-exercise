package hospital;

public abstract class Employee {

	protected String empNumber;
	protected String empName;

	public String getEmpNumber() {
		return empNumber;
	}
	
	public String getEmpName() {
		return empName;
	}
	public Employee() {
		super();
	}

	public abstract String paySalary();

}