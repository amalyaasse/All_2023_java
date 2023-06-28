package PKW;

public class Pkw {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	/*
	 * Die Hauptaufgabe der Klasse „PKW“ liegt in der Verwaltung von PKW`s. Dazu
	 * bietet die Klasse die folgenden Methoden an:
	 * 
	 * setKaufPreis(): setzt den Kaufpreis des Wagens fest
	 * 
	 * getKaufPreis(): gibt den Kaufpreis des Wagens an
	 * 
	 * tanken(): addiert eine neue Tankfüllung zu der insgesamt bereits
	 * getankten Treibstoffmenge (in Liter)
	 * 
	 * getTankMenge(): gibt die bereits getankte Gesamttankmenge an (in Liter)
	 * 
	 * kmErfassen(): erhöht die Gesamtfahrleistung des Wagens um die km –
	 * Distanz einer gerade gefahrenen Strecke
	 * 
	 * getKmLeistung(): gibt die aktuelle Gesamtfahrstrecke des Wagens in km an
	 * 
	 * berechneVerbrauch(): berechnet den Treibstoffverbrauch auf 100km und gibt
	 * ihn aus
	 */

	private double kaufpreis;
	private double tankMenge;
	public double kmLeistung;
	

	public void setKaufPreis(double KaufPreis) {
		this.kaufpreis = kaufpreis;
	}

	public double getKaufPreis() {
		return kaufpreis;
	}

	// addiert eine neue Tankfüllung zu der insgesamt bereits getankten
	// Treibstoffmenge (in Liter)
	public void tanken(double tankMenge) {

		this.tankMenge += tankMenge;

	}

	// gibt die bereits getankte Gesamttankmenge an (in Liter)

	public double getTankMenge() {
		return tankMenge;
	}

	// erhöht die Gesamtfahrleistung des Wagens um die km –
	// * Distanz einer gerade gefahrenen Strecke
	public void kmErfassen(double km) {
		kmLeistung += km ;
	}

	// gibt die aktuelle Gesamtfahrstrecke des Wagens in km an
	public double getKmLeistung() {
		return kmLeistung;
	}

	public void berechneVerbrauch() {
		double verbrauch = (tankMenge/kmLeistung)*100;
		System.out.println("verbrauch: " +verbrauch + " Liter auf 100 km " );
		
	}

}
