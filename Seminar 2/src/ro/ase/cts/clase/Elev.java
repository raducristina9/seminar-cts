package ro.ase.cts.clase;


import java.util.Arrays;

import ro.ase.cts.util.Constante;

public class Elev extends Aplicant{
	private int clasa;
	private String tutore;
	
	public int getClasa() {
		return clasa;
	}
	public void setClasa(int clasa) {
		this.clasa = clasa;
	}
	public String getTutore() {
		return tutore;
	}
	public void setTutore(String tutore) {
		this.tutore = tutore;
	}
	public int getFinantare() {
		return Constante.FINANTARE_ELEV;
	}
	
	@Override
	public String toString() {
		final StringBuilder stringb=new StringBuilder("Elev:");
		stringb.append(super.toString());
		stringb.append(", clasa=");
		stringb.append(clasa);
		stringb.append(", tutore=");
		stringb.append(tutore);
		return stringb.toString();
	}
	public Elev() {
		super();
	}
	
	public Elev(String nume, String prenume, int varsta, int punctaj,
			int nr_proiecte, String[] denumireProiect, int clasa, String tutore) {
		super(nume,prenume,varsta,punctaj,nr_proiecte,denumireProiect);
		this.clasa = clasa;
		this.tutore = tutore;
	}
	public String finantare() {
		StringBuilder builder = new StringBuilder();
		builder.append(String.valueOf(super.finantare()));
		builder.append(Constante.FINANTARE_ELEV);
		builder.append(" Euro/zi in proiect.");	
		return builder.toString();
	}
}
