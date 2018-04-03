package refactoring.chap09;

public class Player {
	private Media media = Media.Null;

	public void play() {
		media.play();
	}
	public void loop() {
		media.loop();
	}
	public void stop() {
		media.stop();
	}
	public void setMedia(Media media) {
		if(media==null) {
			media=Media.Null;
		}else {
			media=media;
		}
	}
}
