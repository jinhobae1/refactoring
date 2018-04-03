package refactoring.chapter10;

import java.util.StringTokenizer;

public class Robot {
	private final String Robotname;
	private final Position position = new Position(0, 0);
	private final Direction direction = new Direction(0, 1);

	public Robot(String name) {
		Robotname = name;
	}

	public void execute(String commandSequence) {
		StringTokenizer tokenizer = new StringTokenizer(commandSequence);

		try {
			while (tokenizer.hasMoreTokens()) {
				String token = tokenizer.nextToken();
				executeCommand(token);
			}
		} catch (InvalidCommandExcaption e) {
			System.out.println("Invalid command:" + e.getMessage());
		}
		/*
		 * if(!executeCommand(token)) { System.out.println("Invalid command:"+token);
		 * break; }
		 */
	}

	public void executeCommand(String commandString) throws InvalidCommandExcaption {
		Command command= Command.parseCommand(commandString);
		command.execute(this);
	
	}


	public void forward() {
		position.relativeMove(direction.Px, direction.Py);
	}

	public void backward() {
		position.relativeMove(direction.Px, -direction.Py);
	}

	public void right() {
		direction.setDirection(direction.Py, -direction.Px);
	}

	public void left() {
		direction.setDirection(-direction.Py, direction.Px);
	}

	@Override
	public String toString() {
		return "[Robot: " + Robotname + " " + "position(" + position.Px + "," + position.Py + "), " + "direction("
				+ direction.Px + "," + direction.Py + ")]";
	}

}
