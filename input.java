import java.util.Scanner;
import javax.swing.JOptionPane;

public class input{
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        // ask for birthday
        System.out.print("Enter Your Date of Birth yyyy/mm/dd ");
        String birthday = keyboard.nextLine();
      
        // split on /
        String[] birthdaysplit = birthday.split("/");
        int year = Integer.parseInt(birthdaysplit[0]);
        int month = Integer.parseInt(birthdaysplit[1]);
        int day = Integer.parseInt(birthdaysplit[2]);
        
        // calculate the average
        int sum = year + month + day;
        float average = sum / 3;
        System.out.println("Average is " + average);                 
		
		// ask for name in dialog box
        String name = (String)JOptionPane.showInputDialog(
            null,
            "Whats Your Name");
        
        //split into first and last
        String[] namepart = name.split(" ");
        String firstname = namepart[0];
        String lastname = namepart[1];
        System.out.println("First Name is " + firstname);
        System.out.println("Last Name is " + lastname);

    }
}
