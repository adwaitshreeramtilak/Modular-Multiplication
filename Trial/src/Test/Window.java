package Test;
import java.awt.Canvas;
import java.awt.Dimension;
import javax.swing.JFrame;
public class Window extends Canvas{
	private static final long serialVersionUID = -7285731868068618630L;
	public Window(int width, int height, String title, Game game) { // constructor of the class Window 
		JFrame frame = new JFrame(title);// we make a new object frame
		frame.setPreferredSize(new Dimension(width, height));//we set the size of the window which we want
		frame.setMaximumSize(new Dimension(width, height));// we set the maximum allowed size of the window
		frame.setMinimumSize(new Dimension(width, height));// we set the minimum allowed size of the window
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// we add the option to add the cross button at the top of the window 
		frame.setResizable(false);// we set the window to forbid resizing
		frame.setLocationRelativeTo(null);//the window will start at the middle
		frame.add(game);//we add the object game given to us in line 7 and add it to frame
		frame.setVisible(true);// we set the frame visible so that we can see the frame
		game.start();// we call the method start of the class game. goto class game line 18
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
