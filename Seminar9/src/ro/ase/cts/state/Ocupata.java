package ro.ase.cts.state;

public class Ocupata implements IStareMasa{

	@Override
	public void monificaStare(Masa masa) {
		if(masa.getStareMasa() instanceof Rezervata){
			masa.setStareMasa(this);
		}
		
	}
}
