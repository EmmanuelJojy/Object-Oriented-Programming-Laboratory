import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class P37_Info implements ActionListener{
	JFrame f;
	JLabel l1, l2, l3;
	JTextField t1;
	JRadioButton b1, b2, b3;
	public P37_Info(){
		f = new JFrame("MyFrame");
		f.setSize(400, 200);
		f.setVisible(true);
		f.setLayout(new FlowLayout());
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		l1 = new JLabel("Enter Name: ");
		f.add(l1);
		
		t1 = new JTextField(10);
		f.add(t1);
		
		l2 = new JLabel("Choose: ");
		f.add(l2);
		
		b1 = new JRadioButton("Male");
		f.add(b1);
		b1.addActionListener(this);
		b2 = new JRadioButton("Female");
		f.add(b2);
		b2.addActionListener(this);
		ButtonGroup bg = new ButtonGroup();
		bg.add(b1);
		bg.add(b2);
		
		l3 = new JLabel("");
		f.add(l3);
	}
	
	public void actionPerformed(ActionEvent e){
		l3.setText(t1.getText() + " ( " + e.getActionCommand() + ")");
	}
	public static void main(String[] Args){
		new P37_Info();
	}
}
