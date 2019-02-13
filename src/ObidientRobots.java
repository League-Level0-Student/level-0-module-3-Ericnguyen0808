import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ObidientRobots {
	public static void drawSquare() {
	}
	public static void main(String[] args) {
		String answer = JOptionPane.showInputDialog("What shape do you want?");
		String input = JOptionPane.showInputDialog("what color do you want?");
		Robot eric = new Robot();
		if(input.equalsIgnoreCase("blue")){
		eric.setPenColor(66, 134, 244);
		
		}
		else if(input.equalsIgnoreCase("green")){
			eric.setPenColor(Color.green);
		}	
			else if(input.equalsIgnoreCase("yellow")){
				eric.setPenColor(Color.YELLOW);
			}		
				else if(input.equalsIgnoreCase("red")){
					eric.setPenColor(Color.red);
				}
		if(answer.equalsIgnoreCase("square")){
		eric.setSpeed(15);
		eric.penDown();
		eric.move(100);
		eric.turn(90);
		eric.move(100);
		eric.turn(90);
		eric.move(100);
		eric.turn(90);
		eric.move(100);
		eric.turn(90);
		}
		if(answer.equalsIgnoreCase("triangle")){for(int i=0; i<3; i++) {
			eric.setSpeed(15);
			eric.penDown();
			eric.move(100);
			eric.turn(360/3);
		}
		}
		if(answer.equalsIgnoreCase("circle")) {for(int i=0; i<360; i++) {
			eric.penDown();
			eric.move(2);
			eric.turn(360/360);
		}
}
}
}