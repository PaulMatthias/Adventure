/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//Note: To add stuff in existing panel it is easiest to create a new panel with the desired Layout and add it to the existing one!!!


/**
 *
 * @author Paul
 */
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.sql.SQLException;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
public class GeneralPanel extends javax.swing.JPanel{

		// creating general panels
	public void createGeneralPanel(String data) throws SQLException{
		//setTitle(title);
		setMainText(data);
		addButtons(data);
	}

	public int index;

	public void setIndex(int i){
		//storing the index of the database this frame belongs too (for saving purposes etc...)
		this.index  = i;
	}
	
	public GeneralPanel(){
		//constructor with super() function from parent class
		super();
    		setBackground(new java.awt.Color(81, 213, 25));  
	}
	public void setTitle(String s){
		//set Title of new Panel
		JLabel title = new JLabel(s);
		setLayout(new BorderLayout());
		add(title, BorderLayout.PAGE_START);
	}
	
	public void setMainText(String s) throws SQLException{
		//set Main text of new Panel, aim is to read it from a database (look into sql stuff)
		//Look stuff up in a database and fill in here
		ReadTextFromFile r = new ReadTextFromFile();
		//r.load(index) this is how it should work at some point
		String readText = r.loadMainText(s);
		JPanel textPanel = new GeneralPanel();
		textPanel.setLayout(new GridBagLayout());
		JLabel l = new JLabel("<html><p style=\"width:100px\">"+readText+"</p></html>", SwingConstants.CENTER);
		
		GridBagConstraints c = new GridBagConstraints ();
		c.gridy = 1;
		c.insets = new Insets (5, 0, 0, 0);
 
		textPanel.add(l , c);
		add(textPanel, BorderLayout.CENTER);
	}
	
	public void addButtons(String chapterName) throws SQLException{
		//adds button (TODO: check if button funtionality is better added later, avoid complicate dhandling)
		GeneralPanel buttonRightPanel = new GeneralPanel();
		GeneralPanel buttonLeftPanel = new GeneralPanel();
		ButtonCreator bc = new ButtonCreator();

		ReadTextFromFile rs = new ReadTextFromFile();
		String nextChapterLeft = rs.loadLeftButtonLeadTo(chapterName);
		String nextChapterRight = rs.loadRightButtonLeadTo(chapterName);
		
		JButton buttonLeft = bc.createButton(MainPanel.gamePanel, this, nextChapterLeft, "decisionLeft");
		JButton buttonRight = bc.createButton(MainPanel.gamePanel, this, nextChapterRight, "decisionRight");

		buttonLeftPanel.add(buttonLeft, BorderLayout.CENTER);
		add(buttonLeftPanel,BorderLayout.LINE_START);
		buttonRightPanel.add(buttonRight, BorderLayout.CENTER);
		add(buttonRightPanel,BorderLayout.LINE_END);
	}
}
