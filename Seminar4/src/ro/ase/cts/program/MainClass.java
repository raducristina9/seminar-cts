package ro.ase.cts.program;

import ro.ase.cts.singleton.AsigurareMedicala;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AsigurareMedicala asigurareMedicala=AsigurareMedicala.getInstance();
		AsigurareMedicala asigurareMedicala2=AsigurareMedicala.getInstance();
		
		asigurareMedicala.setId(2);
		asigurareMedicala2.setContributie(240.8f);
		
		System.out.println(asigurareMedicala.toString());
		System.out.println(asigurareMedicala2.toString());
		
		ro.ase.cts.singletonlazy.AsigurareMedicala asigurareMedicalaLazy = ro.ase.cts.singletonlazy.AsigurareMedicala.getInstance(100, "Cristina", 330.9f);
		ro.ase.cts.singletonlazy.AsigurareMedicala asigurareMedicalaLazy2 = ro.ase.cts.singletonlazy.AsigurareMedicala.getInstance(400, "Cristina", 550.9f);
		System.out.println(asigurareMedicalaLazy.toString());
		System.out.println(asigurareMedicalaLazy2.toString());
	}

}
