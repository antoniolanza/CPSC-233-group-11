import java.util.Random;

public class WheelSpin { // wheel initialization
    private String[] wheelArrayA = {"1", "2", "3", "4", "5"};
    private String[] wheelArrayB = {"1", "2", "3", "4", "5"};
    private String[] wheelArrayC = {"1", "2", "3", "4", "5"};
    private int wheel1result;
    private int wheel2result;
    private int wheel3result;
    private int wheel1prev;
    private int wheel2prev;
    private int wheel3prev;
    private int wheel1next;
    private int wheel2next;
    private int wheel3next;
    private boolean wheel2lock;
    private int wheel2;
    private int winpayout;
    
    public int wheelSpin(boolean wheel2lock, int wheel2, int ammount) { 
		
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

    public int getWheel2Result () {
	return wheel2result;
    }
}
