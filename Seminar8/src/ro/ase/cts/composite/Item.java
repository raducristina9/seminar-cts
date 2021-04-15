package ro.ase.cts.composite;

public class Item implements ComponentaMeniu{
	
	private String nume;

	public Item(String nume) {
		super();
		this.nume = nume;
	}

	@Override
	public void adaugareNod(ComponentaMeniu componentaMeniu) {
		throw new IllegalArgumentException("Metoda nu este implementata");
		
	}

	@Override
	public void stergereNod(ComponentaMeniu componentaMeniu) {
		throw new IllegalArgumentException("Metoda nu este implementata");
		
	}

	@Override
	public void afiseazaInformatii() {
		System.out.println("Item "+nume);
		
	}

	@Override
	public ComponentaMeniu getComponenta(int index) throws Exception {
		throw new IllegalArgumentException("Metoda nu este implementata");
	}
	

}
