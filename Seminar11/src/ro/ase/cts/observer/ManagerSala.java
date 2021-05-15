package ro.ase.cts.observer;

public class ManagerSala extends ManagerSalaAbstracta{
	
	private String denumieSala;

	public ManagerSala(String denumieSala) {
		super();
		this.denumieSala = denumieSala;
	}
	
	public void anuntaMeci(String tipMeci) {
		super.notifica("Va avea loc un meci de "+tipMeci);
	}

}
