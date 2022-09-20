import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class P36_Radio{
	JFrame f;
	JLabel l;
	JRadioButton b1, b2, b3;
	public P36_Radio(Event_sep obj){
		f = new JFrame("MyFrame");
		f.setSize(400, 200);
		f.setVisible(true);
		f.setLayout(new FlowLayout());
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		b1 = new JRadioButton("1");
		f.add(b1);
		b1.addActionListener(obj);
		b2 = new JRadioButton("2");
		f.add(b2);
		b2.addActionListener(obj);
		b3 = new JRadioButton("3");
		f.add(b3);
		b3.addActionListener(obj);
		ButtonGroup bg = new ButtonGroup();
		bg.add(b1);
		bg.add(b2);
		bg.add(b3);
		
		l = new JLabel("WELCOME");
		obj.l = l;
		f.add(l);
	}
	
	
	public static void main(String[] Args){
		new P36_Radio(new Event_sep());
	}
}

class Event_sep implements ActionListener{
	JLabel l;
	public void actionPerformed(ActionEvent e){
		System.out.println(e);
		l.setText("Radio " + e.getActionCommand() + " Selected");
	}
}
