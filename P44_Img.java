// Emmanuel Jojy
// Roll no.: 53
// S3 CSE A

// Load Image using Applet

import java.applet.*;  
import java.awt.*; 

/*
<applet code="P44_Img" width="1366" height="720"> 
</applet> 
*/

public class P44_Img extends Applet{
	// #802
	Image img;
	public void init(){
		System.out.println("Applet Initialized.");
		img = getImage(getCodeBase(), "img.jpg");
	}
	public void start(){
		System.out.println("Applet Started.");
	}
	public void paint(Graphics g){ 
		g.drawImage(img, 0, 0, this);  
	}
	public void stop(){
		System.out.println("Applet Stoped.");
	}
	public void destroy(){
		System.out.println("Applet Destroyed.");
	}
}
