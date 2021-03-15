package ro.ase.cts.reader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ro.ase.cts.clase.Angajat;
import ro.ase.cts.clase.Aplicant;
import ro.ase.cts.clase.Elev;

public abstract class ReaderAplicanti {
	protected String numeFisier;
	
	public abstract List<Aplicant> readAplicanti()  throws FileNotFoundException;
	
	public ReaderAplicanti(String numeFisier) {
		super();
		this.numeFisier = numeFisier;
	}
	
	public void readAplicanti(Scanner scanner,Aplicant aplicant) {
		
		String nume = scanner.next();
		String prenume = scanner.next();
		int varsta = scanner.nextInt();
		int punctaj = scanner.nextInt();
		int nrProiecte = scanner.nextInt();
		String[] vectDenumiriProiecte = new String[5];
		for (int i = 0; i < nrProiecte; i++)
			vectDenumiriProiecte[i] = scanner.next();
		aplicant.setNume(nume);
		aplicant.setPrenume(prenume);
		aplicant.setVarsta(varsta);
		aplicant.setPunctaj(punctaj);
		aplicant.setNrSiDenumiriProiecte(nrProiecte, vectDenumiriProiecte);
		
	
	
	}
	
	
	

}
