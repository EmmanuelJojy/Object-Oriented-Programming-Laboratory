//Emmanuel Jojy 
//S3 CSE A
//Roll no.: 53

//Program illustrating Abstract Classes
//Lab Cycle Program

import java.util.*;
public class L4_Palin{
	void fun(){
		System.out.print("Enter String: ");
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int i, j;
		for(i = 0, j = s.length() - 1; i <= j; i++, j--){
			if(s.charAt(i) != s.charAt(j)){
				System.out.println(s + " Not Palindrome");
				return;
			}
		}
		System.out.println(s + " Is Palindrome");
	}
	public static void main(String[] args){
		L4_Palin obj = new L4_Palin();
		obj.fun();
	}
}
