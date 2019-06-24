package Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.sun.rowset.CachedRowSetImpl;

public class DbUtil {
	 private static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	 private static Connection con = null;
	 private static final String connStr = "jdbc:mysql://localhost:3306/hospital";
	 
	 //opening the connection
	 public static void dbConnect() throws SQLException, ClassNotFoundException{
		 try {
			 Class.forName(JDBC_DRIVER);
		 }catch(ClassNotFoundException e) {
			 System.out.println("Where is your MySQL JDBC Driver?");
			 e.printStackTrace();
			 throw e;
		 }
		 System.out.println("JDBC Driver has been registered!");
		 try {
			 con = DriverManager.getConnection(connStr, "root", "08M15b28j");
		 }	
		 catch(SQLException e) {
			 System.out.println("Connection Failed! Check output console" +e );
			 throw e;
		 }
	 }
	 //closing the connection
	 public static void dbDisconnect() throws SQLException{
		 try {
			 if(con != null && !con.isClosed()) {
				 con.close();
			 }
		 }
		 catch(Exception e) {
			 throw e;
		 }
	 }
	 //this is to insert,delete and update
	 public static void dbExcecuteQuery(String sqlStmt) throws SQLException, ClassNotFoundException{
		 Statement stmt = null;
		 try {
			 dbConnect();
			 stmt = con.createStatement();
			 stmt.executeUpdate(sqlStmt);
		 }
		 catch(SQLException e) {
			 System.out.println("Problem occured at dbExecuteQuery operation" +e);
			 throw e;
		 }
		 finally {
			 if(stmt != null) {
				 stmt.close();
			 }
			 dbDisconnect();
		 }
	 }
	 //This is to show database
	public static ResultSet dbExcecute(String sqlQuery) throws ClassNotFoundException, SQLException{
		 Statement stmt = null;
		 ResultSet rs = null;
		 CachedRowSetImpl crs = null;
		 try {
			 dbConnect();
			 stmt = con.createStatement();
			 rs = stmt.executeQuery(sqlQuery);
			 crs = new CachedRowSetImpl();
			 crs.populate(rs);
		 }
		 catch(SQLException e) {
			 System.out.println("Error occured in dbExcute operation" +e);
			 throw e;
		 }
		 finally {
			 if(rs != null) {
				 rs.close();
			 }
			 if(stmt != null) {
				 stmt.close();
			 }
			 dbDisconnect();
		 }
		 return crs;
	 }
}
