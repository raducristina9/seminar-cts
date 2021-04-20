package ro.ase.cts.strategy.program;

import ro.ase.cts.strategy.Client;
import ro.ase.cts.strategy.PlataCard;
import ro.ase.cts.strategy.PlataCash;

public class Main {

	public static void main(String[] args) {
		Client client=new Client("Cristina", new PlataCard());
		client.platesteNota(20);
		client.setModPlata(new PlataCash());
		client.platesteNota(5);
	}

}
