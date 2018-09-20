package hospital;

public class Receptionist extends Employee{

	private boolean onPhone;



	public Receptionist(String empNumber, String empName, boolean onPhone) {
		this.empName = empName;
		this.empNumber = empNumber;
		this.onPhone = onPhone;
	}

	
	
	@Override
	public String paySalary() {
		return "45000";
	}



	public boolean isOnPhone() {
		return onPhone;
	}

}
