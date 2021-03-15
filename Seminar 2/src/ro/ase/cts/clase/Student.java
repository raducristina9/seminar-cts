package ro.ase.cts.clase;

import java.util.Arrays;

import ro.ase.cts.util.Constante;

public class Student extends Aplicant {
	protected String facultate;
	protected int an_studii;
	
	
	public String getFacultate() {
		return facultate;
	}
	public void setFacultate(String facultate) {
		this.facultate = facultate;
	}
	public int getAn_studii() {
		return an_studii;
	}
	public void setAn_studii(int an_studii) {
		this.an_studii = an_studii;
	}

	public int getFinantare() {
		return Constante.FINANTARE_STUDENT;
	}
	public Student() {
		super();
		
	}
	
	public Student(String nume, String prenume, int varsta, int punctaj, int nr_proiecte, String[] denumireProiect, String facultate, int an_studii) {
		super(nume,prenume,varsta,punctaj,nr_proiecte,denumireProiect);
		this.facultate = facultate;
		this.an_studii = an_studii;
	}
	
	@Override
	public String toString() {
		final StringBuilder stringb=new StringBuilder("Student:");
		stringb.append(super.toString());
		stringb.append(", facultate=");
		stringb.append(facultate);
		stringb.append(", an_studii=");
		stringb.append(an_studii);
		return stringb.toString();
	}
	
	public String finantare() {
		StringBuilder builder = new StringBuilder();
		builder.append(String.valueOf(super.finantare()));
		builder.append(Constante.FINANTARE_ELEV);
		builder.append(" Euro/zi in proiect.");	
		return builder.toString();
	}
	
}
