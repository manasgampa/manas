package net.antra;

public class Employee {

	private int id;
	private String name;
	private int sal;
	static{
		
		System.out.println("in static block");
	}
	{
		System.out.println("in instance controle flow");
	}
	public Employee() {
		System.out.println("in default");
	}
	public Employee(int id,String name,int sal) {
		this.id=id;
		this.name=name;
		this.sal=sal;
		System.out.println("in parameterized constructor");
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	public void setId(int id) {
		this.id=id;
	}
	
	public int getId() {
		
		return this.id;
	}
}
