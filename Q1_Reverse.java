import java.io.*;

public class Q1_Reverse{
	public static void main(String[] args){
		BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
		String s = "", rev = "";
		int i;
		System.out.print("Enter string: ");
		try{
			s = obj.readLine();
		}
		catch(IOException e){
			System.out.println(e);
		}
		
		for(i = s.length() - 1; i > -1; i--)
			rev += s.charAt(i);
		
		System.out.println("Reversed String: " + rev);
	}
}
