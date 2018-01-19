package Test;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
public class modmul extends GameObject{
	public int ox,oy;
	public int ocx[] = new int[1000], ocy[]= new int[1000];
	public float t1;
	public modmul(int x, int y, ID id, float Theta1) {
		super(x, y, id, Theta1);}
	public void tick() {
		this.ox = x;
		this.oy = y;
		int r = 300,c,k,z,i;
		double a = (2 * 3.14159265358979323846)/y;
		double kx[]= new double[y], ky[]= new double[y];
		int cx[] = new int[y], cy[]= new int[y];
		for (i = 0 ; i < y ; i++ ) {
			 c = i+1;
			 kx[i]=((Math.cos(c*a))*r)+650;
			 ky[i]=((Math.sin(c*a))*r)+350;}
		for (i = 0 ; i < y ; i++ ) {
			 cx[i] = (int) Math.round(kx[i]); 
			 cy[i] = (int) Math.round(ky[i]);
			 this.ocx = cx;
			 this.ocy = cy;}
		this.t1 = (float) ((Math.sin(Theta1))*(0.5)+0.5);}//this.t2 = (float) ((Math.sin(Theta2))*(0.5)+0.5);//System.out.println(t1+" "+t2);
	public void render(Graphics g) {
		g.setColor(Color.getHSBColor(t1, 1f, 1f));
		for (int z = 0 ; z < oy ; z++ ) {
			 int c = z+1;
			 int k = (c*ox)%oy;
			g.drawLine(ocx[z],ocy[z],ocx[k],ocy[k]);}
		String s1 = "Multiplier: ";
		String s2 = " Number Of Points: ";
		String s3 = Integer.toString(x);
		String s4 = Integer.toString(y);
		String string = s1+s3+s2+s4;
		g.setFont(new Font("TimesRoman", Font.PLAIN, 20));
				
		g.drawString(string, 450, 40);
				}}
