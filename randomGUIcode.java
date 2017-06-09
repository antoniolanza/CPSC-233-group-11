import java.util.Random;
import java.util.Scanner;
import javax.swing.JApplet;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;


public class Project extends JApplet implements ActionListener{
    JTextField text = new JTextField(20);
    JLabel result = new JLabel("Insert 10, 20, OR 30 coins");
    JButton insertButton = new JButton(""); 


    public void init(){ //initalizes JApplet
        Container contentPane = getContentPane();
        contentPane.setBackground(Color.RED);
        contentPane.setLayout(new FlowLayout());
        contentPane.add(insertButton);
        guessButton.addActionListener(this);  
        contentPane.add(text);
        contentPane.add(result);    
    }
    

    public void actionPerformed(ActionEvent e){ // applet command is run
        Container contentPane = getContentPane();






	
        
private void createFrame(){
        
    newFrame = new JFrame();
    newFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    newFrame.setTitle("A slot machine");
    newFrame.setResizable(False);
    newFrame.setVisible(True);
        
    wheelPanel = new JPanel();
    wheelPanel.setBorder(BorderFactory.createEtchedBorder());
        
    wheel1 = new JPanel();
    wheel1.setBackground(new Color(255, 215, 0));
    wheel1.setBorder(new SoftBevelBorder(BevelBorder.LOWERED));
    wheel2 = new JPanel();
    wheel2.setBackground(new Color(255, 216, 0));
    wheel2.setBorder(new SoftBevelBorder(BevelBorder.LOWERED));
    wheel3 = new JPanel();
    wheel3.setBackground(new java.awt.Color(255, 215, 0));
    wheel3.setBorder(new SoftBevelBorder(BevelBorder.LOWERED));
        
}
private void addButtons() {
    wheelSpin = new JButton();
    wheelSpin.setBackground(new Color(50, 255, 50));
    wheelSpin.setText("Spin");
    wheelSpin.setToolTipText("Click to spin!");
    wheelSpin.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    wheelSpin.setInheritsPopupMenu(true);
    wheelSpin.setMaximumSize(new Dimension(200, 50));
    wheelSpin.setMinimumSize(new Dimension(200, 50));
    wheelSpin.addActionListener(new SpinHandler());
              
    monBut = new JButton();
    monBut.setBackground(new Color(255, 0, 0));
    monBut.setText("YES");

    monBut.setHorizontalTextPosition(SwingConstants.CENTER);
    btnCash.addActionListener(new BuyCreditsHandler());

}







int dialogButton = JOptionPane.YES_NO_OPTION;
int reply = JOptionPane.showConfirmDialog(null, "Would you like to add an additinal 25 coins to lock the second wheel?",  JOptionPane.YES_NO_OPTION);

if (reply == JOptionPane.NO_OPTION)
    {
	System.exit(0);
    }
if (reply == JOptionPane.YES_OPTION)
}
