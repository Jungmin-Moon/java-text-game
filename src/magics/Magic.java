package magics;

import enemy.Enemy;
import main_game.Player;

public interface Magic {
	public void attack(Player player, int enemyDef, int enemyMagResistance);
	public void checkWeakness(String weakness);
	
}
