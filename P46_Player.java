// Emmanuel Jojy
// Roll no.: 53
// S3 CSE A

// Audio Player using Applet

import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/*
<applet code="P46_Player.class" width="1366" height="720"> 
</applet> 
*/

public class P46_Player extends JApplet implements ActionListener{
	AudioClip doc, air;
	public void init(){
		air = getAudioClip(getCodeBase(), "airtel.wav");
		doc = getAudioClip(getCodeBase(), "docomo.wav");
		
		getContentPane().setLayout(new FlowLayout());
		
		
		JButton b1 = new JButton("Airtel");
		b1.addActionListener(this);
		add(b1);
		
		JButton m = new JButton("MIX");
		m.addActionListener(this);
		add(m);
		
		JButton b2 = new JButton("Docomo");
		b2.addActionListener(this);
		add(b2);
		
		System.out.println("Applet Initialized.");
	}
	public void start(){
		System.out.println("Applet Started.");
	}
	public void stop(){
		air.stop();
		doc.stop();
		System.out.println("Applet Stoped.");
	}
	public void destroy(){
		System.out.println("Applet Destroyed.");
	}
	public void actionPerformed(ActionEvent e){
		air.stop();
		doc.stop();
		if(e.getActionCommand() == "Airtel")
			air.loop();
		else if(e.getActionCommand() == "Docomo")
			doc.loop();
		else{
			air.loop();
			doc.loop();
		}
	}
}

// Refer: https://docs.oracle.com/javase/7/docs/api/java/applet/Applet.html
