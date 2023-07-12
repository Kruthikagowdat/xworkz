class NumberPlateRunner{
	public static void main(String[] args){
		System.out.println("Running main method");
		NumberPlate ref=new NumberPlate();
		ref.distictName="KA-01-Bengluru";
		ref.plateNo=8709;
		
		ref.displayInstance();
		
		NumberPlate ref1=new NumberPlate();
		ref1.distictName="KA-13-Hassan";
		ref1.plateNo=4501;
		
		ref1.displayInstance();
		
		NumberPlate ref2=new NumberPlate();
		ref2.distictName="KA-18-Chikmagaluru";
		ref2.plateNo=3333;

		ref2.displayInstance();
	}
}