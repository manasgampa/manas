package com.antra3;

import java.io.Serializable;

public class Employee implements Serializable {

	public int id;
	public transient String name;
	public int sal;
	
	static {
		
		new Employee();
	}
	
}
