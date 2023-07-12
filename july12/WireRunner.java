class WireRunner{
	public static void main(String[] args){
		System.out.println("Running main method");
		Wire ref=new Wire();
		ref.brandName="Finolex";
		ref.quality="Good";
		ref.length=100;
		
		ref.displayInstance();
		
		Wire ref1=new Wire();
		ref1.brandName="Sterlite cables";
		ref1.quality="Medium";
		ref1.length=100.90;
		
		ref1.displayInstance();
		
		Wire ref2=new Wire();
		ref2.brandName="Polycab Wires";
		ref2.quality="Good";
		ref2.length=200;
		
		ref2.displayInstance();
	}
}