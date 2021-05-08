package ro.ase.cts.command;

public class ComandaRetragere extends ComandaAbstracta{

	public ComandaRetragere(ContBancar contBancar, float suma) {
		super(contBancar, suma);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void executa() {
		// TODO Auto-generated method stub
		super.contBancar.retragere(super.suma);
	}

}
