public class Project{
	
    public static void main(String[] args){
        String[] wheellist = {"1", "2", "3", "4", "5"};
		
		
		
        Wheel wheel1 = new Wheel(wheellist, 1);
        Wheel wheel2 = new Wheel(wheellist, 1);
        Wheel wheel3 = new Wheel(wheellist, 1);
	Wheel[] wheelArray = new Wheel[3];
        wheelArray[0] = wheel1;
	wheelArray[1] = wheel2;
	wheelArray[2] = wheel3;
        int[] speeds = {wheel1.getSpeed(), wheel2.getSpeed(), wheel3.getSpeed()};

        Play p = new Play(wheelArray, speeds);
        p.play();
    }

/* 	public void GUI{
	call gui class here
	}
	public void wheelSpeed{
	wheelSpeed class called here when gui is implemented
*/
	
	
	
	
}
