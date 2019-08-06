package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {

		// START HERE
		Robot Jacob = new Robot();
		Jacob.setSpeed(100);
		Jacob.penDown();
		for (int i = 0; i < 4; i++) {
			Jacob.move(200);
			Jacob.turn(90);
		}
	}
}
