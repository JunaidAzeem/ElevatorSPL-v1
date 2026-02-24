/*
 * This file is a merged test suite:
 * - Tests test00() to test48() are reused from the original Elevator_ESTest.
 * - Tests test49() to test51() are NEW tests for additional SPL features (Weight, ExecutiveFloor, Empty).
 */

package ElevatorSystem;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ElevatorSystem.Elevator;
import ElevatorSystem.Environment;
import ElevatorSystem.Floor;
import ElevatorSystem.Person;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Elevator_ESTest extends Elevator_ESTest_scaffolding {

	@Test(timeout = 4000)
	public void test00()  throws Throwable  {
		Environment environment0 = new Environment(935);
		Elevator elevator0 = new Elevator(environment0, true);
		elevator0.isBlocked();
		elevator0.currentFloorID = 771;
		Person person0 = new Person("", 3118, 771, 771, environment0);
				     person0.leaveElevator();
				     person0.leaveElevator();
				     person0.leaveElevator();
				     elevator0.isIdle();
				     elevator0.leaveElevator(person0);
				     elevator0.areDoorsOpen();
				     elevator0.enterElevator(person0);
				     elevator0.isEmpty();
				     elevator0.timeShift();
				     elevator0.toString();
				     Elevator.Direction elevator_Direction0 = Elevator.Direction.up;
				     Elevator.Direction elevator_Direction1 = elevator_Direction0.reverse();
				     elevator_Direction1.reverse();
				     elevator0.getEnv();
				     // Undeclared exception!"
				     try {      
				    	 Elevator.DoorState.valueOf(",o>|C}m\\u007fJ4v~2?3tH");
				    	 fail("Expecting exception: IllegalArgumentException");
				     }
				    	 
				     catch(IllegalArgumentException e) {
				     		      		    	//
				     		      		    	// No enum constant ElevatorSystem.Elevator.DoorState.,o>|C}m\u007fJ4v~2?3tH   
				     		      		    	verifyException("java.lang.Enum", e);
				     		      		    			    }
				     }
				     		      		 
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Environment environment0 = new Environment(935);
      Elevator elevator0 = new Elevator(environment0, true);
      elevator0.isBlocked();
      elevator0.currentFloorID = 771;
      Person person0 = new Person("", 3118, 771, 308, environment0);
      person0.leaveElevator();
      person0.leaveElevator();
      person0.leaveElevator();
      elevator0.isIdle();
      elevator0.leaveElevator(person0);
      elevator0.areDoorsOpen();
      elevator0.enterElevator(person0);
      elevator0.leaveElevator(person0);
      elevator0.isEmpty();
      elevator0.timeShift();
      elevator0.toString();
      Elevator.Direction elevator_Direction0 = Elevator.Direction.up;
      Elevator.Direction elevator_Direction1 = elevator_Direction0.reverse();
      elevator_Direction1.reverse();
      elevator0.getEnv();
      elevator0.getCurrentDirection();
      // Undeclared exception!
      try { 
        Elevator.DoorState.valueOf(",o>|C}mJ4v~2?3tH");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No enum constant ElevatorSystem.Elevator.DoorState.,o>|C}mJ4v~2?3tH
         //
         verifyException("java.lang.Enum", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Environment environment0 = new Environment(0);
      Elevator elevator0 = new Elevator(environment0, true, 0, true);
      elevator0.isIdle();
      boolean[] booleanArray0 = new boolean[4];
      booleanArray0[0] = true;
      booleanArray0[1] = true;
      Floor[] floorArray0 = new Floor[1];
      Floor floor0 = new Floor(environment0, 0);
      floor0.processWaitingPersons(elevator0);
      floorArray0[0] = floor0;
      environment0.floors = floorArray0;
      booleanArray0[2] = false;
      booleanArray0[3] = true;
      elevator0.floorButtons = booleanArray0;
      Elevator.DoorState elevator_DoorState0 = Elevator.DoorState.open;
      elevator0.doors = elevator_DoorState0;
      elevator0.pressInLiftFloorButton(1);
      elevator0.pressInLiftFloorButton(1);
      Elevator.Direction elevator_Direction0 = elevator0.currentHeading;
      elevator_Direction0.reverse();
      elevator0.isIdle();
      elevator0.areDoorsOpen();
      elevator0.getCurrentFloorID();
      elevator0.isEmpty();
      elevator0.buttonForFloorIsPressed(1);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Environment environment0 = new Environment(344);
      Elevator elevator0 = new Elevator(environment0, true);
      elevator0.toString();
      elevator0.timeShift();
      Elevator.DoorState elevator_DoorState0 = Elevator.DoorState.open;
      environment0.floors = null;
      Floor[] floorArray0 = new Floor[2];
      Floor floor0 = new Floor(environment0, (-1));
      floorArray0[0] = floor0;
      floor0.addWaitingPerson((Person) null);
      Elevator.Direction.values();
      Floor floor1 = new Floor(environment0, 0);
      floorArray0[1] = floor1;
      environment0.floors = floorArray0;
      elevator0.doors = elevator_DoorState0;
      elevator0.toString();
      elevator0.timeShift();
      Elevator.Direction elevator_Direction0 = elevator0.currentHeading;
      // Undeclared exception!
      try { 
        elevator0.timeShift();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("ElevatorSystem.Elevator", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Environment environment0 = new Environment(344);
      Elevator elevator0 = new Elevator(environment0, true);
      Person person0 = new Person("p", 344, 43, 1, environment0);
      elevator0.leaveElevator(person0);
      elevator0.toString();
      elevator0.isIdle();
      elevator0.timeShift();
      elevator0.toString();
      elevator0.timeShift();
      // Undeclared exception!
      try { 
        Elevator.Direction.valueOf("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No enum constant ElevatorSystem.Elevator.Direction.
         //
         verifyException("java.lang.Enum", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Environment environment0 = new Environment(935);
      Elevator elevator0 = new Elevator(environment0, true);
      elevator0.isBlocked();
      elevator0.currentFloorID = 771;
      Person person0 = new Person("", 3118, 771, 308, environment0);
      person0.leaveElevator();
      person0.leaveElevator();
      person0.leaveElevator();
      elevator0.isIdle();
      elevator0.leaveElevator(person0);
      elevator0.areDoorsOpen();
      elevator0.enterElevator(person0);
      elevator0.isEmpty();
      elevator0.timeShift();
      elevator0.toString();
      Elevator.Direction elevator_Direction0 = Elevator.Direction.up;
      Elevator.Direction elevator_Direction1 = elevator_Direction0.reverse();
      elevator_Direction1.reverse();
      elevator0.getEnv();
      elevator0.getCurrentDirection();
      // Undeclared exception!
      try { 
        Elevator.DoorState.valueOf(",o>|C}mJ4v~2?3tH");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No enum constant ElevatorSystem.Elevator.DoorState.,o>|C}mJ4v~2?3tH
         //
         verifyException("java.lang.Enum", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Environment environment0 = new Environment(0);
      Elevator elevator0 = new Elevator(environment0, true, 0, true);
      boolean[] booleanArray0 = new boolean[4];
      booleanArray0[0] = true;
      booleanArray0[1] = true;
      Floor[] floorArray0 = new Floor[1];
      Floor floor0 = new Floor(environment0, 0);
      environment0.floors = floorArray0;
      booleanArray0[2] = false;
      booleanArray0[3] = true;
      elevator0.floorButtons = booleanArray0;
      Elevator.DoorState elevator_DoorState0 = Elevator.DoorState.open;
      elevator0.doors = elevator_DoorState0;
      elevator0.pressInLiftFloorButton(1);
      elevator0.pressInLiftFloorButton(1);
      Elevator.Direction elevator_Direction0 = elevator0.currentHeading;
      elevator_Direction0.reverse();
      // Undeclared exception!
      try { 
        elevator0.isIdle();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("ElevatorSystem.Elevator", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Environment environment0 = new Environment(344);
      Elevator elevator0 = new Elevator(environment0, true);
      elevator0.toString();
      elevator0.timeShift();
      boolean[] booleanArray0 = new boolean[5];
      booleanArray0[0] = true;
      booleanArray0[1] = true;
      booleanArray0[2] = true;
      booleanArray0[3] = true;
      booleanArray0[4] = true;
      elevator0.floorButtons = booleanArray0;
      Elevator.DoorState elevator_DoorState0 = Elevator.DoorState.open;
      environment0.floors = null;
      Floor[] floorArray0 = new Floor[2];
      Floor floor0 = new Floor(environment0, (-1));
      floorArray0[0] = floor0;
      Elevator.Direction.values();
      Floor floor1 = new Floor(environment0, 0);
      floorArray0[1] = floor1;
      environment0.floors = floorArray0;
      elevator0.doors = elevator_DoorState0;
      elevator0.toString();
      elevator0.timeShift();
      // Undeclared exception!
      try { 
        Elevator.Direction.valueOf("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No enum constant ElevatorSystem.Elevator.Direction.
         //
         verifyException("java.lang.Enum", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Environment environment0 = new Environment(344);
      Elevator elevator0 = new Elevator(environment0, true);
      Person person0 = new Person("p", 344, 0, 1, environment0);
      elevator0.leaveElevator(person0);
      elevator0.toString();
      elevator0.isIdle();
      elevator0.timeShift();
      elevator0.toString();
      elevator0.timeShift();
      // Undeclared exception!
      try { 
        Elevator.Direction.valueOf("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No enum constant ElevatorSystem.Elevator.Direction.
         //
         verifyException("java.lang.Enum", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Environment environment0 = new Environment(935);
      Elevator elevator0 = new Elevator(environment0, true);
      elevator0.isBlocked();
      elevator0.currentFloorID = 771;
      Person person0 = new Person("", 3118, 771, 308, environment0);
      person0.leaveElevator();
      person0.leaveElevator();
      person0.leaveElevator();
      elevator0.isIdle();
      elevator0.leaveElevator(person0);
      elevator0.areDoorsOpen();
      elevator0.enterElevator(person0);
      elevator0.isEmpty();
      // Undeclared exception!
      try { 
        Elevator.Direction.valueOf((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Name is null
         //
         verifyException("java.lang.Enum", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Environment environment0 = new Environment(344);
      Elevator elevator0 = new Elevator(environment0, false);
      elevator0.toString();
      elevator0.timeShift();
      Elevator.DoorState elevator_DoorState0 = Elevator.DoorState.open;
      environment0.floors = null;
      Floor[] floorArray0 = new Floor[2];
      Floor floor0 = new Floor(environment0, 2147483645);
      floorArray0[0] = floor0;
      Elevator.Direction.values();
      Floor floor1 = new Floor(environment0, 0);
      floor1.callElevator();
      floorArray0[1] = floor1;
      environment0.floors = floorArray0;
      elevator0.doors = elevator_DoorState0;
      elevator0.toString();
      elevator0.timeShift();
      // Undeclared exception!
      try { 
        Elevator.Direction.valueOf("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No enum constant ElevatorSystem.Elevator.Direction.
         //
         verifyException("java.lang.Enum", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      int int0 = 0;
      Environment environment0 = new Environment(0);
      Elevator elevator0 = new Elevator(environment0, true);
      String string0 = "[Ei1S$WwE%5nRQU)";
      Floor[] floorArray0 = new Floor[1];
      Floor floor0 = new Floor(environment0, 0);
      floorArray0[0] = floor0;
      environment0.floors = floorArray0;
      // Undeclared exception!
      try { 
        elevator0.isIdle();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("ElevatorSystem.Elevator", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Environment environment0 = new Environment(344);
      Elevator elevator0 = new Elevator(environment0, true);
      Floor[] floorArray0 = new Floor[1];
      Environment environment1 = new Environment(344);
      Floor floor0 = new Floor(environment1, 344);
      floorArray0[0] = floor0;
      environment0.floors = floorArray0;
      elevator0.toString();
      elevator0.timeShift();
      Elevator.DoorState elevator_DoorState0 = Elevator.DoorState.open;
      Elevator.Direction.values();
      elevator0.doors = elevator_DoorState0;
      elevator0.toString();
      // Undeclared exception!
      try { 
        elevator0.timeShift();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("ElevatorSystem.Environment", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      int int0 = 390;
      Environment environment0 = new Environment(390);
      int int1 = 0;
      Elevator elevator0 = new Elevator(environment0, false, 0, false);
      elevator0.timeShift();
      elevator0.toString();
      elevator0.getCurrentDirection();
      Floor[] floorArray0 = new Floor[9];
      Floor floor0 = new Floor(environment0, 0);
      floorArray0[1] = floor0;
      // Undeclared exception!
      try { 
        environment0.getFloor((-3564));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -3564
         //
         verifyException("ElevatorSystem.Environment", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      int int0 = 390;
      Environment environment0 = new Environment(390);
      int int1 = 25;
      Elevator elevator0 = new Elevator(environment0, true, 25, true);
      elevator0.timeShift();
      elevator0.toString();
      elevator0.getCurrentDirection();
      Floor[] floorArray0 = new Floor[9];
      int int2 = (-3551);
      // Undeclared exception!
      try { 
        environment0.getFloor((-3551));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -3551
         //
         verifyException("ElevatorSystem.Environment", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Floor[] floorArray0 = new Floor[9];
      Environment environment0 = new Environment(1260);
      environment0.floors = floorArray0;
      Elevator elevator0 = new Elevator(environment0, false);
      // Undeclared exception!
      try { 
        elevator0.enterElevator((Person) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("ElevatorSystem.Elevator", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Environment environment0 = new Environment(344);
      Elevator elevator0 = new Elevator(environment0, true);
      Floor[] floorArray0 = null;
      environment0.floors = null;
      elevator0.toString();
      // Undeclared exception!
      try { 
        elevator0.timeShift();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("ElevatorSystem.Environment", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Floor[] floorArray0 = new Floor[8];
      Environment environment0 = new Environment(444);
      Elevator elevator0 = new Elevator(environment0, false, (-1), false);
      elevator0.getCurrentFloorID();
      elevator0.getCurrentFloorID();
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Environment environment0 = new Environment(344);
      Elevator elevator0 = new Elevator(environment0, true);
      elevator0.toString();
      elevator0.timeShift();
      elevator0.toString();
      elevator0.timeShift();
      // Undeclared exception!
      try { 
        Elevator.Direction.valueOf("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No enum constant ElevatorSystem.Elevator.Direction.
         //
         verifyException("java.lang.Enum", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Environment environment0 = new Environment(1135);
      Elevator elevator0 = new Elevator(environment0, true);
      elevator0.timeShift();
      Person person0 = new Person("*!mN#ZK0d^(&(93{R", 1, 1, 0, environment0);
      elevator0.leaveElevator(person0);
      elevator0.getCurrentFloorID();
      elevator0.getEnv();
      elevator0.getCurrentFloorID();
      elevator0.isBlocked();
      Person person1 = null;
      try {
        person1 = new Person("", 0, (-1), (-2483), environment0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("ElevatorSystem.Environment", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Elevator.Direction.values();
      Environment environment0 = new Environment(2671);
      Elevator elevator0 = new Elevator(environment0, true);
      elevator0.toString();
      Floor[] floorArray0 = new Floor[0];
      environment0.floors = floorArray0;
      environment0.floors = floorArray0;
      elevator0.verbose = false;
      elevator0.verbose = false;
      environment0.floors = floorArray0;
      elevator0.buttonForFloorIsPressed(0);
      elevator0.areDoorsOpen();
      Elevator.Direction elevator_Direction0 = Elevator.Direction.up;
      elevator_Direction0.reverse();
      environment0.floors = floorArray0;
      elevator_Direction0.reverse();
      // Undeclared exception!
      try { 
        Elevator.Direction.valueOf("Elevator [_] at 0 heading up");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No enum constant ElevatorSystem.Elevator.Direction.Elevator [_] at 0 heading up
         //
         verifyException("java.lang.Enum", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Environment environment0 = new Environment(1);
      Elevator elevator0 = new Elevator(environment0, true);
      int int0 = 0;
      elevator0.toString();
      Person person0 = new Person("", 1, 0, 1, environment0);
      person0.leaveElevator();
      person0.leaveElevator();
      person0.leaveElevator();
      person0.leaveElevator();
      person0.leaveElevator();
      // Undeclared exception!
      try { 
        elevator0.enterElevator(person0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("ElevatorSystem.Elevator", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      int int0 = 390;
      Environment environment0 = new Environment(390);
      int int1 = 0;
      Elevator elevator0 = new Elevator(environment0, true, 0, true);
      elevator0.timeShift();
      elevator0.toString();
      elevator0.getCurrentDirection();
      Floor[] floorArray0 = new Floor[9];
      int int2 = (-3551);
      // Undeclared exception!
      try { 
        environment0.getFloor((-3551));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -3551
         //
         verifyException("ElevatorSystem.Environment", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      int int0 = 1390;
      Environment environment0 = new Environment(1390);
      assertNotNull(environment0);
      
      Elevator elevator0 = new Elevator(environment0, false);
      assertNotNull(elevator0);
      assertFalse(elevator0.isBlocked());
      assertEquals(0, elevator0.getCurrentFloorID());
      assertTrue(elevator0.areDoorsOpen());
      assertEquals(Elevator.Direction.up, elevator0.getCurrentDirection());
      assertTrue(elevator0.isEmpty());
      
      elevator0.timeShift();
      assertFalse(elevator0.isBlocked());
      assertFalse(elevator0.areDoorsOpen());
      assertEquals(1, elevator0.getCurrentFloorID());
      assertEquals(Elevator.Direction.up, elevator0.getCurrentDirection());
      assertTrue(elevator0.isEmpty());
      
      boolean boolean0 = elevator0.areDoorsOpen();
      assertFalse(boolean0);
      assertFalse(elevator0.isBlocked());
      assertFalse(elevator0.areDoorsOpen());
      assertEquals(1, elevator0.getCurrentFloorID());
      assertEquals(Elevator.Direction.up, elevator0.getCurrentDirection());
      assertTrue(elevator0.isEmpty());
      
      String string0 = "_TBS{>";
      // Undeclared exception!
      try { 
        Elevator.Direction.valueOf("_TBS{>");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No enum constant ElevatorSystem.Elevator.Direction._TBS{>
         //
         verifyException("java.lang.Enum", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      int int0 = 1995;
      Environment environment0 = new Environment(1995);
      assertNotNull(environment0);
      
      Elevator elevator0 = new Elevator(environment0, false);
      assertNotNull(elevator0);
      assertFalse(elevator0.isBlocked());
      assertTrue(elevator0.isEmpty());
      assertEquals(Elevator.Direction.up, elevator0.getCurrentDirection());
      assertTrue(elevator0.areDoorsOpen());
      assertEquals(0, elevator0.getCurrentFloorID());
      
      boolean boolean0 = elevator0.isBlocked();
      assertFalse(boolean0);
      assertFalse(elevator0.isBlocked());
      assertTrue(elevator0.isEmpty());
      assertEquals(Elevator.Direction.up, elevator0.getCurrentDirection());
      assertTrue(elevator0.areDoorsOpen());
      assertEquals(0, elevator0.getCurrentFloorID());
      
      Floor[] floorArray0 = new Floor[3];
      Floor floor0 = new Floor(environment0, 1995);
      assertNotNull(floor0);
      assertEquals(1995, floor0.getFloorID());
      
      floorArray0[0] = floor0;
      Floor floor1 = new Floor(environment0, (-3982));
      assertFalse(floor1.equals((Object)floor0));
      assertNotNull(floor1);
      assertEquals((-3982), floor1.getFloorID());
      
      floorArray0[1] = floor1;
      Floor floor2 = environment0.getFloor(1);
      assertFalse(floor2.equals((Object)floor0));
      assertFalse(floor2.equals((Object)floor1));
      assertNotNull(floor2);
      assertEquals(1, floor2.getFloorID());
      assertNotSame(floor2, floor0);
      assertNotSame(floor2, floor1);
      
      floorArray0[2] = floor2;
      environment0.floors = floorArray0;
      Floor[] floorArray1 = new Floor[0];
      assertFalse(floorArray1.equals((Object)floorArray0));
      
      environment0.floors = floorArray1;
      // Undeclared exception!
      try { 
        Elevator.Direction.valueOf("k?3{v6M3-bO'khr_H");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No enum constant ElevatorSystem.Elevator.Direction.k?3{v6M3-bO'khr_H
         //
         verifyException("java.lang.Enum", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Environment environment0 = new Environment(186);
      assertNotNull(environment0);
      
      Elevator elevator0 = new Elevator(environment0, false);
      assertNotNull(elevator0);
      assertEquals(Elevator.Direction.up, elevator0.getCurrentDirection());
      assertTrue(elevator0.areDoorsOpen());
      assertFalse(elevator0.isBlocked());
      assertEquals(0, elevator0.getCurrentFloorID());
      assertTrue(elevator0.isEmpty());
      
      int int0 = elevator0.getCurrentFloorID();
      assertEquals(0, int0);
      assertEquals(Elevator.Direction.up, elevator0.getCurrentDirection());
      assertTrue(elevator0.areDoorsOpen());
      assertFalse(elevator0.isBlocked());
      assertEquals(0, elevator0.getCurrentFloorID());
      assertTrue(elevator0.isEmpty());
      
      elevator0.timeShift();
      assertEquals(Elevator.Direction.up, elevator0.getCurrentDirection());
      assertFalse(elevator0.isBlocked());
      assertFalse(elevator0.areDoorsOpen());
      assertEquals(1, elevator0.getCurrentFloorID());
      assertTrue(elevator0.isEmpty());
      
      boolean boolean0 = elevator0.buttonForFloorIsPressed(0);
      assertFalse(boolean0);
      assertEquals(Elevator.Direction.up, elevator0.getCurrentDirection());
      assertFalse(elevator0.isBlocked());
      assertFalse(elevator0.areDoorsOpen());
      assertEquals(1, elevator0.getCurrentFloorID());
      assertTrue(elevator0.isEmpty());
      
      boolean boolean1 = elevator0.areDoorsOpen();
      assertTrue(boolean1 == boolean0);
      assertFalse(boolean1);
      assertEquals(Elevator.Direction.up, elevator0.getCurrentDirection());
      assertFalse(elevator0.isBlocked());
      assertFalse(elevator0.areDoorsOpen());
      assertEquals(1, elevator0.getCurrentFloorID());
      assertTrue(elevator0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Environment environment0 = new Environment(2868);
      assertNotNull(environment0);
      
      Floor[] floorArray0 = new Floor[1];
      Floor floor0 = new Floor(environment0, 2868);
      assertNotNull(floor0);
      assertEquals(2868, floor0.getFloorID());
      
      floorArray0[0] = floor0;
      floor0.callElevator();
      assertEquals(2868, floor0.getFloorID());
      
      environment0.floors = floorArray0;
      Elevator elevator0 = new Elevator(environment0, false);
      assertNotNull(elevator0);
      assertFalse(elevator0.isBlocked());
      assertTrue(elevator0.areDoorsOpen());
      assertEquals(0, elevator0.getCurrentFloorID());
      assertEquals(Elevator.Direction.up, elevator0.getCurrentDirection());
      assertTrue(elevator0.isEmpty());
      
      Elevator.DoorState elevator_DoorState0 = Elevator.DoorState.open;
      boolean boolean0 = elevator0.isIdle();
      assertFalse(boolean0);
      assertFalse(elevator0.isBlocked());
      assertTrue(elevator0.areDoorsOpen());
      assertEquals(0, elevator0.getCurrentFloorID());
      assertEquals(Elevator.Direction.up, elevator0.getCurrentDirection());
      assertTrue(elevator0.isEmpty());
      
      elevator0.doors = elevator_DoorState0;
      assertFalse(elevator0.isBlocked());
      assertTrue(elevator0.areDoorsOpen());
      assertEquals(0, elevator0.getCurrentFloorID());
      assertEquals(Elevator.Direction.up, elevator0.getCurrentDirection());
      assertTrue(elevator0.isEmpty());
      
      elevator0.getCurrentDirection();
      assertFalse(elevator0.isBlocked());
      assertTrue(elevator0.areDoorsOpen());
      assertEquals(0, elevator0.getCurrentFloorID());
      assertEquals(Elevator.Direction.up, elevator0.getCurrentDirection());
      assertTrue(elevator0.isEmpty());
      
      // Undeclared exception!
      try { 
        Elevator.Direction.valueOf("ElevatorSystem.Environment");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No enum constant ElevatorSystem.Elevator.Direction.ElevatorSystem.Environment
         //
         verifyException("java.lang.Enum", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      int int0 = 4667;
      Environment environment0 = new Environment(4667);
      assertNotNull(environment0);
      
      Elevator elevator0 = new Elevator(environment0, true);
      assertNotNull(elevator0);
      assertTrue(elevator0.isEmpty());
      assertEquals(Elevator.Direction.up, elevator0.getCurrentDirection());
      assertFalse(elevator0.isBlocked());
      assertEquals(0, elevator0.getCurrentFloorID());
      assertTrue(elevator0.areDoorsOpen());
      
      boolean boolean0 = elevator0.areDoorsOpen();
      assertTrue(boolean0);
      assertTrue(elevator0.isEmpty());
      assertEquals(Elevator.Direction.up, elevator0.getCurrentDirection());
      assertFalse(elevator0.isBlocked());
      assertEquals(0, elevator0.getCurrentFloorID());
      assertTrue(elevator0.areDoorsOpen());
      
      elevator0.timeShift();
      assertTrue(elevator0.isEmpty());
      assertFalse(elevator0.areDoorsOpen());
      assertEquals(Elevator.Direction.up, elevator0.getCurrentDirection());
      assertFalse(elevator0.isBlocked());
      assertEquals(1, elevator0.getCurrentFloorID());
      
      int int1 = (-516);
      // Undeclared exception!
      try { 
        elevator0.pressInLiftFloorButton((-516));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -516
         //
         verifyException("ElevatorSystem.Elevator", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Environment environment0 = new Environment(0);
      assertNotNull(environment0);
      
      Elevator elevator0 = new Elevator(environment0, true, 0, true);
      assertNotNull(elevator0);
      assertTrue(elevator0.isEmpty());
      assertEquals(0, elevator0.getCurrentFloorID());
      assertEquals(Elevator.Direction.up, elevator0.getCurrentDirection());
      assertTrue(elevator0.areDoorsOpen());
      assertFalse(elevator0.isBlocked());
      
      environment0.floors = null;
      String string0 = elevator0.toString();
      assertEquals("Elevator [_] at 0 heading up", string0);
      assertNotNull(string0);
      assertTrue(elevator0.isEmpty());
      assertEquals(0, elevator0.getCurrentFloorID());
      assertEquals(Elevator.Direction.up, elevator0.getCurrentDirection());
      assertTrue(elevator0.areDoorsOpen());
      assertFalse(elevator0.isBlocked());
      
      elevator0.getCurrentDirection();
      assertTrue(elevator0.isEmpty());
      assertEquals(0, elevator0.getCurrentFloorID());
      assertEquals(Elevator.Direction.up, elevator0.getCurrentDirection());
      assertTrue(elevator0.areDoorsOpen());
      assertFalse(elevator0.isBlocked());
      
      Person person0 = null;
      try {
        person0 = new Person("a{rs]BI\"X=", 0, 0, 0, environment0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("ElevatorSystem.Environment", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Environment environment0 = new Environment(0);
      assertNotNull(environment0);
      
      Elevator elevator0 = new Elevator(environment0, true);
      assertNotNull(elevator0);
      assertEquals(Elevator.Direction.up, elevator0.getCurrentDirection());
      assertTrue(elevator0.areDoorsOpen());
      assertEquals(0, elevator0.getCurrentFloorID());
      assertTrue(elevator0.isEmpty());
      assertFalse(elevator0.isBlocked());
      
      String string0 = elevator0.toString();
      assertEquals("Elevator [_] at 0 heading up", string0);
      assertNotNull(string0);
      assertEquals(Elevator.Direction.up, elevator0.getCurrentDirection());
      assertTrue(elevator0.areDoorsOpen());
      assertEquals(0, elevator0.getCurrentFloorID());
      assertTrue(elevator0.isEmpty());
      assertFalse(elevator0.isBlocked());
      
      Elevator.Direction[] elevator_DirectionArray0 = Elevator.Direction.values();
      assertEquals(2, elevator_DirectionArray0.length);
      assertNotNull(elevator_DirectionArray0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Environment environment0 = new Environment(0);
      assertNotNull(environment0);
      
      Elevator elevator0 = new Elevator(environment0, false);
      assertNotNull(elevator0);
      assertEquals(Elevator.Direction.up, elevator0.getCurrentDirection());
      assertTrue(elevator0.areDoorsOpen());
      assertEquals(0, elevator0.getCurrentFloorID());
      assertTrue(elevator0.isEmpty());
      assertFalse(elevator0.isBlocked());
      
      // Undeclared exception!
      try { 
        elevator0.timeShift();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("ElevatorSystem.Environment", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Elevator.Direction elevator_Direction0 = Elevator.Direction.down;
      Elevator.Direction elevator_Direction1 = elevator_Direction0.reverse();
      assertFalse(elevator_Direction1.equals((Object)elevator_Direction0));
      
      Elevator.Direction elevator_Direction2 = elevator_Direction0.reverse();
      assertFalse(elevator_Direction0.equals((Object)elevator_Direction1));
      assertFalse(elevator_Direction2.equals((Object)elevator_Direction0));
      assertSame(elevator_Direction2, elevator_Direction1);
      
      Elevator.Direction elevator_Direction3 = elevator_Direction0.reverse();
      assertFalse(elevator_Direction0.equals((Object)elevator_Direction2));
      assertFalse(elevator_Direction0.equals((Object)elevator_Direction1));
      assertFalse(elevator_Direction3.equals((Object)elevator_Direction0));
      assertSame(elevator_Direction3, elevator_Direction1);
      assertSame(elevator_Direction3, elevator_Direction2);
      
      Elevator.Direction elevator_Direction4 = elevator_Direction3.reverse();
      assertFalse(elevator_Direction0.equals((Object)elevator_Direction2));
      assertFalse(elevator_Direction0.equals((Object)elevator_Direction3));
      assertFalse(elevator_Direction0.equals((Object)elevator_Direction1));
      assertFalse(elevator_Direction3.equals((Object)elevator_Direction0));
      assertFalse(elevator_Direction4.equals((Object)elevator_Direction3));
      assertFalse(elevator_Direction4.equals((Object)elevator_Direction2));
      assertFalse(elevator_Direction4.equals((Object)elevator_Direction1));
      assertSame(elevator_Direction0, elevator_Direction4);
      assertSame(elevator_Direction3, elevator_Direction1);
      assertSame(elevator_Direction3, elevator_Direction2);
      assertSame(elevator_Direction4, elevator_Direction0);
      
      Elevator.Direction elevator_Direction5 = elevator_Direction3.reverse();
      assertFalse(elevator_Direction0.equals((Object)elevator_Direction2));
      assertFalse(elevator_Direction0.equals((Object)elevator_Direction3));
      assertFalse(elevator_Direction0.equals((Object)elevator_Direction1));
      assertFalse(elevator_Direction3.equals((Object)elevator_Direction0));
      assertFalse(elevator_Direction3.equals((Object)elevator_Direction4));
      assertFalse(elevator_Direction5.equals((Object)elevator_Direction3));
      assertFalse(elevator_Direction5.equals((Object)elevator_Direction2));
      assertFalse(elevator_Direction5.equals((Object)elevator_Direction1));
      assertSame(elevator_Direction0, elevator_Direction4);
      assertSame(elevator_Direction0, elevator_Direction5);
      assertSame(elevator_Direction3, elevator_Direction1);
      assertSame(elevator_Direction3, elevator_Direction2);
      assertSame(elevator_Direction5, elevator_Direction4);
      assertSame(elevator_Direction5, elevator_Direction0);
      
      // Undeclared exception!
      try { 
        Elevator.Direction.valueOf("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No enum constant ElevatorSystem.Elevator.Direction.
         //
         verifyException("java.lang.Enum", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Environment environment0 = new Environment(1);
      assertNotNull(environment0);
      
      Elevator elevator0 = new Elevator(environment0, false, 1, false);
      assertNotNull(elevator0);
      assertTrue(elevator0.areDoorsOpen());
      assertEquals(1, elevator0.getCurrentFloorID());
      assertEquals(Elevator.Direction.down, elevator0.getCurrentDirection());
      assertFalse(elevator0.isBlocked());
      assertTrue(elevator0.isEmpty());
      
      boolean boolean0 = elevator0.isIdle();
      assertTrue(boolean0);
      assertTrue(elevator0.areDoorsOpen());
      assertEquals(1, elevator0.getCurrentFloorID());
      assertEquals(Elevator.Direction.down, elevator0.getCurrentDirection());
      assertFalse(elevator0.isBlocked());
      assertTrue(elevator0.isEmpty());
      
      // Undeclared exception!
      try { 
        elevator0.buttonForFloorIsPressed(15);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 15
         //
         verifyException("ElevatorSystem.Elevator", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Environment environment0 = new Environment(0);
      assertNotNull(environment0);
      
      Elevator elevator0 = new Elevator(environment0, false, 509, false);
      assertNotNull(elevator0);
      assertFalse(elevator0.isBlocked());
      assertEquals(Elevator.Direction.down, elevator0.getCurrentDirection());
      assertTrue(elevator0.areDoorsOpen());
      assertEquals(509, elevator0.getCurrentFloorID());
      assertTrue(elevator0.isEmpty());
      
      boolean boolean0 = elevator0.isIdle();
      assertTrue(boolean0);
      assertFalse(elevator0.isBlocked());
      assertEquals(Elevator.Direction.down, elevator0.getCurrentDirection());
      assertTrue(elevator0.areDoorsOpen());
      assertEquals(509, elevator0.getCurrentFloorID());
      assertTrue(elevator0.isEmpty());
      
      Environment environment1 = new Environment(3099);
      assertFalse(environment1.equals((Object)environment0));
      assertNotNull(environment1);
      
      Person person0 = new Person("ElevatorSystem.Person", 509, 0, 353, environment1);
      assertFalse(environment1.equals((Object)environment0));
      assertNotNull(person0);
      assertEquals(0, person0.getOrigin());
      assertEquals(353, person0.getDestination());
      assertFalse(person0.isDestinationReached());
      assertEquals(509, person0.getWeight());
      assertEquals("ElevatorSystem.Person", person0.getName());
      
      boolean boolean1 = elevator0.leaveElevator(person0);
      assertFalse(environment0.equals((Object)environment1));
      assertFalse(environment1.equals((Object)environment0));
      assertFalse(boolean1 == boolean0);
      assertFalse(boolean1);
      assertFalse(elevator0.isBlocked());
      assertEquals(Elevator.Direction.down, elevator0.getCurrentDirection());
      assertTrue(elevator0.areDoorsOpen());
      assertEquals(509, elevator0.getCurrentFloorID());
      assertTrue(elevator0.isEmpty());
      assertEquals(0, person0.getOrigin());
      assertEquals(353, person0.getDestination());
      assertFalse(person0.isDestinationReached());
      assertEquals(509, person0.getWeight());
      assertEquals("ElevatorSystem.Person", person0.getName());
      assertNotSame(environment0, environment1);
      assertNotSame(environment1, environment0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Environment environment0 = new Environment(775);
      assertNotNull(environment0);
      
      Elevator elevator0 = new Elevator(environment0, false);
      assertNotNull(elevator0);
      assertTrue(elevator0.areDoorsOpen());
      assertFalse(elevator0.isBlocked());
      assertEquals(0, elevator0.getCurrentFloorID());
      assertTrue(elevator0.isEmpty());
      assertEquals(Elevator.Direction.up, elevator0.getCurrentDirection());
      
      // Undeclared exception!
      try { 
        elevator0.buttonForFloorIsPressed(775);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 775
         //
         verifyException("ElevatorSystem.Elevator", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Environment environment0 = new Environment(2972);
      assertNotNull(environment0);
      
      Floor[] floorArray0 = null;
      environment0.floors = null;
      Elevator elevator0 = null;
      try {
        elevator0 = new Elevator(environment0, true, 2972, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("ElevatorSystem.Elevator", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Elevator elevator0 = null;
      try {
        elevator0 = new Elevator((Environment) null, false, 1971, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("ElevatorSystem.Elevator", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Environment environment0 = new Environment(0);
      assertNotNull(environment0);
      
      Elevator elevator0 = new Elevator(environment0, false);
      assertNotNull(elevator0);
      assertTrue(elevator0.areDoorsOpen());
      assertEquals(Elevator.Direction.up, elevator0.getCurrentDirection());
      assertEquals(0, elevator0.getCurrentFloorID());
      assertFalse(elevator0.isBlocked());
      assertTrue(elevator0.isEmpty());
      
      Environment environment1 = elevator0.getEnv();
      assertNotNull(environment1);
      assertTrue(elevator0.areDoorsOpen());
      assertEquals(Elevator.Direction.up, elevator0.getCurrentDirection());
      assertEquals(0, elevator0.getCurrentFloorID());
      assertFalse(elevator0.isBlocked());
      assertTrue(elevator0.isEmpty());
      assertSame(environment0, environment1);
      assertSame(environment1, environment0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      int int0 = 2306;
      Environment environment0 = new Environment(2306);
      assertNotNull(environment0);
      
      Floor[] floorArray0 = null;
      environment0.floors = null;
      environment0.floors = null;
      environment0.floors = null;
      Elevator elevator0 = null;
      try {
        elevator0 = new Elevator(environment0, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("ElevatorSystem.Elevator", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Environment environment0 = new Environment(344);
      assertNotNull(environment0);
      
      Elevator elevator0 = new Elevator(environment0, true);
      assertNotNull(elevator0);
      assertEquals(0, elevator0.getCurrentFloorID());
      assertTrue(elevator0.isEmpty());
      assertEquals(Elevator.Direction.up, elevator0.getCurrentDirection());
      assertTrue(elevator0.areDoorsOpen());
      assertFalse(elevator0.isBlocked());
      
      String string0 = elevator0.toString();
      assertEquals("Elevator [_] at 0 heading up", string0);
      assertNotNull(string0);
      assertEquals(0, elevator0.getCurrentFloorID());
      assertTrue(elevator0.isEmpty());
      assertEquals(Elevator.Direction.up, elevator0.getCurrentDirection());
      assertTrue(elevator0.areDoorsOpen());
      assertFalse(elevator0.isBlocked());
      
      elevator0.timeShift();
      assertEquals(1, elevator0.getCurrentFloorID());
      assertFalse(elevator0.areDoorsOpen());
      assertTrue(elevator0.isEmpty());
      assertEquals(Elevator.Direction.up, elevator0.getCurrentDirection());
      assertFalse(elevator0.isBlocked());
      
      Elevator.DoorState elevator_DoorState0 = Elevator.DoorState.open;
      environment0.floors = null;
      Floor[] floorArray0 = new Floor[2];
      Floor floor0 = new Floor(environment0, (-1));
      assertNotNull(floor0);
      assertEquals((-1), floor0.getFloorID());
      
      floorArray0[0] = floor0;
      boolean[] booleanArray0 = new boolean[5];
      booleanArray0[0] = true;
      booleanArray0[1] = true;
      booleanArray0[2] = true;
      booleanArray0[3] = true;
      booleanArray0[4] = true;
      elevator0.floorButtons = booleanArray0;
      assertEquals(1, elevator0.getCurrentFloorID());
      assertFalse(elevator0.areDoorsOpen());
      assertTrue(elevator0.isEmpty());
      assertEquals(Elevator.Direction.up, elevator0.getCurrentDirection());
      assertFalse(elevator0.isBlocked());
      
      Elevator.Direction[] elevator_DirectionArray0 = Elevator.Direction.values();
      assertEquals(2, elevator_DirectionArray0.length);
      assertNotNull(elevator_DirectionArray0);
      
      Floor floor1 = new Floor(environment0, 0);
      assertFalse(floor1.equals((Object)floor0));
      assertNotNull(floor1);
      assertEquals(0, floor1.getFloorID());
      
      floorArray0[1] = floor1;
      environment0.floors = floorArray0;
      elevator0.doors = elevator_DoorState0;
      assertEquals(1, elevator0.getCurrentFloorID());
      assertTrue(elevator0.isEmpty());
      assertEquals(Elevator.Direction.up, elevator0.getCurrentDirection());
      assertTrue(elevator0.areDoorsOpen());
      assertFalse(elevator0.isBlocked());
      
      String string1 = elevator0.toString();
      assertFalse(string1.equals((Object)string0));
      assertEquals("Elevator [_] at 1 heading up", string1);
      assertNotNull(string1);
      assertEquals(1, elevator0.getCurrentFloorID());
      assertTrue(elevator0.isEmpty());
      assertEquals(Elevator.Direction.up, elevator0.getCurrentDirection());
      assertTrue(elevator0.areDoorsOpen());
      assertFalse(elevator0.isBlocked());
      
      elevator0.timeShift();
      assertEquals(1, elevator0.getCurrentFloorID());
      assertTrue(elevator0.isEmpty());
      assertEquals(Elevator.Direction.up, elevator0.getCurrentDirection());
      assertTrue(elevator0.areDoorsOpen());
      assertFalse(elevator0.isBlocked());
      
      Elevator.Direction elevator_Direction0 = elevator0.currentHeading;
      elevator0.timeShift();
      assertFalse(elevator0.areDoorsOpen());
      assertEquals(0, elevator0.getCurrentFloorID());
      assertTrue(elevator0.isEmpty());
      assertEquals(Elevator.Direction.down, elevator0.getCurrentDirection());
      assertFalse(elevator0.isBlocked());
      
      Elevator.Direction[] elevator_DirectionArray1 = Elevator.Direction.values();
      assertEquals(2, elevator_DirectionArray1.length);
      assertFalse(elevator_DirectionArray1.equals((Object)elevator_DirectionArray0));
      assertNotNull(elevator_DirectionArray1);
      assertNotSame(elevator_DirectionArray1, elevator_DirectionArray0);
      
      Elevator.Direction elevator_Direction1 = elevator_Direction0.reverse();
      assertFalse(elevator_Direction1.equals((Object)elevator_Direction0));
      assertFalse(elevator0.areDoorsOpen());
      assertEquals(0, elevator0.getCurrentFloorID());
      assertTrue(elevator0.isEmpty());
      assertEquals(Elevator.Direction.down, elevator0.getCurrentDirection());
      assertFalse(elevator0.isBlocked());
      
      String string2 = elevator0.toString();
      assertFalse(string2.equals((Object)string0));
      assertFalse(string2.equals((Object)string1));
      assertEquals("Elevator []  at 0 heading down", string2);
      assertNotNull(string2);
      assertFalse(elevator0.areDoorsOpen());
      assertEquals(0, elevator0.getCurrentFloorID());
      assertTrue(elevator0.isEmpty());
      assertEquals(Elevator.Direction.down, elevator0.getCurrentDirection());
      assertFalse(elevator0.isBlocked());
      
      // Undeclared exception!
      try { 
        Elevator.DoorState.valueOf("Elevator [_] at 1 heading up");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No enum constant ElevatorSystem.Elevator.DoorState.Elevator [_] at 1 heading up
         //
         verifyException("java.lang.Enum", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Environment environment0 = new Environment(0);
      assertNotNull(environment0);
      
      Elevator elevator0 = new Elevator(environment0, true, 0, true);
      assertNotNull(elevator0);
      assertFalse(elevator0.isBlocked());
      assertTrue(elevator0.isEmpty());
      assertEquals(Elevator.Direction.up, elevator0.getCurrentDirection());
      assertEquals(0, elevator0.getCurrentFloorID());
      assertTrue(elevator0.areDoorsOpen());
      
      boolean[] booleanArray0 = new boolean[4];
      booleanArray0[0] = true;
      booleanArray0[1] = true;
      Floor[] floorArray0 = new Floor[1];
      Floor floor0 = new Floor(environment0, 0);
      assertNotNull(floor0);
      assertEquals(0, floor0.getFloorID());
      
      floorArray0[0] = floor0;
      environment0.floors = floorArray0;
      booleanArray0[2] = false;
      booleanArray0[3] = true;
      elevator0.floorButtons = booleanArray0;
      assertFalse(elevator0.isBlocked());
      assertTrue(elevator0.isEmpty());
      assertEquals(Elevator.Direction.up, elevator0.getCurrentDirection());
      assertEquals(0, elevator0.getCurrentFloorID());
      assertTrue(elevator0.areDoorsOpen());
      
      Elevator.DoorState elevator_DoorState0 = Elevator.DoorState.open;
      elevator0.doors = elevator_DoorState0;
      assertFalse(elevator0.isBlocked());
      assertTrue(elevator0.isEmpty());
      assertEquals(Elevator.Direction.up, elevator0.getCurrentDirection());
      assertEquals(0, elevator0.getCurrentFloorID());
      assertTrue(elevator0.areDoorsOpen());
      
      elevator0.pressInLiftFloorButton(1);
      assertFalse(elevator0.isBlocked());
      assertTrue(elevator0.isEmpty());
      assertEquals(Elevator.Direction.up, elevator0.getCurrentDirection());
      assertEquals(0, elevator0.getCurrentFloorID());
      assertTrue(elevator0.areDoorsOpen());
      
      elevator0.pressInLiftFloorButton(1);
      assertFalse(elevator0.isBlocked());
      assertTrue(elevator0.isEmpty());
      assertEquals(Elevator.Direction.up, elevator0.getCurrentDirection());
      assertEquals(0, elevator0.getCurrentFloorID());
      assertTrue(elevator0.areDoorsOpen());
      
      Elevator.Direction elevator_Direction0 = elevator0.currentHeading;
      Elevator.Direction elevator_Direction1 = elevator_Direction0.reverse();
      assertFalse(elevator_Direction1.equals((Object)elevator_Direction0));
      assertFalse(elevator0.isBlocked());
      assertTrue(elevator0.isEmpty());
      assertEquals(Elevator.Direction.up, elevator0.getCurrentDirection());
      assertEquals(0, elevator0.getCurrentFloorID());
      assertTrue(elevator0.areDoorsOpen());
      
      boolean boolean0 = elevator0.isIdle();
      assertFalse(boolean0);
      assertFalse(elevator0.isBlocked());
      assertTrue(elevator0.isEmpty());
      assertEquals(Elevator.Direction.up, elevator0.getCurrentDirection());
      assertEquals(0, elevator0.getCurrentFloorID());
      assertTrue(elevator0.areDoorsOpen());
      
      boolean boolean1 = elevator0.areDoorsOpen();
      assertFalse(boolean1 == boolean0);
      assertTrue(boolean1);
      assertFalse(elevator0.isBlocked());
      assertTrue(elevator0.isEmpty());
      assertEquals(Elevator.Direction.up, elevator0.getCurrentDirection());
      assertEquals(0, elevator0.getCurrentFloorID());
      assertTrue(elevator0.areDoorsOpen());
      
      int int0 = elevator0.getCurrentFloorID();
      assertEquals(0, int0);
      assertFalse(elevator0.isBlocked());
      assertTrue(elevator0.isEmpty());
      assertEquals(Elevator.Direction.up, elevator0.getCurrentDirection());
      assertEquals(0, elevator0.getCurrentFloorID());
      assertTrue(elevator0.areDoorsOpen());
      
      boolean boolean2 = elevator0.isEmpty();
      assertTrue(boolean2 == boolean1);
      assertFalse(boolean2 == boolean0);
      assertTrue(boolean2);
      assertFalse(elevator0.isBlocked());
      assertTrue(elevator0.isEmpty());
      assertEquals(Elevator.Direction.up, elevator0.getCurrentDirection());
      assertEquals(0, elevator0.getCurrentFloorID());
      assertTrue(elevator0.areDoorsOpen());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Environment environment0 = new Environment(344);
      assertNotNull(environment0);
      
      Elevator elevator0 = new Elevator(environment0, true);
      assertNotNull(elevator0);
      assertTrue(elevator0.isEmpty());
      assertEquals(Elevator.Direction.up, elevator0.getCurrentDirection());
      assertEquals(0, elevator0.getCurrentFloorID());
      assertFalse(elevator0.isBlocked());
      assertTrue(elevator0.areDoorsOpen());
      
      Person person0 = new Person("p", 344, 0, 1, environment0);
      assertNotNull(person0);
      assertEquals(1, person0.getDestination());
      assertEquals(0, person0.getOrigin());
      assertEquals("p", person0.getName());
      assertFalse(person0.isDestinationReached());
      assertEquals(344, person0.getWeight());
      
      boolean boolean0 = elevator0.leaveElevator(person0);
      assertFalse(boolean0);
      assertTrue(elevator0.isEmpty());
      assertEquals(Elevator.Direction.up, elevator0.getCurrentDirection());
      assertEquals(0, elevator0.getCurrentFloorID());
      assertFalse(elevator0.isBlocked());
      assertTrue(elevator0.areDoorsOpen());
      assertEquals(1, person0.getDestination());
      assertEquals(0, person0.getOrigin());
      assertEquals("p", person0.getName());
      assertFalse(person0.isDestinationReached());
      assertEquals(344, person0.getWeight());
      
      String string0 = elevator0.toString();
      assertEquals("Elevator [_] at 0 heading up", string0);
      assertNotNull(string0);
      assertTrue(elevator0.isEmpty());
      assertEquals(Elevator.Direction.up, elevator0.getCurrentDirection());
      assertEquals(0, elevator0.getCurrentFloorID());
      assertFalse(elevator0.isBlocked());
      assertTrue(elevator0.areDoorsOpen());
      
      boolean boolean1 = elevator0.isIdle();
      assertTrue(boolean1 == boolean0);
      assertFalse(boolean1);
      assertTrue(elevator0.isEmpty());
      assertEquals(Elevator.Direction.up, elevator0.getCurrentDirection());
      assertEquals(0, elevator0.getCurrentFloorID());
      assertFalse(elevator0.isBlocked());
      assertTrue(elevator0.areDoorsOpen());
      
      elevator0.timeShift();
      assertFalse(elevator0.isEmpty());
      assertEquals(Elevator.Direction.up, elevator0.getCurrentDirection());
      assertEquals(0, elevator0.getCurrentFloorID());
      assertFalse(elevator0.isBlocked());
      assertTrue(elevator0.areDoorsOpen());
      
      elevator0.timeShift();
      assertFalse(elevator0.areDoorsOpen());
      assertFalse(elevator0.isEmpty());
      assertEquals(Elevator.Direction.up, elevator0.getCurrentDirection());
      assertEquals(1, elevator0.getCurrentFloorID());
      assertFalse(elevator0.isBlocked());
      
      String string1 = elevator0.toString();
      assertFalse(string1.equals((Object)string0));
      assertEquals("Elevator []  at 1 heading up", string1);
      assertNotNull(string1);
      assertFalse(elevator0.areDoorsOpen());
      assertFalse(elevator0.isEmpty());
      assertEquals(Elevator.Direction.up, elevator0.getCurrentDirection());
      assertEquals(1, elevator0.getCurrentFloorID());
      assertFalse(elevator0.isBlocked());
      
      elevator0.timeShift();
      assertTrue(elevator0.isEmpty());
      assertEquals(Elevator.Direction.up, elevator0.getCurrentDirection());
      assertEquals(1, elevator0.getCurrentFloorID());
      assertFalse(elevator0.isBlocked());
      assertTrue(elevator0.areDoorsOpen());
      
      // Undeclared exception!
      try { 
        Elevator.Direction.valueOf("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No enum constant ElevatorSystem.Elevator.Direction.
         //
         verifyException("java.lang.Enum", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Environment environment0 = new Environment(344);
      assertNotNull(environment0);
      
      Elevator elevator0 = new Elevator(environment0, true);
      assertNotNull(elevator0);
      assertTrue(elevator0.areDoorsOpen());
      assertFalse(elevator0.isBlocked());
      assertTrue(elevator0.isEmpty());
      assertEquals(0, elevator0.getCurrentFloorID());
      assertEquals(Elevator.Direction.up, elevator0.getCurrentDirection());
      
      String string0 = elevator0.toString();
      assertEquals("Elevator [_] at 0 heading up", string0);
      assertNotNull(string0);
      assertTrue(elevator0.areDoorsOpen());
      assertFalse(elevator0.isBlocked());
      assertTrue(elevator0.isEmpty());
      assertEquals(0, elevator0.getCurrentFloorID());
      assertEquals(Elevator.Direction.up, elevator0.getCurrentDirection());
      
      elevator0.timeShift();
      assertFalse(elevator0.areDoorsOpen());
      assertEquals(1, elevator0.getCurrentFloorID());
      assertFalse(elevator0.isBlocked());
      assertTrue(elevator0.isEmpty());
      assertEquals(Elevator.Direction.up, elevator0.getCurrentDirection());
      
      Elevator.DoorState elevator_DoorState0 = Elevator.DoorState.open;
      environment0.floors = null;
      Floor[] floorArray0 = new Floor[2];
      Floor floor0 = new Floor(environment0, (-1));
      assertNotNull(floor0);
      assertEquals((-1), floor0.getFloorID());
      
      floorArray0[0] = floor0;
      floor0.callElevator();
      assertEquals((-1), floor0.getFloorID());
      
      Elevator.Direction[] elevator_DirectionArray0 = Elevator.Direction.values();
      assertEquals(2, elevator_DirectionArray0.length);
      assertNotNull(elevator_DirectionArray0);
      
      Floor floor1 = new Floor(environment0, 0);
      assertFalse(floor1.equals((Object)floor0));
      assertNotNull(floor1);
      assertEquals(0, floor1.getFloorID());
      
      floorArray0[1] = floor1;
      environment0.floors = floorArray0;
      elevator0.doors = elevator_DoorState0;
      assertTrue(elevator0.areDoorsOpen());
      assertEquals(1, elevator0.getCurrentFloorID());
      assertFalse(elevator0.isBlocked());
      assertTrue(elevator0.isEmpty());
      assertEquals(Elevator.Direction.up, elevator0.getCurrentDirection());
      
      String string1 = elevator0.toString();
      assertFalse(string1.equals((Object)string0));
      assertEquals("Elevator [_] at 1 heading up", string1);
      assertNotNull(string1);
      assertTrue(elevator0.areDoorsOpen());
      assertEquals(1, elevator0.getCurrentFloorID());
      assertFalse(elevator0.isBlocked());
      assertTrue(elevator0.isEmpty());
      assertEquals(Elevator.Direction.up, elevator0.getCurrentDirection());
      
      elevator0.timeShift();
      assertEquals(Elevator.Direction.down, elevator0.getCurrentDirection());
      assertFalse(elevator0.areDoorsOpen());
      assertFalse(elevator0.isBlocked());
      assertTrue(elevator0.isEmpty());
      assertEquals(0, elevator0.getCurrentFloorID());
      
      // Undeclared exception!
      try { 
        Elevator.Direction.valueOf("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No enum constant ElevatorSystem.Elevator.Direction.
         //
         verifyException("java.lang.Enum", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Environment environment0 = new Environment(344);
      assertNotNull(environment0);
      
      Elevator elevator0 = new Elevator(environment0, true);
      assertNotNull(elevator0);
      assertFalse(elevator0.isBlocked());
      assertTrue(elevator0.isEmpty());
      assertEquals(0, elevator0.getCurrentFloorID());
      assertTrue(elevator0.areDoorsOpen());
      assertEquals(Elevator.Direction.up, elevator0.getCurrentDirection());
      
      String string0 = elevator0.toString();
      assertEquals("Elevator [_] at 0 heading up", string0);
      assertNotNull(string0);
      assertFalse(elevator0.isBlocked());
      assertTrue(elevator0.isEmpty());
      assertEquals(0, elevator0.getCurrentFloorID());
      assertTrue(elevator0.areDoorsOpen());
      assertEquals(Elevator.Direction.up, elevator0.getCurrentDirection());
      
      elevator0.timeShift();
      assertFalse(elevator0.isBlocked());
      assertFalse(elevator0.areDoorsOpen());
      assertTrue(elevator0.isEmpty());
      assertEquals(1, elevator0.getCurrentFloorID());
      assertEquals(Elevator.Direction.up, elevator0.getCurrentDirection());
      
      Elevator.DoorState elevator_DoorState0 = Elevator.DoorState.open;
      environment0.floors = null;
      Floor[] floorArray0 = new Floor[2];
      Floor floor0 = new Floor(environment0, (-1));
      assertNotNull(floor0);
      assertEquals((-1), floor0.getFloorID());
      
      floorArray0[0] = floor0;
      Elevator.Direction[] elevator_DirectionArray0 = Elevator.Direction.values();
      assertEquals(2, elevator_DirectionArray0.length);
      assertNotNull(elevator_DirectionArray0);
      
      Floor floor1 = new Floor(environment0, 0);
      assertFalse(floor1.equals((Object)floor0));
      assertNotNull(floor1);
      assertEquals(0, floor1.getFloorID());
      
      floorArray0[1] = floor1;
      environment0.floors = floorArray0;
      elevator0.doors = elevator_DoorState0;
      assertFalse(elevator0.isBlocked());
      assertTrue(elevator0.isEmpty());
      assertEquals(1, elevator0.getCurrentFloorID());
      assertTrue(elevator0.areDoorsOpen());
      assertEquals(Elevator.Direction.up, elevator0.getCurrentDirection());
      
      String string1 = elevator0.toString();
      assertFalse(string1.equals((Object)string0));
      assertEquals("Elevator [_] at 1 heading up", string1);
      assertNotNull(string1);
      assertFalse(elevator0.isBlocked());
      assertTrue(elevator0.isEmpty());
      assertEquals(1, elevator0.getCurrentFloorID());
      assertTrue(elevator0.areDoorsOpen());
      assertEquals(Elevator.Direction.up, elevator0.getCurrentDirection());
      
      elevator0.timeShift();
      assertFalse(elevator0.isBlocked());
      assertFalse(elevator0.areDoorsOpen());
      assertTrue(elevator0.isEmpty());
      assertEquals(0, elevator0.getCurrentFloorID());
      assertEquals(Elevator.Direction.down, elevator0.getCurrentDirection());
      
      Elevator.Direction elevator_Direction0 = elevator0.currentHeading;
      elevator0.timeShift();
      assertFalse(elevator0.isBlocked());
      assertFalse(elevator0.areDoorsOpen());
      assertTrue(elevator0.isEmpty());
      assertEquals(1, elevator0.getCurrentFloorID());
      assertEquals(Elevator.Direction.up, elevator0.getCurrentDirection());
      
      Elevator.Direction[] elevator_DirectionArray1 = Elevator.Direction.values();
      assertEquals(2, elevator_DirectionArray1.length);
      assertFalse(elevator_DirectionArray1.equals((Object)elevator_DirectionArray0));
      assertNotNull(elevator_DirectionArray1);
      assertNotSame(elevator_DirectionArray1, elevator_DirectionArray0);
      
      Elevator.Direction elevator_Direction1 = elevator_Direction0.reverse();
      assertFalse(elevator_Direction1.equals((Object)elevator_Direction0));
      assertFalse(elevator0.isBlocked());
      assertFalse(elevator0.areDoorsOpen());
      assertTrue(elevator0.isEmpty());
      assertEquals(1, elevator0.getCurrentFloorID());
      assertEquals(Elevator.Direction.up, elevator0.getCurrentDirection());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Environment environment0 = new Environment(344);
      assertNotNull(environment0);
      
      Elevator elevator0 = new Elevator(environment0, false);
      assertNotNull(elevator0);
      assertFalse(elevator0.isBlocked());
      assertEquals(0, elevator0.getCurrentFloorID());
      assertTrue(elevator0.areDoorsOpen());
      assertEquals(Elevator.Direction.up, elevator0.getCurrentDirection());
      assertTrue(elevator0.isEmpty());
      
      elevator0.timeShift();
      assertFalse(elevator0.isBlocked());
      assertFalse(elevator0.areDoorsOpen());
      assertEquals(1, elevator0.getCurrentFloorID());
      assertEquals(Elevator.Direction.up, elevator0.getCurrentDirection());
      assertTrue(elevator0.isEmpty());
      
      Elevator.DoorState elevator_DoorState0 = Elevator.DoorState.open;
      environment0.floors = null;
      Floor[] floorArray0 = new Floor[2];
      Floor floor0 = new Floor(environment0, (-1));
      assertNotNull(floor0);
      assertEquals((-1), floor0.getFloorID());
      
      floorArray0[0] = floor0;
      Elevator.Direction[] elevator_DirectionArray0 = Elevator.Direction.values();
      assertEquals(2, elevator_DirectionArray0.length);
      assertNotNull(elevator_DirectionArray0);
      
      Floor floor1 = new Floor(environment0, 0);
      assertFalse(floor1.equals((Object)floor0));
      assertNotNull(floor1);
      assertEquals(0, floor1.getFloorID());
      
      floorArray0[1] = floor1;
      environment0.floors = floorArray0;
      elevator0.doors = elevator_DoorState0;
      assertFalse(elevator0.isBlocked());
      assertEquals(1, elevator0.getCurrentFloorID());
      assertTrue(elevator0.areDoorsOpen());
      assertEquals(Elevator.Direction.up, elevator0.getCurrentDirection());
      assertTrue(elevator0.isEmpty());
      
      String string0 = elevator0.toString();
      assertEquals("Elevator [_] at 1 heading up", string0);
      assertNotNull(string0);
      assertFalse(elevator0.isBlocked());
      assertEquals(1, elevator0.getCurrentFloorID());
      assertTrue(elevator0.areDoorsOpen());
      assertEquals(Elevator.Direction.up, elevator0.getCurrentDirection());
      assertTrue(elevator0.isEmpty());
      
      elevator0.timeShift();
      assertFalse(elevator0.isBlocked());
      assertFalse(elevator0.areDoorsOpen());
      assertEquals(0, elevator0.getCurrentFloorID());
      assertEquals(Elevator.Direction.down, elevator0.getCurrentDirection());
      assertTrue(elevator0.isEmpty());
      
      // Undeclared exception!
      try { 
        Elevator.Direction.valueOf("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No enum constant ElevatorSystem.Elevator.Direction.
         //
         verifyException("java.lang.Enum", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Environment environment0 = new Environment(390);
      Elevator elevator0 = new Elevator(environment0, true);
      Person person0 = new Person("", 1, 383, 383, environment0);
      elevator0.enterElevator(person0);
      elevator0.timeShift();
      elevator0.toString();
      elevator0.getCurrentDirection();
      Floor[] floorArray0 = new Floor[9];
      Floor floor0 = new Floor(environment0, 28);
      floorArray0[1] = floor0;
      // Undeclared exception!
      try { 
        environment0.getFloor(390);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 390
         //
         verifyException("ElevatorSystem.Environment", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Elevator.Direction elevator_Direction0 = Elevator.Direction.up;
      elevator_Direction0.reverse();
      elevator_Direction0.reverse();
      Floor[] floorArray0 = new Floor[5];
      Elevator.DoorState[] elevator_DoorStateArray0 = Elevator.DoorState.values();
      assertEquals(2, elevator_DoorStateArray0.length);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Environment environment0 = new Environment(0);
      Elevator.Direction.values();
      Elevator.DoorState.values();
      Elevator.DoorState.values();
      Elevator elevator0 = new Elevator(environment0, false);
      Person person0 = null;
      try {
        person0 = new Person("3`.7R6n?j2", 0, (-3596), 0, environment0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -3596
         //
         verifyException("ElevatorSystem.Environment", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Environment environment0 = new Environment(935);
      Elevator elevator0 = new Elevator(environment0, false);
      elevator0.isBlocked();
      elevator0.currentFloorID = 771;
      Person person0 = new Person("", 3118, 771, 308, environment0);
      person0.leaveElevator();
      person0.leaveElevator();
      person0.leaveElevator();
      elevator0.isIdle();
      elevator0.leaveElevator(person0);
      elevator0.areDoorsOpen();
      elevator0.enterElevator(person0);
      elevator0.isEmpty();
      elevator0.timeShift();
      elevator0.toString();
      Elevator.Direction elevator_Direction0 = Elevator.Direction.up;
      Elevator.Direction elevator_Direction1 = elevator_Direction0.reverse();
      elevator_Direction1.reverse();
      elevator0.getEnv();
      elevator0.getCurrentDirection();
      // Undeclared exception!
      try { 
        Elevator.DoorState.valueOf(",o>|C}mJ4v~2?3tH");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No enum constant ElevatorSystem.Elevator.DoorState.,o>|C}mJ4v~2?3tH
         //
         verifyException("java.lang.Enum", e);
      }
  }

  // ============================================================
  // NEW TESTS for additional SPL features in the new Elevator
  // ============================================================

  // NEW TEST 49: Weight feature (TwoThirdsFull / Weight tracking)
  @Test(timeout = 4000)
  public void test49() throws Throwable {
      Environment env = new Environment(5);
      Floor[] floors = new Floor[5];
      for (int i = 0; i < 5; i++) {
          floors[i] = new Floor(env, i);
      }
      env.floors = floors;

      Elevator e = new Elevator(env, false);
      // initial weight should be 0
      assertEquals(0, e.weight);

      Person p = new Person("w", 70, 0, 1, env);
      e.enterElevator(p);
      // after entering, weight should increase by passenger weight
      assertEquals(70, e.weight);

      e.leaveElevator(p);
      // after leaving, weight should be back to 0
      assertEquals(0, e.weight);
  }

  // NEW TEST 50: ExecutiveFloor feature
  @Test(timeout = 4000)
  public void test50() throws Throwable {
      Environment env = new Environment(5);
      Floor[] floors = new Floor[5];
      for (int i = 0; i < 5; i++) {
          floors[i] = new Floor(env, i);
      }
      env.floors = floors;

      Elevator e = new Elevator(env, false);

      // default executive floor is 4
      assertTrue(e.isExecutiveFloor(4));
      assertFalse(e.isExecutiveFloorCalling());

      floors[4].callElevator();
      // once the executive floor calls, the elevator should detect it
      assertTrue(e.isExecutiveFloorCalling());
  }

  // NEW TEST 51: Empty feature (clearing buttons when elevator becomes empty)
  @Test(timeout = 4000)
  public void test51() throws Throwable {
      Environment env = new Environment(5);
      Floor[] floors = new Floor[5];
      for (int i = 0; i < 5; i++) {
          floors[i] = new Floor(env, i);
      }
      env.floors = floors;

      Elevator e = new Elevator(env, false);
      Person p = new Person("p", 50, 0, 3, env);

      e.enterElevator(p);
      e.pressInLiftFloorButton(3);
      assertTrue(e.buttonForFloorIsPressed(3));

      e.leaveElevator(p);
      // elevator is empty; Empty feature should clear all floor buttons
      assertTrue(e.isEmpty());
      assertFalse(e.buttonForFloorIsPressed(3));
  }
}
