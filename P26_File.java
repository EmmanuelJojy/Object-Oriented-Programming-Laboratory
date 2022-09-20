import java.io.*;
public class P26_File{
	public static void main(String[] args){
		try{
			FileInputStream fin = new FileInputStream("fin.txt");
			FileOutputStream fout = new FileOutputStream("fout.txt");
			int i;
			System.out.println("\nContents of file fin.txt: ");
			for(i = fin.read(); i != -1; i = fin.read()){
				System.out.write(i);
				fout.write(i);
			}
		}
		catch(FileNotFoundException e){
			System.out.println("Check if file exist. Error encountered. " + e);
		}
		catch(IOException e){
			System.out.println("Error encountered. " + e);
		}
		System.out.println("\nSusccesfully copied from fin.txt to fout.txt\n");
	}
}
