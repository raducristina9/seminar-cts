package ro.ase.cts.chainofresponsability.program;

import ro.ase.cts.chainofresponsability.Cont;
import ro.ase.cts.chainofresponsability.ContCredit;
import ro.ase.cts.chainofresponsability.ContCurent;
import ro.ase.cts.chainofresponsability.ContEconomii;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Cont contCurent=new ContCurent(200);
		Cont contEconomii=new ContEconomii(500);
		Cont contCredit=new ContCredit(700);
		
		contCurent.setCont(contEconomii);
		contEconomii.setCont(contCredit);
		
		contCurent.realizeazaPlata(150);
		contCurent.realizeazaPlata(60);
		contCurent.realizeazaPlata(490);
		contCurent.realizeazaPlata(250);
		contCredit.realizeazaPlata(300);
		
		
		
	}

}
