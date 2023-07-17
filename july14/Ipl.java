class Ipl {
	
	String favoriteTeam;
	int players;
	String favoritePlayerName;
	String favoritePlayerDaughter;
	Rcb rcb=new Rcb("Virat","Aggersive captain","Aunshak",18);
	
	
	Ipl(String favoriteTeam,int players)
	{
		this.favoriteTeam=favoriteTeam;
		this.players=players;
	}
	
	void setFavorite(String favoritePlayerName)
	{
		this.favoritePlayerName=favoritePlayerName;
	}
	
	void printinfo()
	{
		System.out.println(this.favoriteTeam);
		System.out.println(this.players);
		System.out.println(this.favoritePlayerName);
		System.out.println(this.favoritePlayerDaughter);
		
		this.rcb.printInfo();
	}

}