package ro.ase.cts.observer.program;

import ro.ase.cts.observer.ClientAbonat;
import ro.ase.cts.observer.IObserver;
import ro.ase.cts.observer.ManagerSala;

public class Main {

	public static void main(String[] args) {
		ManagerSala managerSala=new ManagerSala("Sala sport");
		IObserver clientAbonat1=new ClientAbonat("Cristina");
		IObserver clientAbonat2=new ClientAbonat("Andrei");
		
		managerSala.aboneaza(clientAbonat1);
		managerSala.aboneaza(clientAbonat2);
		managerSala.anuntaMeci("fotbal");
		
		managerSala.dezaboneaza(clientAbonat2);
		managerSala.anuntaMeci("volei");
	}

}
