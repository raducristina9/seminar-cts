package ro.ase.cts.command;

public class ComandaDepunere extends ComandaAbstracta {

	public ComandaDepunere(ContBancar contBancar, float suma) {
		super(contBancar, suma);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void executa() {
		// TODO Auto-generated method stub
		super.contBancar.depunere(super.suma);
	}

}
