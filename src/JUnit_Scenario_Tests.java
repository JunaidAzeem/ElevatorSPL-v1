 

import org.junit.Before; 
import org.junit.Test;  

import ElevatorSystem.ElevatorV2;  
import ElevatorSystem.EnvironmentV2;  
import ElevatorSystem.PersonV2;  
import TestSpecifications.SpecificationException;  
import TestSpecifications.SpecificationManager;  

public    class   JUnit_Scenario_Tests {
	
	
	private static final int cleanupTimeShifts = 12;

	
	

	/**
	 * Hook for AbstractSpecification.aj (resets specifications at test start)
	 */
	//__feature_mapping__ [Base] [20:23]
	@Before
	public void setup() {

	}

	

	

	/**
	 * Hook for specifications with liveness properties. (indicator for
	 * test-termination)
	 */
	/*@
	  @ ensures (\forall int i; 0 <= i && i < env.calledAt_Spec1.length; !env.calledAt_Spec1[i]);
	  @ ensures (\forall int i; 0 <= i && i < env.calledAt_Spec2.length; !env.calledAt_Spec2[i]);
	  @*/
	//__feature_mapping__ [Base] [35:37]
	 private void  testFinished__wrappee__Base(EnvironmentV2 env) {

	}

	
	
	/**
	 * Hook for specifications with liveness properties. (indicator for
	 * test-termination)
	 */
	/*@
	  @ ensures \original;
	  @ ensures (\forall int i; 0 <= i && i < env.calledAt_Spec9.length; !env.calledAt_Spec9[i]);
	  @*/
	//__feature_mapping__ [Empty] [22:24]
	public void testFinished(EnvironmentV2 env) {
		testFinished__wrappee__Base(env);
	}

	

	//__feature_mapping__ [Base] [39:51]
	@Test(expected = SpecificationException.class)
	public void Specification1() {
		SpecificationManager.checkOnlySpecification(1);
		EnvironmentV2 env = new EnvironmentV2(5);
		ElevatorV2 e = new ElevatorV2(env, false);
		Actions a = new Actions(env, e);

		a.bigMacCall();
		a.angelinaCall();
		for (int i = 0; i < cleanupTimeShifts && !e.isBlocked(); i++)
			e.timeShift();
		testFinished(env);
	}

	

	

	//__feature_mapping__ [Base] [55:66]
	@Test(expected = SpecificationException.class)
	public void Specification2() {
		SpecificationManager.checkOnlySpecification(2);
		EnvironmentV2 env = new EnvironmentV2(5);
		ElevatorV2 e = new ElevatorV2(env, false);
		Actions a = new Actions(env, e);

		a.bigMacCall();
		for (int i = 0; i < cleanupTimeShifts && !e.isBlocked(); i++)
			e.timeShift();
		testFinished(env);
	}

	

	

	//__feature_mapping__ [Base] [70:91]
	@Test(expected = SpecificationException.class)
	public void Specification3() {
		SpecificationManager.checkOnlySpecification(3);
		EnvironmentV2 env = new EnvironmentV2(5);
		ElevatorV2 e = new ElevatorV2(env, false, 4, false);
		Actions a = new Actions(env, e);

		PersonV2 bob = a.bobCall();
		while (env.getFloor(bob.getOrigin()).hasCall())
			e.timeShift();
		// bob has been picked up in executive Suite
		
		e.timeShift();
		// executive suite calls again
		// (lift should reverse directions although in-lift button for bob's
		// destination is still pressed)
		// direction, is active)
		a.bobCall();
		for (int i = 0; i < cleanupTimeShifts && !e.isBlocked(); i++)
			e.timeShift();
		testFinished(env);
	}

	

	

	// Specification 8 cannot occur in our system
	// (see end of chapter 5 in Malte Plath and Mark Ryan
	// "Feature integration using a Feature Construct")

	// copy of Spec2-Test because Spec9 is a near-copy of Spec2
	//__feature_mapping__ [Base] [100:111]
	@Test(expected = SpecificationException.class)
	public void Specification9() {
		SpecificationManager.checkOnlySpecification(9);
		EnvironmentV2 env = new EnvironmentV2(5);
		ElevatorV2 e = new ElevatorV2(env, false);
		Actions a = new Actions(env, e);

		a.bigMacCall();
		for (int i = 0; i < cleanupTimeShifts && !e.isBlocked(); i++)
			e.timeShift();
		testFinished(env);
	}

	

	

	// Specifications 10 and 11 are never violated
	// (see end of chapter 5 in Malte Plath and Mark Ryan
	// "Feature integration using a Feature Construct")

	//__feature_mapping__ [Base] [119:135]
	@Test(expected = SpecificationException.class)
	public void Specification13() {
		SpecificationManager.checkOnlySpecification(13);
		EnvironmentV2 env = new EnvironmentV2(5);
		ElevatorV2 e = new ElevatorV2(env, false);
		Actions a = new Actions(env, e);

		a.aliceCall();
		PersonV2 angelina = a.angelinaCall();
		while (env.getFloor(angelina.getOrigin()).hasCall()) {
			e.timeShift();
		}
		a.bobCall();
		for (int i = 0; i < cleanupTimeShifts && !e.isBlocked(); i++)
			e.timeShift();
		testFinished(env);
	}

	

	

	//__feature_mapping__ [Base] [139:155]
	@Test(expected = SpecificationException.class)
	public void Specification14() {
		SpecificationManager.checkOnlySpecification(14);
		EnvironmentV2 env = new EnvironmentV2(5);
		ElevatorV2 e = new ElevatorV2(env, false);
		Actions a = new Actions(env, e);

		PersonV2 bm = a.bigMacCall();

		while (env.getFloor(bm.getOrigin()).hasCall()) {
			e.timeShift();
		}
		a.bobCall();
		for (int i = 0; i < cleanupTimeShifts && !e.isBlocked(); i++)
			e.timeShift();
		testFinished(env);
	}


}
