package ElevatorSystem; 


public  class  EvilPersonV2  extends PersonV2 {
	

	private int[] additionalButtons;

	

	//__feature_mapping__ [Base] [8:12]
	public EvilPersonV2(String name, int weight, int origin, int destination, int[] additionalButtons,
			EnvironmentV2 env) {
		super(name, weight, origin, destination, env);
		this.additionalButtons = additionalButtons;
	}

	
	
	//__feature_mapping__ [Base] [14:19]
	@Override
	public void enterElevator(ElevatorV2 e) {
		super.enterElevator(e);
		for (Integer btnID : additionalButtons)
			e.pressInLiftFloorButton(btnID);
	}


}
