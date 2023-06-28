package Kontrabass;

public class Startklasse {

	
	public static void main(String[] args) {
		
	//Testen Sie die Klasse mit Hilfe der Entwicklungsumgebung Eclipse mit einer Startklasse, indem Sie ein Objekt vom Typ Kontrabass 
		//erzeugen, dann seine Seriennummer auf „3224“ setzen und 
		//als Preis 28500 € festlegen. Ermitteln Sie danach den Stammkundenpreis für diesen Kontrabass und geben Sie ihn aus.
		
		Kontrabass testKontrabass = new Kontrabass();
		
		testKontrabass.setSerienNr("3224");
		testKontrabass.setPreis(28500);
		double stammkundenpreis = testKontrabass.berechneStammkundenPreis();
		System.out.println("Stammkundenpreis " + stammkundenpreis);
		
		
		
		
		
		
	}

}
