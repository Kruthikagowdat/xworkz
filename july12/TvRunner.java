class TvRunner{
	public static void main(String[] args){
		System.out.println("Running main method");
		Tv ref=new Tv();
		ref.brandName="LG";
		ref.price=33000;
		
		ref.displayInstance();
		
		Tv ref1=new Tv();
		ref1.brandName="Redmi";
		ref1.price=48000;
		
		ref1.displayInstance();
		
		Tv ref2=new Tv();
		ref2.brandName="One plus";
		ref2.price=45000;
		
		ref2.displayInstance();
	}
}