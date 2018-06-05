package DBConn;

import java.sql.*;

public class DBAccess{
	
	private Connection conn=null;
	private Statement st;
	
	public DBAccess(String driver, String connString,	String user, String password) throws SQLException, Exception{
		Class.forName(driver);
		conn = DriverManager.getConnection(connString, user, password);
		st = conn.createStatement();
	}
	
	public void executeSQL(String stmt) throws SQLException,Exception{	
		st.execute(stmt);		
	}

	public ResultSet executeSQL(String stmt, boolean returns) throws SQLException, Exception {
		ResultSet rs;
		rs = st.executeQuery(stmt);
		return rs;
	}

	public void setAutocommitFalse() throws java.sql.SQLException {
		conn.setAutoCommit(false);	
	}
	
	public void setAutocommitTrue() throws java.sql.SQLException {
		conn.setAutoCommit(true);
	}
	
	public void commitTransaction() throws java.sql.SQLException{
		conn.commit();
	}
	
	public void rollbackTransaction() throws java.sql.SQLException{
		conn.rollback();	
	}
	
	public void closeConn(){
		try {
			conn.close();	
		}
		catch(Exception e){		
			
		}
	}	
	
}