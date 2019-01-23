//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		//1. Create a new Robot
		Robot liam = new Robot();
		liam.setSpeed(15);
		//3. Ask the user what color they would like the robot to draw
		String input = JOptionPane.showInputDialog("What color would you like to draw with today?");
		//5. Use an if/else statement to set the pen color that the user requested
		if(input.equalsIgnoreCase("green")) {
			liam.setPenColor(26, 255, 0);
		}
        //6. If the user doesn’t enter anything, choose a random color
		else
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//4. Set the pen width to 10
		liam.setPenWidth(10);
	    //2. Make the robot draw a shape (this will take more than one line of code)
		liam.penDown();
		liam.move(250);
		liam.turn(90);
		liam.move(250);
		liam.turn(90);
		liam.move(250);
		liam.turn(90);
		liam.move(250);

	}
}
