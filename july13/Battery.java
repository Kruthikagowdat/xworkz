class Battery {
	
	String name="Exide";
	BatteryType type;
	int cost;
	int noOfBatteries;
	
	void setBatteryType(BatteryType type) {
		this.type = type;
	}
	
	Battery(int cost, int noOfBatteries){
		this.cost=cost;
		this.noOfBatteries=noOfBatteries;
	}
	
	void display() {
		System.out.println(name);
		System.out.println("Battery Type : "+this.type + " Battery");
		System.out.println("Cost of the batteries : "+this.cost+"rs");
		System.out.println("No of Batteries : "+noOfBatteries);
	}
	

}