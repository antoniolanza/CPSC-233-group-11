import java.util.Scanner;    




public class Play{
    
    private int winpayout = 0; // inits a global win payout 
    private Wheel[] wheels;
   
    private int[] speeds;
    WinCheck win = new WinCheck();
    
    public Play(Wheel[] wheelArray, int[] speedArray){
        wheels = new Wheel[wheelArray];
        speeds = new int[speedArray];
    }


    public void play(){
        int money = 100;   
        boolean firstplay = true;
		boolean[] wheellocks = {false, false, false};
		Project game = new Project();
        Scanner keyboardint = new Scanner(System.in); // keyboard input for integers
        while (money >= 10){
            money = money + winpayout; // adds winnings or adds 0 if a loss
            System.out.println("You Have " + money + " coins"); // prints how much money you have every round
            System.out.println ("Insert 10, 20, OR 30 coins"); // asking user for how much they would like to put in
            int ammount = keyboardint.nextInt();
     
            if (ammount == 10) {System.out.println("You Have Inserted 10 coins");
                money = money - 10;
				wheelLock(money, firstplay, wheel2, wheel2lock);
				winpayout = win.winPayout(wheels, wheellocks, speeds);	
            }
        
            else if (ammount == 20) {System.out.println("You Have Inserted 20 coins"); // the more the user puts in, the more money they can win
                money = money - 20;
                wheelLock(money, firstplay, wheel2, wheel2lock);
				winpayout = win.winPayout(wheels, wheellocks, speeds);	
            }

			else if (ammount == 30) {System.out.println("You Have Inserted 30 coins");
				money = money - 30;
				wheelLock(money,firstplay, wheel2, wheel2lock);
				winpayout = win.winPayout(wheels, wheellocks, speeds);	
			}
			
			else {System.out.println("Not valid ammount inserted");} // for cases where user inputs a string or large/negative numbers
			}
    }
	
	public void wheelLock(int money, boolean firstplay, int wheel2 , boolean wheel2lock){
		Scanner keyboardstr = new Scanner(System.in); // keyboard input for strings
		
		
        String y = "y";
		if (firstplay == false){    
			System.out.print("Would you like to add an additinal 25 coins to lock the second wheel (y/n)");
			String lock = keyboardstr.nextLine();
			if (y.equals(lock)) {System.out.println("You Have locked the second wheel");
				money = money - 25;
				wheellocks[1] = true;
			}
			
			else {
				wheellocks[1] = false;
			}
					
		}
		else {
			firstplay = false;
		}	
	} 
}	
