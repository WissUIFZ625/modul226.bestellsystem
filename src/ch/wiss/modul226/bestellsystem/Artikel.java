package ch.wiss.modul226.bestellsystem;

public class Artikel {

	private String ArtikelBezeichung;
	private int Artikelnummer;
	private double Preis;	
	
	public String getArtikelBezeichung() {
		return ArtikelBezeichung;
	}

	public void setArtikelBezeichung(String artikelBezeichung) {
		ArtikelBezeichung = artikelBezeichung;
	}

	public int getArtikelnummer() {
		return Artikelnummer;
	}

	public void setArtikelnummer(int artikelnummer) {
		Artikelnummer = artikelnummer;
	}

	public double getPreis() {
		return Preis;
	}

	public void setPreis(double preis) {
		Preis = preis;
	}

	public Artikel (int nr, String bezeichnung, double preis){
        this.Artikelnummer = nr;
        this.ArtikelBezeichung = bezeichnung;
        this.Preis = preis;
	}
	
	public Artikel (){
		
	}
}