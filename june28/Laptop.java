public class Laptop{
	String name;
	int barCode;
	Laptop(String name,int barCode){
		System.out.println("Laptop Name: "+name+ " --- Bar Code: "+barCode);
	}
	public static void main(String[] args){
		System.out.println("Executing main method of Laptop company\n");
		Laptop l1= new Laptop("Dell",6789);
		Laptop l2= new Laptop("HP",6568);
		Laptop l3= new Laptop("Apple",4455);
		Laptop l4= new Laptop("Asus",3214);
		Laptop l5= new Laptop("Sony",5543);
		Laptop l6= new Laptop("samsung",4325);
		Laptop l7= new Laptop("MSI",5981);
		Laptop l8= new Laptop("Toshiba",9098);
		Laptop l9= new Laptop("Lenovo",7540);
		Laptop l10= new Laptop("Acer",1241);
		Laptop l11= new Laptop("LG",8241);
	}
}