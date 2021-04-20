package ro.ase.cts.strategy;

public class Client {
	private String nume;
	private IModPlata modPlata;
	
	public Client(String nume, IModPlata modPlata) {
		super();
		this.nume = nume;
		this.modPlata = modPlata;
	}

	public void setModPlata(IModPlata modPlata) {
		this.modPlata = modPlata;
	}
	
	public void platesteNota(int suma) {
		System.out.println(nume + " are de relizat o plata pentru suma de "+suma);
		
		modPlata.plateste(suma);
	}
	
	
	
	
	

}
