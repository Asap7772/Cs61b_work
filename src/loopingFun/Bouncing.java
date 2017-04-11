package loopingFun;

import javax.swing.*;
import java.awt.*;

public class Bouncing extends JFrame{
	public Bouncing(){
		super("Bouncing");
		this.setSize(800,800);
		this.setVisible(true);
		repaint();
	}
	@Override
	public void paint(Graphics g){
		int sizeB = 300;
		this.setSize(sizeB, sizeB);
		Color bk = Color.white;
		g.setColor(bk);
		g.fillRect(0, 0, sizeB, 800);
		int x = (int)(Math.random()*(sizeB-200)) + 100;
		int y = (int)(Math.random()*(sizeB-200)) + 100;
		int vx = 5;
		int vy = 5;
		int size = 50;
		Color[] arr = new Color[]{Color.red, Color.blue, Color.yellow, Color.green};
		while(true){
			g.setColor(bk);
			g.fillOval(x, y, 50, 50);
			x += vx;
			y += vy;
			if(y + vy > (sizeB-50) || y + vy < 30){
				vy = -vy;
			}
			if(x + vx > (sizeB-50) || x + vx < 10){
				vx = -vx;
			}
			g.setColor(arr[0]);
			g.fillOval(x, y, 50, 50);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		Bouncing app = new Bouncing();
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
