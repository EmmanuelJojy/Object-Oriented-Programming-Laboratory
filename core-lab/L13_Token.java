import java.io.*;
import java.util.*;

public class L13_Token{
	public static void main(String[] args){
		String s = "";
		int sum = 0, n;
		
		try{
			BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("Enter numbers: ");
			s = obj.readLine();
		}
		catch(IOException e){
			System.out.println(e);
		}
		
		System.out.print("\nNumbers are: ");
		StringTokenizer token = new StringTokenizer(s, " ");
		while(token.hasMoreTokens()){
			n = Integer.parseInt(token.nextToken());
			System.out.print(n + ", ");
			sum += n;
		}
		System.out.println("\nSum is " + sum);
	}
}
