package ro.ase.cts.adapter;

public class AdapterCrediteClasa extends Leasing implements ICreditAbstract{

	public AdapterCrediteClasa(String numeClient, float suma) {
		super(numeClient, suma);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void oferaCredit() {
		super.creeazLeasing();
		
	}
	
	

}
