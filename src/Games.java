import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.sql.SQLException;
//ww  w  .j a v a 2 s.co  m
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;



public class Games extends JFrame {

	
//create connection to database

//begin constructor of the game	
  public Games() throws SQLException {
	  //create main panel
    ;

    //JPanel gamePanel = new JPanel();
    MainPanel.gamePanel.setPreferredSize(new Dimension(800, 600));
    MainPanel.gamePanel.setLayout(new BorderLayout());

    //first loading screen panel
    JPanel startPanel = new JPanel(); 
    startPanel.setBackground(new java.awt.Color(81, 213, 25));
    JLabel titleOfScreen = new JLabel();
    titleOfScreen.setText("Das ist der Titel text der Seite");
    startPanel.add(titleOfScreen,BorderLayout.PAGE_START);
    
    JButton exitButton = new JButton("Exit");
    exitButton.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {                                        
            System.exit(0);
        }
    });

    ButtonCreator bc = new ButtonCreator();
    JButton b = bc.createButton(MainPanel.gamePanel, startPanel, "Kapitel1", "Start");
    startPanel.add(b, BorderLayout.LINE_START);
    startPanel.add(exitButton, BorderLayout.LINE_END);

    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    MainPanel.gamePanel.add(startPanel, BorderLayout.CENTER);
    add(MainPanel.gamePanel);
    pack();
    setVisible(true);
  }
  public static void main(String[] args) throws SQLException{
    new Games();
  }
}