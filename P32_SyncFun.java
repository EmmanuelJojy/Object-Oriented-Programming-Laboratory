class Display{
	synchronized void display(String message){
		System.out.print("\n[ " + message);
		try{
			Thread.sleep(1000);
		}
		catch(InterruptedException e){
			System.out.println("Thread Interrupted" + e);
		}
		System.out.print(" ]");
	}
}


class MyThread extends Thread{
	String message;
	Display obj;
	MyThread(String message, Display obj){
		this.message = message;
		this.obj = obj;
	}
	public void run(){
		obj.display(message);
	}
}


public class P32_SyncFun{
	public static void main(String[] args){
		Display obj = new Display();
		MyThread t1 = new MyThread("Message One", obj);
		MyThread t2 = new MyThread("Message Two", obj);
		MyThread t3 = new MyThread("Message Three", obj);
		t1.start();
		t2.start();
		t3.start();
	}
}
