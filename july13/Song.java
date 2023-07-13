class Song {
	
	String name="V HARI KRISHAN";
	SongType type;
	String singer;
	int mins;
	
	void setSongType(SongType type) {
		this.type = type;
	}
	
	Song(String singer, int mins){
		this.singer=singer;
		this.mins=mins;
	}
	
	void display() {
		System.out.println(name);
		System.out.println("Songs Type : "+this.type);
		System.out.println("singer  : "+this.singer);
		System.out.println("No of mins : "+mins);
	}
	

}