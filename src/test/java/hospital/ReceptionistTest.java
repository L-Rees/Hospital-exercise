package hospital;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ReceptionistTest  {

	Receptionist underTest = new Receptionist("4", "name", true);
	
	@Test
	public void shouldReturnEmpName() {
		String check = underTest.getEmpName();
		assertEquals(check, "name");
	}
	@Test
	public void shouldReturnEmpNumber() {
		String check = underTest.getEmpNumber();
		assertEquals(check, "4");
	}
	@Test
	public void shouldReturnTrueOnPhone() {
		boolean check = underTest.getPhone();
		assertTrue(check);
	}
	@Test
	public void shouldGetPaid45K() {
		String check = underTest.paySalary();
		assertEquals(check, "45000");
	}
}
