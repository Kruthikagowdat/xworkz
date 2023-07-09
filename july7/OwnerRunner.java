class OwnerRunner{
	public static void main(String[] args){
		System.out.println(" ");
		System.out.println("Running main in OwnerRunner...");
		System.out.println(" ");
		
		System.out.println("calling 1st constructor from OwnerRunner...");
		Owner owner1 = new Owner("Sathish" , 99012046l,56 , "male" , "Indian");
		owner1.info();
		System.out.println(" ");

	
			
	    System.out.println("calling 2nd constructor from OwnerRunner...");
		Owner owner2 = new Owner("TIhimme gowda" , 65813110l, 50 , "male" ,"HP");
		owner2.info();
		System.out.println(" ");
	
	
	    System.out.println("calling 3rd constructor from OwnerRunner...");
		Owner owner3 = new Owner("Sreedhar" , 94453323l , 40 , "female" , "Bharth");
		owner3.info();
		System.out.println(" ");

	}
}
