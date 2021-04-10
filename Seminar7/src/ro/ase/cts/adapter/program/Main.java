package ro.ase.cts.adapter.program;

import ro.ase.cts.adapter.AdapterCreditObiecte;
import ro.ase.cts.adapter.AdapterCrediteClasa;
import ro.ase.cts.adapter.ICreditAbstract;
import ro.ase.cts.adapter.Leasing;

public class Main {
	
	public static void creeazaCredit(ICreditAbstract creditAbstract) {
		creditAbstract.oferaCredit();
	}

	public static void main(String[] args) {
		Leasing leasing=new Leasing("Cristina", 2000);
		//leasing.creeazLeasing();
		
		AdapterCreditObiecte adapterCreditObiecte=new AdapterCreditObiecte(leasing);
		creeazaCredit(adapterCreditObiecte);
		
		
		ICreditAbstract adapterCrediteClasa=new AdapterCrediteClasa("Alexandra", 6000);
		creeazaCredit(adapterCrediteClasa);
	}

}
