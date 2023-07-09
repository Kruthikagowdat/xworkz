class Worker{
	String name;
	int idNo;
	String shift;
	String gender;
	double salary;
	
	Worker(String name,int idNo,String shift,String gender,double salary){
		System.out.println("Running string,int,string,string,double constructor in worker");
		this.name = name;
		this.idNo = idNo;
		this.shift = shift;
		this.gender = gender;
		this.salary = salary;
	}
	void info(){
		System.out.println("Running non static method in worker");
		System.out.println("Worker name : " + name);
		System.out.println("Worker idNo : " + idno);
		System.out.println("Worker shift : " + shift);
		System.out.println("Worker gender : " + gender);
		System.out.println("Worker salary : " + salary);
	}
	
	
}
