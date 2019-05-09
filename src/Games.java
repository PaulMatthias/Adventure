import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
//ww  w  .j a v a 2 s.co  m
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;

public class Games extends JFrame {
	//creates a choosing button which removes on activation the old Panel and loads a new one
	private ChooseButton createChooseButton(JPanel gamePanel, JPanel oldPanel, GeneralPanel nextPanel, String s){
		ChooseButton b = new ChooseButton(s);
		b.addActionListener(e -> {
			gamePanel.remove(oldPanel);
			gamePanel.add(nextPanel,BorderLayout.CENTER);
			revalidate();
			repaint();
		});	
	return b;
	}

	// creating general panels
	private GeneralPanel createGeneralPanel(String title, String data, String bleft, String bright){
		GeneralPanel g =new GeneralPanel();
		g.setTitle(title);
		g.setMainText(data);
		//g.addButton(bleft, "left");
		//g.addButton(bright, "right");
		return g;
	}

//begin constructor of the game	
  public Games() {
	  //create main panel
    JPanel gamePanel = new JPanel();
    gamePanel.setPreferredSize(new Dimension(800, 600));
    gamePanel.setLayout(new BorderLayout());

    //first loading screen panel
    JPanel startPanel = new JPanel(); 
    startPanel.setBackground(new java.awt.Color(81, 213, 25));
    JLabel titleOfScreen = new JLabel();
    titleOfScreen.setText("Das ist der Titel text der Seite");
    startPanel.add(titleOfScreen,BorderLayout.PAGE_START);
    
    GeneralPanel nextPanel = createGeneralPanel("Titel", "test.txt", "bleft", "bright");
    
    JButton exitButton = new JButton("Exit");
    exitButton.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {                                        
            System.exit(0);
        }
    });
    startPanel.add(createChooseButton(gamePanel, startPanel, nextPanel, "Start"), BorderLayout.LINE_START);
    startPanel.add(exitButton, BorderLayout.LINE_END);

    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    gamePanel.add(startPanel, BorderLayout.CENTER);
    add(gamePanel);
    pack();
    setVisible(true);
  }
  public static void main(String[] args) {
    new Games();
  }
}