package refactoring.chap06.extract_superclass;

public class Player {
	private boolean isMusic;
	private String musicDate = "±Â";
	private String videoDate = "»Õ";

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


	private void playMusic() {
		System.out.printf("%s %s%n",musicDate,"play");
	}
	private void playvideo() {
		System.out.printf("%s %s%n",videoDate,"play");
	}


	private void loopvideo() {
		System.out.printf("%s %s%n",videoDate,"loop");
	}

	private void loopMusic() {
		System.out.printf("%s %s%n",musicDate,"loop");
	}

	private void stopvideo() {
		System.out.printf("%s %s%n",videoDate,"stop");
	}

	private void stopMusic() {
		System.out.printf("%s %s%n",musicDate,"stop");
	}

	public String getMusicDate() {
		return musicDate;
	}

	public void setMusicDate(String musicDate) {
		this.musicDate = musicDate;
	}

	public String getVideoDate() {
		return videoDate;
	}

	public void setVideoDate(String videoDate) {
		this.videoDate = videoDate;
	}

}
