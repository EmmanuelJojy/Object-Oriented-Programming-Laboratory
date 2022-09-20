import java.io.*;

public class Q3_Second{
	public static void main(String[] args)throws IOException{
		BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter no of elements: ");
		int n = Integer.parseInt(obj.readLine());
		int arr[] = new int[n];
		System.out.println("Enter elements: ");
		for(int i = 0; i < n; i++){
			System.out.print("a[" + i + "]: ");
			arr[i] = Integer.parseInt(obj.readLine());
		}
		for(int i = 0; i < arr.length - 1; i++){
			for(int j = 0; j < arr.length - i - 1; j++){
				if(arr[j] < arr[j + 1]){
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		System.out.println("Second = " + arr[1]);
	}
}
