package controller;

import java.sql.Connection;
import java.sql.DriverManager;



public class DB_Connection {
	public  Connection get_Connection()  {
		Connection connection=null;
		

		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/moviedb","root","root");
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
				
		return connection;
		
	}

public static void main(String[] args) throws ClassNotFoundException {
	DB_Connection obj_DB_Connection=new DB_Connection();
	System.out.println(obj_DB_Connection.get_Connection());
   

}
}