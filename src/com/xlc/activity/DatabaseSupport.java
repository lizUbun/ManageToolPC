package com.xlc.activity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseSupport {

	public static Connection con;
	public static Statement sta;
	public static ResultSet res;
	public static void main(String[] args) {
		loadDriver();
		
	}
	
	// load the driver
	public static void loadDriver(){
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			con = DriverManager.getConnection("jdbc:mysql://localhost/tool?user=root&password=guozhang92");
			sta = con.createStatement();
//			if(sta.executeQuery("select * from tool;") != null){
//				res = sta.getResultSet();
//				for(int i = 0 ;i < res.getRow();i++){
//					System.out.println("result : " + res.getString(i));
//				}
//			}
			sta.execute("use tool");
			sta.execute("select * from tool_one");
			res = sta.getResultSet();
//			String s = res.getString(1);
//			System.out.println(s);
//			System.out.println(res.getString(0));
//			System.out.println(res);
			int rowCount = 0; 
			while(res.next()) { 
				ResultSetMetaData rsmd = res.getMetaData();
				String s = rsmd.getColumnName(1);
				String s5 = rsmd.getColumnName(2);
				String s6 = rsmd.getColumnName(3);
				System.out.println("" + s + " # " + s5 + " # " + s6);
				String s2 = res.getString(1);
				String s3 = res.getString(2);
				String s4 = res.getString(3);
				System.out.println("" + s2 + " # " + s3 + " # " + s4);
				System.out.println("...............................................");
				rowCount++; 
			}
			System.out.println("******************************************************");
			System.out.println("res length : " + rowCount);
			
			System.out.println("succeed ... ");
		} catch (Exception e) {
			System.out.println("not found ... ");
		}
		
		try {
			if(res != null){
				res.close();
			}
			sta.close();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
