package ro.ase.cts.reader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ro.ase.cts.clase.Angajat;
import ro.ase.cts.clase.Aplicant;
import ro.ase.cts.clase.Elev;

public abstract class ReaderAplicant {
	protected String numeFisier;
	
	public abstract List<Aplicant> readAplicanti()  throws FileNotFoundException;
	
	public ReaderAplicant(String numeFisier) {
		super();
		this.numeFisier = numeFisier;
	}
	
	public void readAplicant(Scanner input2,Aplicant aplicant) {
		
		String nume = input2.next();
		String prenume = input2.next();
		int varsta = input2.nextInt();
		int punctaj = input2.nextInt();
		int nr = input2.nextInt();
		String[] vect = new String[5];
		for (int i = 0; i < nr; i++)
			vect[i] = input2.next();
		aplicant.setNume(nume);
		aplicant.setPrenume(prenume);
		aplicant.setVarsta(varsta);
		aplicant.setPunctaj(punctaj);
		aplicant.setNrSiDenumiriProiecte(nr, vect);
		
	
	
	}
	
	
	

}
