package Test;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyInput extends KeyAdapter{
	private Handler handler;
	public KeyInput(Handler handler) {
		this.handler = handler;
	}
	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();//the variable "key" is the inputted key by the user
		//System.out.println(key);
		/* if statements are to be made for individual objects which are to 
		 * react to various keystrokes. that is every object will 
		 * have its own loop for instructions as per keystrokes
		 */
		
		for(int i = 0; i < handler.object.size(); i++) {//loop to apply every object its instruction or changes
			GameObject tempObject = handler.object.get(i);//temporary object
			if(tempObject.getId() == ID.modmul) {//instrutions for a specific object
				if(key == KeyEvent.VK_UP) {
					tempObject.setX(tempObject.getX()+1);//instructions assigned as per the input to the object
					tempObject.setTheta1(tempObject.getTheta1()+0.05);
				}
				if(key == KeyEvent.VK_DOWN) {
					tempObject.setX(tempObject.getX()-1);
					tempObject.setTheta1(tempObject.getTheta1()-0.05);
				}
				if(key == KeyEvent.VK_LEFT) {
					tempObject.setY(tempObject.getY()-1);
					tempObject.setTheta1(tempObject.getTheta1()-0.05);
				}
				if(key == KeyEvent.VK_RIGHT) {
					tempObject.setY(tempObject.getY()+1);
					tempObject.setTheta1(tempObject.getTheta1()+0.05);
				}
			}
			
		}
	}
    public void keyReleased(KeyEvent e) {
    	int key = e.getKeyCode();
		
	}

}
