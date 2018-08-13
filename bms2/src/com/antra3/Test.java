package com.antra3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Test {

	/*static int a = 1111;
	 static
	 {
		 System.out.println(a--);
		 System.out.println(--a);
	        a = a-- - --a;
	 }
	    
	{
	        a = a++ + ++a;
	 }
	 */
	
	/*public int m1() {
		
		return(true?null:0);
	}
*/
	public static void main(String[] args) {
		
		System.out.println(3>4);
		for(int i = 0; true; i++) {
			System.out.println("Hello");
			break;
		}
		
		/* Integer i1=127;
		 Integer i2=127;
		 
		 System.out.println(i1==i2);
		
		 Integer i3=126;
		 Integer i4=126;
		 System.out.println(i3==i4);*/
	}
	
	/*public static void main(String[] args) {
		
		Employee emp=new Employee();
		emp.id=101;
		emp.name="manas";
		emp.sal=300;
		FileOutputStream fos;
		ObjectOutputStream obj;
		try {
			 fos=new FileOutputStream("abc.txt");
			 obj=new ObjectOutputStream(fos);
			obj.writeObject(emp);
			
			FileInputStream fis=new FileInputStream("abc.txt");
			ObjectInputStream obji=new ObjectInputStream(fis);
			Employee e=(Employee)obji.readObject();
			System.out.println(e.id);
			System.out.println(e.name);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			
		}
		
		
		*/
		/*int i=10;
		Integer i1=new Integer("10");
		System.out.println(i1);
		String st3="var";
		int j=Integer.parseInt(st3);
		System.out.println(j);
		
		String str1=new String("manas");
		String str2="kumar";
		*/
		/*String str=new String("manas");
		String str2=new String("manas");
		//System.out.println(str.equals(str2));
		
		
		//System.out.println(str2);
		
		StringBuffer sb=new StringBuffer("John");
		StringBuffer sb2=new StringBuffer("John");
		
		System.out.println(sb.toString().equals(sb2.toString()));
		
		System.out.println(sb.equals(sb2));
		//System.out.println(sb);
*/		
	/*	
	Student st1=new Student();
	st1.setRollNo(101);
	st1.setName("manas");
	st1.setMarks(30);
	
	Student st2=new Student();
	st2.setRollNo(101);
	st2.setName("manas");
	st2.setMarks(30);
	
	System.out.println(st1.equals(st2));*/
	//}
	
}
