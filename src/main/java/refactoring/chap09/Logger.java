package refactoring.chap09;

public class Logger {
	/*
	 * static final int STATE_STOPPED = 0; public static final int STATE_LOGGING =
	 * 1;
	 */
	private State state;

	/*
	 * public int getState() { return state.getTypecode(); }
	 */

	public void setState(State state) {
		this.state = state;
		/*
		 * switch(state) { case STATE_STOPPED: state = new StateStopped(); break; case
		 * STATE_LOGGING: state = new StateLoggin(); break; default:
		 * System.out.println("Invalid state:"+state); }
		 */
	}

	public Logger() {
		setState(StateStopped.getInstance());
	}

	public void start() {
		state.start(this);
		/*
		 * switch (getState()) { case STATE_STOPPED:
		 * System.out.println("**START LOGGING**"); setState(STATE_LOGGING); break;
		 * 
		 * case STATE_LOGGING: // 아무것도 하지 않음 break; default:
		 * System.out.println("Invalid state:" + getState());
		 */
	}



	public void stop() {
		state.stop(this);
		/*
		 * switch (state.getState()) { case STATE_STOPPED: // 아무것도 하지 않음 break; case
		 * STATE_LOGGING: System.out.println("**STOP LOGGING**");
		 * state.setState(STATE_STOPPED); break; default:
		 * System.out.println("Invalid state:" + getState());
		 */
	}

	public void log(String info) {
		state.log(info);
		/*switch (state.getState()) {
		case STATE_STOPPED:
			System.out.println("Ignoring:" + info);
			break;
		case STATE_LOGGING:
			System.out.println("Logging:" + info);
			break;
		default:
			System.out.println("Invalid state:" + getState());
		}*/
	}

}
