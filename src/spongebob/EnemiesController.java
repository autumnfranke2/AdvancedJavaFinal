package spongebob;

import java.util.LinkedList;

public class EnemiesController extends Controller<EntityEnemy> {

	public EnemiesController(Game game, Textures tex) {
		super(game, tex);
	}
	
	public void tick() {  
	  Entity item;
	  LinkedList<EntityEnemy> list = getList();
	  
	  synchronized(list) {
		  for(int i=0;i < list.size();i++)
		  {
		    item = list.get(i);

		    item.tick();
		  }
	  }
	}
	
	public void createEnemies(int enemyCount) {
		for(int i=0;i< enemyCount;i++)
		{
		  add(new Enemy(-10,game,tex));
		}
	}
	
	public void resetEnemies(int enemyCount) {
		this.resetList();
		this.createEnemies(enemyCount);
	}
}

