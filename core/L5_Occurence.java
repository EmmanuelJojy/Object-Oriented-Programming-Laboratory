// Emmanuel Jojy
// S3 CSE A
// Roll No. 53

// Q: Calculate and display the frequency of a specific character in a string.
// Lab Cycle Program

import java.util.Scanner;
class L5_Occurence{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s;
		char ch;
		int count = 0, i = 0;
		System.out.print("Enter String: ");
		s = sc.nextLine();
		System.out.print("Enter Character: ");
		ch = sc.next().charAt(0);
		while(i < s.length()){
			i = s.indexOf(ch, i);
			if(i == -1){
				break;
			}
			else{
				count++;
				i++;
			}
		}
		System.out.println("\n" + ch + " appears " + count + " times.");
	}
}
