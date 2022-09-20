// Emmanuel Jojy
// S3 CSE A 53

// Q: Implement Binary Search

import java.io.*;
public class P34_BinarySearch{
	BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
	
	void display(int arr[]){
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + "  ");
		}
		System.out.println();
	}
	
	void sort(int arr[]){
		int i, j, temp;
		for(i = 0; i < arr.length - 1; i++){
			for(j = 0; j < arr.length - i -1; j++){
				if(arr[j] > arr[j + 1]){
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}
	
	void bsearch(int arr[], int key){
		int low = 0, high = arr.length - 1;
		int mid = (low + high) / 2;
		while(key != arr[mid] && low < high){
			if(key > arr[mid])
				low = mid + 1;
			else
				high = mid - 1;
			mid = (low + high) / 2;
		}
		if(key == arr[mid])
			System.out.println(key + " Found at index " + mid);
		else
			System.out.println("Element Not Found!");
	}
	
	void call()throws IOException{
		int i;
		System.out.print("Enter Number of Elements: ");
		int n = Integer.parseInt(obj.readLine());
		int arr[] = new int[n], key;
		System.out.println("Enter elements: ");
		for(i = 0; i < n; i++){
			System.out.print("arr[" + i +"]: ");
			arr[i] = Integer.parseInt(obj.readLine());
		}
		System.out.print("Input Matrix: ");
		display(arr);
		sort(arr);
		System.out.print("Sort  Matrix: ");
		display(arr);
		System.out.print("Enter Element to Search: ");
		key = Integer.parseInt(obj.readLine());
		bsearch(arr, key);
	}
	public static void main(String[] args)throws IOException{
		P34_BinarySearch obj1 = new P34_BinarySearch();
		obj1.call();
	}
}
