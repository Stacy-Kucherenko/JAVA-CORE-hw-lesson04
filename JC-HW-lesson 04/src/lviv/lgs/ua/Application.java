package lviv.lgs.ua;

public class Application {
public static void main(String[] args) {
	
	Robot r = new Robot ("Robot");
	r.work("- я просто працюю");
//	System.out.println(r);
	
	CoffeRobot r2 = new CoffeRobot("CoffeRobot");
	r2.work("- я просто варю каву");
//	System.out.println(r2);
	
	RobotDancer r3 = new RobotDancer("RobotDancer");
	r3.work("- я просто танцюю");
//	System.out.println(r3);
	
	RobotCoocker r4 = new RobotCoocker("RobotCoocker");
	r4.work("- я просто готую");
//	System.out.println(r4);

	
	Robot[] rob = new Robot[4];
	rob[0] = r;
	rob[1] = r2;
	rob[2] = r3;
	rob[3] = r4;
	
	for (int i = 0; i < rob.length; i++) {
		System.out.println(rob[i]);
	}
	
	 

	
	
}
}
