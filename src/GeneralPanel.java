/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Paul
 */
import java.awt.BorderLayout;
import javax.swing.JLabel;
public class GeneralPanel extends javax.swing.JPanel{

	private int index;

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
		add(title, BorderLayout.PAGE_START);
	}
	
	public void setMainText(String s){
		//set Main text of new Panel, aim is to read it from a database (look into sql stuff)
		JLabel l = new JLabel();
		//Look stuff up in a database and fill in here
		ReadTextFromFile r = new ReadTextFromFile();
		//r.load(index) this is how it should work at some point
		String readText = r.load(s);
		l.setText(readText);
		add(l, BorderLayout.CENTER);
	}
	
	public void addButton(ChooseButton b, String loc){
		//adds button (TODO: check if button funtionality is better added later, avoid complicate dhandling)
		if (loc=="left") add(b, BorderLayout.LINE_START);
		if (loc=="right") add(b, BorderLayout.LINE_END);
	}
}
