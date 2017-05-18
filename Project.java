import java.util.Random;

public class Project{

    public static void main (String[] args){

	int wheel1 = new Random().nextInt(5);
	if (wheel1 == 0) {
	    System.out.println("Bar");
		}
	else if (wheel1 == 1) {
	    System.out.println("7");
	}
	else if (wheel1 == 2) {
	    System.out.println("BarBar");
	}
	else {
	    System.out.println("LOSE");
	}
	int wheel2 = new Random().nextInt(5);
	if (wheel2 == 0) {
	    System.out.println("Bar");
		}
	else if (wheel2 == 1) {
	    System.out.println("7");
	}
	else if (wheel2 == 2) {
	    System.out.println("BarBar");
	}
	else {
	    System.out.println("LOSE");
	}
	int wheel3 = new Random().nextInt(5);
	if (wheel3 == 0) {
	    System.out.println("Bar");
		}
	else if (wheel3 == 1) {
	    System.out.println("7");
	}
	else if (wheel3 == 2) {
	    System.out.println("BarBar");
	}
	else {
	    System.out.println("LOSE");
	}
    }

}
