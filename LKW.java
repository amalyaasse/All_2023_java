package PKW;

public class LKW extends Pkw {

	/**
	 * 
	 * zusätliche Methoden für Lkw
	 * 
	 * setHoechstGewicht(): legt das zulässige Höchstgewicht des LKW’s fest
	 * 
	 * getHoechstGewicht(): gibt das zulässige Höchstgewicht des LKW’s an
	 * 
	 * erfasseMautzahlung(): addiert die Zahlung einer Maut zu der schon
	 * insgesamt gezahlten Abgabesumme hinzu
	 * 
	 * getMaut(): gibt die insgesamt gezahlte Summe der Mautausgaben an
	 * 
	 * berechneMautProKm(): berechnet die Maut, die insgesamt im Durchschnitt
	 * pro gefahrenen km gezahlt wurde und gibt sie zurück
	 * 
	 * 
	 * 
	 */
	public static void main(String[] args) {
		//

	}

	private double hochstgewicht;
	private double maut;
	private double gewicht;
	

	public void setHoechstGewicht(double gewicht) {
		
		this.hochstgewicht = gewicht;
	}

	public double setHoechstGewicht() {
		 return gewicht;
	}

	public void erfasseMautzahlung(double betrag) {

		this.maut = betrag;
	}

	public double getMaut() {
		
		return maut;
	}
	
	public double berechneMautProKm(){
		
		return maut/kmLeistung;
	}

	

}
