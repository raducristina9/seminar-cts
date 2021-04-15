package ro.ase.cts.flyweight;

import java.util.HashMap;
import java.util.Map;

public class FabricaFlyweight {
	
	private Map<String,FlyweightAbstract> clienti=null;

	public FabricaFlyweight() {
		clienti=new HashMap<>();
	}
	
	public FlyweightAbstract getClient(String nrTelefon) {
		Client client=(Client)clienti.get(nrTelefon);
		if(client ==null) {
			client=new Client("Cristina", nrTelefon, "crstina@stud.ase.ro");
			clienti.put(nrTelefon, client);
		}
		return client;
	}
	
	
}
