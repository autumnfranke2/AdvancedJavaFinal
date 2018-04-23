package spongebob;

import java.util.LinkedList;

public class BulletsController extends Controller<EntityFriendly> {

	public BulletsController(Game game, Textures tex) {
		super(game, tex);
	}
	
	public void tick() {  
	  EntityFriendly item;
	  LinkedList<EntityFriendly> list = getList();
	  
	  synchronized(list) {
		  for(int i=0;i < list.size();i++)
		  {
		    item = list.get(i);
		    
		    if(item.getY() < 0)
			  remove(item);  
		    else
		      item.tick();
		  }
	  }
	}
}
