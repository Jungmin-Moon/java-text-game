package enemy;

import main_game.Player;

public interface Enemy {
	public void enemyAttack(Player player);
	public void dmgTaken(int playerDmg);
}
