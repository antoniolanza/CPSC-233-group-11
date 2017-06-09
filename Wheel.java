import java.util.Random;

public class Wheel {
    private String[] wheelArray = {"1", "2", "3", "4", "5"};
    private String[] wheelResult = {"n0", "n1", "n2"};
    private int wheelSpeed = 1;

    public Wheel (String[] setArray, int speed) {
	//String[] wheelArray = new String[setArray.length];
	for (int i = 0; i < setArray.length; i++) {
	    wheelArray[i] = setArray[i];
	}
	wheelSpeed = speed;
    }

    public String[] wheelSpin(boolean wheelLock) {
	if (wheelLock == false) {
	    int randInt = new Random().nextInt(wheelArray.length);
	    if (randInt > 0) {
		wheelResult[0] = wheelArray[randInt-1];
	    }
	    else {
		wheelResult[0] = wheelArray[wheelArray.length - 1];
	    }
	    wheelResult[1] = wheelArray[randInt];
	    if (randInt < (wheelArray.length - 1)) {
		wheelResult[2] = wheelArray[randInt+1];
	    }
	    else {
		wheelResult[2] = wheelArray[0];
	    }
	    return wheelResult;
	}

	else {
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
	for (int i = 0; i < array.length; i++) {
	    wheelArray[i] = array[i];
	}
    }
			  
}
