

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class database {
	private String durl = "jdbc:mysql://localhost:3306/userdb";
	private String dbname ="root";
	private String dbpassword="Password";
	private String dbdriver = "com.mysql.jdbc.Driver";
	public void loadDriver(String Dbdriver) {
		try {
			Class.forName(Dbdriver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public Connection getConnection() {
		Connection con =null;
		try {
			con = DriverManager.getConnection(durl,dbname,dbpassword);//Open a connection
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}
	String insert(member m) {
		loadDriver(dbdriver); // Register JDBC driver
		Connection con=  getConnection();
		String result = "data enter successfully";
		String sql = "insert into dbuser.m values(?,?)";//dbuser is database name and m is member object 
		try {
			PreparedStatement ps = con.prepareStatement(sql);//Execute a query
			ps.setString(1,m.getUname());
			ps.setString(2,m.getPassword());
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result= "data not entered";
		}
		
		return result;
		
	}
}
