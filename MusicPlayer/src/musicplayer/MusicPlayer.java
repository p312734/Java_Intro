package musicplayer;

public class MusicPlayer {
	/* Main Class */
	
	public static void main(String[] args) {
		Song mySong1 = new Song("1 Blue Screen Band", "The Fatal Error Song", 666);
		mySong1.druckeSong();

		Song mySong2 = new Song("Meltdown Security Flaw", 777);
		mySong2.druckeSong();
		
		Song mySong3 = new Song("Memory Overflow", 1, 30, 30);
		mySong3.druckeSong();

	}
}
