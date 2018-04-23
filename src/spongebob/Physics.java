package spongebob;

import java.util.LinkedList;

public class Physics {
  
	public static EntityEnemy collision(EntityFriendly friend , LinkedList<EntityEnemy> list) {
		EntityEnemy ret = null;
		
		synchronized(list) {
			for(EntityEnemy enemy: list) {
				if(friend.getBounds().intersects(enemy.getBounds()))
					return ret;
			}
		}	
		return ret;
	}
	
	
	 //Detects if there is a collision 
    public static EntityFriendly collision(EntityEnemy enemy , LinkedList<EntityFriendly> list) {
    	synchronized(list) {
			for(EntityFriendly friend: list) {
				if(enemy.getBounds().intersects(friend.getBounds()))
					return friend;
			}
    	}
    	
		return null;
	}
    
    public static EntityEnemy collision(Player player , LinkedList<EntityEnemy> list) {
		synchronized(list) {
			for(EntityEnemy enemy: list) {
				if(player.getBounds().intersects(enemy.getBounds()))
					return enemy;
			}
		}	
		return null;
	}
	
}
