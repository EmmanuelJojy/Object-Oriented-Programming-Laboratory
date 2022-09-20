import java.util.Scanner;

interface StackOperations{
	void push();
	void pop();
	void display();
}

class Stack implements StackOperations{
	Scanner sc = new Scanner(System.in);
	int TOP;
	int S[];
	Stack(int size){
		S = new int[size];
		TOP = -1;
		System.out.println("MAXSIZE = " + size);
	}
	public void push(){
		if(TOP == S.length - 1){
			System.out.println("\tStack Overflow");
		}
		else{
			System.out.print("\tEnter item: ");
			int item = sc.nextInt();
			TOP++;
			S[TOP] = item;
			System.out.println("\tSuccessfully pushed " + item + ".");
		}
	}
	public void pop(){
		if(TOP == -1){
			System.out.println("\tStack Underflow");
			return;
		}
		int temp = S[TOP];
		TOP--;
		System.out.println("\tSuccessfully popped " + temp + ".");
	}
	public void display(){
		if(TOP == -1){
			System.out.println("\tSTACK EMPTY");
		}
		else{
			System.out.print("\tCurrent Stack -> ");
			for(int i = 0; i <= TOP; i++){
				System.out.print(S[i] + "\t");
			}
			System.out.println("\n");
		}
	}
	public void call(){
		while(true){
			System.out.println("\n*** STACK OPERATIONS ***");
			System.out.println("1. Push  2. Pop  3. Display 4. Exit");
			System.out.print("Enter Choice: ");
			int ch = sc.nextInt();
			switch(ch){
				case 1: push(); break;
				case 2: pop(); break;
				case 3: display(); break;
				default: return;
			}
		}
	}
	public static void main(String[] args){
		Stack obj = new Stack(5);
		obj.call();
	}
}
