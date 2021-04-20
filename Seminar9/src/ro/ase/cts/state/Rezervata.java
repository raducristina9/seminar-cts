package ro.ase.cts.state;

public class Rezervata implements IStareMasa{

	@Override
	public void monificaStare(Masa masa) {
		if(masa.getStareMasa() instanceof Libera) {
			masa.setStareMasa(this);	
		}
					
	}

}
