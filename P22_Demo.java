import java.util.Scanner;
import AdMath.P21_Fact;

class P22_Demo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int n = sc.nextInt();
		long res = P21_Fact.facto(n);
		System.out.println(n + "! = " + res);
	}
}
