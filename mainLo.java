// https://stackoverflow.com/questions/22344139/how-do-i-loop-my-main-method-in-a-way

public static void main(String[] args) {
  // input main class calling 
  
  Scanner usc = new Scanner(System. in );
  System.out.print("Please enter the amount you wish to put in: ");
  String aMount = usc.next();
    printSomeInfoAbout(aMount);

  System.out.print("PLAY AGAIN?(Y/N): ");  // get the input from the user
    String plAgain = usc.next();
    if(plAgain.equalsIgnoreCase("Y")){// Matches "Y" or "y"
      main(null); // if input is Y then call main again. 
   }
}
