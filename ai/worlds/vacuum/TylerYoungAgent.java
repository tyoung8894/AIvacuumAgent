package ai.worlds.vacuum;



public class TylerYoungAgent extends VacuumAgent {
	public int steps = 0;	
	
	public int getAction() {
		if (seesDirt()) return this.SUCK;
		if(bumped()) return this.LEFT;
		steps++;
		return this.FORWARD;
	}
}
