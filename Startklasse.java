package PKW;

public class Startklasse {

	/**
	 *a) Erzeugen eines PKW – Objekts mit der Bezeichnung „testWagen“, Preis: 24.900 €.

b) 2 mal Tanken: 32 und 27 Liter, 2 Fahrten mit 400 km und 380 km erfassen.

c) Ausgabe der bisherigen Gesamtfahrleistung.

d) Da der Tank fast leer ist: Ausgabe der bisher getankten Treibstoffmenge und des Durchschnittsverbrauchs!
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pkw testwagen = new Pkw();
		testwagen.setKaufPreis(24.900);
		
		testwagen.tanken(32);
		testwagen.kmErfassen(400);
		
		testwagen.tanken(27);
		testwagen.kmErfassen(380);
		
		System.out.println("Gesamtfahrleistung: " + testwagen.getKmLeistung() + "km");
		System.out.println("bisher getankte treibstoffmenge: " +testwagen.getTankMenge()+ " Liter");
		
		testwagen.berechneVerbrauch();
		
		
		LKW transporter = new LKW();
		transporter.setKaufPreis(49900);
		transporter.tanken(200);
		transporter.tanken(160);
		transporter.kmErfassen(1000);
		transporter.kmErfassen(800);
		transporter.erfasseMautzahlung(60);
		transporter.erfasseMautzahlung(300);
		transporter.berechneVerbrauch();
		transporter.berechneMautProKm();
		
	
		
		
		
		
		
	}

}
