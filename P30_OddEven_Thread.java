// Emmanuel Jojy
// S3 CSE A
// Roll no.: 53

// Separate odd and even numbers using 
// files and thread concept.
import java.io.*;
class MyThread extends Thread{
	public void run(){
		try{
			FileInputStream fin = new FileInputStream("fin.txt");
			FileOutputStream feven = new FileOutputStream("feven.txt");
			FileOutputStream fodd = new FileOutputStream("fodd.txt");
			String s = "";
			for(int i = fin.read(); i != -1; i = fin.read()){
				i = i - '0';
				if(i >= 0 && i <= 9){
					s = s + i;
				}
				else{
					try
					{
						i = Integer.parseInt(s);
					}
					catch(Exception e){
						s = "";
						continue;
					}
					if(i % 2 == 0){
						for(int j:s.toCharArray())
							feven.write((int)j);
						feven.write('\n');
					}
					else{
						for(int j:s.toCharArray())
							fodd.write((int)j);
						fodd.write('\n');
					}
					s = "";
				}
			}
		}
		catch(FileNotFoundException e){
			System.out.println("Could not locate file. " + e);
		}
		catch(IOException e){
			System.out.println("Write Error. " + e);
		}
	}
}
public class P30_OddEven_Thread{
	public static void main(String[] args){
		MyThread obj = new MyThread();
		obj.start();
		try{
			obj.join();
		}
		catch(InterruptedException e){
			System.out.println("Thread Exception. " + e);
		}
		System.out.println("Successfully separated odd and even numbers to files.");
	}
}
