import org.jointheleague.graphical.robot.Robot;

import javax.swing.JOptionPane;

public class CodingExercise1 {
public static void main(String[] args) {
	Robot rob = new Robot();
	String color = JOptionPane.showInputDialog("What color would you like the robot to draw in? (red or green)");
	if(color.equals("red")){
		rob.setPenColor(255,0,0);
	}
	if(color.equals("green")){
		rob.setPenColor(0,255,0);
	}
	rob.setSpeed(10);
	rob.setPenWidth(10);
	rob.penDown();
	rob.move(100);
	rob.turn(90);
	rob.move(100);
	rob.turn(90);
	rob.move(100);
	rob.turn(90);
	rob.move(100);
	rob.turn(90);
}
}
