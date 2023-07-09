class OilRunner{
	public static void main(String[] args){
		System.out.println(" ");
		System.out.println("Running main in OilRunner...");
		System.out.println(" ");
		
		System.out.println("calling 1st constructor from OilRunner...");
		Oil oil1 = new Oil("Indian oil" , 2000 , 101 , "Petrol" , 74.5);
		oil1.info();
		System.out.println(" ");

	
			
	    System.out.println("calling 2nd constructor from OilRunner...");
		Oil oil2 = new Oil("HP" , 1000, 110 , "Petrol" , 73.2);
		oil2.info();
		System.out.println(" ");
	
	
	    System.out.println("calling 3rd constructor from OilRunner...");
		Oil oil3 = new Oil("Bharat Petrolium" , 5000 , 105 , "Diesel" , 85.3);
		oil3.info();
		System.out.println(" ");

	}
}