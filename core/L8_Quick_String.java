import java.io.*;
public class L8_Quick_String{
	String A[];
	int n;
	public void swap(int a, int b){
		String temp = A[a];
		A[a] = A[b];
		A[b] = temp;
	}
	public void quick(int lb, int ub){
		if(lb < ub){
			int i = lb, j = ub;
			String pivot = A[lb];
			while(i < j){
				while(i <= ub && A[i].compareToIgnoreCase(pivot) <= 0){
					i++;
				}
				while(j >= lb && A[j].compareToIgnoreCase(pivot) > 0){
					j--;
				}
				if(i < j){
					swap(i, j);
				}
			}
			swap(lb, j);
			System.out.print("\n\tCurrent Iteration Array: ");
			for(i = 0; i < n; i++){
				System.out.print(A[i] + "  ");
				if(i == j - 1 || i == j){
					System.out.print("|  ");
				}
			}
			quick(lb, j - 1);
			quick(j + 1, ub);
		}
	}
	public void f()throws IOException{
		BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter Number of Elements: ");
		n = Integer.parseInt(obj.readLine());
		A = new String[n];
		System.out.println("Enter Elements");
		for(int i = 0; i < n; i++){
			System.out.print("A[" + i + "]: ");
			A[i] = obj.readLine();
		}
		System.out.print("\nUnsorted Array: ");
		for(int i = 0; i < n; i++){
			System.out.print(A[i] + "  ");
		}
		System.out.println();
		quick(0, n - 1);
		System.out.print("\n\nSorted Array:   ");
		for(int i = 0; i < n; i++){
			System.out.print(A[i] + "  ");
		}
		System.out.println();
	}
	public static void main(String[] args)throws IOException{
		L8_Quick_String obj = new L8_Quick_String();
		obj.f();
	}
}
