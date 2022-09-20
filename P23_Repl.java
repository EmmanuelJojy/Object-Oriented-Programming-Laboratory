import java.util.Scanner;
public class P23_Repl 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter string: ");
		String s1 = sc.nextLine();
		System.out.print("Enter string to be replaced: ");
		String s2 = sc.nextLine();
		System.out.print("Enter string to be replaced with: ");
		String s3 = sc.nextLine();
		int n = s1.length();
		String res = s1.replaceAll(s2,s3);
		System.out.print("Result: "+res);
	}
}
