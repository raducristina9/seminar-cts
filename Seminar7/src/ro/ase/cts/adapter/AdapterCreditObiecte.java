package ro.ase.cts.adapter;

public class AdapterCreditObiecte implements ICreditAbstract{

	
	private Leasing leasing;
	
	public AdapterCreditObiecte(Leasing leasing) {
		super();
		this.leasing = leasing;
	}

	@Override
	public void oferaCredit() {
		leasing.creeazLeasing();
		
	}

}
