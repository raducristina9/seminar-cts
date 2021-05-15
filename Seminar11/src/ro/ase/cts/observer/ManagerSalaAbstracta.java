package ro.ase.cts.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class ManagerSalaAbstracta {
	List<IObserver> listaClientiAbonati;

	public ManagerSalaAbstracta() {
		super();
		this.listaClientiAbonati = new ArrayList<>();
	}
	
	public void aboneaza(IObserver observer) {
		listaClientiAbonati.add(observer);
	}
	
	public void dezaboneaza(IObserver observer) {
		listaClientiAbonati.remove(observer);
	}
	
	public void notifica(String mesajAnunt) {
		for(IObserver observer : listaClientiAbonati) {
			observer.primesteAnunt(mesajAnunt);
		}
	}
	
}
