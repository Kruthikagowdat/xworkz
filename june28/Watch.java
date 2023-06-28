public class Watch{
	String name;
	Watch(String name){
		System.out.println("Watch Name: "+name);
	}
	public static void main(String[] args){
		System.out.println("Executing main method of Watch company\n");
		Watch w1= new Watch("Rolex");
		Watch w2= new Watch("Omega");
		Watch w3= new Watch("Tag Heuer");
		Watch w4= new Watch("Cartier");
		Watch w5= new Watch("Patek Philippe");
		Watch w6= new Watch("Audemars Piguet");
		Watch w7= new Watch("Breitling");
		Watch w8= new Watch("Tissot");
		Watch w9= new Watch("Seiko");
		Watch w10= new Watch("Citizen");
		Watch w11= new Watch("Swatch");
	}
}