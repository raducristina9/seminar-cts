package ro.ase.cts.composite.program;

import ro.ase.cts.composite.ComponentaMeniu;
import ro.ase.cts.composite.Item;
import ro.ase.cts.composite.Sectiune;

public class Main {

	public static void main(String[] args) {
		
		ComponentaMeniu meniu=new Sectiune("Meniu");
		
		ComponentaMeniu sectiuneBauturi=new Sectiune("Bauturi");
		ComponentaMeniu sectiuneDesert=new Sectiune("Desert");
		
		ComponentaMeniu frappe=new Item("Frape");
		ComponentaMeniu catite=new Item("Clatite");
		ComponentaMeniu cola=new Item("Cola");

		meniu.adaugareNod(sectiuneBauturi);
		meniu.adaugareNod(sectiuneDesert);
		
		
		sectiuneBauturi.adaugareNod(cola);
		sectiuneBauturi.adaugareNod(frappe);
		sectiuneDesert.adaugareNod(catite);
		
		meniu.afiseazaInformatii();
		
		System.out.println("_________________________");
		
		sectiuneBauturi.stergereNod(frappe);
		sectiuneDesert.adaugareNod(frappe);
		meniu.afiseazaInformatii();
	}


}
