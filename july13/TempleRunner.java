class TempleRunner {

	public static void main(String[] args) {
		Temple temple1 = new Temple("Ganesh",true);
		temple1.setPrasdaType(PrasdaType.LADDOO);
		temple1.display();
		
		Temple temple2 = new Temple("Lakshmi",true);
		temple2.setPrasdaType(PrasdaType.CURD_RICE);
		temple2.display();

	}

}