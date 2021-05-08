package ro.ase.cts.commnd.program;

import ro.ase.cts.command.ComandaAbstracta;
import ro.ase.cts.command.ComandaConstituire;
import ro.ase.cts.command.ComandaDepunere;
import ro.ase.cts.command.ComandaRetragere;
import ro.ase.cts.command.ContBancar;
import ro.ase.cts.command.ManagerComenzi;

public class Main {

	public static void main(String[] args) {
	
		ManagerComenzi managerComenzi=new ManagerComenzi();
		ContBancar contBancar1=new ContBancar("Cristina");

		managerComenzi.invocaComanda(new ComandaConstituire(contBancar1, 1000));
		managerComenzi.invocaComanda(new ComandaDepunere(contBancar1, 90));
		managerComenzi.executaComanda();
		managerComenzi.invocaComanda(new ComandaRetragere(contBancar1,190));
		managerComenzi.executaComanda();
		managerComenzi.executaComanda();
		managerComenzi.invocaComanda(new ComandaRetragere(contBancar1,1190));
		managerComenzi.executaComanda();
	}

}
