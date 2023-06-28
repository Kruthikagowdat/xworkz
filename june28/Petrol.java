public class Petrol{
	String name;
	Petrol(String name){
		System.out.println("Petrol Name: "+name);
	}
	public static void main(String[] args){
		System.out.println("Executing main method of Petrol company\n");
		Petrol p1= new Petrol("Indian Oil Corporation");
		Petrol p2= new Petrol("Bharat Petroleum Corporation Limited");
		Petrol p3= new Petrol("Hindustan Petroleum Corporation Limited");
		Petrol p4= new Petrol("Reliance Petroleum");
		Petrol p5= new Petrol("Essar Oil");
		Petrol p6= new Petrol("Shell India");
		Petrol p7= new Petrol("GAIL");
		Petrol p8= new Petrol("Petronet LNG");
		Petrol p9= new Petrol("ONGC");
		Petrol p10= new Petrol("Cairn Oil & Gas");
		Petrol p11= new Petrol("Nayara Energy");
	}
}