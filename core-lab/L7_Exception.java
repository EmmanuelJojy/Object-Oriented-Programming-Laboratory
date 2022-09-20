class Sub{
	public void f() throws Exception{
		try{
			System.out.println("From try in F()");
			throw new Exception();
		}
		finally{
			System.out.println("From finally");
		}
	}
}
public class L7_Exception{
	public static void main(String[] args){
		try{
			Sub obj =new Sub();
			obj.f();
		}
		catch(Exception e){
			System.out.println("Handled in main()");
		}
	}
}
