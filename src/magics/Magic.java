package magics;

import enemy.Enemy;
import main_game.Player;

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
	
	public abstract void addCharges(Player player);
	
	public abstract int calcDmg(Enemy enemy, Player player);
	
	
	
}
