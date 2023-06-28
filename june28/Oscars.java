public class Oscars{
	String name;
	Oscars(String name){
		System.out.println("Oscars Name: "+name);
	}
	public static void main(String[] args){
		System.out.println("Executing main method of Oscars company\n");
		Oscars os1= new Oscars("Gandhi");
		Oscars os2= new Oscars("Salaam Bombay!");
		Oscars os3= new Oscars("Lagaan: Once Upon a Time in India" );
		Oscars os4= new Oscars("Mother India");
		Oscars os5= new Oscars("Sons of the Desert" );
		Oscars os6= new Oscars("An Encounter with Faces" );
		Oscars os7= new Oscars("Sikkim");
		Oscars os8= new Oscars("The Final Inch");
		Oscars os9= new Oscars("Period. End of Sentence" );
		Oscars os10= new Oscars("Water");
		Oscars os11= new Oscars("RRR");
	}
}
