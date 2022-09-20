// Emmanuel Jojy
// Roll no: 53
// S3 CSE A

// JDBC Q2

import java.sql.*;
import java.io.*;
public class P43_JDBC{
	Statement st;
	ResultSet res;
	String query;
	BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
	
	public P43_JDBC(){
		try{
			Class.forName("org.postgresql.Driver");
			Connection c = DriverManager.getConnection("jdbc:postgresql://john.db.elephantsql.com:5432/ghjyduvs", "ghjyduvs", "RN7_ne-JI4lm6NpjTWhQ46-YgiYvFGaJ");

			st = c.createStatement();
		}
		catch(ClassNotFoundException e){
			System.out.println("Class Missing. " + e);
			System.exit(0);
		}
		catch(SQLException e){
			System.out.println(e);
			System.exit(0);
		}
	}
	
	public void update(){
		try{
			query = "UPDATE stud SET NAME = 'NEETHU' WHERE ROLL = '12';";
			st.executeUpdate(query);
		}
		catch(SQLException e){
			System.out.println(e);
		}
		System.out.println("\n\tRecord Updated Successfully");
	}
	
	public void delete(){
		int roll = 0;
		try{
			query = "DELETE FROM stud WHERE NAME = 'CINI';";
			st.executeUpdate(query);
		}
		catch(SQLException e){
			System.out.println("\tCOULD NOT LOCATE 'CINI'.\n\t" + e);
			return;
		}
		System.out.println("\n\tRecord CINI DELETED");
	}
	
	public void filter(){
		System.out.println("\n\tRank List: ");
		try{
			query = "SELECT * FROM stud WHERE MARK > 70 ORDER BY MARK DESC;";
			res = st.executeQuery(query);
			System.out.println("\n\tROLL\tNAME\t\t\tMARK\n");
			while(res.next()){
				System.out.println("\t" + res.getString("ROLL") + "\t" + res.getString("NAME") + "\t\t" + res.getString("MARK"));
			}
		}
		catch(SQLException e){
			System.out.println("");
		}
	}
	
	public void show(){
		System.out.println("\n\tRank List: ");
		try{
			int r = 1;
			query = "SELECT * FROM stud ORDER BY MARK DESC;";
			res = st.executeQuery(query);
			System.out.println("\n\tRANK\tROLL\tNAME\t\tMARK\n");
			while(res.next()){
				System.out.println("\t" + r + "\t" + res.getString("ROLL") + "\t" + res.getString("NAME") + "\t\t" + res.getString("MARK"));
				r++;
			}
		}
		catch(SQLException e){
			System.out.println("");
		}
	}
	
	public void f(){
		while(true){
			System.out.println("\n*** STUDENT DB OPTIONS ***");
			System.out.println("1. Update Roll 12 to 'NEETHU'\n2. Delete 'cini'\n3. Show greater than 70\n4. Rank List\n5. Exit");
			System.out.print("Enter Choice: ");
			char ch = '1';
			try{
				ch = obj.readLine().charAt(0);
			}
			catch(IOException e){
				System.out.println(e);
			}
			switch(ch){
				case '1': update(); break;
				case '2': delete(); break;
				case '3': filter(); break;
				case '4': show(); break;
				case '5': return;
			}
		}
	}
	public static void main(String[] args){
		P43_JDBC stud = new P43_JDBC();
		stud.f();
	}
}
