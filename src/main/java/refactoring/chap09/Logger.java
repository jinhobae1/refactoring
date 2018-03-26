package refactoring.chap09;

public class Logger {
	public static final int STATE_STOPPED = 0;
	public static final int STATE_LOGGIN = 1;

	private int state;

	public Logger() {
		state = STATE_STOPPED;
	}

	public void start() {
		switch (state) {
		case STATE_STOPPED:
			System.out.println("**START LOGGING**");
			state = STATE_LOGGIN;
			break;

		case STATE_LOGGIN:
			// �ƹ��͵� ���� ����
			break;
		default:
			System.out.println("Invalid state:" + state);
		}
	}

	public void stop() {
		switch (state) {
		case STATE_STOPPED:
			// �ƹ��͵� ���� ����
			break;
		case STATE_LOGGIN:
			System.out.println("**STOP LOGGING**");
			state = STATE_STOPPED;
			break;
		default:
			System.out.println("Invalid state:" + state);
		}
	}
	
	public void log(String info) {
		switch(state) {
		case STATE_STOPPED:
			System.out.println("Ignoring:"+info);
			break;
		case STATE_LOGGIN:
			System.out.println("Logging:"+info);
			break;
			default:
				System.out.println("Invalid state:"+state);
		}
	}

}
