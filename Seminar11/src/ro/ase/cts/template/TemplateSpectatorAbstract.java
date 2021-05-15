package ro.ase.cts.template;

public abstract class TemplateSpectatorAbstract {
	
	public abstract void asezareCoada();
	public abstract void printeazBilet();
	public abstract void realizareControlCorporal();
	public abstract void ocupaLoc();
	public final void intrarePeStadion() {
		asezareCoada();
		printeazBilet();
		realizareControlCorporal();
		ocupaLoc();
	}

	
}
