package ro.ase.cts.memento.program;

import javax.print.attribute.standard.OrientationRequested;

import ro.ase.cts.memento.ManagerMeci;
import ro.ase.cts.memento.Memento;
import ro.ase.cts.memento.OriginatorMeci;

public class Main {

	public static void main(String[] args) {
		OriginatorMeci meciJucat=new OriginatorMeci(100, "Echipa 1", "Echipa 2", 10, 10);
		Memento memento=meciJucat.creareMemento();
		ManagerMeci managerMeciuri=new ManagerMeci();
		managerMeciuri.adaugaMemento(memento);
		
		meciJucat.setNumarSpectatori(400);
		meciJucat.setNumeEchipaGazda("FCSB");
		meciJucat.setNumeEchipaOaspeti("Craiova");
		
		managerMeciuri.adaugaMemento(meciJucat.creareMemento());
		System.out.println(meciJucat.toString());
		
		managerMeciuri.getMemento(0);
		meciJucat.setMemento(managerMeciuri.getMemento(0));
		System.out.println(meciJucat.toString());

	}

}
