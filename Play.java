import java.util.Scanner;    




public class Play{
    
    private int wheel2; // inits the wheel 2 as a global varible to allow for lock
    private int winpayout = 0; // inits a global win payout 
        
    WheelSpin w = new WheelSpin();


    public void play(){
        int money = 100;    
        boolean wheel2lock = false; // only user can decide whether or not to lock wheel 
        Project game = new Project();
        boolean firstplay = true;
        String y = "y";
        Scanner keyboardint = new Scanner(System.in); // keyboard input for integers
        Scanner keyboardstr = new Scanner(System.in); // keyboard input for strings
        while (money >= 10){
            money = money + winpayout; // adds winnings or adds 0 if a loss
            System.out.println("You Have " + money + " coins"); // prints how much money you have every round
            System.out.println ("Insert 10, 20, OR 30 coins"); // asking user for how much they would like to put in
            int ammount = keyboardint.nextInt();
     
            if (ammount == 10) {System.out.println("You Have Inserted 10 coins");
                money = money - 10;
                if (firstplay == false){    
                    System.out.print("Would you like to add an additinal 25 coins to lock the second wheel (y/n)"); // Ablility to lock wheel when favourable outcome is seen
                    String lock = keyboardstr.nextLine();
                    System.out.println(lock);
                    if (y.equals(lock)) {System.out.println("You Have locked the second wheel"); // only allowing the ability to lock the second wheel for the time being
                        money = money - 25;
                        wheel2lock = true; // locks the wheel
                        
                        wheel2 = w.getWheel2Result(); // sets wheel to previous outcome 
                    }
                    else {
                        wheel2lock = false;
                    }
                }
                else {firstplay = false;
                }
        
                w.wheelSpin(wheel2lock, wheel2, ammount);     
            }
        
            else if (ammount == 20) {System.out.println("You Have Inserted 20 coins"); // the more the user puts in, the more money they can win
                money = money - 20;
                if (firstplay == false){    
                    System.out.print("Would you like to add an additinal 25 coins to lock the second wheel (y/n)");
                    String lock = keyboardstr.nextLine();
                    if (y.equals(lock)) {System.out.println("You Have locked the second wheel");
                        money = money - 25;
                        wheel2lock = true;
                        wheel2 = w.getWheel2Result();
                    }
                    else {
                        wheel2lock = false;
                    }
                }
                else {firstplay = false;}
                w.wheelSpin(wheel2lock, wheel2, ammount);
            }

			else if (ammount == 30) {System.out.println("You Have Inserted 30 coins");
				money = money - 30;
				if (firstplay == false){    
					System.out.print("Would you like to add an additinal 25 coins to lock the second wheel (y/n)");
					String lock = keyboardstr.nextLine();
					if (y.equals(lock)) {System.out.println("You Have locked the second wheel");
						money = money - 25;
						wheel2lock = true;
						wheel2 = w.getWheel2Result();
						}
					else {
						wheel2lock = false;
						}
					
					}
				else {firstplay = false;}
				w.wheelSpin(wheel2lock, wheel2, ammount);
				} 
			else {System.out.println("Not valid ammount inserted");} // for cases where user inputs a string or large/negative numbers
			}
    }
}	
