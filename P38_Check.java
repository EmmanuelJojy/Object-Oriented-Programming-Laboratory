import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class P38_Check implements ItemListener{
	JFrame f;
	JLabel l;
	JCheckBox b1, b2, b3;
	public P38_Check(){
		f = new JFrame("MyFrame");
		f.setSize(400, 200);
		f.setVisible(true);
		f.setLayout(new FlowLayout());
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		b1 = new JCheckBox("1");
		f.add(b1);
		b1.addItemListener(this);
		b2 = new JCheckBox("2");
		f.add(b2);
		b2.addItemListener(this);
		b3 = new JCheckBox("3");
		f.add(b3);
		b3.addItemListener(this);
		
		l = new JLabel("WELCOME");
		f.add(l);
	}
	
	public void itemStateChanged(ItemEvent e){
		AbstractButton b = (AbstractButton)e.getSource();
		if(b.isSelected()){
			l.setText("Check " + b.getActionCommand() + " Selected");
		}
		else{
			l.setText("Check " + b.getActionCommand() + " Cleared");
		}
	}
	public static void main(String[] Args){
		new P38_Check();
	}
}
