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

public class GuessingGame extends JApplet implements ActionListener{
	public static int randomNumber = new Random().nextInt(10);
    public static boolean wincheck = false; //sets wincheck to false as default
    JTextField text = new JTextField(20);
    JLabel result = new JLabel("result here");
    
    public void init() { //initalizes the applet
        Container contentPane = getContentPane();
        contentPane.setBackground(Color.WHITE);
        contentPane.setLayout(new FlowLayout());
        JButton guessButton = new JButton("Guess");
        contentPane.add(guessButton);
        guessButton.addActionListener(this);  
        contentPane.add(text);
        contentPane.add(result);

            
        
    }
    public void actionPerformed(ActionEvent e){ // applet commaned is run 
        Container contentPane = getContentPane();
        
        if (e.getActionCommand().equals("Guess")){
            
			int user2guess = Integer.parseInt(text.getText());//gets string input from text field convert to int 
			if (user2guess == randomNumber) {result.setText("Well Done");
            }

            else if (user2guess > randomNumber) {result.setText("Too High");
            }
    
            else if (user2guess < randomNumber) {result.setText("Too Low");
            }
            else {
                result.setText("Not a Number");
            }
        }
        else{
            System.out.println("error in button interface");
        }
    }
    public static void main (String [] args) {
    
        GuessingGame game = new GuessingGame();
        game.play();
	}   
	
	
    public void play(){
            
        System.out.println("I'm thinking of a number between 0 and 9.");			
		while (wincheck == false) {	
			getGuess();
            } 
	}   
 
    // Method to vaildate user guess and returns wincheck 
    public boolean checkGuess(int userguess){ 
                 
        //if guess is a match game is won and wincheck is set to true so application ends
		if (userguess == randomNumber) {System.out.println("Well Done!"); 
            wincheck = true;
            return wincheck;
        }   

        else if (userguess > randomNumber) {System.out.println("too high"); //checks if guess is higher
            wincheck = false; 
            return wincheck;
        }
    
        else if (userguess < randomNumber) {System.out.println("too low"); // checks if guess is lower
            wincheck = false;
            return wincheck;
        }
        else {
            return wincheck;}
        }
		// method to get user input 
        public void getGuess(){
            Scanner keyboard = new Scanner(System.in);//console input for guess
            System.out.println("Whats Your Guess? ");
            int userguess = keyboard.nextInt(); 
            while ((userguess < 0) || (userguess > 9)){ //prints error if guess is < 0 or > 9  
                System.out.println("Invalid Number Guess Again ");
                userguess = keyboard.nextInt();
            }
            checkGuess(userguess);// runs checkguess to see if guess is right, too high or too low
            
        }
         
}
