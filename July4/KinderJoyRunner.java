class KinderJoyRunner{
	public static void main(String[] args) 
    {
        System.out.println("running main of KinderjoyRunner");
		
		KinderJoy ref=new KinderJoy();
        System.out.println("Name: "+ref.price);
        System.out.println("Quantity: "+ref.quantity);
        System.out.println("toy: "+ref.toy);
		
		KinderJoy ref1=new KinderJoy(45.00);
        System.out.println("Name: "+ref1.price);
        System.out.println("Quantity: "+ref1.quantity );
        System.out.println("toy: "+ref1.toy);
        
		
		KinderJoy ref2=new KinderJoy(45.00,2);
        System.out.println("Name: "+ref2.price);
        System.out.println("Quantity: "+ref2.quantity );
        System.out.println("toy: "+ref2.toy);
        
		
		KinderJoy ref3=new KinderJoy(45.00,2,true);
        System.out.println("Name: "+ref3.price);
        System.out.println("Quantity: "+ref3.quantity );
        System.out.println("toy: "+ref3.toy);
	}   
}