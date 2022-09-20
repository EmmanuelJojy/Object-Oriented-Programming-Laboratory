import java.util.*;

public class P24_Camel{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s;
		char ch;
		int i = 0;
		System.out.print("Enter String: ");
		s = sc.nextLine();
		System.out.print(s.charAt(0));
		while(i < s.length()){
			i = s.indexOf(' ', i);
			if(i == -1){
				break;
			}
			else{
				i++;
				System.out.print(s.charAt(i));
			}
		}
	}
}
