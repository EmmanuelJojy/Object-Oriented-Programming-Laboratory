// Emmanuel Jojy
// Roll no.: 53
// S3 CSE A

// Load Song using Applet

import java.applet.*;

/* 
<applet code="P45_Song.class" width="2000" height="1000"> 
</applet> 
*/  
 
public class P45_Song extends Applet{
	AudioClip song;
	public void init(){
		song = getAudioClip(getCodeBase(), "song.wav");
		System.out.println("Applet Initialized.");
	}
	public void start(){
		song.loop();
		System.out.println("Applet Started.");
	}
	public void stop(){
		song.stop();
		System.out.println("Applet Stoped.");
	}
	public void destroy(){
		System.out.println("Applet Destroyed.");
	}
}

// Refer: https://docs.oracle.com/javase/7/docs/api/java/applet/Applet.html
