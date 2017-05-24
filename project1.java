import java.util.Scanner;

public class project1{
    public static void main (String[] args){
        Scanner keyboard = new Scanner(System.in);
        int money = 100;
        System.out.println ("Insert 10, 20, or 30 coins");
        int ammount = keyboard.nextInt();
        

        if (ammount == 10) {System.out.println("You Have Inserted 10 coins");
            money = money - 10;
            }
        
        else if (ammount == 20) {System.out.println("You Have Inserted 20 coins");
            money = money - 20;
            }

        else if (ammount == 30) {System.out.println("You Have Inserted 30 coins");
            money = money - 30;
            System.out.println(money);
            }
        else {System.out.println("Not valid ammount inserted");}
    }
}
