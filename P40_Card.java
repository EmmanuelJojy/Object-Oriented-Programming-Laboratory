import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class P40_Card implements ActionListener{
	JFrame f;
	JPanel p, p1, p2, p3, p4;
	JLabel l1, l2, l3, l4;
	CardLayout card;
	JButton b1, b2;
	public P40_Card(){
		f = new JFrame("MyFrame");
		f.setSize(1000, 1000);
		f.setVisible(true);
		f.setLayout(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		p = new JPanel();
		card = new CardLayout();
		p.setLayout(card);
		
		p1 = new JPanel();
		l1 = new JLabel("CURENT CARD - 1");
		p1.add(l1);
		
		p2 = new JPanel();
		l2 = new JLabel("CURENT CARD - 2");
		p2.add(l2);
		
		p3 = new JPanel();
		l3 = new JLabel("CURENT CARD - 3");
		p3.add(l3);
		
		p4 = new JPanel();
		l4 = new JLabel("CURENT CARD - 4");
		p4.add(l4);
		
//		p1.setBackground(Color.red);
//		p2.setBackground(Color.blue);
//		p3.setBackground(Color.green);
//		p4.setBackground(Color.yellow);
		
		p.add(p1);
		p.add(p2);
		p.add(p3);
		p.add(p4);
		
		f.add(p);
		p.setBounds(600,100, 200, 200);
		b1 = new JButton("NEXT");
		b1.setBounds(700,400, 100, 50);
		b2 = new JButton("PREVIOUS");
		b2.setBounds(600, 400, 100, 50);
		b1.addActionListener(this);
		b2.addActionListener(this);
		f.add(b2);
		f.add(b1);
	}
	public void actionPerformed(ActionEvent e){
		if(e.getSource() == b1){
			card.next(p);
		}
		else{
			card.previous(p);
		}
	}
	
	public static void main(String[] Args){
		new P40_Card();
	}
}

