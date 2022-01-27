package enemy;

import main_game.Player;

public interface Enemy {
	
	//need to overwrite
	public static final String weakness = "";
	public void enemyAttack(Player player);
	public void dmgTaken(int playerDmg);
}
