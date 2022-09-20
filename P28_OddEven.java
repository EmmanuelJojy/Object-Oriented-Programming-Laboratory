// Emmanuel Jojy
// Roll no.: 53
// S3 CSE A

// Take an input file and copy odd digits and even digits to separate file

import java.io.*;
public class P28_OddEven{
	public static void main(String[] args)throws FileNotFoundException, IOException{
		FileInputStream fin = new FileInputStream("fin.txt");
		FileOutputStream feven = new FileOutputStream("feven.txt");
		FileOutputStream fodd = new FileOutputStream("fodd.txt");
		
		for(int i = fin.read(); i != -1; i = fin.read()){
			i = i - '0';
			if(i >= 0 && i<= 9){
				if(i % 2 == 0){
					feven.write(i + '0');
					feven.write('\n');
				}
				else{
					fodd.write(i + '0');
					fodd.write('\n');
				}
			}
		}
	}
}
