import java.util.Random;

public class Project{

    public static void main (String[] args){
		
		String[] wheelArrayA = {"1", "2", "3", "4", "5"};
		String[] wheelArrayB = {"1", "2", "3", "4", "5"};
		String[] wheelArrayC = {"1", "2", "3", "4", "5"};
		int wheel1result = 9;
		int wheel2result = 8;
		int wheel3result = 7;
		int wheel1prev = 10;
		int wheel2prev = 11;
		int wheel3prev = 12;
		int wheel1next = 13;
		int wheel2next = 14;
		int wheel3next = 15;
		int winpayout = 0;
		
		// remove next line for proper implementation
		boolean wheel2lock = false;

		int wheel1 = new Random().nextInt(5);
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
		int wheel2 = new Random().nextInt(5);
		if (wheel2lock == true) {
		}
		else if (wheel2 == 0) {
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
			wheel3next = wheel3result + 1;
		}
		
		System.out.println("Wheel 1" + "\t" + "Wheel 2" + "\t" + "Wheel 3");
		System.out.println(wheel1prev + "\t" + wheel2prev + "\t" + wheel3prev);
		System.out.println(wheel1result + "\t" + wheel2result + "\t" + wheel3result);
		System.out.println(wheel1next + "\t" + wheel2next + "\t" + wheel3next);
		
		if ((wheel1result == wheel2result) && (wheel2result == wheel3result)) {
			System.out.println("YOU WIN ON CENTER MATCH");
			winpayout = wheel2result + 1;
		}
		else if ((wheel1prev == wheel2result) && (wheel2result == wheel3next)) {
			System.out.println("YOU WIN ON TOP LEFT DIAGONAL MATCH");
			winpayout = wheel2result + 1;
		}
		else if ((wheel1next == wheel2result) && (wheel2result == wheel3prev)) {
			System.out.println("YOU WIN ON BOTTOM LEFT DIAGONAL MATCH");
			winpayout = wheel2result + 1;
		}
		else {
			System.out.println("YOU LOSE, NO MATCH");
			winpayout = 0;
		}
		
		System.out.println(winpayout);
    }

}


// URL for scanner help: https://stackoverflow.com/questions/23450524/java-scanner-doesnt-wait-for-user-input
// referenced on May 24, 2017
// URL for if statement help: https://stackoverflow.com/questions/14267220/java-string-for-loop-not-reading-if-statement
// referenced on May 24, 2017
