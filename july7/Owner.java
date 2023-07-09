class Owner{
	String name;
	long phNumber;
	int age;
	String gender;
	String bunkName;
	
	Owner(String name,long phNumber,int age,String gender,String bunkName){
		System.out.println("Running string,long,int,string,String constructor in Owner");
		this.name = name;
		this.phNumber = phNumber;
		this.age = age;
		this.gender = gender;
		this.bunkName = bunkName;
	}
	void info(){
		System.out.println("Running non static method in Owner");
		System.out.println("Owner name : " + name);
		System.out.println("Owner phNumber : " + phNumber);
		System.out.println("Owner age : " + age);
		System.out.println("Owner gender : " + gender);
		System.out.println("Owner bunkName : " + bunkName);
		
		

	}
	
	
}