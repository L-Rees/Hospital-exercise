package hospital;


public class Surgeon extends Employee implements MedicalDuties{

	
	private String specialty;
	private boolean isOperating;

	public Surgeon(String empNumber, String empName, String specialty, boolean isOperating) {
		this.empNumber = empNumber;
		this.empName = empName;
		this.specialty = specialty;
		this.isOperating = isOperating;
	
	}

	public void drawBlood(Patient patient) {
		patient.removeBlood(5);	
	}

	@Override
	public void careForPatient(Patient patient) {
		patient.increaseHealth(5);
		
	}


	public String getSpecialty() {
		return specialty;
	}

	@Override
	public String paySalary() {
		return "120000";
	}

	public boolean getOperating() {
		return isOperating;
	}
	
}
