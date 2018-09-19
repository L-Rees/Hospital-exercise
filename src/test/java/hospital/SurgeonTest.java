package hospital;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class SurgeonTest {

	Surgeon underTest = new Surgeon("3", "name", "area", true); 
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
		assertThat(healthLevelAfter - healthLevelBefore, is(5));
	}
	
	@Test
	public void shouldReturnEmpNumber() {
		String check = underTest.getEmpNumber();
		assertEquals(check, "3");
	}
	@Test
	public void shouldReturnEmpName() {
		String check = underTest.getEmpName();
		assertEquals(check, "name");
	}
	@Test
	public void shouldReturnSpecialty() {
		String check = underTest.getSpecialty();
		assertEquals(check, "area");
	}
	@Test
	public void shouldGetPaid120K() {
		String check = underTest.paySalary();
		assertEquals(check, "120000");
	}
	@Test
	public void shouldOperateTrue() {
		boolean check = underTest.getOperating();
		assertTrue(check);
	}
}
