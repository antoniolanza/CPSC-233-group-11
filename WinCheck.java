public class WinCheck {
    Wheel[] wheelStore = new Wheel[3];
    Wheel wheel0 = new Wheel();
    Wheel wheel1 = new Wheel();
    Wheel wheel2 = new Wheel();
    
    public int winPayout (Wheel[] wheelList, boolean[] lockList, int[] speedList) {
	String[][] resultList = new String[wheelList.length][];
	int payout;
	int length = wheelList.length;
	for (int i = 0; i < length; i++) {
	    wheelStore[i] = wheelList[i];
	}
	for (int i = 0; i < length; i++) {
	    Wheel tempWheel = new Wheel();
	    tempWheel.setArray(wheelStore[i].getArray());
	    tempWheel.setSpeed(speedList[i]);
	    resultList[i] = tempWheel.wheelSpin(lockList[i]);
	    printResult(wheelList, resultList, speedList);
	}
	

	if ((resultList[0][1] == resultList[1][1]) && (resultList[1][1] == resultList[2][1])) {
	    payout = Integer.parseInt(resultList[1][1]);
	}
	
	else if ((resultList[0][0] == resultList[1][1]) && (resultList[1][1] == resultList[2][2])) {
	    payout = Integer.parseInt(resultList[1][1]);
	}

	else if ((resultList[0][2] == resultList[1][1]) && (resultList[1][1] == resultList[2][0])) {
	    payout = Integer.parseInt(resultList[1][1]);
	}

	else {
	    payout = 0;
	}

	return payout;
    }

    private void printResult(Wheel[] listWheels, String[][] getResults, int[] listSpeeds) {
	for (int i = 0; i < listWheels.length; i++) {
	    Wheel tempWheel = new Wheel(listWheels[i].getArray(), listSpeeds[i]);
	    String[] tempArray = tempWheel.getArray();
	    System.out.print(tempArray[Integer.parseInt(getResults[i][0])] + "\t");
	    System.out.println("");
	}
	for (int i = 0; i < listWheels.length; i++) {
	    Wheel tempWheel = new Wheel(listWheels[i].getArray(), listSpeeds[i]);
	    String[] tempArray = tempWheel.getArray();
	    System.out.print(tempArray[Integer.parseInt(getResults[i][1])] + "\t");
	    System.out.println("");
	}
	for (int i = 0; i < listWheels.length; i++) {
	    Wheel tempWheel = new Wheel(listWheels[i].getArray(), listSpeeds[i]);
	    String[] tempArray = tempWheel.getArray();
	    if (Integer.parseInt(getResults[i][1]) < tempArray.length) {
		System.out.print(tempArray[Integer.parseInt(getResults[i][2])] + "\t");
	    }
	    else {
		System.out.print(tempArray[0] + "\t");
	    }
				 
	}
    }
}
