package ch.wiss.modul226.bestellsystem;

import java.time.LocalDate;
import java.util.ArrayList;

public class Bestellung extends ArrayList<Artikel> {
	//Das muss ich manchen weil der BasisTyp ArrayList von Java als Serializable deklariert ist...
	private static final long serialVersionUID = 1L;
	public LocalDate datum;
	//Brs
	//private ArrayList<Artikel> artikelListe = new ArrayList<Artikel>();


	//Getter
	/*
	public ArrayList<Artikel> getArtikelListe() {
		return this.artikelListe;
	}
*/
	public void  hinzufuegen(Artikel a) {
		this.add(a);
		//artikelListe.add(a);
	}

	public void hinzufuegen(int nr, String artikelBezeichung, double preis) {
		Artikel a = new Artikel(nr, artikelBezeichung, preis);
		
		this.add(a);
	}



	/*
	public Bestellung (String Artikel){
		this.artikelListe = artikelListe;
	}
	 */

}
