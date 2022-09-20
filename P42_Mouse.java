import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class P42_Mouse implements MouseListener{
	JFrame f;
	JLabel l1;
	public P42_Mouse(){
		f = new JFrame("MyFrame");
		f.setSize(400, 400);
		f.setVisible(true);
		f.setLayout(new FlowLayout());
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		f.addMouseListener(this);
		
		l1 = new JLabel("HELLO");
		f.add(l1);
	}
	
	public void mouseClicked(MouseEvent e){
		l1.setText("Mouse Clicked");
	}
	public void mouseEntered(MouseEvent e){
		l1.setText("Mouse Enetered");
	}
	public void mouseExited(MouseEvent e){
		l1.setText("Mouse Exited");
	}
	public void mousePressed(MouseEvent e){
		l1.setText("Mouse Pressed");
	}
	public void mouseReleased(MouseEvent e){
		l1.setText("Mouse Released");
	}
	public static void main(String[] Args){
		new P42_Mouse();
	}
}
