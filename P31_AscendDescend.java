class Ascend{
	int arr[];
	Ascend(int arr[]){
		this.arr = arr;
	}
	public void call(){
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
		for(i = 0; i < arr.length; i++){
			System.out.print(arr[i] + "   ");
		}
	}
}
class Descend{
	int arr[];
	Descend(int arr[]){
		this.arr = arr;
	}
	public void call(){
		int i, j, temp;
		for(i = 0; i < arr.length - 1; i++){
			for(j = 0; j < arr.length - i -1; j++){
				if(arr[j] < arr[j + 1]){
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		for(i = 0; i < arr.length; i++){
			System.out.print(arr[i] + "   ");
		}
	}
}
public class P31_AscendDescend{
	public static void main(String[] args){
		int arr[] = {20, 18, 23, 45};
		Ascend obj = new Ascend(arr);
		obj.call();
		Descend obj1 = new Descend(arr);
		obj1.call();
	}
}
