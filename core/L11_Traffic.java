import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class L11_Traffic implements ActionListener{
	JFrame f;
	JRadioButton b1, b2, b3;
	static int select = 0;
	Signal s = null;
	public L11_Traffic(){
		f = new JFrame("MyFrame");
		f.setSize(400, 200);
		f.setVisible(true);
		f.setLayout(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		b1 = new JRadioButton("Stop");
		b1.setBounds(0, 0, 90, 20);
		b1.addActionListener(this);
		f.add(b1);
		
		b2 = new JRadioButton("Ready");
		b2.setBounds(100, 0, 90, 20);
		b2.addActionListener(this);
		f.add(b2);
		
		b3 = new JRadioButton("Go");
		b3.setBounds(200, 0, 90, 20);
		b3.addActionListener(this);
		f.add(b3);
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(b1);
		bg.add(b2);
		bg.add(b3);
		
		s = new Signal();
		f.add(s);
	}
	
	
	public void actionPerformed(ActionEvent e){
		if(e.getActionCommand() == "Stop")
			select = 1;
		else if(e.getActionCommand() == "Ready")
			select = 2;
		else
			select = 3;
		
		s.repaint();
	}
	
	public static void main(String[] Args){
		new L11_Traffic();
	}
}

class Signal extends JPanel{
	public Signal(){
		setBounds(600, 100, 200, 500);
	}
	public void paint(Graphics g){
		super.paint(g);
		g.setColor(Color.black);
		g.drawOval(0, 0, 50,50);
		g.drawOval(60, 0, 50, 50);
		g.drawOval(120, 0, 50, 50);
		if(L11_Traffic.select == 1){
			g.setColor(Color.red);
			g.fillOval(0, 0, 50,50);
		}
		if(L11_Traffic.select == 2){
			g.setColor(Color.yellow);
			g.fillOval(60, 0, 50, 50);
		}
		if(L11_Traffic.select == 3){
			g.setColor(Color.green);
			g.fillOval(120, 0, 50, 50);
		}
	}
}
