package hospital;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class NurseTest {
	
	Nurse underTest = new Nurse("2", "name", 3);
	Patient patient = new Patient();
	
	
	@Test 
	public void shouldBeAbleToDrawBlood() {
		int bloodLevelBefore = patient.getBloodLevel();
		underTest.drawBlood(patient);
		int bloodLevelAfter = patient.getBloodLevel();
		assertThat(bloodLevelBefore-bloodLevelAfter, is(5));
	}
	
	@Test
	public void shouldBeAbleToIncreaseHealthWithCare() {
		int healthLevelBefore = patient.getHealthLevel();
		underTest.careForPatient(patient);
		int healthLevelAfter = patient.getHealthLevel();
		assertThat(healthLevelAfter - healthLevelBefore, is(3));
	}
	@Test
	public void shouldReturnEmpNumber() {
		String check = underTest.getEmpNumber();
		assertEquals(check, "2");
	}
	@Test
	public void shouldReturnEmpName() {
		String check = underTest.getEmpName();
		assertEquals(check, "name");
	}
	
	@Test
	public void shouldReturnNumPatients() {
		int check = underTest.getNumPatients();
		assertEquals(check, 3);
	}
	
	@Test
	public void shouldGetPaid50K() {
		String check = underTest.paySalary();
		assertEquals(check, "50000");
	}
	
	
	
	
	
}



