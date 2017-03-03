package ch.wiss.modul226.bestellsystem;

public class BestellungTest  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Artikel a1 = new Artikel();
		//Public Attribute
		//a1.ArtikelBezeichung = "Zahnpasta";
		//a1.Artikelnummer = 99;
		//a1.Preis = 3.5;
		
		a1.setArtikelBezeichung("Zahnpasta");
		a1.setArtikelnummer(99);
		a1.setPreis(3.5);		
		
		
		Artikel kaffee = new Artikel();
		
		kaffee.setArtikelBezeichung("Frischer Kaffe");
		kaffee.setArtikelnummer(555);
		kaffee.setPreis(500);
		
		
		
		
		Artikel a2 = new Artikel(666, "Hanfbrot", 3.5);
		
		
			
		Bestellung best = new Bestellung();
		best.hinzufuegen(a1);
		best.hinzufuegen(a2);
		best.hinzufuegen(kaffee);
		
		DatenSpeicherer.exporToCSV(best, "testBestellung.csv");
	}

}
		
		
		/*
		
		
		Artikel Hanf = new Artikel (1, "Hanf ", 1.90);
		Artikel Brot = new Artikel (2, "Brot ", 2.00);
		Artikel Zopf = new Artikel (54, "Milch ", 5.50);
		
		Bestellung HanfBrot = new Bestellung("erste Bestellung");
		
		
		System.out.println("Name: " + Brot.ArtikelBezeichung + ";" + " Artikelnummer: " + Brot.Artikelnummer + ";" + "Preis " + Brot.Preis);
		System.out.println(Hanf);
		System.out.println(Zopf.ArtikelBezeichung + "kostet " + Zopf.Preis + "Fr.");
		System.out.println(Brot);
		*/

