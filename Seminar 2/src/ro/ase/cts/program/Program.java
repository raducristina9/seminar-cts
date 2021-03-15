package ro.ase.cts.program;

import java.io.FileNotFoundException;
import java.util.List;

import ro.ase.cts.clase.Angajat;
import ro.ase.cts.clase.Aplicant;
import ro.ase.cts.reader.ReaderAngajati;
import ro.ase.cts.reader.ReaderAplicanti;
import ro.ase.cts.reader.ReaderStudenti;

public class Program {
	
	public static List<Aplicant> citireAplicanti(ReaderAplicanti readerAplicant) throws FileNotFoundException{
		return readerAplicant.readAplicanti();
		
	}

	public static void main(String[] args) {
		List<Aplicant> listaAplicant;
	
		try {
			listaAplicant = citireAplicanti(new ReaderStudenti("studenti.txt"));
			for(Aplicant aplicant:listaAplicant) {
				System.out.println(aplicant.toString());
				aplicant.statut();
				System.out.println(aplicant.finantare());
			}
		} catch (FileNotFoundException err) {
			// TODO Auto-generated catch block
			err.printStackTrace();
		}
	}

}
