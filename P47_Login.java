// Emmanuel Jojy
// Roll no.: 53
// S3 CSE A

// Assignment 2
// Set 2 - Q2

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class P47_Login implements ActionListener{
	Statement st;
	ResultSet res;
	String query;

	CardLayout card;
	JPanel p, p1, p2, p3, p4;
	JButton up, in, upsub, insub, home;
	JTextField upname, upuser, inuser;
	JPasswordField uppass, inpass;
	JLabel l;
	
	public P47_Login(){
		try{
			Class.forName("org.postgresql.Driver");
			Connection c = DriverManager.getConnection("jdbc:postgresql://john.db.elephantsql.com:5432/kblfyfsr", "kblfyfsr", "ugaYHPvD9LGnFYih_9IR1lqU_f3pfFBe");

			st = c.createStatement();
		}
		catch(ClassNotFoundException e){
			System.out.println("Class Missing. " + e);
		}
		catch(SQLException e){
			System.out.println(e);
		}
	
		JFrame f = new JFrame("MyFrame");
		f.setSize(1000, 1000);
		f.setVisible(true);
		f.setLayout(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Main Panel - CARDLAYOUT
		card = new CardLayout();
		p = new JPanel(card);
		
		
		// First Page Panel
		p1 = new JPanel();
		p1.setLayout(null);
		up = new JButton("Sign Up");
		in = new JButton("Sign In");
		up.setBounds(533, 350, 100, 40);
		in.setBounds(733, 350, 100, 40);
		in.addActionListener(this);
		up.addActionListener(this);
		p1.add(up);
		p1.add(in);
		p.add("1", p1);
		// ----------------
		
		
		// Sign Up Page
		p2 = new JPanel();
		p2.setLayout(null);
		upname = new JTextField(150);
		upuser = new JTextField(150);
		uppass = new JPasswordField(150);
		upname.setBounds(633, 250, 300, 40);
		upuser.setBounds(633, 300, 300, 40);
		uppass.setBounds(633, 350, 300, 40);
		JLabel l1 = new JLabel("NAME");
		JLabel l2 = new JLabel("USERNAME");
		JLabel l3 = new JLabel("PASSWORD");
		l1.setBounds(483, 250, 100, 40);
		l2.setBounds(483, 300, 100, 40);
		l3.setBounds(483, 350, 100, 40);
		upsub = new JButton("SIGN UP");
		upsub.setBounds(833, 450, 100, 40);
		upsub.addActionListener(this);
		p2.add(upname);
		p2.add(upuser);
		p2.add(uppass);
		p2.add(l1);
		p2.add(l2);
		p2.add(l3);
		p2.add(upsub);
		p.add("2", p2);
		// ----------------
		
		// Sign Up Page
		p3 = new JPanel();
		p3.setLayout(null);
		inuser = new JTextField(150);
		inpass = new JPasswordField(150);
		inuser.setBounds(633, 300, 300, 40);
		inpass.setBounds(633, 350, 300, 40);
		JLabel l4 = new JLabel("USERNAME");
		JLabel l5 = new JLabel("PASSWORD");
		l4.setBounds(483, 300, 100, 40);
		l5.setBounds(483, 350, 100, 40);
		insub = new JButton("SIGN IN");
		insub.setBounds(833, 450, 100, 40);
		insub.addActionListener(this);
		p3.add(inuser);
		p3.add(inpass);
		p3.add(l4);
		p3.add(l5);
		p3.add(insub);
		p.add("3", p3);
		// ----------------
		
		// Common Area
		home = new JButton("HOME");
		home.setBounds(0, 0, 100, 40);
		home.addActionListener(this);
		f.add(home);
		l = new JLabel("", JLabel.CENTER);
		l.setBounds(483, 450, 400, 40);
		f.add(l);
		// ----------------
		
		p.setBounds(0, 0, 1366, 720);
		f.add(p);
	}
	public void actionPerformed(ActionEvent e){
		JButton b = (JButton) e.getSource();
		l.setText("");
		if(b == home)
			card.show(p, "1");
		else if(b == up)
			card.show(p, "2");
		else if(b == in)
			card.show(p, "3");
		else if(b == upsub){
			String name, user, pass;
			name = upname.getText();
			user = upuser.getText();
			pass = new String(uppass.getPassword());
			query = "INSERT INTO users(NAME, USERNAME, PASS) VALUES('" + name + "', '" + user + "', '" + pass + "');";
			try{
				st.executeUpdate(query);
			}
			catch(SQLException er){
				l.setText("[" + user + "] ALREADY EXIST IN THE SYSTEM !");
				return;
			}
			l.setText("[" + user + "] have successfully registered.");
		}
		else if(b == insub){
			String user, pass;
			user = inuser.getText();
			pass = new String(inpass.getPassword());
			query = "SELECT * FROM users WHERE USERNAME = '" + user + "';";
			try{
				res = st.executeQuery(query);
				res.next();
				if(pass.equals(res.getString("PASS")))
					l.setText("WELCOME [" + user + "].");
				else
					l.setText("WRONG USERNAME/ PASSWORD");
			}
			catch(SQLException er){
				l.setText("WRONG USERNAME/ PASSWORD");
			}
		}
	}
	
	public static void main(String[] Args){
		new P47_Login();
	}
}

