import java.util.Random;

public class Wheel {
    private String[] wheelArray = {"1", "2", "3", "4", "5"};
    private String[] wheelResult;
    private int wheelSpeed;

    public Wheel () {
    }
    
    public Wheel (String[] setArray, int speed) {
	wheelArray = new String[setArray.length];
	for (int i = 0; i < setArray.length; i++) {
	    wheelArray[i] = setArray[i];
	}
	wheelSpeed = speed;
    }

    public String[] wheelSpin(boolean wheelLock) {
	if (wheelLock = false) {
	    wheelResult = getResult();
	    return wheelResult;
	}
	
	else {
	    return wheelResult;
        }
	
    }

	private String[] getResult () {
	    int randInt = new Random().nextInt(wheelArray.length);
	    if (randInt < wheelArray.length) {
		String[] wheelResult = {wheelArray[randInt-1], wheelArray[randInt], wheelArray[randInt+1]};
		return wheelResult;
	    }
	    else {
		String[] wheelResult = {wheelArray[randInt-1], wheelArray[randInt], wheelArray[0]};
		return wheelResult;
	    }
	}

    public String[] getArray () {
	return wheelArray;
    }

    public int getSpeed () {
	return wheelSpeed;
    }

    public void setSpeed (int speed) {
	wheelSpeed = speed;
    }

    public void setArray (String[] array) {
	String[] wheelArray = new String[array.length];
	for (int i = 0; i < array.length; i++) {
	    wheelArray[i] = array[i];
	}
    }
    
}
