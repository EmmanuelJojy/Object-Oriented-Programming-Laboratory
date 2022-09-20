import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class P36_JGUI implements ActionListener{
	JFrame f;
	JLabel l;
	JButton b;
	public P36_JGUI(){
		f = new JFrame("MyFrame");
		l = new JLabel("hello, world!");
		b = new JButton("Hi!");
		f.add(l);
		f.add(b);
		f.setSize(400, 200);
		f.setVisible(true);
		f.setLayout(new FlowLayout());
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		b.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e){
		l.setText("Button Click");
	}
	public static void main(String[] Args){
		new P36_JGUI();
	}
}
