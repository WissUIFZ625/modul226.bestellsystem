package ch.wiss.modul226.bestellsystem;


import java.io.*;
import java.util.ArrayList;

public class DatenSpeicherer extends ArrayList<Artikel> {

	private static final long serialVersionUID = 1L;

	static void exporToCSV(Bestellung b, String dateiName) {


		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter(dateiName));

			//Viel Schöner

			for (Artikel a : b) { 
				writer.write(a.getArtikelnummer() + ";" + a.getArtikelBezeichung() + ";" + a.getPreis()) ;
				writer.newLine();
			}

			writer.flush();
			writer.close();
			System.out.println("Sicherung war erfolgrich");
			throw new NullPointerException();
		} catch (Exception e) {
			String Mitteilung = "Du horst machs richtig";
			System.out.println(Mitteilung);
		}	 

	}
}


/*
	public class Export {
		public void main(String[] args) throws IOException {
			String csvFile = "/Users/streber/Documents/workspace/Modul226/csvexport.csv";
			FileWriter writer = new FileWriter(csvFile);
 */

/*
for (int i = 0; i < b.getArtikelListe().size(); i++) {
	Artikel einEinzelner = b.getArtikelListe().get(i);
	System.out.println(einEinzelner.Artikelnummer + ";" + einEinzelner.ArtikelBezeichung + ";" + einEinzelner.Preis );
	writer.write(einEinzelner.Artikelnummer)

}
 */


