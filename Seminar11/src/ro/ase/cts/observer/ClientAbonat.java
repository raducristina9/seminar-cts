package ro.ase.cts.observer;

public class ClientAbonat implements IObserver {
	
	private String numeClient;
	

	public ClientAbonat(String numeClient) {
		super();
		this.numeClient = numeClient;
	}


	@Override
	public void primesteAnunt(String mesajAnunt) {
		System.out.println(this.numeClient+" ai primit "+mesajAnunt);
	}

}
