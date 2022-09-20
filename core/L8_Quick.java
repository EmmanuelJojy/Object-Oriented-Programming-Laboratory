import java.util.Scanner;

public class L8_Quick{
	int A[], n;
	public void swap(int a, int b){
		int temp = A[a];
		A[a] = A[b];
		A[b] = temp;
	}
	public void quick(int lb, int ub){
		if(lb < ub){
			int i = lb, j = ub, pivot = A[lb];
			while(i < j){
				while(i <= ub && A[i] <= pivot){
					i++;
				}
				while(j >= lb && A[j] > pivot){
					j--;
				}
				if(i < j){
					swap(i, j);
				}
			}
			swap(lb, j);
			quick(lb, j - 1);
			quick(j + 1, ub);
		}
	}
	public void f(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number of Elements: ");
		n = sc.nextInt();
		A = new int[n];
		
		System.out.println("Enter Elements");
		for(int i = 0; i < n; i++){
			System.out.print("A[" + i + "]: ");
			A[i] = sc.nextInt();
		}
		
		System.out.print("\nUnsorted Array: ");
		for(int i = 0; i < n; i++){
			System.out.print(A[i] + "  ");
		}
		
		quick(0, n - 1);
		
		System.out.print("\nSorted Array:   ");
		for(int i = 0; i < n; i++){
			System.out.print(A[i] + "  ");
		}
		System.out.println();
	}
	public static void main(String[] args){
		L8_Quick obj = new L8_Quick();
		obj.f();
	}
}
