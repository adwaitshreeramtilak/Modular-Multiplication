package Test;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
public class Game extends Canvas implements Runnable {
	private static final long serialVersionUID = 5953559785486325743L;
	private Thread thread;
	private boolean running = false;
	private Handler handler;
	public Game() // The Game constructor method .
	{
		handler = new Handler(); // A new object is made of type Handler.
		this.addKeyListener(new KeyInput(handler));//So we call a function from our java library with the parameters being the constructor of the KeyInput class and it having the parameter of the object handler. I have no idea how this works in detail, so i have to find out how it works in detail. 
		new Window(1300, 700, "Let's Build a Game!", this);//We call the constructor of the Window class.
		handler.addObject(new modmul(5, 100, ID.modmul, 0));//we call the method addObject from handler class and give modmul class's constructor as its parameter.
		}//goto handler class line 20.
	public synchronized void start() {//this is the start method
		thread = new Thread(this);//we make the object thread of the type Thread with the parameters being this class i.e. the class game
		thread.start();//this method calls the run method 
		running = true;}// sets the value of running to be true
	public synchronized void stop() {//this method is used to stop the thread. goto line 28.
		try {thread.join();
			running = false;}
		catch(Exception e) {
			e.printStackTrace();}}
	
	public void run() {//the method run. this method has our game loop.//from line 29 till line 35 we have declaration and initialization of the variables.
		long lastTime = System.nanoTime();//this variable is assigned the time in nano seconds as this instruction is run
        final double amountOfTicks = 60.0;//the value of game logic being run per second
        double ns = 1000000000 / amountOfTicks;//'tis obvious as to what happens
        double delta = 0;//'tis obvious as to what happens
        int frames = 0;//'tis obvious as to what happens
        int ticks = 0;//'tis obvious as to what happens
        long timer = System.currentTimeMillis();
        while(running){//while loop with the variable running as the parameter with the boolean value true 
            long now = System.nanoTime();//this variable is assigned the time in nano seconds as this instruction is run
            delta += (now - lastTime) / ns;//'tis obvious as to what happens
            lastTime = now;//'tis obvious as to what happens
            while(delta >= 1){//'tis obvious as to what happens
                tick();//method tick is being called
                ticks++;//'tis obvious as to what happens
                delta--;}//'tis obvious as to what happens
            if(running)render();//the render method is being called
            frames++;//'tis obvious as to what happens
            if(System.currentTimeMillis() - timer > 1000){
                timer += 1000;//'tis obvious as to what happens
                System.out.println("FPS: " + frames + " TPS: " + ticks);//we are supposed to print out the value of fps and tps
                frames = 0;//'tis obvious as to what happens
                ticks = 0;}}//'tis obvious as to what happens
        stop();}//if we go out of the while loop we call the method stop
	private void tick() {//the tick method
		handler.tick();}//calls the method tick in the class handler
	private void render() {//the render method
		BufferStrategy bs = this.getBufferStrategy();//dont know what it does
		if(bs == null) {//'tis obvious as to what happens
			this.createBufferStrategy(3);//dont know what it does
			return;//'tis obvious as to what happens
			}
		Graphics g = bs.getDrawGraphics();//new object g is made of the type graphics
		g.setColor(Color.white);//the color is set to white
		g.fillRect(0, 0, 1365, 720);//a rectangle is drawn of the sixe which is in the parameters
		handler.render(g);//the method render is called which is the part of handler class
		g.dispose();//dont know
		bs.show();//dont know
		}//goto Handler class. line 8
	public static void main(String args[]) // This is our main Function
	{new Game();}} // Calls and executes the "Game" constructor method /goto line 11
	