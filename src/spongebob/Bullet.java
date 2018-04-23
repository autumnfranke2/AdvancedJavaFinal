package spongebob;

import java.awt.Graphics;
import java.util.LinkedList;

public class Bullet extends GameElement implements EntityFriendly {   
   Animation anim;
	
   public Bullet(double x, double y, Game game, Textures tex){
	   super(x,y,game,tex);
	   anim = new Animation(5, tex.bullet);
   }
   
   @Override 
   protected void init() {
 	super.init();
 	this.setSprite(tex.bullet.get(0));
   }

   @Override
   public void tick() {
	   y-=10;
	   
	   anim.runAnimation();
   } 
   
   @Override
   public void render(Graphics g) {
 	  anim.drawAnimation(g, x, y, 0);
   }
}
