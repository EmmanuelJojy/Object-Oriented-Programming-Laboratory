import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Q2_Calc implements ActionListener{
	JTextField t1, t2, res;
	JButton b1, b2, b3, b4;
	public Q2_Calc(){
		JFrame f = new JFrame();
		f.setSize(500, 500);
		f.setVisible(true);
		f.setLayout(new FlowLayout());
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		t1 = new JTextField(5);
		t2 = new JTextField(5);
		res = new JTextField(10);
		
		b1 = new JButton("+");
		b2 = new JButton("-");
		b3 = new JButton("*");
		b4 = new JButton("/");
		
		f.add(t1); f.add(t2);
		f.add(b1); f.add(b2); f.add(b3); f.add(b4);
		f.add(res);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e){
		int a = Integer.parseInt(t1.getText());
		int b = Integer.parseInt(t2.getText());
		double r;
		
		if(e.getSource() == b1)
			r = a + b;
		else if(e.getSource() == b2)
			r = a - b;
		else if(e.getSource() == b3)
			r = a * b;
		else
			r = a / b;
		res.setText(String.valueOf(r));
	}
	public static void main(String[] args){
		new Q2_Calc();
	}
}
