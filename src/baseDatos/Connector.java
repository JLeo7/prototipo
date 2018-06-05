package DBConn;

import java.io.*;
import java.util.TreeMap;
import java.util.Properties;
 
public class Connector{
	
	private DBAccess conn = null;

    public Connector() {
        
    }
	 
	public DBAccess getConector() throws java.sql.SQLException,Exception{
            
            TreeMap param = getParams();
            
            if (conn == null) {			
            	conn = new DBAccess("com.mysql.jdbc.Driver","jdbc:mysql://" + param.get("dbhost") + ":" + param.get("dbport") + "/" + param.get("dbschema"),
                                    param.get("dbuser").toString(),param.get("dbpassword").toString());
            }
            
            return conn;
	}
        
	public TreeMap getParams() throws FileNotFoundException, IOException {
	    
	    TreeMap parametros = new TreeMap();
	    Properties prop = new Properties();
	    InputStream input = new FileInputStream(System.getProperty("user.dir") + "/db.properties");
	    
	    prop.load(input);
	    
	    parametros.put("dbhost",prop.getProperty("dbhost"));
	    parametros.put("dbport",prop.getProperty("dbport"));
	    parametros.put("dbschema",prop.getProperty("dbschema"));
	    parametros.put("dbuser",prop.getProperty("dbuser"));
	    parametros.put("dbpassword",prop.getProperty("dbpassword"));
	    
	    return parametros;
	}
	
}
