class TrainRunner{
	public static void main(String[] args){
		System.out.println("Running main method");
		Train ref=new Train();
		ref.name="Kacheguda–Mysuru Express";
		ref.noOfSeats=3500;
		ref.length=650;
		
		ref.displayInstance();
		
		Train ref1=new Train();
		ref1.name="Karnataka Express";
		ref1.noOfSeats=6000;
		ref1.length=550;
		
		ref1.displayInstance();
		
		Train ref2=new Train();
		ref2.name="Karnataka Sampark Kranti Express";
		ref2.noOfSeats=1600;
		ref2.length=600;
		
		ref2.displayInstance();
	}
}