// Emmanuel Jojy 
// Roll no. 53
// S3 CSE A

// Assignment 2
// Set 1 - Q2

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class P48_Ball implements KeyListener{
	JFrame f;
	static int x = 683 - 40, y = 360 - 40;
	Draw draw = null;
	public P48_Ball(){
		f = new JFrame("MyFrame");
		f.setSize(1366, 720);
		f.setVisible(true);
		f.setLayout(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.addKeyListener(this);
		
		draw = new Draw();
		f.add(draw);
	}
	
	public void keyPressed(KeyEvent e){
		int key = e.getExtendedKeyCode();
		if(key == e.VK_LEFT)
			x -= 20;
		else if(key == e.VK_UP)
			y -= 20;
		else if(key == e.VK_RIGHT)
			x += 20;
		else if(key == e.VK_DOWN)
			y += 20;
		else
			return;
			
		draw.repaint();
	}
	
	public void keyReleased(KeyEvent e){}
	public void keyTyped(KeyEvent e){}
	
	public static void main(String[] Args){
		new P48_Ball();
	}
}

class Draw extends JPanel{
	public Draw(){
		setBounds(0, 0, 1366, 720);
	}
	public void paint(Graphics g){
		super.paint(g);
		g.setColor(Color.red);
		g.fillOval(P48_Ball.x, P48_Ball.y, 80, 80);
	}
}
