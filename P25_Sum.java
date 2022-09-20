import java.io.*;
public class P25_Sum{
	public static void main(String[] args)throws IOException{
		BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter 1st Number: ");
		int a = Integer.parseInt(obj.readLine());
		System.out.print("Enter 2st Number: ");
		int b = Integer.parseInt(obj.readLine());
		System.out.println(a + " + " + b + " = " + (a+b));
	}
}
