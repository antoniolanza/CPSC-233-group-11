import java.util.Scanner;
import java.util.Random;



public class Project{
    
    public static int wheel2 = 10; // inits the wheel 2 as a global varible to allow for lock
    public static int wheel2result = 10;
    public static int money = 100; //starts with 100 coins
    public static int winpayout = 0; // inits a global win payout 
	
    public static void main(String[] args){
    
	Project game = new Project(); 
	game.play();
	
	}

    public void play(){
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
					wheel2 = wheel2result; // sets wheel to previous outcome 
					}
                else {
                    wheel2lock = false;
                    }
				}
			else {firstplay = false;
            }
		
            game.wheelspin(wheel2lock, wheel2, ammount);     
            }
        
        else if (ammount == 20) {System.out.println("You Have Inserted 20 coins"); // the more the user puts in, the more money they can win
            money = money - 20;
			if (firstplay == false){    
                System.out.print("Would you like to add an additinal 25 coins to lock the second wheel (y/n)");
                String lock = keyboardstr.nextLine();
                if (y.equals(lock)) {System.out.println("You Have locked the second wheel");
					money = money - 25;
					wheel2lock = true;
					wheel2 = wheel2result;
					}
                else {
                    wheel2lock = false;
					}
                }
			else {firstplay = false;}
			game.wheelspin(wheel2lock, wheel2, ammount);
            }

        else if (ammount == 30) {System.out.println("You Have Inserted 30 coins");
            money = money - 30;
            if (firstplay == false){    
                System.out.print("Would you like to add an additinal 25 coins to lock the second wheel (y/n)");
                String lock = keyboardstr.nextLine();
                if (y.equals(lock)) {System.out.println("You Have locked the second wheel");
                    money = money - 25;
					wheel2lock = true;
					wheel2 = wheel2result;
					}
                else {
                    wheel2lock = false;
                    }
				
				}
			else {firstplay = false;}
			game.wheelspin(wheel2lock, wheel2, ammount);
            } 
        else {System.out.println("Not valid ammount inserted");} // for cases where user inputs a string or large/negative numbers
		}
	}	
	
    public int wheelspin(boolean wheel2lock, int wheel2, int ammount){ // wheel initialization
			
		String[] wheelArrayA = {"1", "2", "3", "4", "5"};
		String[] wheelArrayB = {"1", "2", "3", "4", "5"};
		String[] wheelArrayC = {"1", "2", "3", "4", "5"};
		int wheel1result = 9;
		//int wheel2result = 8;
		int wheel3result = 7;
		int wheel1prev = 10;
		int wheel2prev = 11;
		int wheel3prev = 12;
		int wheel1next = 13;
		int wheel2next = 14;
		int wheel3next = 15;		
		
        // remove next line for proper implementation
		//boolean wheel2lock = false;

		int wheel1 = new Random().nextInt(5); // all randomly generated to determine position of wheel
		if (wheel1 == 0) {
			wheel1result = 0;
		}
		else if (wheel1 == 1) {
			wheel1result = 1;
		}
		else if (wheel1 == 2) {
			wheel1result = 2;
		}
		else if (wheel1 == 3) {
			wheel1result = 3;
		}
		else if (wheel1 == 4) {
			wheel1result = 4;
		}
		else {
			System.out.println("LOSE");
		}
		if (wheel2lock == false) {
		wheel2 = new Random().nextInt(5);
		}
		if (wheel2 == 0) {
			wheel2result = 0;
		}
		else if (wheel2 == 1) {
			wheel2result = 1;
		}
		else if (wheel2 == 2) {
			wheel2result = 2;
		}
		else if (wheel2 == 3) {
			wheel2result = 3;
		}
		else if (wheel2 == 4) {
			wheel2result = 4;
		}
		else {
			System.out.println("LOSE");
		}
		int wheel3 = new Random().nextInt(5);
		if (wheel3 == 0) {
			wheel3result = 0;
		}
		else if (wheel3 == 1) {
			wheel3result = 1;
		}
		else if (wheel3 == 2) {
			wheel3result = 2;
		}
		else if (wheel3 == 3) {
			wheel3result = 3;
		}
		else if (wheel3 == 4) {
			wheel3result = 4;
		}
		else {
			System.out.println("LOSE");
		}
		
		if (wheel1result == 0) {
			wheel1prev = 4;
		}
		else {
			wheel1prev = wheel1result - 1;
		}
		if (wheel2result == 0) {
			wheel2prev = 4;
		}
		else {
			wheel2prev = wheel2result - 1;
		}
		if (wheel3result == 0) {
			wheel3prev = 4;
		}
		else {
			wheel3prev = wheel3result - 1;
		}
		
		if (wheel1result == 4) {
			wheel1next = 0;
		}
		else {
			wheel1next = wheel1result + 1;
		}
		if (wheel2result == 4) {
			wheel2next = 0;
		}
		else {
			wheel2next = wheel2result + 1;
		}
		if (wheel3result == 4) {
			wheel3next = 0;
		}
		else {
			wheel3next = wheel3result + 1; // many possible permutations
		}
		
		System.out.println("Wheel 1" + "\t" + "Wheel 2" + "\t" + "Wheel 3");
		System.out.println(wheelArrayA[wheel1prev] + "\t" + wheelArrayB[wheel2prev] + "\t" + wheelArrayC[wheel3prev]);
		System.out.println(wheelArrayA[wheel1result] + "\t" + wheelArrayB[wheel2result] + "\t" + wheelArrayC[wheel3result]);
		System.out.println(wheelArrayA[wheel1next] + "\t" + wheelArrayB[wheel2next] + "\t" + wheelArrayC[wheel3next]);
		
		if ((wheel1result == wheel2result) && (wheel2result == wheel3result)) { // only three patterns that can win
			System.out.println("YOU WIN ON CENTER MATCH"); 
			winpayout = ammount * wheel2next; //XXX test change later
		}
		else if ((wheel1prev == wheel2result) && (wheel2result == wheel3next)) {
			System.out.println("YOU WIN ON TOP LEFT DIAGONAL MATCH");
			winpayout = ammount * wheel2next;
		}
		else if ((wheel1next == wheel2result) && (wheel2result == wheel3prev)) {
			System.out.println("YOU WIN ON BOTTOM LEFT DIAGONAL MATCH");
			winpayout = ammount * wheel2next;
		}
		else {
			System.out.println("YOU LOSE, NO MATCH");
			
			winpayout = 0;
		}
    System.out.println("Winnings " + winpayout);	// XXX prints winnings for debugging
    return winpayout;
	}

	
	
	

	
}









