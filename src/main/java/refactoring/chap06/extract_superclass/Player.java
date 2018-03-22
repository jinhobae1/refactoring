package refactoring.chap06.extract_superclass;

public class Player {
	private boolean isMusic;
	private Music music = new Music("±Â");
	private Video video = new Video("»Õ");

	public boolean isMusic() {
		return isMusic;
	}

	public void setMusic(boolean isMusic) {
		this.isMusic = isMusic;
	}

	public void play() {
		if (isMusic) {
			playMusic();
		} else {
			playvideo();
		}
	}

	public void loop() {
		if (isMusic) {
			loopMusic();
		} else {
			loopvideo();
		}
	}

	public void stop() {
		if (isMusic) {
			stopMusic();
		} else {
			stopvideo();
		}
	}

	public void playMusic() {
		music.playMusic();
	}

	public void loopMusic() {
		music.loopMusic();
	}

	public void stopMusic() {
		music.stopMusic();
	}

	private void playvideo() {
		video.playvideo();
	}

	private void loopvideo() {
		video.loopvideo();
	}

	private void stopvideo() {
		video.stopvideo();
	}

}
