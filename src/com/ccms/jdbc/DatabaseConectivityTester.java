package com.ccms.jdbc;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DatabaseConectivityTester
 */
@WebServlet("/DatabaseConectivityTester")
public class DatabaseConectivityTester extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	//set the variables for jdbc connection
		String jdbcUrl="jdbc:mysql://localhost:3306/web_customer_tracker?useSSL=false";
		String userName="hbstudent";
		String password="hbstudent";
		String driver="com.mysql.cj.jdbc.Driver";
		
		try {
			Class.forName(driver);
			
			PrintWriter out=response.getWriter();
			out.println("Establishing The Connection.....");
			Connection myConnection=DriverManager.getConnection(jdbcUrl,userName,password);
			out.println("Successfully Connected to the Database.");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	
	
	}

}
