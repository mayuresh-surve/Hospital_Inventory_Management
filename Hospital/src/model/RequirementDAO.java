package model;

import java.sql.ResultSet;
import java.sql.SQLException;

import Util.DbUtil;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class RequirementDAO 
{
	public static void insertIntoRequirement(String serialNo, String WardName,String ProductName, String Quantity) throws SQLException, ClassNotFoundException
	{
		String sqlQuery = "insert into requirement values ('"+serialNo+"','"+WardName+"','"+ProductName+"','"+Quantity+"')";
		try
		{
			DbUtil.dbExcecuteQuery(sqlQuery);
		}catch(SQLException e){
			System.out.println("Exception occur while inserting the data" +e);
			e.printStackTrace();
			throw e;
		}
	}
	
	public static ObservableList<Requirement> getAllRecords() throws ClassNotFoundException, SQLException
	{
		String sqlQuery = "select * from requirement order by sr_no";
		try
		{
			ResultSet rs = DbUtil.dbExcecute(sqlQuery);
			ObservableList<Requirement> req = getRequirementObjects(rs);
			return req;
		}catch(SQLException e ) {
			System.out.println("Error occured while fetching the DB" +e);
			e.printStackTrace();
			throw e;
		}
	}

	private static ObservableList<Requirement> getRequirementObjects(ResultSet rs) throws ClassNotFoundException, SQLException
	{
		try {
			ObservableList<Requirement> req = FXCollections.observableArrayList();
			
			while(rs.next())
			{
				Requirement reqt = new Requirement();
				reqt.setSrNo(rs.getInt("sr_no"));
				reqt.setWname(rs.getString("ward_name"));
				reqt.setPname(rs.getString("product_required"));
				reqt.setquan(rs.getInt("quantity"));
				req.add(reqt);
			}
			return req;
		}catch(SQLException e ) { 
			System.out.println("Error occured while fetching the DB" +e);
			e.printStackTrace();
			throw e;
		}
		
	}
}
