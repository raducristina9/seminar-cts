package ro.ase.cts.proxy;

public class ProxyRezervare implements IOperatorRezervari {

	private OperatorRezervare operatorRezervare;
	private int numarMinimDePersoane;
	
	public ProxyRezervare(OperatorRezervare operatorRezervare, int numarMinimDePersoane) {
		super();
		this.operatorRezervare = operatorRezervare;
		this.numarMinimDePersoane = numarMinimDePersoane;
	}

	@Override
	public void rezerva(int numarPersoane) {
		if(numarPersoane>=numarMinimDePersoane) {
			operatorRezervare.rezerva(numarPersoane);
		}else {
			System.out.println("Numarul de persoane este prea mic!");
		}
		
	}

}
