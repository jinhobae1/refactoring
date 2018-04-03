package refactoring.chap09;

public  class StateStopped extends State {
	private static final StateStopped instance = new StateStopped();

	public static StateStopped getInstance() {
		return instance;
	}

	private StateStopped() {
	}

	@Override
	public void start(Logger logger) {
		System.out.println("**START LOGGING**");
		logger.setState(StateLogging.getInstance());

	}

	@Override
	public void stop(Logger logger) {
		// 아무것도 하지 않음
	}

	public void log(String info) {
		System.out.println("Ignoring:" + info);
	}

}
