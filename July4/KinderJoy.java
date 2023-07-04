class KinderJoy{
	double price;
	int quality;
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
	
	KinderJoy(double price,int quality)
	{
		System.out.println("Running kinderjoy with double and int ");
		this.price=price;
		this.quality=quality;
	}
	
	KinderJoy(double price,int quality,boolean toy)
	{
		System.out.println("Running kinderjoy with double, int and boolean");
		this.price=price;
		this.quality=quality;
		this.toy=toy;
	}
}