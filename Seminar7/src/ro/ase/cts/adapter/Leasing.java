package ro.ase.cts.adapter;

public class Leasing {
	
	private String numeClient;
	private float suma;
	
	public Leasing(String numeClient, float suma) {
		super();
		this.numeClient = numeClient;
		this.suma = suma;
	}
	
	public void creeazLeasing() {
		System.out.println("Clientul "+ numeClient + " a luat leasing pt suma "+ suma);
	}
	
	
}
