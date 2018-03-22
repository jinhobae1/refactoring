package refactoring.chap06.extract_superclass;

public class Video {
	public String videoDate;

	public Video(String videoDate) {
		this.videoDate = videoDate;
	}

	public String getVideoDate() {
		return videoDate;
	}

	public void setVideoDate(String videoDate) {
		this.videoDate = videoDate;
	}

	public void playvideo() {
		System.out.printf("%s %s%n", videoDate, "play");
	}

	public void loopvideo() {
		System.out.printf("%s %s%n",videoDate, "loop");
	}

	public void stopvideo() {
		System.out.printf("%s %s%n", videoDate, "stop");
	}

}