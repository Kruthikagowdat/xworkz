public class Bed{
	String name;
	String size;
	Bed(String name,String size){
		System.out.println("Bed Name: "+name+ " --- Size: "+size);
	}
	public static void main(String[] args){
		System.out.println("Executing main method of Bed company\n");
		Bed b1= new Bed("Tempur-Pedic","King");
		Bed b2= new Bed("Sealy","King");
		Bed b3= new Bed("Serta","Queen");
		Bed b4= new Bed("Simmons","King");
		Bed b5= new Bed("Casper","Queen");
		Bed b6= new Bed("Tuft & Needle","Queen");
		Bed b7= new Bed("Purple","Queen");
		Bed b8= new Bed("Beautyrest","King");
		Bed b9= new Bed("Stearns & Foster","Queen");
		Bed b10= new Bed("Ikea","Queen");
		Bed b11= new Bed("Sleep Number","King");
	}
}
