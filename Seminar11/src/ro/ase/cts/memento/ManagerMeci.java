package ro.ase.cts.memento;

import java.util.ArrayList;
import java.util.List;

import javax.management.RuntimeErrorException;

public class ManagerMeci {
	private List<Memento> listaMeciuriSalvate;

	public ManagerMeci() {
		super();
		this.listaMeciuriSalvate = new ArrayList<>();
		
	}
	
	public void adaugaMemento(Memento memento) {
		this.listaMeciuriSalvate.add(memento);
	}
	
	public Memento getMemento(int pozitie) {
		if(pozitie>=0 && pozitie<listaMeciuriSalvate.size()) {
			return this.listaMeciuriSalvate.get(pozitie);
		}
			throw new IndexOutOfBoundsException();
		
	}
	
	public Memento undo() {
		return this.listaMeciuriSalvate.get(this.listaMeciuriSalvate.size()-1);
	}
	
	
}
