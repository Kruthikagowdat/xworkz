class Train{
	static String name;
	double noOfSeats;
	double length;
	
	void displayInstance(){
		System.out.println(this.noOfSeats);
		System.out.println(this.length+"m");
		displaystatic();
	}
	static String displaystatic(){
		System.out.println(name);
		return name;
	}
}