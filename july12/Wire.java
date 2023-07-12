class Wire{
	static String brandName;
	String quality;
	double length;
	
	void displayInstance(){
		System.out.println(this.quality);
		System.out.println(this.length);
		displaystatic();
	}
	static String displaystatic(){
		System.out.println(brandName);
		return brandName;
	}
}