package refactoring.chapter10;

import java.util.HashMap;
import java.util.Map;

public class Command {
	public static final Command FORWARD = new Command("forward");
	public static final Command BACKWARD = new Command("backward");
	public static final Command TURN_RIGHT = new Command("right");
	public static final Command TRUN_LEFT = new Command("left");
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
}
