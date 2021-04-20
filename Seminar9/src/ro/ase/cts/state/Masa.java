package ro.ase.cts.state;

public class Masa {
	
	private int idMasa;
	private IStareMasa stareMasa;

	public Masa(int idMasa) {
		super();
		this.idMasa = idMasa;
		this.stareMasa = new Libera();
	}

	public IStareMasa getStareMasa() {
		return stareMasa;
	}

	void setStareMasa(IStareMasa stareMasa) {
		this.stareMasa = stareMasa;
	}
	
	public void rezervaMasa(String numeClient) {
		if(stareMasa instanceof Libera) {
			System.out.println(numeClient+" a rezervat masa " +idMasa);
			this.setStareMasa(new Rezervata());
		}else {
			System.out.println("Daca nu este libera masa " +idMasa +" nu poate sa fie ocupata");
		}
	}
	
	public void ocupaMasa(String numeClient) {
		if(!(stareMasa instanceof Ocupata)){
			System.out.println(numeClient+" a ocupat masa " +idMasa);
			this.setStareMasa(new Ocupata());
		}
		else {
			System.out.println("Daca nu este libera sau ocupata masa" +idMasa +" nu poate sa fie ocupata");
		}
	}
	
	public void elibereazaMasa(String numeClient) {
		if(!(stareMasa instanceof Libera)){
			System.out.println(numeClient+" a a ocupat masa " +idMasa);
			this.setStareMasa(new Ocupata());
		}else {
			System.out.println("Masa " +idMasa +" este deja libera");
		}
	}
	
	
	
}
