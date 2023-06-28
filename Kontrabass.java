package Kontrabass;

public class Kontrabass {

	
	public static void main(String[] args) {
		

	}
	
	public String seriennummer; // Die individuelle Seriennummer des Kontrabasses
	public double preis;  // Der Verkaufspreis f�r den Kontrabass 
	
	// erfasst die Seriennummer des Kontrabasses
	public void setSerienNr(String seriennummer) {
		this.seriennummer = seriennummer;
	} 
	
	//fragt die Seriennummer des Basses ab
	public String getSerienNr() {
		return seriennummer;
	}

	//legt den Verkaufspreis f�r den Kontrabass fest
	public void setPreis(double preis) {
		this.preis = preis; 
	}
	
	//fragt den Verkaufspreis des Kontrabasses ab
	public double getPreis() {
		return preis;
	}

	//berechnet den Verkaufspreis f�r Stammkunden und gibt diesen Preis an die aufrufende Stelle zur�ck
	public double berechneStammkundenPreis() {
		
		double rabatt = preis * 0.05;

		return preis - rabatt;
	}

}
