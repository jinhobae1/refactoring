package refactoring.chap09;

public abstract class Music extends Media {
	@Override public void play() {
		System.out.println("Music:play");
		//���� ��� �ڵ�
	}
	@Override public void loop() {
		System.out.println("Music:loop");
		//���� �ݺ� ��� �ڵ�
	}
	@Override public void stop() {
		System.out.println("Music:stop");
		//���� ���� �ڵ�
	}
}
