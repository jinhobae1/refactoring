package refactoring.chap09;

public abstract class Video extends Media {
	@Override
	public void play() {
		System.out.println("Music:play");
		// 비디오 재생 코드
	}

	@Override
	public void loop() {
		System.out.println("Music:loop");
		// 비디오 반복재생 코드
	}

	@Override
	public void stop() {
		System.out.println("Music:stop");
		// 비디오 정지 코드

	}
}
