package com.db;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.antra3.Employee;


public class JDBCExample {

	public static void main(String[] args) throws SQLException{
	//new scanner
	/*	Scanner sc=new Scanner(System.in);
		System.out.println("please enter the number");
		int no=sc.nextInt();
		System.out.println("please enter the name");
		String name=sc.next();
		System.out.println("please enter the sal");
		int sal=sc.nextInt();*/
		Connection con=null;
		Statement  stmt=null;
		PreparedStatement pstmt=null;
		try {
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/system", "root", "manas");
		//con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "oracle");
		
		System.out.println(con);
		con.setAutoCommit(false);
		pstmt=con.prepareStatement("insert into employee values(?,?,?)");
		pstmt.setInt(1, 3);
		pstmt.setString(2,"tianyu");
		pstmt.setInt(3, 3456);
	
		pstmt.addBatch();
		
		pstmt.setInt(1, 7);
		pstmt.setString(2, "Che1");
		pstmt.setInt(3, 123);
		pstmt.addBatch();
		
		pstmt.executeBatch();
		con.commit();
		/*stmt=con.createStatement();
		//stmt.executeUpdate("insert into emp values("+no+","+name+","+","+sal+")");
		//stmt.executeUpdate("update emp set sal=12 where no=1");
		ResultSet rs=stmt.executeQuery("select * from emp where no="+no);
		System.out.println(rs);
		ResultSetMetaData rsmt=rs.getMetaData();
		int number=rsmt.getColumnCount();
		for(int i=1;i<=number;i++) {
			System.out.println(rsmt.getColumnName(i));
		}
		
		while(rs.next()) {
			
			System.out.println(rs.getInt("no"));
			System.out.println(rs.getString("name"));
			System.out.println(rs.getInt("sal"));
		}*/
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			con.rollback();
			e.printStackTrace();
		}finally {
		try {
			pstmt.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		}
		
		/*try {
			Class cl=Class.forName("com.antra3.Employee");
			Object obj=cl.newInstance();
			Employee e=(Employee)obj;
			System.out.println(e);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	}
}
