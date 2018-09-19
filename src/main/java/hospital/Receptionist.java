package hospital;

public class Receptionist extends Employee{

	private boolean phone;



	public Receptionist(String empNumber, String empName, boolean phone) {
		this.empName = empName;
		this.empNumber = empNumber;
		this.phone = phone;
	}

	
	
	@Override
	public String paySalary() {
		return "45000";
	}



	public boolean getPhone() {
		return phone;
	}

}
