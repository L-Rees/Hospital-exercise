package hospital;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class JanitorTest {

	Janitor underTest = new Janitor("5", "name", true);
	
	
	@Test
	public void shouldReturnEmpName() {
		String check = underTest.getEmpName();
		assertEquals(check, "name");
	}
	
	@Test
	public void shouldReturnEmpNumber() {
		String check = underTest.getEmpNumber();
		assertEquals(check, "5");
	}
	@Test
	public void shouldReturnTrueSweeping() {
		boolean check = underTest.getSweeping();
		assertTrue(check);
	}
}
