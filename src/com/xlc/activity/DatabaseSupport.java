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
		// 1. look all the databases
		showDatabases();
		// 2. create database
		
		
		closeResource();
		
	}
	
	// load the driver
	public static void loadDriver(){
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			con = DriverManager.getConnection("jdbc:mysql://localhost/tool?user=root&password=guozhang92");
			sta = con.createStatement();
			
		} catch (Exception e) {
			System.out.println("not found ... ");
		}
		
	}

	// close
	public static void closeResource() {
		// at last close the resource
		try {
			if(res != null){
				if (!res.isClosed()) {
					res.close();
				}
			}
			
			if (sta != null) {
				if (!sta.isClosed()){
					sta.close();
				}
			}
			
			if (con != null){
				if (!con.isClosed()) {
					con.close();
				}
			}
			System.out.println("succeed close ResultSet Connection Statement");
			
		} catch (SQLException e){
			e.printStackTrace();
		}
	}
	
	// show the databases
	public static String showDatabases(){
		String r = "";
		try{
			sta.execute("show databases");
			res = sta.getResultSet();
			while(res.next()){
				String s = res.getString(1);
				r += s + "\r\n";
				System.out.println(s);
			}
		} catch(SQLException e ){
			e.printStackTrace();
		}
		return r;
	}
	
	// use the database
	public static String useDatabases(String database){
		String r = "";
		try{
			sta.execute("use " + database);
		}catch(SQLException e){
			e.printStackTrace();
		}
		return r;
	}
	
	// show the data in the databases
	public static String showDataInDatabase(String database){
		String r = "";
		try{
			useDatabases("tool");
			sta.execute("select * from tool_one");
			res = sta.getResultSet();
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
		} catch(SQLException e){
			e.printStackTrace();
		}
		return r;
	}
	
	// create the database
	public static String createDatabase(String name){
		String r = "";
		try{
			sta.execute("create database " + name);
			r = "succeed";
		}catch(SQLException e){
			e.printStackTrace();
		}
		return r;
	}
	
}
