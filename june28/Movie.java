public class Movie{
	String name;
	Movie(String name){
		System.out.println("Movie Name: "+name);
	}
	public static void main(String[] args){
		System.out.println("Executing main method of Movie company\n");
		Movie m1= new Movie("Actor");
		Movie m2= new Movie("Actorese");
		Movie m3= new Movie("Director");
		Movie m4= new Movie("Production");
		Movie m5= new Movie("Lightings");
		Movie m6= new Movie("set");
		Movie m7= new Movie("Make up");
		Movie m8= new Movie("Camera man");
		Movie m9= new Movie("Junior artist");
		Movie m10= new Movie("Custom design");
		Movie m11= new Movie("Dancers");
	}
}