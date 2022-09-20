import java.io.*;
public class P28_OddEven_Final{
	public static void main(String[] args)throws FileNotFoundException, IOException{
		FileInputStream fin = new FileInputStream("fin.txt");
		FileOutputStream feven = new FileOutputStream("feven.txt");
		FileOutputStream fodd = new FileOutputStream("fodd.txt");
		String s = "";
		for(int i = fin.read(); i != -1; i = fin.read()){
			i = i - '0';
			if(i >= 0 && i <= 9){
				s = s + i;
			}
			else{
				try
				{
					i = Integer.parseInt(s);
				}
				catch(Exception e){
					s = "";
					continue;
				}
				if(i % 2 == 0){
					for(int j:s.toCharArray())
						feven.write((int)j);
					feven.write('\n');
				}
				else{
					for(int j:s.toCharArray())
						fodd.write((int)j);
					fodd.write('\n');
				}
				s = "";
			}
		}
	}
}
