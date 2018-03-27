package refactoring.chap09;

public  class StateLogging extends State {
	private static final StateLogging instance = new StateLogging();
	public static StateLogging getInstance() {
		return instance;
	}

	private StateLogging() {
	}

	@Override
	public void start(Logger logger) {
		// �ƹ��͵� ���� ����
	}

	@Override
	public void stop(Logger logger) {
		System.out.println("**STOP LOGGING**");
		logger.setState(StateStopped.getInstance());
	}
	public void log(String info) {
		System.out.println("Logging:"+info);
	}
}
