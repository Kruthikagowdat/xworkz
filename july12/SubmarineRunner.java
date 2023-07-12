class SubmarineRunner{
	public static void main(String[] args){
		System.out.println("Running main method");
		Submarine ref=new Submarine();
		ref.name="Simon Lake ";
		ref.type="Nuclear Power Plant";
		
		ref.displayInstance();
		
		Submarine ref1=new Submarine();
		ref1.name="USS Queenfish ";
		ref1.type="Nuclear Navies";
		
		ref1.displayInstance();
		
		Submarine ref2=new Submarine();
		ref2.name="USS Alexandria";
		ref2.type="Design Principle";
		
		ref2.displayInstance();
	}
}