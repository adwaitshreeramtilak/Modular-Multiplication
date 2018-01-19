package Test;

import java.awt.Graphics;
import java.util.LinkedList;

public class Handler {
	LinkedList<GameObject> object = new LinkedList<GameObject>();// we make a new object of data type linked list. read line 15 of the class Game, then goto the class Window 
	public void tick() {/*the tick method
	both tick and the render method have a for loop.
	this makes a temporary object which calls it own tick and render
	method respectively.then the game loop call these methods again 
	and again once every 1/fps second for render method and once for every 
	1/tps second.*/
		//goto KeyInput
		for(int i = 0; i < object.size(); i++) {
			GameObject  tempObject = object.get(i);
			tempObject.tick();
		}
	}
	public void render(Graphics g) {//the render method
		for(int i = 0; i < object.size(); i++) {
			GameObject  tempObject = object.get(i);
			tempObject.render(g);
		}
	}
	public void addObject(GameObject object) //now that we have modmul as this method's parameter
	{
		this.object.add(object);// this object modmul is given to the linked list. goto line 7.
	}
	public void removeObject(GameObject object) 
	{
		this.object.remove(object);
	}
}
