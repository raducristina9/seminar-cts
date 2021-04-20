package ro.ase.cts.proxy;

public class OperatorRezervare implements IOperatorRezervari {

	private String numeRestaurant;
	
	public OperatorRezervare(String numeRestaurant) {
		super();
		this.numeRestaurant = numeRestaurant;
	}

	@Override
	public void rezerva(int numarPersoane) {
	
		System.out.println("A fost realizata rezervarea la "+ numeRestaurant+ " pentru un numar de " + numarPersoane + " persoane!");
		
	}
	
	

}
