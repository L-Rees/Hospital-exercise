package hospital;

public class Janitor extends Employee {

	private boolean sweeping;

	public Janitor(String empNumber, String empName, boolean sweeping) {
		this.empName = empName;
		this.empNumber = empNumber;
		this.sweeping = sweeping;
	}

	@Override
	public String paySalary() {
		return null;
	}

	public boolean getSweeping() {
		return sweeping;
	}

}
