package ro.ase.cts.proxy.program;


import ro.ase.cts.proxy.OperatorRezervare;
import ro.ase.cts.proxy.ProxyRezervare;

public class Main {

	public static void main(String[] args) {
	OperatorRezervare operator=new OperatorRezervare("IlLocale");
	operator.rezerva(2);
	
	ProxyRezervare proxy=new ProxyRezervare(operator, 4);
	proxy.rezerva(2);
	proxy.rezerva(4);

	}

}
