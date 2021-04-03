package ro.ase.cts.builder;

public class Rezervare {
	private int cod;
	private boolean mancareInclusa;
	private boolean scaunErgonomic;
	private boolean bauturaRacoritoareInclusa;
	private boolean muzicaAmbientalaPersonalizata;
	private String genMuzica;
	public Rezervare(int cod, boolean mancareInclusa, boolean scaunErgonomic, boolean bauturaRacoritoareInclusa,
			boolean muzicaAmbientalaPersonalizata, String genMuzica) {
		super();
		this.cod = cod;
		this.mancareInclusa = mancareInclusa;
		this.scaunErgonomic = scaunErgonomic;
		this.bauturaRacoritoareInclusa = bauturaRacoritoareInclusa;
		this.muzicaAmbientalaPersonalizata = muzicaAmbientalaPersonalizata;
		this.genMuzica = genMuzica;
	}
	public void setCod(int cod) {
		this.cod = cod;
	}
	public void setMancareInclusa(boolean mancareInclusa) {
		this.mancareInclusa = mancareInclusa;
	}
	public void setScaunErgonomic(boolean scaunErgonomic) {
		this.scaunErgonomic = scaunErgonomic;
	}
	public void setBauturaRacoritoareInclusa(boolean bauturaRacoritoareInclusa) {
		this.bauturaRacoritoareInclusa = bauturaRacoritoareInclusa;
	}
	public void setMuzicaAmbientalaPersonalizata(boolean muzicaAmbientalaPersonalizata) {
		this.muzicaAmbientalaPersonalizata = muzicaAmbientalaPersonalizata;
	}
	public void setGenMuzica(String genMuzica) {
		this.genMuzica = genMuzica;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Rezervare [cod=");
		builder.append(cod);
		builder.append(", mancareInclusa=");
		builder.append(mancareInclusa);
		builder.append(", scaunErgonomic=");
		builder.append(scaunErgonomic);
		builder.append(", bauturaRacoritoareInclusa=");
		builder.append(bauturaRacoritoareInclusa);
		builder.append(", muzicaAmbientalaPersonalizata=");
		builder.append(muzicaAmbientalaPersonalizata);
		builder.append(", genMuzica=");
		builder.append(genMuzica);
		builder.append("]");
		return builder.toString();
	}
	
	

}
