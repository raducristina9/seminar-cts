package ro.ase.cts.proxy.program;

import ro.ase.cts.proxy.OperatorRezervare;
import ro.ase.cts.proxy.Proxy;
public class Main {

	public static void main(String[] args) {
		OperatorRezervare opertor1= new OperatorRezervare("Local1");
		opertor1.rezerva(2);
		
		Proxy proxy=new Proxy(opertor1, 4);
		proxy.rezerva(2);
		proxy.rezerva(5);

	}

}
