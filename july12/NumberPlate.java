class NumberPlate{
	static String distictName;
	int plateNo;
	
	void displayInstance(){
		System.out.println(this.plateNo);
		displaystatic();
	}
	static String displaystatic(){
		System.out.println(distictName);
		return distictName;
	}
}