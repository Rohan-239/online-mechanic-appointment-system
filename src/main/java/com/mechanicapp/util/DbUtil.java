package com.mechanicapp.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtil {
		
		private final static String DRIVER_CLASS= "";
		private final static String URL="jdbc:mysql://localhost:3306/mechanicapp";
		private final static String USERNAME="root";
		private final static String PASSWORD="rootpassword";
		private static Connection connection=null;
		public static Connection getConnection() {
			try {
				connection=DriverManager.getConnection(URL, USERNAME, PASSWORD);
				System.out.println("------- Connection Successfull -------");
			} catch (SQLException e) {
				System.err.println("------- Connection Unsuccessfull -------");
				System.err.print(e);
			}
			return connection;
		}
		 

}
