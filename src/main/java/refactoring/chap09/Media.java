package refactoring.chap09;

public abstract class Media {
	public abstract void play();

	public abstract void loop();

	public abstract void stop();

	public static final Media Null = new Media() {
			@Override public void play() {
				System.out.println("Null:play");
			}
			@Override public void loop() {
				System.out.println("Null:loop");
			}
			@Override public void stop() {
				System.out.println("Null:stop");
			}
	};

	/*
	 * private Media media = Media.Null; public void play() { if(media
	 * ==Media.VIDEO) { System.out.println("Video:play"); }else if(media ==
	 * Media.MUSIC) { System.out.println("Music:play"); }else if(media==Media.Null)
	 * { System.out.println("Null:play"); }else { assert false; }
	 */

	/*
	 * if(media==Media.VIDEO) { System.out.println("Video:loop"); //비디오 반복 재생 코드
	 * }else if (media == Media.MUSIC) { System.out.println("Music:loop"); //음악 반복
	 * 재생 코드 }else if(media==Media.Null) { System.out.println("Null:loop"); }else {
	 * assert false; }
	 */

	/*
	 * if(media==Media.VIDEO) { System.out.println("Video:stop"); //비디오 정지 코드 }else
	 * if (media == Media.MUSIC) { System.out.println("Music:stop"); //음악 정지코드 }else
	 * if(media==Media.Null) { System.out.println("Null:stop"); }else { assert
	 * false; }
	 */

	public void setMedia(Media media) {
		/*
		 * if(media==null) { media = Media.Null; }else { media=media; } }
		 */

	}
}
