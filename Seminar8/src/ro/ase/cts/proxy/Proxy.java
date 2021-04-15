package ro.ase.cts.proxy;

public class Proxy implements IOperatorRezervare{
	
	private OperatorRezervare operatorRezervare;
	private int numarMinimDePersoane;
	

	public Proxy(OperatorRezervare operatorRezervare, int numarMinimDePersoane) {
		super();
		this.operatorRezervare = operatorRezervare;
		this.numarMinimDePersoane = numarMinimDePersoane;
	}


	public OperatorRezervare getOperatorRezervare() {
		return operatorRezervare;
	}


	public int getNumarMinimDePersoane() {
		return numarMinimDePersoane;
	}


	public void rezerva(int nrPersoane) {
		if(nrPersoane>=numarMinimDePersoane) {
			operatorRezervare.rezerva(nrPersoane);
		}else {
			System.out.println("Nu putem realiza o rezervare pt "+nrPersoane+" persoane va asteptam in locatie");
		}
	}
}
