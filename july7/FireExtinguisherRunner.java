class FireExtinguisherRunner{
	public static void main(String[] args){	
	System.out.println(" ");
	System.out.println("Running main in FireExtinguisherRunner...");
	System.out.println(" ");
		
	System.out.println("calling 1st constructor from FireExtinguisherRunner...");
	FireExtinguisher fire1 = new FireExtinguisher("Amerex" , "Suitable for wood" , 4500 , "Foam type" , 2);
	fire1.info();
	System.out.println(" ");

	System.out.println("calling 2nd constructor from FireExtinguisherRunner...");
    FireExtinguisher fire2 = new FireExtinguisher("EZ Fire Spray" , " Suitable for paper and textiles",  3500 , "Water type" , 2.5);
    fire2.info();
	System.out.println(" ");
	
	
	System.out.println("calling 3rd constructor from FireExtinguisherRunner...");
    FireExtinguisher fire3 = new FireExtinguisher("First Alert" ,"Suitable for flammable gasses" , 2500 , "Co2 type" , 3);
	fire3.info();
	System.out.println(" ");

	}
}