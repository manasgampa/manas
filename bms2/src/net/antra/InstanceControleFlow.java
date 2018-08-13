package net.antra;

public class InstanceControleFlow {

	
	public static void main(String[] args) {
		
		Employee emp=new Employee();
		Employee emp1=new Employee(1,"manas",123);
		int id=emp.getId();
		System.out.println(id);
	}
}
