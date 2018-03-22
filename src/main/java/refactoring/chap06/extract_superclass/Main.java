package refactoring.chap06.extract_superclass;

public class Main {

	public static void main(String[] args) {
	Player musicPlayer = new Player();
	musicPlayer.setMusic(true);
	
	Player videoPlayer =new Player();
	videoPlayer.setMusic(false);
	
	play(musicPlayer);
	play(videoPlayer);
	}
	public static void play(Player player) {
		player.play();
		player.loop();
		player.stop();
	}
}
