package ro.ase.cts.proxy;

public class OperatorRezervare implements IOperatorRezervare{

	private String numeLocal;
	
	public OperatorRezervare(String numeLocal) {
		super();
		this.numeLocal = numeLocal;
	}

	public String getNumeLocal() {
		return numeLocal;
	}

	@Override
	public void rezerva(int nrPersoane) {
		System.out.println("S-a realizat rezervarea pentru un numar de " + nrPersoane +" persoane la localul "+ numeLocal);
		
	}
	
	
}
