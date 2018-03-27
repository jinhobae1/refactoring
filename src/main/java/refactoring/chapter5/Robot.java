package refactoring.chapter5;

import java.util.StringTokenizer;

public class Robot {
	private final String Robotname;
	private final Position position = new Position(0,0);
	private final Direction direction = new Direction(0,1);
	public Robot(String name) {
		Robotname = name;
	}
	public void execute(String commandSequence) {
		StringTokenizer tokenizer = new StringTokenizer(commandSequence);
		while(tokenizer.hasMoreTokens()) {
			String token = tokenizer.nextToken();
			if(!executeCommand(token)) {
				System.out.println("Invalid command:"+token);
				break;
			}
		}
	}
	public boolean executeCommand(String commandString) {
		Command command = Command.parseCommand(commandString);
		if(command == null) {
			return false;
		}
		return executeCommand(command);
	}
	public boolean executeCommand(Command command) {
		if(command==Command.FORWARD) {
			position.relativeMove(direction.Px,direction.Py);
		}else if(command==Command.BACKWARD) {
			position.relativeMove(direction.Px,-direction.Py);
		}else if(command==Command.TURN_RIGHT) {
			direction.setDirection(direction.Py,-direction.Px);
		}else if(command==Command.TRUN_LEFT) {
			direction.setDirection(-direction.Py,direction.Px);
		}else {
			return false;
		}
		return true;
	}
	@Override
	public String toString() {
		return "[Robot: "+Robotname+" "+ "position("+ position.Px+"," +position.Py+"), "+ "direction(" + direction.Px + ","+direction.Py+")]";
	}
		
}
