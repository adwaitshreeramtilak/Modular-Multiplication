package Test;

import java.awt.Graphics;

public abstract class GameObject {
	protected int x,y;
	protected ID id;
	protected int velX, velY;
	protected double Theta1;
	protected double Theta2;
	
	public GameObject(int x, int y, ID id, double Theta1) {
		this.x = x;
		this.y = y;
		this.id = id;
		this.Theta1 = Theta1;
		}
	public abstract void tick();
	public abstract void render(Graphics g);
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public void setId(ID id) {
		this.id = id;
	}
	public ID getId() {
		return id;
	}
	public void setVelX(int velX) {
		this.velX = velX;
	}
    public void setVelY(int velY) {
		this.velY = velY;
	}
    public int getVelX() {
    	return velX;
	}
    public int getVelY() {
		return velY;
	}
    public void setTheta1(double Theta1) {
		this.Theta1 = Theta1;
	}
    public double getTheta1() {
		return Theta1;
	}
   
}
