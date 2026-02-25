package ElevatorSystem; 

import java.util.ArrayList; 
import java.util.List; 

public  class  FloorV2 {
	

	private final int thisFloorID;

	

	private boolean elevatorCall = false;

	

	private List<PersonV2> waiting = new ArrayList<PersonV2>();

	
	
	private EnvironmentV2 env;

	
	
	//__feature_mapping__ [Base] [16:19]
	public FloorV2(EnvironmentV2 env, int id) {
		this.env = env;
		thisFloorID = id;
	}

	
	
	//__feature_mapping__ [Base] [21:23]
	public int getFloorID() {
		return this.thisFloorID;
	}

	
	
	/*@
	  @ ensures env.calledAt_Spec1[floor.getFloorID()];
	  @*/
	//__feature_mapping__ [Base] [28:31]
	public void callElevator() {
		/*@ set env.calledAt_Spec1[floor.getFloorID()] = true; @*/
		elevatorCall = true;
	}

	
	
	//__feature_mapping__ [Base] [33:35]
	public void reset() {
		elevatorCall = false;
	}

	
	
	//__feature_mapping__ [Base] [37:39]
	public /*@pure@*/  boolean hasCall() {
		return elevatorCall;
	}

	
	
	//__feature_mapping__ [Base] [41:47]
	public void processWaitingPersons(ElevatorV2 e) {
		for (PersonV2 p : waiting) {
			e.enterElevator(p);
		}
		waiting.clear();
		reset();
	}

	
	
	//__feature_mapping__ [Base] [49:52]
	public void addWaitingPerson(PersonV2 person) {
		waiting.add(person);
		callElevator();
	}


}
