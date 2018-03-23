package refactoring.chap06.extract_superclass;

import com.google.common.base.MoreObjects.ToStringHelper;

public class Main {

	public static void main(String[] args) {
		Player musicPlayer = new Player();
		musicPlayer.setMedia(new Music("�ƾ�"));

		Player videoPlayer = new Player();
		videoPlayer.setMedia(new Video("��"));

		play(musicPlayer);
		play(videoPlayer);
		System.out.println(musicPlayer);
	}

	public static void play(Player player) {
		
		player.play();
		player.loop();
		player.stop();
	}
}
