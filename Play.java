public class Play {
    private String[] wheelArray0 = {"1", "2", "3", "4", "5"};
    private String[] wheelArray1 = {"1", "2", "3", "4", "5"};
    private String[] wheelArray2 = {"1", "2", "3", "4", "5"};
    private int[] speedArray = {1, 2, 3};
	
    Wheel wheel0 = new Wheel(wheelArray0, speedArray[0]);
    Wheel wheel1 = new Wheel(wheelArray1, speedArray[1]);
    Wheel wheel2 = new Wheel(wheelArray2, speedArray[2]);

    private int playerMoney = 100;
    private boolean lockSet = false;

    public Play() {
    }

    public int play(int buyIn, int money, boolean wheelLock) {
	if (wheelLock == true) {
	    playerMoney = playerMoney - (buyIn + 25);
	}
	else {
	    playerMoney = playerMoney - buyIn;
	}
	String[] wheelResult0 = {};
	String[] wheelResult1 = {};
	String[] wheelResult2 = {};
	wheelResult0 = wheel0.wheelSpin(false);
        wheelResult1 = wheel1.wheelSpin(wheelLock);
	wheelResult2 = wheel2.wheelSpin(false);
	int payoutMult = 0;
	
	if ((wheelResult0[1] == wheelResult1[1]) && (wheelResult1[1] == wheelResult2[1])) {
	    payoutMult = Integer.parseInt(wheelResult1[1]);
	}
	else if ((wheelResult0[0] == wheelResult1[1]) && (wheelResult1[1] == wheelResult2[2])) {
	    payoutMult = Integer.parseInt(wheelResult1[1]);
	}
	else if ((wheelResult0[2] == wheelResult1[1]) && (wheelResult1[1] == wheelResult2[0])) {
	    payoutMult = Integer.parseInt(wheelResult1[1]);
	}
	playerMoney = playerMoney + (payoutMult * buyIn);
        return playerMoney;
    }

}
