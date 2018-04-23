package spongebob;

import java.awt.Graphics;
import java.util.LinkedList;


public abstract class Controller<T extends Entity> {
  private LinkedList<T> list = new LinkedList<>();
  
  protected Game game;
  protected Textures tex;
  
  public Controller(Game game, Textures tex){
	  this.game = game;
	  this.tex = tex;
  }
  
  public abstract void tick();
  
  public void render(Graphics g) {
	  synchronized(list) {
		  for(T item: list) {
			  item.render(g);
		  }
	  }
  }
  
  public void add(T item) {
	  list.add(item);
  }
  
  public void remove(T item) {
	  list.remove(item);
  }
  
  public LinkedList<T> getList() {
	  return list;
  }
  
  protected void resetList() {
	  list.clear();
  }
}
