
import java.nio.file.*;import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;




; 
public class ReadTextFromFile 
{ 
	ConnectToDB db;
	public ReadTextFromFile() throws SQLException{
	  this.db = new ConnectToDB();

	}
	
  public static String readFileAsString(String fileName)throws Exception 
  { 
    String data = ""; 
    data = new String(Files.readAllBytes(Paths.get(fileName))); 
    return data; 
  } 
  
  public String load(String chapterName) throws SQLException
  { 
	//create connection to databse with storyelements
	Statement stmt = db.con.createStatement( );
	String SQL = "SELECT * FROM Story WHERE chapterName = '" + chapterName +"'";
	ResultSet rs = stmt.executeQuery( SQL );
	ResultSetMetaData metadata = rs.getMetaData();
	System.out.println(metadata.getColumnName(3));
	String fileName = null;
	while (rs.next()) {
		fileName = rs.getString("fileName");
	}

    String data = null; 
    
		try {
			data = new String(Files.readAllBytes(Paths.get("C:\\Users\\Paul\\Desktop\\RPG_STUFF\\"+fileName)), "UTF-8");
//			data = readFileAsString("C:\\Users\\Paul\\Desktop\\RPG_STUFF\\"+fileName);
		} catch (Exception ex) {
			Logger.getLogger(ReadTextFromFile.class.getName()).log(Level.SEVERE, null, ex);
		}
    return data;
  } 
} 
