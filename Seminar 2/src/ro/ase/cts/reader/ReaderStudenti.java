package ro.ase.cts.reader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ro.ase.cts.clase.Angajat;
import ro.ase.cts.clase.Aplicant;
import ro.ase.cts.clase.Student;

public class ReaderStudenti extends ReaderAplicanti{
	public ReaderStudenti(String numeFisier) {
		super(numeFisier);
		// TODO Auto-generated constructor stub
	}

	public  List<Aplicant> readAplicanti() throws FileNotFoundException, NumberFormatException {
		Scanner scanner = new Scanner(new File(super.numeFisier));
		scanner.useDelimiter(",|\n");
		List<Aplicant> studenti = new ArrayList<Aplicant>();

		while (scanner.hasNext()) {
			Student student=new Student();
			readAplicanti(scanner, student);
			int an_studii = scanner.nextInt();
			String facultate = (scanner.next()).toString();
			student.setAn_studii(an_studii);
			student.setFacultate(facultate);
			studenti.add(student);
		}
		scanner.close();
		return studenti;
	}
}
