package magics;

import enemy.Enemy;
import main_game.Player;

public abstract class Magic {
	
	protected int rank;
	protected int charges;
	protected String name;
	protected int dmg;
	protected String strongAgainst;
	
	
	Magic(int rank, int charges, String name, int dmg, String strongAgainst) {
		this.rank = rank;
		this.charges = charges;
		this.name = name;
		this.dmg = dmg;
		this.strongAgainst = strongAgainst;
	}
	
	public abstract void addCharges(Player player);
	
	public abstract int calcDmg(Enemy enemy, Player player);
	
	
	
}
