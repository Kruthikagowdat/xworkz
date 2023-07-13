class SongRunner {

	public static void main(String[] args) {
		Song song1 = new Song("Vijay",5);
		song1.setSongType(SongType.BREAK_UP);
		song1.display();
		
		Song song2 = new Song("Anu", 4);
		song2.setSongType(SongType.EMOTIONAL);
		song2.display();

	}

}