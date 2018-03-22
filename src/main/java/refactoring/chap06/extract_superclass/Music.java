package refactoring.chap06.extract_superclass;

public class Music {
	public String musicDate;

	public Music(String musicDate) {
		this.musicDate = musicDate;
	}

	public Music() {
		super();
	}

	public String getMusicDate() {
		return musicDate;
	}

	public void setMusicDate(String musicDate) {
		this.musicDate = musicDate;
	}

	public void playMusic() {
		System.out.printf("%s %s%n",musicDate, "play");
	}

	public void loopMusic() {
		System.out.printf("%s %s%n",musicDate,"loop");
	}
	public void stopMusic() {
		System.out.printf("%s %s%n",musicDate,"stop");
	}

}