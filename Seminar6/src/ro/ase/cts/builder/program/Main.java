package ro.ase.cts.builder.program;

import ro.ase.cts.builder.Rezervare;
import ro.ase.cts.builder.RezervareBuilder;
import ro.ase.cts.builder.RezervareBuilderV2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rezervare rezervare=new Rezervare(1, false, false, false, false, "pop");
		System.out.println(rezervare.toString());
		
		Rezervare rezervare2=new RezervareBuilder().setCod(10).setBauturaRacoritoareInclusa(true).setGenMuzica("pop").build();
		System.out.println(rezervare2.toString());
		
		Rezervare rezervare3=new RezervareBuilder().setCod(15).setBauturaRacoritoareInclusa(true).setGenMuzica("pop").build();
		System.out.println(rezervare3.toString());
		
		Rezervare rezervare4=new RezervareBuilder(11).setBauturaRacoritoareInclusa(true).setGenMuzica("pop").build();
		System.out.println(rezervare4.toString());
		
		RezervareBuilderV2 builderV2=new RezervareBuilderV2().setBauturaRacoritoareInclusa(true).setMancareInclusa(true);
		Rezervare rezervare5=builderV2.setCod(5).build();
		Rezervare rezervare6=builderV2.setCod(6).build();
		System.out.println(rezervare5.toString());
		System.out.println(rezervare6.toString());
	}

}
