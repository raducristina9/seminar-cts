package ro.ase.cts.state.program;

import ro.ase.cts.state.Libera;
import ro.ase.cts.state.Masa;
import ro.ase.cts.state.Ocupata;
import ro.ase.cts.state.Rezervata;

public class Main {

	public static void main(String[] args) {
		Masa masa1=new Masa(1);
		masa1.rezervaMasa("Cristina");
		masa1.rezervaMasa("Alexandra");
		masa1.elibereazaMasa("Cristina");
		
		
		System.out.println();
		Masa masa2=new Masa(2);
		Rezervata rezervata=new Rezervata();
		Ocupata ocupata=new Ocupata();
		Libera libera=new Libera();
		masa2.elibereazaMasa("Maria");
		
		libera.monificaStare(masa2);
		rezervata.monificaStare(masa2);
		ocupata.monificaStare(masa2);
		
	}

}
