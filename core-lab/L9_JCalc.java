import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class L9_JCalc implements ActionListener{
	JTextField t1;
	JButton n0, n1, n2, n3, n4, n5, n6, n7, n8, n9;
	JButton b1, b2, b3, b4, b5, b6, b7, b8, b9;
	
	double a = 0, b = 0, res;
	char oper = '+';
	public L9_JCalc(){
		JFrame f = new JFrame("Simple Calculator");
		f.setSize(800, 600);
		f.setVisible(true);
		f.setLayout(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		t1 = new JTextField(5);
		f.add(t1);
		
		t1.setBounds(100, 100, 200, 50);
		
		n9 = new JButton("9"); f.add(n9);
		n8 = new JButton("8"); f.add(n8);
		n7 = new JButton("7"); f.add(n7);
		n6 = new JButton("6"); f.add(n6);
		n5 = new JButton("5"); f.add(n5);
		n4 = new JButton("4"); f.add(n4);
		n3 = new JButton("3"); f.add(n3);
		n2 = new JButton("2"); f.add(n2);
		n1 = new JButton("1"); f.add(n1);
		n0 = new JButton("0"); f.add(n0);
		b1 = new JButton("+"); f.add(b1);
		b2 = new JButton("-"); f.add(b2);
		b3 = new JButton("*"); f.add(b3);
		b4 = new JButton("/"); f.add(b4);
		b5 = new JButton("="); f.add(b5);
		b6 = new JButton("C"); f.add(b6);
		b7 = new JButton("%"); f.add(b7);
		b8 = new JButton("."); f.add(b8);
		b9 = new JButton("<"); f.add(b9);
		
		n9.addActionListener(this);
		n8.addActionListener(this);
		n7.addActionListener(this);
		n6.addActionListener(this);
		n5.addActionListener(this);
		n4.addActionListener(this);
		n3.addActionListener(this);
		n2.addActionListener(this);
		n1.addActionListener(this);
		n0.addActionListener(this);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		
		n9.setBounds(100, 200, 50, 50);
		n8.setBounds(150, 200, 50, 50);
		n7.setBounds(200, 200, 50, 50);
		b6.setBounds(250, 200, 50, 50);
		n6.setBounds(100, 250, 50, 50);
		n5.setBounds(150, 250, 50, 50);
		n4.setBounds(200, 250, 50, 50);
		b9.setBounds(250, 250, 50, 50);
		n3.setBounds(100, 300, 50, 50);
		n2.setBounds(150, 300, 50, 50);
		n1.setBounds(200, 300, 50, 50);
		b7.setBounds(250, 300, 50, 50);
		b1.setBounds(100, 350, 50, 50);
		b2.setBounds(150, 350, 50, 50);
		b3.setBounds(200, 350, 50, 50);
		b4.setBounds(250, 350, 50, 50);
		n0.setBounds(100, 400, 50, 50);
		b8.setBounds(150, 400, 50, 50);
		b5.setBounds(200, 400, 100,50);
		
	}
	
	public void actionPerformed(ActionEvent e){
		JButton click = (JButton)e.getSource();
		char ch = click.getActionCommand().charAt(0);
		
		String s = t1.getText();
		if(ch == '='){
			b = Double.parseDouble(s);
			result();
		}
		else if(ch == 'C'){
			t1.setText("");
			oper = '!';
			a = 0;
			b = 0;
		}
		else if(ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '%'){
			a = Double.parseDouble(s);
			t1.setText("");
			oper = ch;
		}
		else if(ch == '<'){
			t1.setText(s.substring(0, s.length() - 1));
		}
		else{
			t1.setText(s + ch);
		}
	}
	
	public void result(){
		switch(oper){
			case '+': res = a + b; break;
			case '-': res = a - b; break;
			case '*': res = a * b; break;
			case '/':{ 
				try{
					if(b == 0)
						throw new ArithmeticException();
					res = a / b;
					break;
				} 
				catch(ArithmeticException e){
					t1.setText("Divide By Zero");
					return;
				}
			}
			case '%': res = a % b; break;
		}
		t1.setText(String.valueOf(res));
	}
	public static void main(String[] Args){
		new L9_JCalc();
	}
}
