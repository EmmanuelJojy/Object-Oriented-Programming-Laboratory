// Emmanuel Jojy
// Roll no.: 53
// S3 CSE A

// Random Thread

import java.util.*;

class Even extends Thread{
	int n;
	public Even(int num){
		n = num;
	}
	public void run(){
		System.out.println("[Even] Square: " + (n * n));
	}
}

class Odd extends Thread{
	int n;
	public Odd(int num){
		n = num;
	}
	public void run(){
		System.out.println("[Odd] Cube: " + (n * n * n));
	}
}

class Rand extends Thread{
	public void run(){
		// Generate for 10 times
		Random r = new Random();
		for(int i = 0; i < 10; i++){
			int n = r.nextInt(100);
			System.out.println("\nGenerated number is: " + n);
			
			if(n % 2 == 0){
				Even even = new Even(n);
				even.start();
			}
			else{
				Odd odd = new Odd(n);
				odd.start();
			}
			
			try{
				Thread.sleep(1000);
			}
			catch(InterruptedException e){
				System.out.println("Thread Interrupted");
			}
		}
	}
}
public class L12_Random{
	public static void main(String[] args){
		new Rand().start();
	}
}
