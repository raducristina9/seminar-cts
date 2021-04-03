package ro.ase.cts.builder;

public class RezervareBuilder implements AbstractBuilder{
	
	private Rezervare rezervare;
	
	
	public RezervareBuilder() {
		super();
		rezervare=new Rezervare(1, false, false, false, false, null);
	}
	
	public RezervareBuilder(int cod) {
		super();
		rezervare=new Rezervare(cod, false, false, false, false, null);
	}

	public RezervareBuilder setCod(int cod) {
		rezervare.setCod(cod);
		return this;
	}
	public RezervareBuilder setMancareInclusa(boolean mancareInclusa) {
		rezervare.setMancareInclusa(mancareInclusa);
		return this;
	}
	public RezervareBuilder setScaunErgonomic(boolean scaunErgonomic) {
		rezervare.setScaunErgonomic(scaunErgonomic);
		return this;
	}
	public RezervareBuilder setBauturaRacoritoareInclusa(boolean bauturaRacoritoareInclusa) {
		rezervare.setBauturaRacoritoareInclusa(bauturaRacoritoareInclusa);
		return this;
	}
	public RezervareBuilder setMuzicaAmbientalaPersonalizata(boolean muzicaAmbientalaPersonalizata) {
		rezervare.setMuzicaAmbientalaPersonalizata(muzicaAmbientalaPersonalizata);
		return this;
	}
	public RezervareBuilder setGenMuzica(String genMuzica) {
		rezervare.setGenMuzica(genMuzica);
		return this;
	}

	@Override
	public Rezervare build() {
		// TODO Auto-generated method stub
		return this.rezervare;
	}

}
