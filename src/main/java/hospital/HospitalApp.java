package hospital;

public class HospitalApp {

	public static void main(String[] args) {

		Hospital hospital = new Hospital();
		
		Doctor phil = new Doctor("1", "Phil", "Brain");
		Surgeon jackie = new Surgeon("2", "Jackie", "Brain", true);
		Nurse harry	= new Nurse("3", "Harry", 5);
		Receptionist janine = new Receptionist("4", "Janine", true);
		Janitor joe = new Janitor("5", "Joe", true);
		
		hospital.addEmployee(phil);
		hospital.addEmployee(jackie);
		hospital.addEmployee(harry);
		hospital.addEmployee(janine);
		hospital.addEmployee(joe);
		
		System.out.println("Here are the salary rates at the hospital: ");
		hospital.showPayRates();
		
		System.out.println("Here are the employees who can give medical care: ");
		hospital.showAllMedicalPersonnel();
		
		
		
		
		
		
		
		
	}

}
