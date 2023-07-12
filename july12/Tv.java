class Tv{
	static String brandName;
	double price;
	
	void displayInstance(){
		System.out.println(this.price+"rs");
		displaystatic();
	}
	static String displaystatic(){
		System.out.println(brandName);
		return brandName;
	}
}