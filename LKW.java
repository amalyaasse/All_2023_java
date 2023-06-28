package PKW;

public class LKW extends Pkw {

	/**
	 * 
	 * zus�tliche Methoden f�r Lkw
	 * 
	 * setHoechstGewicht(): legt das zul�ssige H�chstgewicht des LKW�s fest
	 * 
	 * getHoechstGewicht(): gibt das zul�ssige H�chstgewicht des LKW�s an
	 * 
	 * erfasseMautzahlung(): addiert die Zahlung einer Maut zu der schon
	 * insgesamt gezahlten Abgabesumme hinzu
	 * 
	 * getMaut(): gibt die insgesamt gezahlte Summe der Mautausgaben an
	 * 
	 * berechneMautProKm(): berechnet die Maut, die insgesamt im Durchschnitt
	 * pro gefahrenen km gezahlt wurde und gibt sie zur�ck
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
