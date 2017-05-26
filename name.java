import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.JButton;

public class name{
    public static void main(String[] args) {
        Object[] Name = {null};
        String name = (String)JOptionPane.showInputDialog(
            null,
            "Whats Your Name");
        String[] namepart = name.split(" ");
        String firstname = namepart[0];
        String lastname = namepart[1];
        System.out.println("First Name is " + firstname);
        System.out.println("Last Name is " + lastname);

    }
}
