package ro.ase.cts.flyweight.program;

import ro.ase.cts.flyweight.Client;
import ro.ase.cts.flyweight.FabricaFlyweight;
import ro.ase.cts.flyweight.Rezervare;

public class Main {

	public static void main(String[] args) {
		Rezervare rezervare1=new Rezervare(3, 4, 2);
		Rezervare rezervare2=new Rezervare(3, 4, 1);
		Rezervare rezervare3=new Rezervare(3, 4, 5);
		
		FabricaFlyweight fabricaFlyweight=new FabricaFlyweight();
		Client client=(Client)fabricaFlyweight.getClient("0756797980");
		client.afiseazaInformatii(rezervare1);
		
		Client client2=(Client)fabricaFlyweight.getClient("076958484");
		client2.afiseazaInformatii(rezervare2);
		
		fabricaFlyweight.getClient("0756797980").afiseazaInformatii(rezervare3);
	}

}
