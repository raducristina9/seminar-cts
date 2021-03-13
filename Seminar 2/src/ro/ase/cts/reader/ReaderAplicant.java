package ro.ase.cts.reader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ro.ase.cts.clase.Aplicant;
import ro.ase.cts.clase.Elev;

public abstract class ReaderAplicant {
	protected String numeFisier;
	
	public abstract List<Aplicant> readAplicanti()  throws FileNotFoundException;
	
	public ReaderAplicant(String numeFisier) {
		super();
		this.numeFisier = numeFisier;
	}
	
	
	

}
