import java.sql.*;
import java.io.*;
public class L10_JDBC{
	Statement st;
	ResultSet res;
	String query;
	BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
	
	public L10_JDBC(){
		try{
			Class.forName("org.postgresql.Driver");
			Connection c = DriverManager.getConnection("jdbc:postgresql://john.db.elephantsql.com:5432/kblfyfsr", "kblfyfsr", "ugaYHPvD9LGnFYih_9IR1lqU_f3pfFBe");

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
			System.out.println(e);
		}
	}
	
	public static void main(String[] args){
		L10_JDBC stud = new L10_JDBC();
		stud.show();
	}
}
