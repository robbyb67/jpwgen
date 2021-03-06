package de.rrze.jpwgen.test;

import org.apache.commons.lang3.time.StopWatch;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import de.rrze.jpwgen.IPasswordPolicy;
import de.rrze.jpwgen.utils.BlankRemover;
import de.rrze.jpwgen.utils.PwHelper;

public class PwGeneratorSecureRandomTest extends PwGeneratorTest {

	@BeforeClass
	public void setUp() {
		System.out.println("======================== "
				+ this.getClass().getSimpleName()
				+ " ================================");
	}

	@AfterClass
	public void finish() {
		System.out.println("======================== "
				+ this.getClass().getSimpleName()
				+ " ================================");
	}

	@Test(groups = { "secure" }, invocationCount = 20)
	public void secureTest() {

		int numPasswords = 20;
		int passLength = 12;

		System.out
				.println("SECURE TEST STARTED: Generating password with secure random:");

		StopWatch stopWatch = new StopWatch();
		stopWatch.start();

		String flags = "-N " + numPasswords + " -s " + passLength
				+ " -C -Y -S SHA1PRNG SUN";

		flags = BlankRemover.itrim(flags);
		String[] ar = flags.split(" ");
		
		IPasswordPolicy passwordPolicy = PwHelper.buildPasswordPolicy(ar, null,
				null);

		process(this.getClass().getSimpleName(), passwordPolicy, numPasswords);

		stopWatch.stop();
		System.out.println("\nSECURE TEST FINISHED:" + stopWatch.toString()
				+ "\n");
	}

}
