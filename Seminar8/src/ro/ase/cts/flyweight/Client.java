package ro.ase.cts.flyweight;

public class Client implements FlyweightAbstract{
	
	private String numeClient;
	private String nrTelefon;
	private String adresaEmal;

	public Client(String numeClient, String nrTelefon, String adresaEmal) {
		super();
		this.numeClient = numeClient;
		this.nrTelefon = nrTelefon;
		this.adresaEmal = adresaEmal;
	}

	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Client [numeClient=");
		builder.append(numeClient);
		builder.append(", nrTelefon=");
		builder.append(nrTelefon);
		builder.append(", adresaEmal=");
		builder.append(adresaEmal);
		builder.append("]");
		return builder.toString();
	}


	public void afiseazaInformatii(Rezervare rezervare) {
		System.out.println(this.toString()+" " +rezervare.toString());
		
	}

}
