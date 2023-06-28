package Kontrabass;

public class Kontrabass {

	
	public static void main(String[] args) {
		

	}
	
	public String seriennummer; // Die individuelle Seriennummer des Kontrabasses
	public double preis;  // Der Verkaufspreis für den Kontrabass 
	
	// erfasst die Seriennummer des Kontrabasses
	public void setSerienNr(String seriennummer) {
		this.seriennummer = seriennummer;
	} 
	
	//fragt die Seriennummer des Basses ab
	public String getSerienNr() {
		return seriennummer;
	}

	//legt den Verkaufspreis für den Kontrabass fest
	public void setPreis(double preis) {
		this.preis = preis; 
	}
	
	//fragt den Verkaufspreis des Kontrabasses ab
	public double getPreis() {
		return preis;
	}

	//berechnet den Verkaufspreis für Stammkunden und gibt diesen Preis an die aufrufende Stelle zurück
	public double berechneStammkundenPreis() {
		
		double rabatt = preis * 0.05;

		return preis - rabatt;
	}

}
