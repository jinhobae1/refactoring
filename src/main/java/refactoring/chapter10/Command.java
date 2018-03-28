package refactoring.chapter10;

import java.util.HashMap;
import java.util.Map;

public abstract class Command {
	public static final Command FORWARD = new Forward();
	public static final Command BACKWARD = new BACKWARD();
	public static final Command TURN_RIGHT = new RIGHT();
	public static final Command TRUN_LEFT = new left();
	public static final Map<String, Command> commandNameMap = new HashMap<String, Command>();
	private String name;

	private Command(String Cname) {
		name = Cname;
	}

	static {
		commandNameMap.put(FORWARD.name, FORWARD);
		commandNameMap.put(BACKWARD.name, BACKWARD);
		commandNameMap.put(TURN_RIGHT.name, TURN_RIGHT);
		commandNameMap.put(TRUN_LEFT.name, TRUN_LEFT);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static Command parseCommand(String name) throws InvalidCommandExcaption {
		if (!commandNameMap.containsKey(name)) {
			throw new InvalidCommandExcaption(name);
		}
		return commandNameMap.get(name);
	}

	public abstract void execute(Robot robot);

	private static class Forward extends Command {

		public Forward() {
			super("forward");
		}

		public void execute(Robot robot) {
			robot.forward();
		}
	}

	private static class BACKWARD extends Command {

		public BACKWARD() {
			super("BACKWARD");
		}

		public void execute(Robot robot) {
			robot.backward();
		}
	}

	private static class RIGHT extends Command {

		public RIGHT() {
			super("TURN_RIGHT");
		}

		public void execute(Robot robot) {
			robot.right();
		}
	}

	private static class left extends Command {

		public left() {
			super("TURN_LEFT");
		}

		public void execute(Robot robot) {
			robot.left();
		}
	}
}
