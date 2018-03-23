package refactoring.chap06.extract_superclass;

public class Player {
	private Media media;

	public void play() {

		System.out.printf("%s %s%n", media, "play");
	}

	public void loop() {
		System.out.printf("%s %s%n", media, "loop");

	}

	public void stop() {
		System.out.printf("%s %s%n", media, "stop");

	}

	public void setMedia(Media media) {
		this.media = media;
	}

}
