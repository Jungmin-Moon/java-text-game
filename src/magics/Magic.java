package magics;

public abstract class Magic {
	
	protected int rank;
	protected int charges;
	protected String name;
	protected int dmg;
	protected String strongAgainst;
	
	
	Magic() {
		rank = 0;
		charges = 0;
		name = "";
		dmg = 0;
		strongAgainst = "";
	}
	
	public abstract void addCharges();
	
	public abstract int calcDmg();
	
}
