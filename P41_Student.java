import java.sql.*;
import java.io.*;
public class P41_Student{
	Statement st;
	ResultSet res;
	String query;
	BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
	
	public P41_Student(){
		try{
			Class.forName("org.postgresql.Driver");
			Connection c = DriverManager.getConnection("jdbc:postgresql://john.db.elephantsql.com:5432/", "kblfyfsr", "ugaYHPvD9LGnFYih_9IR1lqU_f3pfFBe");

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
	
	public void show(){
		try{
			query = "SELECT * FROM stud ORDER BY ROLL ASC;";
			res = st.executeQuery(query);
			System.out.println("\n\tROLL\tNAME\t\t\tDEPT\tCGPA\n");
			while(res.next()){
				System.out.println("\t" + res.getString("ROLL") + "\t" + res.getString("NAME") + "\t\t" + res.getString("DEPT") + "\t" + res.getDouble("CGPA"));
			}
		}
		catch(SQLException e){
			System.out.println("");
		}
	}
	
	public void insert(){
		try{
			System.out.println("Enter details:");
			System.out.print("\tROLL NO:\t");
			int r = Integer.parseInt(obj.readLine());
			System.out.print("\tNAME:\t\t");
			String name = obj.readLine();
			System.out.print("\tDEPT:\t\t");
			String dept = obj.readLine();
			double cgpa;
			while(true){
				System.out.print("\tCGPA:\t\t");
				cgpa = Double.parseDouble(obj.readLine());
				if(cgpa >= 0 && cgpa <= 10)
					break;
				System.out.println("\tCheck CGPA Range between [0, 10]");
			}
			query = "INSERT INTO stud VALUES(" + r + ",'" + name + "','" + dept + "'," + cgpa + ");";
			st.executeUpdate(query);
			System.out.println("\tSuccessfully Inserted!");
		}
		catch(SQLException e){
			System.out.println("\tDUPLICATE ROLL NUMBER. PLEASE TRY AGAIN\n\t" + e);
		}
		catch(IOException e){
			System.out.println("VERIFY INPUT. PLEASE TRY AGAIN\n\t" + e);
		}
	}
	public void update(){
		int roll = 0;
		try{
			System.out.print("\n\tROLL to update: ");
			roll = Integer.parseInt(obj.readLine());
			query = "SELECT * FROM stud WHERE ROLL = " + roll + ";";
			res = st.executeQuery(query);
			res.next();
			System.out.println("\n\tNAME\t\t\tDEPT\tCGPA");
			System.out.println("\t" + res.getString("NAME") + "\t\t" + res.getString("DEPT") + "\t" + res.getString("CGPA"));
		}
		catch(SQLException e){
			System.out.println("\tCOULD NOT FIND ROLL NO.\n\t" + e);
			return;
		}
		catch(IOException e){
			System.out.println(e);
		}
		
		try{
			query = "UPDATE stud SET ";
			char ch;
			System.out.print("\n\tUpdate NAME[y/n]: ");
			ch = obj.readLine().charAt(0);
			if(ch == 'y'){
				System.out.print("\t  L NAME: ");
				query = query + "NAME = '" + obj.readLine() + "', ";
			}
			
			System.out.print("\n\tUpdate DEPT[y/n]: ");
			ch = obj.readLine().charAt(0);
			if(ch == 'y'){
				System.out.print("\t  L DEPT: ");
				query = query + "DEPT = '" + obj.readLine() + "', ";
			}
			
			System.out.print("\n\tUpdate CGPA[y/n]: ");
			ch = obj.readLine().charAt(0);
			if(ch == 'y'){
				System.out.print("\t  L CGPA: ");
				query = query + "CGPA = " + Double.parseDouble(obj.readLine()) + ", ";
			}
			query = query.substring(0, query.length() - 2) + " WHERE ROLL = " + roll + ";";
			
			st.executeUpdate(query);
			System.out.println("\tRecord Updated Successfully");
		}
		catch(SQLException e){
			System.out.print("\n\tNo input.\n\t" + e);
			return;
		}
		catch(IOException e){
			System.out.println(e);
		}
	}
	
	public void delete(){
		int roll = 0;
		try{
			System.out.print("\n\tROLL to DELETE: ");
			roll = Integer.parseInt(obj.readLine());
			query = "SELECT * FROM stud WHERE ROLL = " + roll + ";";
			res = st.executeQuery(query);
			res.next();
			System.out.println("\n\tNAME\t\tDEPT\tCGPA");
			System.out.println("\t" + res.getString("NAME") + "\t" + res.getString("DEPT") + "\t" + res.getString("CGPA"));
		}
		catch(SQLException e){
			System.out.println("\tCOULD NOT FIND ROLL NO.\n\t" + e);
			return;
		}
		catch(IOException e){
			System.out.println(e);
			return;
		}
		
		try{
			System.out.print("\tDelete above record[y/n]: ");
			char ch = obj.readLine().charAt(0);
			if(ch == 'y'){
				query = "DELETE FROM stud WHERE ROLL = " + roll + ";";
				st.executeUpdate(query);
				System.out.println("\n\tRecord deleted successfully");
			}
		}
		catch(SQLException e){
			System.out.println(e);
		}
		catch(IOException e){
			System.out.println(e);
		}
	}
	
	public void f(){
		while(true){
			System.out.println("\n*** STUDENT DB OPTIONS ***");
			System.out.println("1. Show All Records\n2. Insert Record\n3. Update Record\n4. Delete Student\n5. Exit");
			System.out.print("Enter Choice: ");
			char ch = '1';
			try{
				ch = obj.readLine().charAt(0);
			}
			catch(IOException e){
				System.out.println(e);
			}
			switch(ch){
				case '1': show(); break;
				case '2': insert(); break;
				case '3': update(); break;
				case '4': delete(); break;
				case '5': return;
			}
		}
	}
	public static void main(String[] args){
		P41_Student stud = new P41_Student();
		stud.f();
	}
}
