import java.io.*;
public class P27_Console{
	public static void main(String[] args){
		try{
			FileInputStream fin = new FileInputStream("fin.txt");
			int i;
			for(i = fin.read(); i != -1; i = fin.read()){
				System.out.write(i);
			}
		}
		catch(FileNotFoundException e){
			System.out.println("Check if file exist. Error encountered. " + e);
		}
		catch(IOException e){
			System.out.println("Error encountered. " + e);
		}
	}
}
