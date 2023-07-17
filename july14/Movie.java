class Movie {
	
	String movieName;
	String theatre;
	int ticketPrice=100;
	String hero;
	
	Director director=new Director("Punneeth", "Annabond", 150);

	
	public Movie(String movieName,String theatre)
	{
		System.out.println("running string string const");
		this.movieName=movieName;
		this.theatre=theatre;

	}
	
	void setPrice(int ticketPrice)
	{
		System.out.println("running method");
		this.ticketPrice=ticketPrice;
	}
	
	void printinfo()
	{
		System.out.println("running Movie in printinfo");
		System.out.println("movie name:"+this.movieName);
		System.out.println("theatre name:"+this.theatre);
		System.out.println("ticket price:"+this.ticketPrice);
		System.out.println("hero:"+this.hero);
		System.out.println("  ");
		System.out.println("invoking diresctor movie class");
		this.director.printInfo();
	}
}