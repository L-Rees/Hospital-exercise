package hospital;

import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.Assert.assertThat;

import java.util.Collection;

import org.junit.Test;

public class HospitalTest {
	Hospital hospital = new Hospital();

	@Test
	public void  shouldBeAbleToAddEmployee() {
		Doctor doctor = new Doctor("", "", "");
		hospital.addEmployee(doctor);
		Collection<Employee> check = hospital.getAllEmployees();
		assertThat(check, contains(doctor));
	}
	
	@Test
	public void shouldBeAbleToAdd2DifferentEmployees() {
		Doctor doctor = new Doctor("1", "", "");
		hospital.addEmployee(doctor);
		Nurse nurse = new Nurse("2", "", 0);
		hospital.addEmployee(nurse);
		Collection<Employee> check = hospital.getAllEmployees();
		assertThat(check, containsInAnyOrder(doctor, nurse));	}
	
	
	//fire one, or remove one
	
	
	
}
