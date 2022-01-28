package magics;

import enemy.Enemy;
import main_game.Player;

public class Fire extends Magic{
	
	public Fire() {
		super(1, 2, "Fire", 10, "Ice");
		
	}
	
	public void addCharges(Player player) {
		int currentLevel = player.getLevel();
		if(currentLevel%10 == 0) {
			charges += 2;
		}
	}
	
	
	public int calcDmg(Enemy enemy, Player player) {
		String enemyWeakness = enemy.weakness;
		
		if(enemyWeakness.equalsIgnoreCase(strongAgainst)) {
			return Math.round(dmg + Math.round(dmg * 1.5));
		} 
		
		return 0;
	}
}
