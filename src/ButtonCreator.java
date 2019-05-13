
import java.awt.BorderLayout;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Paul
 */
public class ButtonCreator {

	ConnectToDB db;
	public ButtonCreator() throws SQLException{
	  this.db = new ConnectToDB();

	}

	private String setText(String chapterName, String dbentry) throws SQLException{
	//create connection to databse with storyelements
		Statement stmt = db.con.createStatement( );
		String SQL = "SELECT * FROM Story WHERE chapterName = '" + chapterName +"'";
		ResultSet rs = stmt.executeQuery( SQL );
		ResultSetMetaData metadata = rs.getMetaData();
		String fileName = null;
		while (rs.next()) {
			fileName = rs.getString(dbentry);
		}

	    String data = null; 
	    
			try {
				data = new String(Files.readAllBytes(Paths.get("C:\\Users\\Paul\\Desktop\\RPG_STUFF\\"+fileName)), "UTF-8");
			} catch (Exception ex) {
				Logger.getLogger(ReadTextFromFile.class.getName()).log(Level.SEVERE, null, ex);
			}
	    return data;
	} 	
	
	
	public JButton createButton(JPanel gamePanel, JPanel oldPanel, String data, String dbentry) throws SQLException{
		JButton b = new JButton();
		b.setText(setText(data, dbentry));
		b.addActionListener(e -> {
			GeneralPanel nextPanel = new GeneralPanel();
			try {
				nextPanel.createGeneralPanel(data);
			} catch (SQLException ex) {
				Logger.getLogger(ButtonCreator.class.getName()).log(Level.SEVERE, null, ex);
			}

			MainPanel.gamePanel.remove(oldPanel);
			MainPanel.gamePanel.add(nextPanel,BorderLayout.CENTER);
			System.out.println(nextPanel.index);
			MainPanel.gamePanel.revalidate();
			//repaint();
		});	
		return b;
	}
}
