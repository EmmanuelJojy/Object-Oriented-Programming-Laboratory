import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class P49_TextField extends JFrame implements TextListener{
	JLabel l;
	TextField t;
	public P49_TextField(){
		setSize(2000, 800);
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		t = new TextField(50);
		l = new JLabel("");
		add(t); add(l);
		
		l.setBounds(20, 20, 200, 40);
		t.setBounds(20, 80, 200, 40);
		
		t.addTextListener(this);
	}
	
	public void textValueChanged(TextEvent e){
		l.setText(t.getText());
	}
	
	public static void main(String[] args){
		new P49_TextField();
	}
}
