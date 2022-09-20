import java.awt.*;
import java.awt.event.*;
public class P35_AWT_Calc implements ActionListener{
	Frame f;
	Label l1;
	TextField t1, t2, t3, t4;
	Button add, sub, mul, div, equal, close;
	double res;
	char ch = '~';
	P35_AWT_Calc(){
		System.out.println("Calculator by Emmanuel Jojy\n>> ACTIVE");
		f = new Frame("GUI");
		t1 = new TextField(5);
		add = new Button("+");
		sub = new Button("-");
		mul = new Button("*");
		div = new Button("/");
		t2 = new TextField(5);
		equal = new Button("=");
		t3 = new TextField(12);
		t4 = new TextField(50);
		close = new Button("TERMINATE");
		f.setSize(400, 400);
		f.setLayout(new FlowLayout());
		f.add(t1);
		f.add(add);
		f.add(sub);
		f.add(mul);
		f.add(div);
		f.add(t2);
		f.add(equal);
		f.add(t3);
		f.add(t4);
		f.add(close);
		f.setVisible(true);
		add.addActionListener(this);
		sub.addActionListener(this);
		mul.addActionListener(this);
		div.addActionListener(this);
		equal.addActionListener(this);
		close.addActionListener(this);
	}
	public boolean result(){
		try{
			double a = Double.parseDouble(t1.getText().trim());
			double b = Double.parseDouble(t2.getText().trim());
			switch(ch){
				case '+': res = a + b; break;
				case '-': res = a - b; break;
				case '*': res = a * b; break;
				case '/':{
					if(b == 0.0)
						res = 0 / 0;
					res = a / b; 
					break;
				}
				default: t4.setText("Select Operation"); System.out.println(">> Invalid ~ Set Operation"); return false;
			}
		}
		catch(ArithmeticException e){
			t3.setText("NaN");
			t4.setText("You Seriously !! Division by zero. ");
			System.out.println(">> Invalid ~ " + e);
			return false;
		}
		catch(Exception e){
			t3.setText("");
			t4.setText("Mind your inputs.");
			System.out.println(">> Invalid ~ " + e);
			return false;
		}
		return true;
	}
	public void actionPerformed(ActionEvent e){
		if(e.getSource() == add){
			ch = '+';
		}
		else if(e.getSource() == sub){
			ch = '-';
		}
		else if(e.getSource() == mul){
			ch = '*';
		}
		else if(e.getSource() == div){
			ch = '/';
		}
		else if(e.getSource() == equal){
			if(result()){
				t3.setText(String.valueOf(res));
				t4.setText(t1.getText() + " " + ch + " " + t2.getText() + " = " + res);
				System.out.println(">> " + t1.getText().trim() + " " + ch + " " + t2.getText().trim() + " = " + res);
			}
		}
		else{
			System.out.println(">> DEACTIVATE");
			System.exit(0);
		}
	}
	public static void main(String[] args){
		new P35_AWT_Calc();
	}
}
