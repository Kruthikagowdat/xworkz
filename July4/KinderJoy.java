class KinderJoy{
	double price;
	int quantity;
	boolean toy;
	
	KinderJoy()
	{
		System.out.println("Running with no-args");
	}
	
	KinderJoy(double price)
	{
		System.out.println("Running kinderjoy with double");
		this.price=price;
	}
	
	KinderJoy(double price,int quantity)
	{
		System.out.println("Running kinderjoy with double and int ");
		this.price=price;
		this.quantity=quantity;
	}
	
	KinderJoy(double price,int quanlity,boolean toy)
	{
		System.out.println("Running kinderjoy with double, int and boolean");
		this.price=price;
		this.quantity=quantity;
		this.toy=toy;
	}
}