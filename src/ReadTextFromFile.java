
import java.nio.file.*;import java.util.logging.Level;
import java.util.logging.Logger;
; 
public class ReadTextFromFile 
{ 
	public ReadTextFromFile(){

	}
	
  public static String readFileAsString(String fileName)throws Exception 
  { 
    String data = ""; 
    data = new String(Files.readAllBytes(Paths.get(fileName))); 
    return data; 
  } 
  
  public String load(String file)
  { 
    String data = null; 
		try {
			data = readFileAsString("C:\\Users\\Paul\\Desktop\\RPG_STUFF\\"+file);
		} catch (Exception ex) {
			Logger.getLogger(ReadTextFromFile.class.getName()).log(Level.SEVERE, null, ex);
		}
    return data;
  } 
} 
