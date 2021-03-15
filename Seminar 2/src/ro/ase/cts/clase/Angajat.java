package ro.ase.cts.clase;

import java.util.Arrays;

import ro.ase.cts.util.Constante;

public class Angajat extends Aplicant{
	private String ocupatie;
	private int salariu;
	
	public String getOcupatie() {
		return ocupatie;
	}
	public void setOcupatie(String ocupatie) {
		this.ocupatie = ocupatie;
	}
	public int getSalariu() {
		return salariu;
	}
	public void setSalariu(int salariu) {
		this.salariu = salariu;
	}
	public int getFinantare() {
		return Constante.FINANTARE_ANGAJAT;
	}
	public Angajat(String nume, String prenume, int varsta, int punctaj, int nr_proiecte, String[] denumire_Proiecte,int salariu,String ocupatie) {
		super(nume,prenume,varsta,punctaj,nr_proiecte,denumire_Proiecte);
		this.salariu = salariu;
		this.ocupatie = ocupatie;
	}
	public Angajat() {
		super();
		
	}
	
	
	@Override
	public String toString() {
		final StringBuilder stringb=new StringBuilder("Angajat:");
		stringb.append(super.toString());
		stringb.append(", ocupatie=");
		stringb.append(ocupatie);
		stringb.append(", salariu=");
		stringb.append(salariu);
		return stringb.toString();
	}
	
	
	public String finantare() {
		StringBuilder builder = new StringBuilder();
		builder.append(String.valueOf(super.finantare()));
		builder.append(Constante.FINANTARE_ANGAJAT);
		builder.append(" Euro/zi in proiect.");	
		return builder.toString();
	}
	
}
