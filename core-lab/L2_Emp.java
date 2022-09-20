

import java.util.Scanner;


class Employee
{
	private String name;
	private int age;
	private long number;
	private String address;
	private double salary;
	
	// Input
	public void setName(String name)
	{
		this.name = name;
	}
	public void setAge(int age)
	{
		this.age = age;
	}
	public void setNo(long number)
	{
		this.number = number;
	}
	public void setAd(String address)
	{
		this.address = address;
	}
	public void setSalary(double salary)
	{
		this.salary = salary;
	}
	
	// Display
	public String getName()
	{
		return name;
	}
	public int getAge()
	{
		return age;
	}
	public long getNo()
	{
		return number;
	}
	public String getAd()
	{
		return address;
	}
	public double getSalary()
	{
		return salary;
	}
}


class Officer extends Employee
{
	String specialization;
	// Input
	public void setSpec(String spec)
	{
		this.specialization = spec;
	}
	// Display
	public String getSpec()
	{
		return specialization;
	}
}

class Manager extends Employee
{
	String department;
	// Input
	public void setDept(String dept)
	{
		this.department = dept;
	}
	// Display
	public String getDept()
	{
		return department;
	}
}

class L2_Emp
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		 
		Officer o = new Officer();
		System.out.println("\nClass Officer");
		System.out.print("Enter Name: ");
		o.setName(sc.nextLine());
		System.out.print("Enter Age: ");
		o.setAge(sc.nextInt());
		System.out.print("Enter Number: ");
		o.setNo(sc.nextLong());
		System.out.print("Enter Salary: ");
		o.setSalary(sc.nextDouble());
		System.out.print("Enter Address: ");
		o.setAd(sc.next());
		System.out.print("Enter Specialization: ");
		o.setSpec(sc.next());
		
		System.out.println("\n\nOfficer\nName: "+o.getName()+"\nAge: "+o.getAge()+"\nNumber: "+o.getNo()+"\nSalary: "+o.getSalary()+"\nAddress: "+o.getAd());
		System.out.println("Specialization: "+o.getSpec());
		
		Manager m = new Manager();
		System.out.println("\n\nClass Manager");
		System.out.print("Enter Name: ");
		m.setName(sc.next());
		System.out.print("Enter Age: ");
		m.setAge(sc.nextInt());
		System.out.print("Enter Number: ");
		m.setNo(sc.nextLong());
		System.out.print("Enter Salary: ");
		m.setSalary(sc.nextDouble());
		System.out.print("Enter Address: ");
		m.setAd(sc.next());
		System.out.print("Enter Department: ");
		m.setDept(sc.next());
		
		System.out.println("\nOfficer\nName: "+m.getName()+"\nAge: "+m.getAge()+"\nNumber: "+m.getNo()+"\nSalary: "+m.getSalary()+"\nAddress: "+m.getAd());
		System.out.println("Department: "+m.getDept());
	}
}
