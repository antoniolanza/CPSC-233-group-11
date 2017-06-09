import java.util.Scanner;
import java.util.Random;
public class project1{
    public static void main (String[] args){
        Scanner keyboard = new Scanner(System.in);
        int money = 100;
        boolean firstplay = true;
        System.out.println ("Insert 10, 20, OR 30 coins");
        int ammount = keyboard.nextInt();
        

        if (ammount == 10) {System.out.println("You Have Inserted 10 coins");
            money = money - 10;
            if (firstplay == false){    
                System.out.print("Would you like to add an additinal 25 coins to lock the second wheel (y/n)");
                String lock = keyboard.nextLine();
                if (lock == "y") {System.out.println("You Have locked the second wheel");
                    money = money - 25;}
                else {
                    System.out.print("no");
                    }
				}
                                
            }
        
        else if (ammount == 20) {System.out.println("You Have Inserted 20 coins");
            money = money - 20;
			if (firstplay == false){    
                System.out.print("Would you like to add an additinal 25 coins to lock the second wheel (y/n)");
                String lock = keyboard.nextLine();
                if (lock == "y") {System.out.println("You Have locked the second wheel");
                    money = money - 25;}
                else {
                    System.out.print("no");
					}
                }
            }

        else if (ammount == 30) {System.out.println("You Have Inserted 30 coins");
            money = money - 30;
            if (firstplay == false){    
                System.out.print("Would you like to add an additinal 25 coins to lock the second wheel (y/n)");
                String lock = keyboard.nextLine();
                if (lock == "y") {System.out.println("You Have locked the second wheel");
                    money = money - 25;}
                else {
                    System.out.print("no");
                    }
				}
            } 
        else {System.out.println("Not valid ammount inserted");}
        }
    
}
