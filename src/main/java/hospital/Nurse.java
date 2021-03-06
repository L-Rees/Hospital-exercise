package hospital;

public class Nurse extends Employee implements MedicalDuties{

	private int numPatients;
	

	
	public int getNumPatients() {
		return numPatients;
	}

	public Nurse(String empNumber, String empName, int numPatients) {
		this.empNumber = empNumber;
		this.empName = empName;
		this.numPatients = numPatients;
	}

	@Override
	public void drawBlood(Patient patient) {
		patient.removeBlood(5);	
	}

	@Override
	public void careForPatient(Patient patient) {
		patient.increaseHealth(3);	
	}

	@Override
	public String paySalary() {
		return "50000";
	}

	
	

}
