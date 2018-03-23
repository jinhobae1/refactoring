package refactoring.chap06.extract_superclass;

public abstract class Media {
	public String mediaDate;

	public Media(String mediaDate) {
		super();
		this.mediaDate = mediaDate;
	}

	public abstract void play();

	public abstract void loop();

	public abstract void stop();

}
