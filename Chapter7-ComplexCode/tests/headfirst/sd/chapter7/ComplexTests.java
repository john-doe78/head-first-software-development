package headfirst.sd.chapter7;

import static org.junit.Assert.*;

import org.junit.Test;

public class ComplexTests {

	@Test
	public void testLogin() {
		ComplexCode target = new ComplexCode();
		ComplexCode.UserCredentials userCred = target.login("Dan", "Rules!");
		assertNotNull(userCred);
	}
	
	@Test
	public void testBadLogin() {
		try {
			ComplexCode target = new ComplexCode();
			ComplexCode.UserCredentials userCred = target.login("Dan", "Doesn'tRules!");
			fail("Should have gotten an exception");
		}
		catch (Exception e) {
			// Wo-ho!
		}
	}

	@Test
	public void testNullLogin() {
		try {
			ComplexCode target = new ComplexCode();
			ComplexCode.UserCredentials userCred = target.login(null, "Doesn'tRules!");
			fail("Should have gotten an exception");
		}
		catch (Exception e) {
			// Wo-ho!
		}
	}
	
	@Test
	public void testNullPass() {
		try {
			ComplexCode target = new ComplexCode();
			ComplexCode.UserCredentials userCred = target.login("Dan", null);
			fail("Should have gotten an exception");
		}
		catch (Exception e) {
			// Wo-ho!
		}
	}
}
