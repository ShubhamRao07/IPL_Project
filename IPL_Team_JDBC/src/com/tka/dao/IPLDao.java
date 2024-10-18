package com.tka.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import com.tka.utility.Player;

public class IPLDao {


	public List<Player>getAllPlayer() throws SQLException {
		System.out.println("we are in IPL dao");
		String path="com.mysql.cj.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/batch1199";
		String uname="root";
		String pswd="Root";
		String sql="SELECT * FROM batch1199.player";
		try {
			Class.forName(path);
		//	System.out.println(1);
		
	Connection con= DriverManager.getConnection(url, uname, pswd);
	//System.out.println(2);
			
	Statement st=con.createStatement();
	//System.out.println(3);
	
	 
	ResultSet rs=st.executeQuery(sql);
	System.out.println("----------------------------------------------------");
	
	while(rs.next()) {
		int jercyno=rs.getInt("jercyno");
		String pname=rs.getString("name");
		int pruns=rs.getInt("runs");
		int wickets=rs.getInt("wickets");
		String tname=rs.getString("teamname");
      System.out.printf("|%5s|%10s|%10s|%10s|%10s\n",jercyno,pname,pruns,wickets,tname);
				System.out.println("-----------------------------------------------------");
	}
	
	
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
	



		
		return null;
	}

}
