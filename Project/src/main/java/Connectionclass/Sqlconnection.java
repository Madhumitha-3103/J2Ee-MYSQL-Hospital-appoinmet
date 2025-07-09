package Connectionclass;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Packagepojo.Pojoclass;

public class Sqlconnection {
	  public void insert(int appNo, String patientName, int patientAge, String patientDob, String doctorName, String dateandtime)throws SQLException, ClassNotFoundException{
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/Hospitals?autoReconnect=true&&useSSL=false","root","Madhu@31");
	PreparedStatement p=c.prepareStatement("insert into Appoinments values(?,?,?,?,?,?)");
	p.setInt(1, appNo);
	p.setString(2, patientName);
	p.setInt(3, patientAge);
	p.setString(4, patientDob);
	p.setString(5, doctorName);
	p.setString(6, dateandtime);
	int i=p.executeUpdate(); 
	
	System.out.println(i+"Printed Successfully");
	c.close();
	p.close();
	}

	public List<Pojoclass> getRecord() throws ClassNotFoundException, SQLException{
		List<Pojoclass> addpatdet= new ArrayList<Pojoclass>();
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Hospitals?autoReconnect=true&&useSSL=false","root","Madhu@31");
		Statement stmt=con.createStatement();
		ResultSet res=stmt.executeQuery("select * from Appoinments");
		
		while(res.next()){
			System.out.println(res.getInt(1)+res.getString(2)+res.getInt(3)+res.getString(4)+res.getString(5)+res.getString(6));
			addpatdet.add(new Pojoclass(res.getInt(1),res.getString(2),res.getInt(3),res.getString(4),res.getString(5),res.getString(6)));
		
		}
		return addpatdet;
	}
	public void deleteRecord(int appNo) throws SQLException, ClassNotFoundException{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Hospitals?autoReconnect=true&&useSSL=false","root","Madhu@31");
		PreparedStatement p=con.prepareStatement("delete from Appoinments where appNo=?");
		p.setInt(1, appNo);
		p.executeUpdate();
		System.out.println("deleted successfully");
		con.close();
	}
	void update(int appNo, String patientName, int  patientAge, String patientDob, String doctorName, String dateandtime)throws SQLException, ClassNotFoundException{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Hospitals?autoReconnect=true&&useSSL=false","root","Madhu@31");
		PreparedStatement stmt=con.prepareStatement("update Appoinments set patientName=?, patientAge=?, patientDob=?, doctorName=?, dateandtime=? where appNo=?");
		stmt.setString(1, patientName);
		stmt.setInt(2, patientAge);
		stmt.setString(3, patientDob);
		stmt.setString(4, doctorName);
		stmt.setString(5, dateandtime);
		stmt.setInt(6, appNo);
		
		stmt.close();
		con.close();
		}

}
