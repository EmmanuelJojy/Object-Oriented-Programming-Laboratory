import java.util.Scanner;
class Node{
	int data;
	Node prev, next;
}

class DLL{
	Scanner sc = new Scanner(System.in);
	private Node head, tail;
	DLL(){
		head = null;
		tail = null;
	}
	
	private void ins_b(){
		Node n = new Node();
		System.out.print("\tEnter data to insert: ");
		n.data = sc.nextInt();
		n.next = head;
		n.prev = null;
		if(head != null)
			head.prev = n;
		else
			tail = n;
		head = n;
		System.out.println("\tSuccessfully inserted " + n.data + ".");
	}
	
	private void ins_e(){
		Node n = new Node();
		System.out.print("\tEnter data to insert: ");
		n.data = sc.nextInt();
		n.next = null;
		n.prev = tail;
		if(tail != null)
			tail.next = n;
		else
			head = n;
		tail = n;
		System.out.println("\tSuccessfully inserted " + n.data + ".");
	}
	
	private void ins_p(){
		Node n = new Node();
		System.out.print("\tEnter position: ");
		int pos = sc.nextInt();
		if(pos < 1){
			System.out.println("\tCheck your position. PositionOutOfBounds");
			return;
		}
		if(pos == 1){
			ins_b();
			return;
		}
		try{
			Node temp, loc;
			temp = head;
			for(int i = 1; i < pos - 1 ; i++)
				temp = temp.next; // Seg fault prone
			loc = temp.next; // Seg fault prone
			temp.next = n;
			n.prev = temp;
			n.next = loc;
			if(loc != null){
				loc.prev = n;
			}
			else{
				tail = n;
			}
		}
		catch(Exception e){
			System.out.println("\tCheck your position. " + e);
			return;
		}
		System.out.print("\tEnter data to insert: ");
		n.data = sc.nextInt();
		System.out.println("\tSuccessfully inserted " + n.data + ".");
	}
	
	private void del_b(){
		if(head == null && tail == null){
			System.out.println("\n\tCurent DLL Empty");
		}
		else{
			Node loc = head;
			if(head == tail){
				head = null;
				tail = null;
			}
			else{
				head = head.next;
				head.prev = null;
			}
			System.out.println("\tSuccessfully deleted " + loc.data);
		}
	}
	
	private void del_e(){
		if(head == null && tail == null){
			System.out.println("\n\tCurent DLL Empty");
		}
		else{
			Node loc = tail;
			if(head == tail){
				head = null;
				tail = null;
			}
			else{
				tail = tail.prev;
				tail.next = null;
			}
			System.out.println("\tSuccessfully deleted " + loc.data);
		}
	}
	
	private void del_p(){
		Node n = new Node();
		System.out.print("\tEnter position: ");
		int pos = sc.nextInt();
		if(pos < 1){
			System.out.println("\tCheck your position.");
			return;
		}
		if(pos == 1){
			del_b();
			return;
		}
		try{
			Node temp, loc;
			temp = head;
			for(int i = 1; i < pos - 1 ; i++)
				temp = temp.next; // Seg fault prone
			loc = temp.next; // Seg fault prone
			if(loc != null){
				temp.next = loc.next;
				if(loc.next == null)
					tail = temp;
				else
					loc.next.prev = temp;
				System.out.println("\tSuccessfully deleted " + loc.data);
			}
			else{
				throw new Exception();
			}
		}
		catch(Exception e){
			System.out.println("\tCheck your position. " + e);
			return;
		}
	}
	
	private void display_h(){
		if(head == null && tail == null){
			System.out.println("\n\tCurent DLL Empty");
		}
		else{
			System.out.print("\n\tCurrent DLL >>> _head_ <-> ");
			Node temp;
			for(temp = head; temp != null; temp = temp.next)
				System.out.print(temp.data + " <-> ");
			System.out.println("_tail_");
		}
	}
	
	
	private void display_t(){
		if(head == null && tail == null){
			System.out.println("\n\tCurent DLL Empty");
		}
		else{
			System.out.print("\n\tCurrent DLL >>> _tail_ <-> ");
			Node temp;
			for(temp = tail; temp != null; temp = temp.prev)
				System.out.print(temp.data + " <-> ");
			System.out.println("_head_");
		}
	}
	
	public void f(){
		while(true){
			System.out.println("\n*** Doubly Linked List [DLL] ***");
			System.out.println("Insert at >>>  1. Beginning  2. End  3. Specific Position");
			System.out.println("Delete at >>>  4. Beginning  5. End  6. Specific Position");
			System.out.println("Display   >>>  7. From Head  8. From Tail");
			System.out.println("          >>>  9. Exit");
			System.out.print("Enter the choice: ");
			int ch = sc.nextInt();
			switch(ch){
				case 1: ins_b(); break;
				case 2: ins_e(); break;
				case 3: ins_p(); break;
				
				case 4: del_b(); break;
				case 5: del_e(); break;
				case 6: del_p(); break;
				
				case 7: display_h(); break;
				case 8: display_t(); break;
				
				default : return;
			}
		}
		
	}
}

class List{
	public static void main(String[] args){
		DLL obj = new DLL();
		obj.f();
	}
}
