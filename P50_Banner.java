import javax.swing.*;
import java.awt.*;

public class P50_Banner extends JFrame{
	String s = "hello, world. This is a banner created in Java.";
	JLabel l;
	public P50_Banner(){
		setSize(2000, 800);
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		l = new JLabel("");
		l.setBounds(50, 50, 400, 40);
		add(l);
		
		s.substring(0, 2 + 1);
		
		try{
			for(int i = 0; i <= s.length(); i++){
				l.setText(s.substring(0, i));
				Thread.sleep(1000);
				if(i == s.length())
					i = -1;
			}
		}
		catch(InterruptedException e){
			System.out.println(e);
		}
	}
	public static void main(String[] args){
		new P50_Banner();
	}
}
