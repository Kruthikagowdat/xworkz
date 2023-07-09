class WorkerRunner{
	public static void main(String[] args){
		System.out.println(" ");
		System.out.println("Running main in WorkerRunner...");
		System.out.println(" ");
		
		System.out.println("calling 1st constructor from WorkerRunner...");
		Worker worker1 = new Worker("Ramesh" , 55641, "Morning" , "male" , 15999.9);
		worker1.info();
		System.out.println(" ");

	
			
	    System.out.println("calling 2nd constructor from WorkerRunner...");
		Worker worker2 = new Worker("Suresh" , 54432, "Night" , "male" , 17999.9);
		worker2.info();
		System.out.println(" ");
	
	
	    System.out.println("calling 3rd constructor from WorkerRunner...");
		Worker worker3 = new Worker("pushpa" , 87679 , "Afternoon" , "female" , 9999.9);
		worker3.info();
		System.out.println(" ");

	}
}
